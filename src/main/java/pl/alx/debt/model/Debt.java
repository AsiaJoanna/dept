package pl.alx.debt.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private LocalDateTime createdAt;

    private boolean paidOff;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "lender_id")
    private User lender;

    @ManyToOne
    @JoinColumn(name = "debtor_id")
    private Debtor debtor;



}
