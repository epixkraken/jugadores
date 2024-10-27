public class Jugadores {
//Atributos - Propiedades - Estados

private String nombre;
private String numero;
private String posicion;
private String edad;
private String club;
private String valormercado;

//Constructores

public Jugadores(){}

    //Polimorfismos

//Métodos Set y Get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getValormercado() {
        return valormercado;
    }

    public void setValormercado(String valormercado) {
        this.valormercado = valormercado;
    }


//Métodos propios y de Cálculo

    public String verDetalle(){
    String dv = "\n" + "Nombre: " + this.nombre + "\n" + "Número: " + this.numero
            + "\n" + "Posición: " + this.posicion + "\n" + "Edad: " + this.edad + "\n"
            + "Club: " + this.club + "\n" + "Valor Mercado: " + this.valormercado;
        return dv;
    }
}




