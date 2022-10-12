
/*
    Una Lista Ligada Circular Simple tiene a su ultimo nodo apuntando al inicio de la lista,
    la lista utiliza dos variables Node que sirven para auxiliar la posicion del primer y ultimo Nodo,
    el nodo Head sera el nodo que siempre estara al inicio de la lista mientras que last sera el nodo
    que se encuentra al final de lista. El nodo last apunta al primer nodo de la lista (head)
*/

public class CircularLinkedList {

    /*Nodo auxiliar que siempre estara apuntando al nodo que este al inicio de la lista*/
    Node header = null;
    /*Nodo auxiliar que siempre estara apuntando al nodo que este al final de la lista*/
    Node last = null;
    /*Tamaño de la lista*/
    int size;

    CircularLinkedList() {
        size = 0;
    }

    boolean isEmpty(){
        return header == null;
    }

    /*Añade un Nodo a la lista*/
    void add(int number){
        /*Se instancia el nodo con el valor numero ingresado*/
        Node node = new Node(number);

        /*Si la lista esta vacia se añade el primer Nodo*/
        if ( isEmpty() ){
            header = last = node;
        } else {
            /*
                Si ya existen mas de un Nodo en la lista, se agrega un nuevo nodo al final de la lista,
                last apuntara al nuevo Nodo agregado
            */
            last.next = node;
            last = node;
        }
        last.next = header;
        size++;
    }

    /*Muestra el contenido de la Lista Ligada Circular Simple*/
    void show(){
        Node node = header;
        /*
            La lista forma un circulo, por lo cual la condicion de paro sera la siguiente. Iniciamos
            en header y recorremos toda la lista hasta que llegamos de nuevo a header, de esta forma
            se entiende que ha recorrido toda la lista circular
        */
        do {
            System.out.println( node.getNumber() );
            node = node.next;
        }while (node != header);
    }

    /*Busca el Nodo, si lo encuentra retorna el Nodo sino simplemente retorna null*/
    Node search(int number){
        Node node = header;
        do {
            if (number == node.number)
                return node;
            node = node.next;
        }while (node != header);

        return null;
    }

    /*
        Metodo que elimina todos los nodos que contengan el numero ingresado, el metodo removera
        todos los nodos que contengan el numero
     */
    void delete (int number) {

        /*
            Primero eliminamos el numero si esta al principio de la lista (si es el primero)
            esto se hara consecutivamente hasta que el numero no aparezca primero
        */
        while (header.number == number)
            deleteFirst();

        /*
            Despues eliminamos el numero si se encuentra al final, el metodo dentro del bucle
            eliminara hasta que el numero no aparezca al final de la lista ligada simple
        */
        while (last.number == number)
            deleteLast();

        /*
            Si el nodo que contiene el numero ya no esta ni al inicio ni al final entonces
            se presupone que esta en medio, este metodo eliminara todos los nodos que contengan
            el numero que queremos eliminar
        */
        for (Node aux = header; aux != last; aux = aux.next)
            while(aux.next.number == number) {
                aux.next = aux.next.next;
                size--;
            }
    }

    /*
        Elimina primero, el nodo apuntador header siempre se debe de reasignar,
        header sera igual al nodo siguiente del nodo header, es importante que el nodo last ahora apunte al
        nuevo nodo header (Primer nodo de la lista)
     */
    void deleteFirst () {
        if (isValid()){
            header = header.next;
            last.next = header;
            size--;
        }
    }

    /*
        Elimina el nodo al final de la lista, last se reasigna al nodo anterior a last, es importante que
        el nuevo nodo last apunte a header (Primer nodo de la lista)
     */
    void deleteLast () {
        if (isValid()) {
            Node i;
            for ( i = header; i.next != last; i = i.next);
            i.next = header;
            last = i;
            size--;
        }
    }

    /*
        Metodo que valida si la lista ligada esta vacia, si esta vacia muestra un mensaje, sino ahora
        validara que la lista solo tenga un Nodo, header y last ahora seran nulos y el valor de la lista
        volvera a ser de cero
    */
    boolean isValid () {
        if ( isEmpty() ){
            System.out.println("List Empty");
        } else if (header == last){
            header = last = null;
            size = 0;
        }
        return header != null;
    }

    /*Retorna el tamaño de la lista*/
    int getSize () {
        return size;
    }

}
