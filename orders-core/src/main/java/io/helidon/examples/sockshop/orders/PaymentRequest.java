package io.helidon.examples.sockshop.orders;

import lombok.Builder;
import lombok.Data;

/**
 * Payment request that is sent to Payment service for authorization.
 */
@Data
@Builder
public class PaymentRequest {
    /**
     * Order identifier.
     */
    private String orderId;

    /**
     * Customer information.
     */
    private Customer customer;

    /**
     * Billing address.
     */
    private Address address;

    /**
     * Payment card details.
     */
    private Card card;

    /**
     * Payment amount.
     */
    private float amount;
}
