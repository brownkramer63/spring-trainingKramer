package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentsDetails")
@Data
@NoArgsConstructor
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal mechantPayoutAmount;
    private BigDecimal commissionAmount;

    @Column(columnDefinition = "Date")
    private LocalDate payoutDate;

    public PaymentDetail(BigDecimal mechantPayoutAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.mechantPayoutAmount = mechantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
