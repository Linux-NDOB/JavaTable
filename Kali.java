import javax.swing.*;

public class Kali {

    //Numero que se introduce para su analisis
    private int numero;

    //Contadores de los intervalos
    private int contUno;

    private int contDos;

    private int contTres;

    private int contCuatro;

    private int contCinco;

    private int contIntentos;

    public Kali() {

        numero = 0;

        contUno = 0;

        contDos = 0;

        contTres = 0;

        contCuatro = 0;

        contCinco = 0;

        contIntentos = 0;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getContUno() {
        return contUno;
    }

    public void setContUno(int contUno) {
        this.contUno = contUno;
    }

    public int getContDos() {
        return contDos;
    }

    public void setContDos(int contDos) {
        this.contDos = contDos;
    }

    public int getContTres() {
        return contTres;
    }

    public void setContTres(int contTres) {
        this.contTres = contTres;
    }

    public int getContCuatro() {
        return contCuatro;
    }

    public void setContCuatro(int contCuatro) {
        this.contCuatro = contCuatro;
    }

    public int getContCinco() {
        return contCinco;
    }

    public void setContCinco(int contCinco) {
        this.contCinco = contCinco;
    }

    public int getContIntentos() {
        return contIntentos;
    }

    public void setContIntentos(int contIntentos) {
        this.contIntentos = contIntentos;
    }

    public void setDatos(){

        int intentosValidos = 15;

        for(int i = 0; i < intentosValidos ; i=i){

            numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Porfavor ingrese un numero: "));

            if(numero >=0 && numero <=5)
            {
                contUno++;
                i++;
            }

            if(numero >=6 && numero <=11)
            {
                contDos++;
                i++;
            }

            if(numero >=12 && numero <=15)
            {
                contTres++;
                i++;
            }

            if(numero >=16 && numero <=20)
            {
                contCuatro++;
                i++;
            }

            if(numero >20)
                contCinco++;

    }

    }

    public void ingresadosRango(){

        String info = "La cantidad de datos ingresados por rango es:"+"\n";

        info += "Datos ingresados de 0-5: " + contUno + "\n";

        info += "Datos ingresados de 6-11: "+ contDos + "\n";

        info += "Datos ingresados de 12-15: "+ contTres + "\n";

        info += "Datos ingresados de 16-20: "+ contCuatro + "\n";

        JOptionPane.showMessageDialog(null, info);

    }

    public void mostrarPorcentajes(){

        float porcentajeUno;

        porcentajeUno = (float)((contUno*100)/15);

        float porcentajeDos;

        porcentajeDos = (float)((contDos*100)/15);

        float porcentajeTres;

        porcentajeTres = (float)((contTres*100)/15);

        float porcentajeCuatro;

        porcentajeCuatro = (float)((contCuatro*100)/15);

        String info = "La cantidad de datos ingresados por rango es:"+"\n";

        info += "Porcentaje Datos ingresados de 0-5: " + porcentajeUno + "\n";

        info += "Porcentaje Datos ingresados de 6-11: "+ porcentajeDos + "\n";

        info += "Porcentaje Datos ingresados de 12-15: "+ porcentajeTres + "\n";

        info += "Porcentaje Datos ingresados de 16-20: "+ porcentajeCuatro + "\n";

        JOptionPane.showMessageDialog(null, info);


    }

    public void cantInvalidos(){

        JOptionPane.showMessageDialog(null,
                              "La cantidad de intentos invalidos es: " + contCinco);

    }

}
