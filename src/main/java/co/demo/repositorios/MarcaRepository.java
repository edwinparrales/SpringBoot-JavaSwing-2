
package co.demo.repositorios;

import co.demo.modelos.Marca;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarcaRepository extends JpaRepository<Marca,Long> {
    
}
