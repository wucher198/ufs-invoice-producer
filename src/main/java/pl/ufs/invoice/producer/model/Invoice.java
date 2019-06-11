package pl.ufs.invoice.producer.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import pl.ufs.invoice.producer.consts.PaymentMethodType;

@Entity
@Data
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String number;
	
	private LocalDate issueDate;
	
	private LocalDate realizationDate;
	
	private PaymentMethodType paymentMethod;
	
	private LocalDate dateOfPayment;
	
	private String accountNumber;
}
