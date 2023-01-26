## **Lista Circular Simple Ligada**

El proyecto contiene las siguientes clases:

* **`CircularLinkedList`** donde se establece la lógica de la lista circular simple ligada.
* **`Node`** contiene la informacion de un nodo.
* **`test`** prueba un ejemplo para observar el funcionamiento de la lista circular simple ligada.

### **Tipo de Lista**

A continuación describimos las caracteristicas de una Lista Simple Doblemente Ligada.

**Lista Circular** En la siguiente imagen vemos que en la lista circular se conecta el inicio con el final (Pueden tener un enlace o dos enlaces dependiendo del tipo de Nodo)

![Circular](https://user-images.githubusercontent.com/115047831/207787409-543bef3c-5d1d-477f-94ac-026f9b020b35.png)

### **Tipo de Nodo**

Un **Nodo Simple** solo apuntará al siguiente Nodo. En las listas circulares el último nodo apunta al primer nodo de la lista.

![Unique](https://user-images.githubusercontent.com/115047831/207787501-3af9c726-4cce-4120-8b49-2bac880bd026.png)

## Agregar Nodo

**Cuando agregamos un nuevo Nodo siempre se añadira al final de la Lista. En una lista circular el último nodo debe apuntar al inicio de la lista.**

Tenemos la siguiente lista con los siguientes nodos: El Nodo 1 (Naranja) es el primero nodo en la lista **(Header)**, el Nodo 2 (Azul), el Nodo 3 (Verde) y el Nodo 4 (Rojo) el cual es el último nodo **(Last)**. Notese como en las listas circulares ningún nodo apunta a null ya que el último nodo apunta al primer nodo.

![CircularLinkedList1](https://user-images.githubusercontent.com/115047831/214815890-cc0560de-bdc6-4c60-858d-a42ef85e9ab7.png)

Ahora que agregamos el Nodo 5 (Morado) debemos saber que la **variable last** esta apuntando al Nodo 5 (Morado) ya que ahora es el último nodo de la lista.

![CircularLinkedList2](https://user-images.githubusercontent.com/115047831/214816087-c7d30247-5789-47d0-b605-d9649404fb81.png)

## Eliminar Nodo

**Se elimina un Nodo por su valor númerico, se elimnarán todos los valores con este dígito.**

En el siguiente ejemplo podemos observar que el Nodo 1 (Naranja) se repite 5 veces en la lista, el objetivo es eliminar todos los nodos que coinciden con el número 1, independientemente de su posición en la lista deberán ser eliminados. El método **`delete`** se compone de tres partes, si identifica que el Nodo ha eliminar está al inicio de la lista  entonces ejecutará el método **`deleteFirst`** mientras que detecte que el valor sigue al inicio de la lista. Posteriormente buscará el nodo que esta al final de la lista, si coincide con el número a eliminar continuara eliminandolo ejecutando el método **`deleteLast`** hasta que no este al final de la lista. Finalmente buscará el valor númerico del nodo unicamente en el medio de la lista.

![CircularLinkedList3](https://user-images.githubusercontent.com/115047831/214820621-05737fc2-c077-4a03-ad63-46d681447b3f.png)

En la siguiente imagen podemos observar que todos los Nodos 1 (Naranja) han sido removidos de la lista.

![CircularLinkedList4](https://user-images.githubusercontent.com/115047831/214820763-20a619b0-24b3-4b02-8035-9d5851bb9aaf.png)

## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir la **Lista Circular Simple Ligada**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos de la lista.

![UML (2)](https://user-images.githubusercontent.com/115047831/214822368-9cba39fb-dabf-47be-9b2f-a7f2e8605cf7.png)
