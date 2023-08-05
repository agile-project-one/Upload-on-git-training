package com.projectone.cart.service;

import com.projectone.cart.entity.CartItem;
import com.projectone.cart.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getCartItemsByUserId(Long userId) {
        return cartItemRepository.findByUserId(userId);
    }

    public CartItem addToCart(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    // You can add additional methods to update or delete cart items if required.
}
