
package persistencia;

import Logica.CIn;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.exceptions.NonexistentEntityException;
import javax.persistence.Persistence;


public class CInJpaController implements Serializable {

    public CInJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public CInJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
}
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CIn CIn) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(CIn);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CIn CIn) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CIn = em.merge(CIn);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = CIn.getId();
                if (findCIn(id) == null) {
                    throw new NonexistentEntityException("The cIn with id " + id + " no longer exists.");
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
            CIn CIn;
            try {
                CIn = em.getReference(CIn.class, id);
                CIn.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The CIn with id " + id + " no longer exists.", enfe);
            }
            em.remove(CIn);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CIn> findCInEntities() {
        return findCInEntities(true, -1, -1);
    }

    public List<CIn> findCInEntities(int maxResults, int firstResult) {
        return findCInEntities(false, maxResults, firstResult);
    }

    private List<CIn> findCInEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CIn.class));
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

    public CIn findCIn(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CIn.class, id);
        } finally {
            em.close();
        }
    }

    public int getCInCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CIn> rt = cq.from(CIn.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
