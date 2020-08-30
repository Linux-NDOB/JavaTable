
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Linux {

        public static void main (String[] args){

            try{

                int Option,Exit;

                Kali tux = new Kali();

                do {

                    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
                    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));

                    UIManager UI=new UIManager();
                    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
                    UIManager.put("Panel.background",new ColorUIResource(238,238,238));


                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "     ----------------Main Menu----------------\n"+"\n"+

                                    "1. Ingresar datos:  \n"+"\n"+

                                    "2. Cantidad de datos ingresados por rangos:  \n"+"\n"+

                                    "3. Porcentaje de datos ingresados por rangos " +"\n"+
                                       "respecto al numero de ingresos validos(15). \n"+"\n"+

                                    "4. Cantidad de opciones invalidas registradas "+ "\n" +"\n"+

                                    "5. Salir.\n"+"\n"+

                                    " Porfavor ingrese una opcion : "));


                    switch (Option) {
                        case 1 -> tux.setDatos();
                        case 2 -> tux.ingresadosRango();
                        case 3 -> tux.mostrarPorcentajes();
                        case 4 -> tux.cantInvalidos();
                        case 5 -> Exit = JOptionPane.showConfirmDialog(null, "¿Desea salir del Menu?");
                        default -> JOptionPane.showMessageDialog(null, "Esta opcion no es Valida ");
                    }


                }while (Option != 5);


                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "Favor no hacer esto");


            }
        }
    }




