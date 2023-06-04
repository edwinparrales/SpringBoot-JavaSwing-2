
package co.demo.servicios;

import co.demo.modelos.Categoria;
import co.demo.repositorios.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {
    
  @Autowired
  private final CategoriaRepository cr;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.cr = categoriaRepository;
    }
  
    public List<Categoria> listarCategorias(){
        
        return cr.findAll();
        
    }
    
    
  
  
  
  
  
    
}
