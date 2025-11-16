package ejerciciosTema3;

import java.util.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lectores_y_escritores {

    // Recurso compartido
    private static int recurso = 0;

    // Lock para controlar acceso
    private static final ReadWriteLock lock = new ReentrantReadWriteLock();

    // Clase para hebra lectora
    static class Lectora implements Runnable {
        private final int id;

        public Lectora(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.readLock().lock();
            try {
                System.out.println("Lectora " + id + " lee valor: " + recurso);
            } finally {
                lock.readLock().unlock();
            }
        }
    }

    // Clase para hebra escritora
    static class Escritora implements Runnable {
        private final int id;

        public Escritora(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.writeLock().lock();
            try {
                int nuevoValor = ThreadLocalRandom.current().nextInt(0, 10001);
                recurso = nuevoValor;
                System.out.println("Escritora " + id + " escribe valor: " + recurso);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        // Configuración: número de lectoras y escritoras
        int numLectoras = 5;
        int numEscritoras = 3;

        // Si se pasan argumentos, se usan
        if (args.length == 2) {
            numLectoras = Integer.parseInt(args[0]);
            numEscritoras = Integer.parseInt(args[1]);
        }

        List<Thread> hebras = new ArrayList<>();

        // Crear lectoras
        for (int i = 1; i <= numLectoras; i++) {
            hebras.add(new Thread(new Lectora(i)));
        }

        // Crear escritoras
        for (int i = 1; i <= numEscritoras; i++) {
            hebras.add(new Thread(new Escritora(i)));
        }

        // Lanzar todas las hebras
        for (Thread t : hebras) {
            t.start();
        }

        // Esperar a que terminen
        for (Thread t : hebras) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado.");
    }
}

