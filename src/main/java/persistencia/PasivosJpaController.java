    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Pasivos;
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

/**
 *
 * @author avionics12
 */
public class PasivosJpaController implements Serializable {

    public PasivosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public PasivosJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
        }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pasivos pasivos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pasivos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pasivos pasivos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pasivos = em.merge(pasivos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pasivos.getId();
                if (findPasivos(id) == null) {
                    throw new NonexistentEntityException("The pasivos with id " + id + " no longer exists.");
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
            Pasivos pasivos;
            try {
                pasivos = em.getReference(Pasivos.class, id);
                pasivos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pasivos with id " + id + " no longer exists.", enfe);
            }
            em.remove(pasivos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pasivos> findPasivosEntities() {
        return findPasivosEntities(true, -1, -1);
    }

    public List<Pasivos> findPasivosEntities(int maxResults, int firstResult) {
        return findPasivosEntities(false, maxResults, firstResult);
    }

    private List<Pasivos> findPasivosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pasivos.class));
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

    public Pasivos findPasivos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pasivos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPasivosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pasivos> rt = cq.from(Pasivos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
