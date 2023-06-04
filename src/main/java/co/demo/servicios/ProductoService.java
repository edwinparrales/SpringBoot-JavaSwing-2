/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.demo.servicios;

import co.demo.modelos.Producto;
import co.demo.repositorios.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository pr;
    
    public  List<Producto> listar(){
    
       return pr.findAll();
    }
    
}
