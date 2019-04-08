package com.example.myapp;

public class Reporte{
    private String id;
    private String titulo;
    private String imagen;


        public Reporte(String id, String titulo, String imagen) {
            this.id = id;
            this.titulo = titulo;
            this.imagen = imagen;
        }
         public Reporte( String imagen, String titulo) {

             this.titulo = titulo;
            this.imagen = imagen;
    }

        public Reporte() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
}
