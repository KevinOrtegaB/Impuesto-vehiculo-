import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.Color.*;

public class JFImpuestos extends JFrame
{
    private JPanel p1,p2,p3;
    private JLabel lblMarca,lblModelo,lblLinea,lblValor,lblTotal;
    private JTextArea txtMarca,txtModelo,txtLinea,txtValor,txtTotal;
    private JButton btnBuscar,btnLimpiar,btnCalcular;
    private JCheckBox checkProntoPago,checkTranslado,checkServicio;
    
    public JFImpuestos()
    {
       setTitle("Cálculo impuestos");
       setVisible(true);
       setSize(300,430);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(new BorderLayout()); 
       
       p1=new JPanel();
       p1.setLayout(new GridLayout(5,2,5,5));
       p1.setPreferredSize(new Dimension (300,200));       
       p1.setBorder(new TitledBorder("Datos del vehiculo"));
       
       p2=new JPanel();
       p2.setLayout(new FlowLayout());
       p2.setPreferredSize(new Dimension (300,130));       
       p2.setBorder(new TitledBorder("Descuentos"));
       
       p3=new JPanel();
       p3.setLayout(new GridLayout(2,3,5,5));
       p3.setPreferredSize(new Dimension (300,100));       
       p3.setBorder(new TitledBorder("Resultados"));
       
       
       add(p1,BorderLayout.NORTH);
       add(p2,BorderLayout.CENTER);
       add(p3,BorderLayout.SOUTH);
       
       lblMarca = new JLabel("Marca");
       lblLinea = new JLabel("Linea");
       lblModelo = new JLabel("Modelo");
       lblValor = new JLabel("Valor");
       btnBuscar = new JButton("Buscar");
       
       txtMarca = new JTextArea("");
       txtLinea = new JTextArea("");
       txtModelo = new JTextArea("");
       txtValor = new JTextArea("");
       
       p1.add(lblMarca);
       p1.add(txtMarca);
       p1.add(lblLinea);
       p1.add(txtLinea);
       p1.add(lblModelo);
       p1.add(txtModelo);
       p1.add(lblValor);
       p1.add(txtValor);
       p1.add( new JLabel( "" ) );
       p1.add(btnBuscar);
       
       
       checkProntoPago = new JCheckBox("Pronto pago",false);
       checkTranslado = new JCheckBox("Translado de cuenta",false);
       checkServicio= new JCheckBox("Servicio público",false);
       
       p2.add(checkProntoPago);
       p2.add(checkTranslado);
       p2.add(checkServicio);
       
       
       lblTotal = new JLabel("Total a pagar");
       txtTotal = new JTextArea("$0");
       btnCalcular = new JButton("Calcular");
       btnLimpiar = new JButton("Limpiar");
       txtTotal.setEditable( false );
       txtTotal.setForeground( Color.BLUE );
       txtTotal.setBackground( Color.WHITE );
       
       p3.add( new JLabel( "" ) );
       p3.add( new JLabel( "" ) );
       p3.add(btnLimpiar);
       p3.add(lblTotal);
       p3.add(txtTotal);
       p3.add(btnCalcular);
       
    }

    
}
