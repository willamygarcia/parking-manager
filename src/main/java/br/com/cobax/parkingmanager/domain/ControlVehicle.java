package br.com.cobax.parkingmanager.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.cobax.parkingmanager.enums.TypeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ControlVehicle  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_ContrlVe")
	private Long id;
	
	private LocalDateTime dateRecord = LocalDateTime.now();
	
	private TypeRecord typeRecord;
	
	private Vehicle viVehicle;
	@Column(name = "usuario_id")
	private User user;
	
	
	
	
	
}
