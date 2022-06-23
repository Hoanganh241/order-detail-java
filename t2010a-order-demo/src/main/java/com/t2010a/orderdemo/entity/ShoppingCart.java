package com.t2010a.orderdemo.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "shopping_carts")
public class ShoppingCart {
    // ship về đâu, cho ai, địa chỉ, note ship khi nào
    // tổng tiền.
    // thời gian tạo.* Mặc dù lấy được từ cartItem,
    //     * nhưng nên tính toán mỗi khi update cartie
    //     * để lần sau chỉ việc lấy ra.
    // ai tạo.
    @Id
    private String id;
    private String userId; // ai tạo
    /*
     */
    private BigDecimal totalPrice;
    private String shipName;
    private String shipAddress;
    private String shipPhone;
    private String shipNote;
    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    private Set<CartItem> items;

    public void addTotalPrice(CartItem cartItem) {
        if(this.totalPrice == null){
            this.totalPrice = new BigDecimal(0);
        }
        BigDecimal quantityInBigDecimal = new BigDecimal(cartItem.getQuantity());
        this.totalPrice.add(cartItem.getUnitPrice().multiply(quantityInBigDecimal));
    }
}
