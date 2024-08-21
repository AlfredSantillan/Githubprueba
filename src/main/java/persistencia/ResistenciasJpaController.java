/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Resistencias;
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
public class ResistenciasJpaController implements Serializable {

    public ResistenciasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ResistenciasJpaController() {
        emf = Persistence.createEntityManagerFactory("InventarioAvioPU");
                }
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resistencias resistencias) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(resistencias);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resistencias resistencias) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            resistencias = em.merge(resistencias);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = resistencias.getId();
                if (findResistencias(id) == null) {
                    throw new NonexistentEntityException("The resistencias with id " + id + " no longer exists.");
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
            Resistencias resistencias;
            try {
                resistencias = em.getReference(Resistencias.class, id);
                resistencias.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The resistencias with id " + id + " no longer exists.", enfe);
            }
            em.remove(resistencias);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Resistencias> findResistenciasEntities() {
        return findResistenciasEntities(true, -1, -1);
    }

    public List<Resistencias> findResistenciasEntities(int maxResults, int firstResult) {
        return findResistenciasEntities(false, maxResults, firstResult);
    }

    private List<Resistencias> findResistenciasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Resistencias.class));
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

    public Resistencias findResistencias(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Resistencias.class, id);
        } finally {
            em.close();
        }
    }

    public int getResistenciasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Resistencias> rt = cq.from(Resistencias.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
