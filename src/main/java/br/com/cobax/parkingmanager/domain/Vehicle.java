package br.com.cobax.parkingmanager.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.cobax.parkingmanager.enums.PorteVeiculo;
import br.com.cobax.parkingmanager.enums.TypeVehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_VEIC")
	private Long id;
	
	private TypeVehicle typeVehicle;
	
	private PorteVeiculo porte;
	
	private Double priceParking;	
}
