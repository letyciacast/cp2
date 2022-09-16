package br.com.fiap;

public class Musica implements Comparable<Musica> {
    // BO BEAN Model POJO Entity Resource
    private String titulo;
    private String album;
    private String artista;
    private int nota;
    private String generoMusical;
    
    public Musica (String titulo, String album, String artista, int nota, String generoMusical) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.nota = nota;
        this.generoMusical = generoMusical;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public int compareTo(Musica o) {
        // TODO Auto-generated method stub
        return 0;
    }
}

    