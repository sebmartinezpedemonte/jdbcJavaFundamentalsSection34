package org.smartinez.java.jdbc.modelo.repositorio;

import java.util.List;

public interface Repositorio<T> {
    //esta clase se encarga de to do lo que es consultas
    //y operaciones en la base de datos
    //esto es el CRUD Create, Read, Update and Delete
    //Aca se usa patron de diseño DAO o DTO
    List<T> listar(); //findAll

    T porId(Long id); //lookById

    void guardar(T t);
    //recibe objeto generico de tipo T
    //en nuestro caso va a ser el producto con todos los datos mapeados
    //o con todos los datos que queremos guardar

    void eliminar(Long id);
}
