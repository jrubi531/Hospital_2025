import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
        //Crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital.SCL");
        miVentana.setSize(700,500);
        miVentana.setBackground(null);

        //crear un texto con JLabel
        JLabel texto = new JLabel();
        texto.setText("hola mundo");
        miVentana.add(texto);

        miVentana.setVisible(true);


    }
}