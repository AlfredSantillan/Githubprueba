
package persistencia;

import Logica.Arnes;
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


public class ArnesJpaController implements Serializable {

    public ArnesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
        public ArnesJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
}
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Arnes arnes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(arnes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Arnes arnes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            arnes = em.merge(arnes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = arnes.getId();
                if (findArnes(id) == null) {
                    throw new NonexistentEntityException("The arnes with id " + id + " no longer exists.");
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
            Arnes arnes;
            try {
                arnes = em.getReference(Arnes.class, id);
                arnes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The arnes with id " + id + " no longer exists.", enfe);
            }
            em.remove(arnes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Arnes> findArnesEntities() {
        return findArnesEntities(true, -1, -1);
    }

    public List<Arnes> findArnesEntities(int maxResults, int firstResult) {
        return findArnesEntities(false, maxResults, firstResult);
    }

    private List<Arnes> findArnesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Arnes.class));
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

    public Arnes findArnes(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Arnes.class, id);
        } finally {
            em.close();
        }
    }

    public int getArnesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Arnes> rt = cq.from(Arnes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
