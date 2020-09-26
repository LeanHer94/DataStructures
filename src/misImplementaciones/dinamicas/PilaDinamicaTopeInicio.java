package misImplementaciones.dinamicas;

import miApi.PilaTDA;

public class PilaDinamicaTopeInicio implements PilaTDA {
    class Nodo {
        int valor;
        Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    Nodo inicio;

    @Override
    public void apilar(int x) {
        Nodo nuevo = new Nodo(x);

        nuevo.siguiente = this.inicio;

        this.inicio = nuevo;
    }

    @Override
    public void desapilar() {
        if (this.inicio != null) {
            this.inicio = this.inicio.siguiente;
        }
    }

    @Override
    public int tope() {
        return this.inicio.valor;
    }

    @Override
    public boolean pilaVacia() {
        return this.inicio == null;
    }

    @Override
    public void inicializarPila() {
        this.inicio = null;
    }

    @Override
    public void imprimirValores() {
        PilaTDA aux = new PilaDinamicaTopeInicio();

        while (!this.pilaVacia()) {
            System.out.println(this.tope());
            aux.apilar(this.tope());
            this.desapilar();
        }

        while (!aux.pilaVacia()) {
            this.apilar(aux.tope());
            aux.desapilar();
        }
    }

    @Override
    public void imprimirComparativa(PilaTDA comparar) {

    }
}