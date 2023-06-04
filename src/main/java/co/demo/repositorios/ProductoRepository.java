
package co.demo.repositorios;

import co.demo.modelos.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
    public List<Producto> findByDescripcionLike(String descripcion);
}
