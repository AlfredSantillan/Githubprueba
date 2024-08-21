/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Diodos;
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
public class DiodosJpaController implements Serializable {

    public DiodosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public DiodosJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
        }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Diodos diodos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(diodos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Diodos diodos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            diodos = em.merge(diodos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = diodos.getId();
                if (findDiodos(id) == null) {
                    throw new NonexistentEntityException("The diodos with id " + id + " no longer exists.");
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
            Diodos diodos;
            try {
                diodos = em.getReference(Diodos.class, id);
                diodos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The diodos with id " + id + " no longer exists.", enfe);
            }
            em.remove(diodos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Diodos> findDiodosEntities() {
        return findDiodosEntities(true, -1, -1);
    }

    public List<Diodos> findDiodosEntities(int maxResults, int firstResult) {
        return findDiodosEntities(false, maxResults, firstResult);
    }

    private List<Diodos> findDiodosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Diodos.class));
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

    public Diodos findDiodos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Diodos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDiodosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Diodos> rt = cq.from(Diodos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
