# TallerSOLID

1.- La clase pastel y la clase helado estan compartiendo metodos y atributos por lo que estaria violando el principio de responsabilidad unica que nos menciona que, una clase solo debe tener una responsabilidad. Estas dos clases estan haciendo el mismo trabajo por lo que es conveniente separarlo en dos clases distintas cada una con su respectiva responsabilidad.

2.- No se cumple el principio de inversion de dependencia porque el metodo operaciones.aderezo se lo incluye dentro de la clase postre , haciendo uso de este metodo que no es abstracto para modificar otro.

3.-Se viola el princpio de responsabilidad unica porque los metodos calcular y mostrar precio estan relacionados y estas deberian existir en una clase aparte.

4.- El enum se convierte en una clase abstracta donde sus aderezos tendran sus propias implementaciones esto sin alterar la clase padre haciendo referencia al principio de sustitucion de Liskov.

5.- Se viola el principio de Abierto/ Cerrado debido a que un helado no se hace con leche deslactosada y el helado si, osea se hacen de forma distinta, partiendo de esto nuestro programa requiere que unas entiedades dependan de otras, por lo que afectaria otras partes de nuestro codigo.
