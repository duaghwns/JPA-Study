#JPA란?
######Java Persistence API 의 약자

###Persistence
<hr>

####영속성
**영원히** 계속되는 성질이나 능력.
####컨텍스트
사물의 서로 잇닿아 있는 관계나 연관.


<hr>
~~~java
Member member = new Member();
member.setId(1L);
member.setName("duaghwns");
em.persist(member);
~~~