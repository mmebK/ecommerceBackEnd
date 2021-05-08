package com.meb.ecommerce.dto;


import com.meb.ecommerce.entity.Address;
import com.meb.ecommerce.entity.Customer;
import com.meb.ecommerce.entity.Order;
import com.meb.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
