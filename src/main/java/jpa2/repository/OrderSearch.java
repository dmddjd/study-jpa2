package jpa2.repository;

import jpa2.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String searchName; // 회원 이름
    private OrderStatus orderStatus; // 주문 상태(ORDER, CANCEL)
}
