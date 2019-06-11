package pl.ufs.invoice.producer.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import pl.ufs.invoice.producer.consts.UnitType;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Short ordinalNumber;
	
	private String description;
	
	private BigDecimal netPrice;
	
	private Integer quantity;
	
	@Enumerated(EnumType.STRING)
	private UnitType unit;

	private Integer valueAddedTax;
}
