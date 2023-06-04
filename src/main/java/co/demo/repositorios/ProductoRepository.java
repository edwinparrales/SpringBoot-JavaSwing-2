
package co.demo.repositorios;

import co.demo.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
}
