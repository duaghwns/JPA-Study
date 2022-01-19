package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity @Getter @Setter
public class Order {
    @Id @GeneratedValue
    private Long id;

    private Long memberId;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
}
