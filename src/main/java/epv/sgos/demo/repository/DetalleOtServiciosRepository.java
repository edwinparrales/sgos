package epv.sgos.demo.repository;

import epv.sgos.demo.entities.DetalleOtServicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DetalleOtServiciosRepository extends JpaRepository<DetalleOtServicios, Integer>, JpaSpecificationExecutor<DetalleOtServicios> {

}