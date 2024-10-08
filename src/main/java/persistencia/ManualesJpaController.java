
package persistencia;

import Logica.Manuales;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.exceptions.NonexistentEntityException;

public class ManualesJpaController implements Serializable {

    public ManualesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
        public ManualesJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
        }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Manuales manuales) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(manuales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Manuales manuales) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            manuales = em.merge(manuales);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = manuales.getId();
                if (findManuales(id) == null) {
                    throw new NonexistentEntityException("The manuales with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Manuales manuales;
            try {
                manuales = em.getReference(Manuales.class, id);
                manuales.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The manuales with id " + id + " no longer exists.", enfe);
            }
            em.remove(manuales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Manuales> findManualesEntities() {
        return findManualesEntities(true, -1, -1);
    }

    public List<Manuales> findManualesEntities(int maxResults, int firstResult) {
        return findManualesEntities(false, maxResults, firstResult);
    }

    private List<Manuales> findManualesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Manuales.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Manuales findManuales(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Manuales.class, id);
        } finally {
            em.close();
        }
    }

    public int getManualesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Manuales> rt = cq.from(Manuales.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
