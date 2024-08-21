/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Capacitores;
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
public class CapacitoresJpaController implements Serializable {

    public CapacitoresJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public CapacitoresJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
        }


    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Capacitores capacitores) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(capacitores);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Capacitores capacitores) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            capacitores = em.merge(capacitores);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = capacitores.getId();
                if (findCapacitores(id) == null) {
                    throw new NonexistentEntityException("The capacitores with id " + id + " no longer exists.");
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
            Capacitores capacitores;
            try {
                capacitores = em.getReference(Capacitores.class, id);
                capacitores.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The capacitores with id " + id + " no longer exists.", enfe);
            }
            em.remove(capacitores);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Capacitores> findCapacitoresEntities() {
        return findCapacitoresEntities(true, -1, -1);
    }

    public List<Capacitores> findCapacitoresEntities(int maxResults, int firstResult) {
        return findCapacitoresEntities(false, maxResults, firstResult);
    }

    private List<Capacitores> findCapacitoresEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Capacitores.class));
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

    public Capacitores findCapacitores(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Capacitores.class, id);
        } finally {
            em.close();
        }
    }

    public int getCapacitoresCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Capacitores> rt = cq.from(Capacitores.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
