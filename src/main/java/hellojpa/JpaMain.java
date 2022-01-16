package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hojoon");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            Member member = new Member();
//            member.setId(1L);
//            member.setName("duaghwns");
//            em.persist(member);

            Member member1 = em.find(Member.class, 1L);
            Member member2 = em.find(Member.class, 1L);

            System.out.println("Member : " + member1.getName());
            System.out.println("mem1 or mem2 : " + (member1 == member2));
            // persist 없이 update 됌
            member2.setName("hojoon");
            em.flush();


            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}