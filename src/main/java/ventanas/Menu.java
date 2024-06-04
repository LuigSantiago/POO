/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import com.proyectoudc.subastas.Articulos;
import com.proyectoudc.subastas.Ofertas;
import java.util.Arrays;
import java.awt.Color;
import java.util.HashMap;
import com.proyectoudc.subastas.Usuarios;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    private TableRowSorter<DefaultTableModel> sorter;
    private DefaultTableModel model;
    private int rowIndex;
    
    private TableRowSorter<DefaultTableModel> sorter2;
    private DefaultTableModel model2;
    private int rowIndex2;
    
    public boolean isCellEditable(int row, int column) {
                return false;
              }
    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Tab1.setBackground(new Color(82,0,184));
        BAC.setVisible(false);
        JP1.setVisible(true);
        JP2.setVisible(false);
        JP3.setVisible(false);
        JP4.setVisible(false);
        
        PNR.setVisible(true);
        JIP10.setVisible(false);
        JIP11.setVisible(false);
        JIP12.setVisible(false);
   
        //funcion de asignar una categoria a un articulo
    CategoriasComboBox.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
        // Obtiene la categoría seleccionada
        String categoriaSeleccionada = (String) e.getItem();
        // Actualiza el JComboBox de subcategorías
        switch (categoriaSeleccionada) {
            case "Electronica":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "telefonos moviles y accesorios", "Computadoras y accesorios", "Fotografía y video", "Audio y video", "Wearables"}));
                break;
            case "Moda y Ropa":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "ropa de mujer", "ropa de hombre", "ropa de niños", "zapatos", "accesorios"}));
                break;
            case "Hogar y Jardin":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "decoracion del hogar", "muebles", "cocina y comedor", "jardin"}));
                break;
            case "Salud y Belleza":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "cuidado de la piel", "maquillaje", "cuidado del cabello", "perfumes y fragancias", "salud y bienestar"}));
                break;
            case "Deportes y Entretenimiento":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "deportes al aire libre", "deportes de interior", "hobbies y creatividad", "juguetes y juegos"}));
                break;    
            case "Vehiculos":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "accesorios para automoviles", "accesorios para motocicletas", "mantenimiento y cuidado"}));
                break;
            case "Juguetes y Niños":
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Ninguna", "juguetes para bebes", "juguetes para niños", "juegos educativos"}));
                break;   
            default:
                SubcategoriasComboBox.setModel(new DefaultComboBoxModel<>()); // Vacía el ComboBox
        }
 }
});
          
   Collection<Articulos> datos = Articulos.getArticulosBD().values();            
          List<Articulos> listaArticulos = new ArrayList(datos);
          String columnas[] = {"Nombre", "InforEstado", "Precio", "Categoria", "Subcategoria", "ID", "Vendedor"};
          int totalArticulos = listaArticulos.size();
          String filas [][] = new String[totalArticulos][columnas.length];
          for(int i = 0; i <listaArticulos.size(); i++ ){
              Articulos A = listaArticulos.get(i);
              
              
              
              
          }
          DefaultTableModel datosTabla = new DefaultTableModel();
          datosTabla.setDataVector(filas, columnas);
          ArticulosResultado.setModel(datosTabla);
          ArticulosResultado.setAutoCreateRowSorter(true);
          sorter = new TableRowSorter<>(datosTabla);
          ArticulosResultado.setRowSorter(sorter);
          ArticulosResultado.getTableHeader().setReorderingAllowed(false);
          
          
          DefaultTableModel datosTabla2 = new DefaultTableModel();
          datosTabla2.setDataVector(filas, columnas);
          MisVentasRes.setModel(datosTabla2);
          MisVentasRes.setAutoCreateRowSorter(true);
          sorter2 = new TableRowSorter<>(datosTabla2);
          MisVentasRes.setRowSorter(sorter2);
          MisVentasRes.getTableHeader().setReorderingAllowed(false);
       }
    
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        Tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Tab3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Tab4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        JP1 = new javax.swing.JPanel();
        PNR = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        JIP10 = new javax.swing.JPanel();
        BarraBusqueda = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        IBN = new javax.swing.JButton();
        IBR = new javax.swing.JButton();
        IBSA = new javax.swing.JButton();
        NombreL = new javax.swing.JLabel();
        IconoUsuario = new javax.swing.JLabel();
        JIP11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ArticulosResultado = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel29 = new javax.swing.JLabel();
        DescripcionCampo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        OfrecerBoton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        OtrasOfertas = new javax.swing.JTextArea();
        JTFP = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JLEM = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        OOM = new javax.swing.JLabel();
        OML = new javax.swing.JLabel();
        JIP12 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        LabelInstruccion = new javax.swing.JLabel();
        LabelNombreArticulo = new javax.swing.JLabel();
        CampoTextoNombreArt = new javax.swing.JTextField();
        CampoTextoDescArt = new javax.swing.JTextField();
        LabelDescripcionArticulo = new javax.swing.JLabel();
        LabelInfoArticulo = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        LabelPrecioBase = new javax.swing.JLabel();
        PanelBotonAceptar = new javax.swing.JPanel();
        BotonCancelarLabel = new javax.swing.JLabel();
        LabelInfoSubida = new javax.swing.JLabel();
        CategoriasComboBox = new javax.swing.JComboBox<>();
        SubcategoriasComboBox = new javax.swing.JComboBox<>();
        LabelSelecionCateg = new javax.swing.JLabel();
        LabelSeleccionSubcateg = new javax.swing.JLabel();
        JTextFieldPrecioBase = new javax.swing.JTextField();
        CampoTextoInfoEstad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        JP2 = new javax.swing.JPanel();
        JIP21 = new javax.swing.JPanel();
        MisVentas = new javax.swing.JPanel();
        MisCompras = new javax.swing.JPanel();
        JIP22 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        MisVentasRes = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        MID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        OMY = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        OFT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        JP3 = new javax.swing.JPanel();
        JIP30 = new javax.swing.JPanel();
        BIS = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BRG = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BAC = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JIP31 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JIP32 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LabelNombre4 = new javax.swing.JLabel();
        LabelContraseña2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        JPFIS = new javax.swing.JPasswordField();
        JTFNIS = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ISR = new javax.swing.JLabel();
        LabelBienvenido2 = new javax.swing.JLabel();
        JIP33 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        JPHR = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        LabelContraseña1 = new javax.swing.JLabel();
        LabelNombre3 = new javax.swing.JLabel();
        LabelNombre2 = new javax.swing.JLabel();
        LabelNombre1 = new javax.swing.JLabel();
        JTFRNU = new javax.swing.JTextField();
        JTFRDID = new javax.swing.JTextField();
        JTFRCE = new javax.swing.JTextField();
        JPFRC = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        JLERR = new javax.swing.JLabel();
        LabelBienvenido1 = new javax.swing.JLabel();
        JIP34 = new javax.swing.JPanel();
        LabelBienvenido3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        LabelContraseña3 = new javax.swing.JLabel();
        LabelNombre7 = new javax.swing.JLabel();
        LabelNombre6 = new javax.swing.JLabel();
        LabelNombre5 = new javax.swing.JLabel();
        JTFECE = new javax.swing.JTextField();
        JTFEDID = new javax.swing.JTextField();
        JTFEC = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        JLBAUER = new javax.swing.JLabel();
        JLENU = new javax.swing.JLabel();
        JP4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jEditorPane1);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        Tab1.setBackground(new java.awt.Color(51, 0, 153));
        Tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        javax.swing.GroupLayout Tab1Layout = new javax.swing.GroupLayout(Tab1);
        Tab1.setLayout(Tab1Layout);
        Tab1Layout.setHorizontalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab1Layout.setVerticalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tab2.setBackground(new java.awt.Color(51, 0, 153));
        Tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mis Datos");

        javax.swing.GroupLayout Tab2Layout = new javax.swing.GroupLayout(Tab2);
        Tab2.setLayout(Tab2Layout);
        Tab2Layout.setHorizontalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab2Layout.setVerticalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tab3.setBackground(new java.awt.Color(51, 0, 153));
        Tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cuenta");

        javax.swing.GroupLayout Tab3Layout = new javax.swing.GroupLayout(Tab3);
        Tab3.setLayout(Tab3Layout);
        Tab3Layout.setHorizontalGroup(
            Tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab3Layout.setVerticalGroup(
            Tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tab4.setBackground(new java.awt.Color(51, 0, 153));
        Tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Servicio al Cliente");

        javax.swing.GroupLayout Tab4Layout = new javax.swing.GroupLayout(Tab4);
        Tab4.setLayout(Tab4Layout);
        Tab4Layout.setHorizontalGroup(
            Tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab4Layout.setVerticalGroup(
            Tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Subastas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        JP1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Para acceder a la plataforma registrese o inicie sesion");

        javax.swing.GroupLayout PNRLayout = new javax.swing.GroupLayout(PNR);
        PNR.setLayout(PNRLayout);
        PNRLayout.setHorizontalGroup(
            PNRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNRLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addGap(302, 302, 302))
        );
        PNRLayout.setVerticalGroup(
            PNRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNRLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(427, 427, 427))
        );

        JIP10.setBackground(new java.awt.Color(102, 0, 204));

        BarraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarraBusquedaKeyReleased(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(102, 0, 204));
        BotonBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Subastas\\rsc\\search-circle-sharp-icon.png")); // NOI18N
        BotonBuscar.setBorder(null);
        BotonBuscar.setBorderPainted(false);
        BotonBuscar.setContentAreaFilled(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        IBN.setBackground(new java.awt.Color(102, 0, 204));
        IBN.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Subastas\\rsc\\bell-icon.png")); // NOI18N
        IBN.setBorder(null);
        IBN.setBorderPainted(false);
        IBN.setContentAreaFilled(false);

        IBR.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Subastas\\rsc\\gift-icon.png")); // NOI18N
        IBR.setBorder(null);
        IBR.setBorderPainted(false);
        IBR.setContentAreaFilled(false);

        IBSA.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Subastas\\rsc\\upload-icon.png")); // NOI18N
        IBSA.setBorder(null);
        IBSA.setBorderPainted(false);
        IBSA.setContentAreaFilled(false);
        IBSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IBSAActionPerformed(evt);
            }
        });

        NombreL.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        IconoUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Subastas\\rsc\\User-Solid-Circle-icon.png")); // NOI18N

        javax.swing.GroupLayout JIP10Layout = new javax.swing.GroupLayout(JIP10);
        JIP10.setLayout(JIP10Layout);
        JIP10Layout.setHorizontalGroup(
            JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(IconoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(IBN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(IBR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(IBSA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        JIP10Layout.setVerticalGroup(
            JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIP10Layout.createSequentialGroup()
                        .addGroup(JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IBSA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IBR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IBN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP10Layout.createSequentialGroup()
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(JIP10Layout.createSequentialGroup()
                            .addGroup(JIP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BarraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
            .addComponent(IconoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ArticulosResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        ArticulosResultado.setRowHeight(40);
        ArticulosResultado.setRowMargin(2);
        ArticulosResultado.setSelectionBackground(new java.awt.Color(153, 153, 153));
        ArticulosResultado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ArticulosResultado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ArticulosResultado.setShowHorizontalLines(true);
        ArticulosResultado.setShowVerticalLines(true);
        ArticulosResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticulosResultadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ArticulosResultado);

        jLabel26.setText("ID");

        jTextPane1.setEnabled(false);

        jLabel29.setText("Descripcion");

        DescripcionCampo.setColumns(20);
        DescripcionCampo.setRows(5);
        DescripcionCampo.setEnabled(false);

        jButton1.setText("Agregar comentario");

        jLabel30.setText("agregar un comentario acerca del vendedor");

        OfrecerBoton.setText("Ofrecer");
        OfrecerBoton.setEnabled(false);
        OfrecerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfrecerBotonActionPerformed(evt);
            }
        });

        OtrasOfertas.setColumns(20);
        OtrasOfertas.setRows(5);
        OtrasOfertas.setEnabled(false);
        jScrollPane4.setViewportView(OtrasOfertas);

        JTFP.setEnabled(false);
        JTFP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFPKeyTyped(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Para participar ofrece una suma ");
        jLabel27.setToolTipText("");

        jLabel28.setText("la suma debe ser mayor a la anterior mas alta");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("todas las ofertas");

        jLabel33.setText("Vendedor:");

        OOM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OML.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JIP11Layout = new javax.swing.GroupLayout(JIP11);
        JIP11.setLayout(JIP11Layout);
        JIP11Layout.setHorizontalGroup(
            JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JIP11Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JIP11Layout.createSequentialGroup()
                        .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescripcionCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane4)
                    .addComponent(OfrecerBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JIP11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLEM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIP11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1)
                            .addGroup(JIP11Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addGroup(JIP11Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(0, 378, Short.MAX_VALUE))))
                    .addGroup(JIP11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        JIP11Layout.setVerticalGroup(
            JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIP11Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(JIP11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OfrecerBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLEM, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(OML, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OOM, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JIP12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(102, 0, 204));

        LabelInstruccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelInstruccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelInstruccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelInstruccion.setText("Ingrese porfavor los siguientes datos acerca del articulo a publicar");

        LabelNombreArticulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombreArticulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombreArticulo.setText("Nombre del articulo:");

        CampoTextoNombreArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTextoNombreArtActionPerformed(evt);
            }
        });

        LabelDescripcionArticulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelDescripcionArticulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelDescripcionArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelDescripcionArticulo.setText("Descripcion del articulo:");

        LabelInfoArticulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelInfoArticulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelInfoArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelInfoArticulo.setText("Informacion del estado del articulo:");

        BotonCancelar.setText("Cancelar");
        BotonCancelar.setBorder(null);
        BotonCancelar.setBorderPainted(false);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        LabelPrecioBase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelPrecioBase.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrecioBase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelPrecioBase.setText("Precio base del articulo:");

        PanelBotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBotonAceptarMouseClicked(evt);
            }
        });

        BotonCancelarLabel.setText("Aceptar");

        javax.swing.GroupLayout PanelBotonAceptarLayout = new javax.swing.GroupLayout(PanelBotonAceptar);
        PanelBotonAceptar.setLayout(PanelBotonAceptarLayout);
        PanelBotonAceptarLayout.setHorizontalGroup(
            PanelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCancelarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonAceptarLayout.setVerticalGroup(
            PanelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCancelarLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelInfoSubida.setForeground(new java.awt.Color(255, 255, 255));
        LabelInfoSubida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelInfoSubida.setText("Necesitas rellenar todo el formulario para continuar");

        CategoriasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias", "Electronica", "Moda y Ropa", "Hogar y Jardin", "Salud y Belleza", "Deportes y Entretenimiento", "Vehiculos", "Juguetes y Niños", " " }));
        CategoriasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasComboBoxActionPerformed(evt);
            }
        });

        LabelSelecionCateg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelSelecionCateg.setForeground(new java.awt.Color(255, 255, 255));
        LabelSelecionCateg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelSelecionCateg.setText("Seleccione una categoria:");

        LabelSeleccionSubcateg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelSeleccionSubcateg.setForeground(new java.awt.Color(255, 255, 255));
        LabelSeleccionSubcateg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelSeleccionSubcateg.setText("Seleccione una subcategoria (opcional):");

        JTextFieldPrecioBase.setText(" ");
        JTextFieldPrecioBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldPrecioBaseKeyTyped(evt);
            }
        });

        CampoTextoInfoEstad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo", "Usado - Como nuevo", "Usado - Buen estado", "Usado - Aceptable" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(LabelInstruccion, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(371, 371, 371))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(PanelBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelInfoSubida, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelNombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelDescripcionArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CampoTextoNombreArt)
                                    .addComponent(CampoTextoDescArt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoriasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSelecionCateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSeleccionSubcateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SubcategoriasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelInfoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                    .addComponent(CampoTextoInfoEstad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(LabelPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 63, Short.MAX_VALUE))
                                    .addComponent(JTextFieldPrecioBase))))))
                .addGap(136, 136, 136))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSelecionCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTextoNombreArt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDescripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSeleccionSubcateg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTextoDescArt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubcategoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelInfoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrecioBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTextoInfoEstad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(LabelInfoSubida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("¿Desea publicar un articulo?");

        javax.swing.GroupLayout JIP12Layout = new javax.swing.GroupLayout(JIP12);
        JIP12.setLayout(JIP12Layout);
        JIP12Layout.setHorizontalGroup(
            JIP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP12Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(431, 431, 431))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP12Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JIP12Layout.setVerticalGroup(
            JIP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP12Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel13)
                .addGap(42, 42, 42)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JP1Layout = new javax.swing.GroupLayout(JP1);
        JP1.setLayout(JP1Layout);
        JP1Layout.setHorizontalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JIP10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PNR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP1Layout.setVerticalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1Layout.createSequentialGroup()
                .addComponent(JIP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JP1Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(JIP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PNR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP1Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(JIP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(JP1);

        JP2.setBackground(new java.awt.Color(102, 0, 204));

        JIP21.setBackground(new java.awt.Color(102, 0, 204));

        MisVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MisVentasLayout = new javax.swing.GroupLayout(MisVentas);
        MisVentas.setLayout(MisVentasLayout);
        MisVentasLayout.setHorizontalGroup(
            MisVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );
        MisVentasLayout.setVerticalGroup(
            MisVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MisComprasLayout = new javax.swing.GroupLayout(MisCompras);
        MisCompras.setLayout(MisComprasLayout);
        MisComprasLayout.setHorizontalGroup(
            MisComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        MisComprasLayout.setVerticalGroup(
            MisComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JIP21Layout = new javax.swing.GroupLayout(JIP21);
        JIP21.setLayout(JIP21Layout);
        JIP21Layout.setHorizontalGroup(
            JIP21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP21Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(MisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(MisCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        JIP21Layout.setVerticalGroup(
            JIP21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP21Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(JIP21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MisCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );

        JIP22.setBackground(new java.awt.Color(102, 0, 204));

        MisVentasRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        MisVentasRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisVentasResMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(MisVentasRes);

        MID.setEnabled(false);
        MID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDActionPerformed(evt);
            }
        });

        jLabel35.setText("ID:");

        jLabel37.setText("Oferta Mayor:");

        OMY.setEnabled(false);
        OMY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OMYActionPerformed(evt);
            }
        });

        jLabel36.setText("Ofertante");

        OFT.setEnabled(false);

        jButton2.setText("Vender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MID, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OMY, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OFT, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OMY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JIP22Layout = new javax.swing.GroupLayout(JIP22);
        JIP22.setLayout(JIP22Layout);
        JIP22Layout.setHorizontalGroup(
            JIP22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JIP22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIP22Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())
                    .addGroup(JIP22Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(727, 727, 727))))
        );
        JIP22Layout.setVerticalGroup(
            JIP22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JIP22Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JP2Layout = new javax.swing.GroupLayout(JP2);
        JP2.setLayout(JP2Layout);
        JP2Layout.setHorizontalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JIP21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP2Layout.setVerticalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JIP21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(JP2);

        JP3.setBackground(new java.awt.Color(204, 204, 204));

        JIP30.setBackground(new java.awt.Color(153, 153, 153));
        JIP30.setPreferredSize(new java.awt.Dimension(206, 623));

        BIS.setBackground(new java.awt.Color(102, 102, 102));
        BIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BISMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Iniciar Sesion");

        javax.swing.GroupLayout BISLayout = new javax.swing.GroupLayout(BIS);
        BIS.setLayout(BISLayout);
        BISLayout.setHorizontalGroup(
            BISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BISLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BISLayout.setVerticalGroup(
            BISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BISLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        BRG.setBackground(new java.awt.Color(102, 102, 102));
        BRG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BRGMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Registrarse");

        javax.swing.GroupLayout BRGLayout = new javax.swing.GroupLayout(BRG);
        BRG.setLayout(BRGLayout);
        BRGLayout.setHorizontalGroup(
            BRGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BRGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        BRGLayout.setVerticalGroup(
            BRGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BRGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        BAC.setBackground(new java.awt.Color(102, 102, 102));
        BAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Administrar Cuenta");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BACLayout = new javax.swing.GroupLayout(BAC);
        BAC.setLayout(BACLayout);
        BACLayout.setHorizontalGroup(
            BACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BACLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BACLayout.setVerticalGroup(
            BACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BACLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Opciones");

        javax.swing.GroupLayout JIP30Layout = new javax.swing.GroupLayout(JIP30);
        JIP30.setLayout(JIP30Layout);
        JIP30Layout.setHorizontalGroup(
            JIP30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP30Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JIP30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JIP30Layout.setVerticalGroup(
            JIP30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP30Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        JIP31.setBackground(new java.awt.Color(102, 0, 204));
        JIP31.setPreferredSize(new java.awt.Dimension(815, 651));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Bienvenido");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(369, 369, 369))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Seleccione una de las opciones en el panel izquierdo");

        javax.swing.GroupLayout JIP31Layout = new javax.swing.GroupLayout(JIP31);
        JIP31.setLayout(JIP31Layout);
        JIP31Layout.setHorizontalGroup(
            JIP31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JIP31Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(307, 307, 307))
        );
        JIP31Layout.setVerticalGroup(
            JIP31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP31Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        JIP32.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(102, 0, 204));

        LabelNombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelNombre4.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre4.setText("Nombre de Usuario:");

        LabelContraseña2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelContraseña2.setText("Contraseña:");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Hecho");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        JPFIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPFISActionPerformed(evt);
            }
        });

        JTFNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNISActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ingrese sus datos para iniciar sesion");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ISR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFNIS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPFIS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNombre4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelContraseña2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addGap(38, 38, 38)
                .addComponent(LabelNombre4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelContraseña2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        LabelBienvenido2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        LabelBienvenido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBienvenido2.setText("Bienvenido Nuevamente");

        javax.swing.GroupLayout JIP32Layout = new javax.swing.GroupLayout(JIP32);
        JIP32.setLayout(JIP32Layout);
        JIP32Layout.setHorizontalGroup(
            JIP32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP32Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(LabelBienvenido2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addGap(127, 127, 127))
        );
        JIP32Layout.setVerticalGroup(
            JIP32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP32Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LabelBienvenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JIP33.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(102, 0, 204));

        JPHR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPHRMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Hecho");

        javax.swing.GroupLayout JPHRLayout = new javax.swing.GroupLayout(JPHR);
        JPHR.setLayout(JPHRLayout);
        JPHRLayout.setHorizontalGroup(
            JPHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHRLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );
        JPHRLayout.setVerticalGroup(
            JPHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelContraseña1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelContraseña1.setText("Contraseña:");

        LabelNombre3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre3.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre3.setText("Documento ID:");

        LabelNombre2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre2.setText("Correo Electronico:");

        LabelNombre1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre1.setText("Nombre de Usuario:");

        JPFRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPFRCActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Ingrese sus datos para crear una cuenta");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLERR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelContraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(195, 195, 195))
                    .addComponent(JTFRNU, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFRDID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFRCE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPFRC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPHR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(157, 157, 157))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(LabelNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFRNU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFRDID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFRCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLERR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        LabelBienvenido1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        LabelBienvenido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBienvenido1.setText("Bienvenido");

        javax.swing.GroupLayout JIP33Layout = new javax.swing.GroupLayout(JIP33);
        JIP33.setLayout(JIP33Layout);
        JIP33Layout.setHorizontalGroup(
            JIP33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JIP33Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(LabelBienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(225, 225, 225))
        );
        JIP33Layout.setVerticalGroup(
            JIP33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP33Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LabelBienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JIP34.setBackground(new java.awt.Color(255, 255, 255));

        LabelBienvenido3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        LabelBienvenido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBienvenido3.setText("¿Desea modificar su informacion?");

        jPanel8.setBackground(new java.awt.Color(102, 0, 204));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hecho");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(154, 154, 154))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelContraseña3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelContraseña3.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelContraseña3.setText("Contraseña:");

        LabelNombre7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre7.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre7.setText("Documento ID:");

        LabelNombre6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre6.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre6.setText("Correo Electronico:");

        LabelNombre5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNombre5.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre5.setText("Nombre de Usuario (no modificable):");

        JTFECE.setBackground(new java.awt.Color(102, 0, 204));
        JTFECE.setForeground(new java.awt.Color(255, 255, 255));
        JTFECE.setBorder(null);

        JTFEDID.setBackground(new java.awt.Color(102, 0, 204));
        JTFEDID.setForeground(new java.awt.Color(255, 255, 255));
        JTFEDID.setBorder(null);

        JTFEC.setBackground(new java.awt.Color(102, 0, 204));
        JTFEC.setForeground(new java.awt.Color(255, 255, 255));
        JTFEC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTFEC.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ingrese su informacion nueva en los campos a continuacion");

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cerrar Sesion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Eliminar Cuenta");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JLENU.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFEC)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(LabelContraseña3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(212, 212, 212)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLBAUER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(LabelNombre7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(LabelNombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(LabelNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(245, 245, 245))
                    .addComponent(JTFECE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFEDID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(LabelNombre5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLENU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombre7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEDID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombre6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFECE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(JLBAUER, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelContraseña3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JIP34Layout = new javax.swing.GroupLayout(JIP34);
        JIP34.setLayout(JIP34Layout);
        JIP34Layout.setHorizontalGroup(
            JIP34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIP34Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(LabelBienvenido3, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );
        JIP34Layout.setVerticalGroup(
            JIP34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIP34Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelBienvenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JP3Layout = new javax.swing.GroupLayout(JP3);
        JP3.setLayout(JP3Layout);
        JP3Layout.setHorizontalGroup(
            JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP3Layout.createSequentialGroup()
                .addComponent(JIP30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(882, Short.MAX_VALUE))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP3Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(JIP33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP3Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(JIP34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP3Layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(JIP32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP3Layout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addComponent(JIP31, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)))
        );
        JP3Layout.setVerticalGroup(
            JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JIP30, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JIP31, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
        );

        jPanel2.add(JP3);

        JP4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel19.setText("Servicio al Cliente");

        jPanel9.setBackground(new java.awt.Color(102, 0, 153));

        jLabel20.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("¿Algun problema? informenos y estaremos encantados de darle asistencia");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Puede hacer un comentario aqui y lo recibiremos:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Recibira una respuesta al correo adjunto en la informacion de su cuenta");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Enviar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Reglamento y Condiciones de Uso\n\n-Aceptación de Términos\n\nAl acceder y utilizar esta plataforma de subastas, usted acepta y se compromete a cumplir con los siguientes términos y condiciones. Si no está de acuerdo con estos términos, por favor abstengase de utilizar nuestra plataforma.\n\n-Registro de Usuarios\n\nPara participar en las subastas, los usuarios deben registrarse proporcionando información veraz y completa. Cada usuario es responsable de mantener la confidencialidad de su cuenta y contraseña, así como de todas las actividades que ocurran bajo su cuenta.\n\n-Condiciones de Participación en Subastas\n\nLos usuarios deben ser mayores de 18 años para participar en las subastas. Todas las ofertas realizadas en una subasta son vinculantes y no pueden ser retiradas. El ganador de una subasta está obligado a completar la transacción de acuerdo con los términos establecidos para cada artículo.\n\n-Publicación de Artículos\n\nLos vendedores deben proporcionar descripciones precisas y detalladas de los artículos que desean subastar. Está prohibido subastar artículos ilegales, peligrosos o que infrinjan derechos de propiedad intelectual. Los vendedores son responsables de garantizar que los artículos ofrecidos sean auténticos y se encuentren en las condiciones descritas.\n\n-Pagos y Comisiones\n\nLos compradores deben pagar los artículos ganados en las subastas dentro del plazo establecido. Los vendedores deben pagar una comisión al sitio de subastas, calculada como un porcentaje del precio final de venta. Los métodos de pago aceptados serán especificados en cada subasta.\n\n-Entrega y Envío\n\nLos vendedores son responsables de organizar el envío de los artículos vendidos y proporcionar información de seguimiento a los compradores. Los costos de envío serán detallados en la descripción del artículo y deben ser cubiertos por el comprador, a menos que se especifique lo contrario.\n\n-Política de Devoluciones\n\nLas devoluciones y reembolsos estarán sujetos a las políticas individuales de cada vendedor, que deberán ser claramente especificadas en la descripción del artículo. En caso de disputa, el sitio podrá mediar, pero no garantiza la resolución favorable para ninguna de las partes.\n\n-Conducta del Usuario\n\nLos usuarios deben comportarse de manera ética y respetuosa en el sitio. Está prohibido manipular las subastas, ya sea mediante ofertas falsas o cualquier otra forma de fraude. Los usuarios no deben utilizar el sitio para enviar spam, mensajes no solicitados o cualquier contenido inapropiado, a su vez los comentarios en los articulos deben de ser siempre respetuosos.\n\n-Privacidad y Protección de Datos\n\nLa información personal proporcionada por los usuarios será tratada de acuerdo con nuestra política de privacidad. Nos comprometemos a proteger la información personal de nuestros usuarios y a no compartirla con terceros sin su consentimiento, salvo cuando sea necesario para completar una transacción o conforme a lo requerido por la ley.\n\n-Limitación de Responsabilidad\n\nEl sitio de subastas no se hace responsable por la calidad, seguridad o legalidad de los artículos subastados. No garantizamos el acceso ininterrumpido al sitio ni que el mismo esté libre de errores. En ningún caso seremos responsables por daños indirectos, incidentales, especiales o consecuentes que resulten del uso del sitio.\n\n-Modificaciones a los Términos y Condiciones\n\nNos reservamos el derecho de modificar estos términos y condiciones en cualquier momento. Las modificaciones serán efectivas a partir de su publicación en el sitio. El uso continuado del sitio después de cualquier modificación constituye su aceptación de los nuevos términos.\n\n-Ley Aplicable y Jurisdicción\n\nEstos términos y condiciones se rigen por las leyes del país en el que operamos. Cualquier disputa relacionada con estos términos será resuelta en los tribunales competentes de dicha jurisdicción.\n\n\n-Contacto\n\nPara cualquier duda o consulta sobre estos términos y condiciones, por favor, contáctenos a través del campo de texto disponible en la sesion de servicio al cliente y le haremos llegar una respuesta por correo.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(131, 131, 131))
                                    .addComponent(jTextField7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(273, 273, 273))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel20)
                .addGap(58, 58, 58)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JP4Layout = new javax.swing.GroupLayout(JP4);
        JP4.setLayout(JP4Layout);
        JP4Layout.setHorizontalGroup(
            JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JP4Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(287, 287, 287))
        );
        JP4Layout.setVerticalGroup(
            JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(JP4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab1MouseClicked

        JP1.setVisible(true);
        JP2.setVisible(false);
        JP3.setVisible(false);
        JP4.setVisible(false);
 
        Tab1.setBackground(new Color(82,0,184));
        Tab2.setBackground(new Color(51,0,153));
        Tab3.setBackground(new Color(51,0,153));
        Tab4.setBackground(new Color(51,0,153));
    }//GEN-LAST:event_Tab1MouseClicked

    private void Tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab2MouseClicked
        JP2.setVisible(true);
        JP1.setVisible(false);
        JP3.setVisible(false);
        JP4.setVisible(false);
        
        JIP21.setVisible(true);
        JIP22.setVisible(false);
 
        Tab2.setBackground(new Color(82,0,184));
        Tab1.setBackground(new Color(51,0,153));
        Tab3.setBackground(new Color(51,0,153));
        Tab4.setBackground(new Color(51,0,153));
    }//GEN-LAST:event_Tab2MouseClicked

    private void Tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab3MouseClicked
        JP3.setVisible(true);
        JP2.setVisible(false);
        JP1.setVisible(false);
        JP4.setVisible(false);
         
        Tab3.setBackground(new Color(82,0,184));
        Tab2.setBackground(new Color(51,0,153));
        Tab1.setBackground(new Color(51,0,153));
        Tab4.setBackground(new Color(51,0,153));

        JIP31.setVisible(true);
        JIP32.setVisible(false);
        JIP33.setVisible(false);
        JIP34.setVisible(false);        
    }//GEN-LAST:event_Tab3MouseClicked

    private void Tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab4MouseClicked
        JP4.setVisible(true);
        JP2.setVisible(false);
        JP1.setVisible(false);
        JP3.setVisible(false);
 
        Tab4.setBackground(new Color(82,0,184));
        Tab2.setBackground(new Color(51,0,153));
        Tab3.setBackground(new Color(51,0,153));
        Tab1.setBackground(new Color(51,0,153));
    }//GEN-LAST:event_Tab4MouseClicked

    private void BISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BISMouseClicked
        JIP32.setVisible(true);
        JIP33.setVisible(false);
        JIP34.setVisible(false);
        
        jLabel6.setForeground(new Color(102, 102, 102));
        jLabel7.setForeground(new Color(153, 153, 153));
        jLabel8.setForeground(new Color(153, 153, 153));
        
        BIS.setBackground(new Color(143, 143, 143));
        BRG.setBackground(new Color(102, 102, 102));
        BAC.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_BISMouseClicked

    private void BRGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BRGMouseClicked
        JIP33.setVisible(true);
        JIP32.setVisible(false);
        JIP34.setVisible(false);
        
        jLabel7.setForeground(new Color(102, 102, 102));
        jLabel8.setForeground(new Color(153, 153, 153));
        jLabel6.setForeground(new Color(153, 153, 153));
        
        BRG.setBackground(new Color(143, 143, 143));
        BIS.setBackground(new Color(102, 102, 102));
        BAC.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_BRGMouseClicked
        //TODO add your handling code here:
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JIP34.setVisible(true);
        JIP33.setVisible(false);
        JIP32.setVisible(false);
        
        jLabel8.setForeground(new Color(102, 102, 102));
        jLabel7.setForeground(new Color(153, 153, 153));
        jLabel6.setForeground(new Color(153, 153, 153));
        
        BAC.setBackground(new Color(143, 143, 143));
        BRG.setBackground(new Color(102, 102, 102));
        BIS.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void BACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACMouseClicked
        JIP34.setVisible(true);
        JIP33.setVisible(false);
        JIP32.setVisible(false);
        
        jLabel8.setForeground(new Color(102, 102, 102));
        jLabel7.setForeground(new Color(153, 153, 153));
        jLabel6.setForeground(new Color(153, 153, 153));
        
        BAC.setBackground(new Color(143, 143, 143));
        BRG.setBackground(new Color(102, 102, 102));
        BIS.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_BACMouseClicked

    private void JPFISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPFISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFISActionPerformed

    private void JTFNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNISActionPerformed

    private void JPFRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPFRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFRCActionPerformed

    private void JPHRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPHRMouseClicked
        //obtener datos
        String Nombres = JTFRNU.getText();
        String Correo = JTFRCE.getText();
        char[] contraseña = JPFRC.getPassword();
        String documento = JTFRDID.getText();

        //
        Usuarios usuario = new Usuarios();
        usuario.setNombres(Nombres);
        usuario.setDocumento(documento);
        usuario.setCorreo(Correo);
        usuario.setContraseña(contraseña);
        if(Usuarios.getUsuariosBD()== null){
        Usuarios.setUsuariosBD(new HashMap<>());
        String pass = String.valueOf(contraseña);        
        }
        //no permitir que los campos esten vacios
                 if (Nombres.trim().isEmpty()) {
            JLERR.setForeground(Color.RED);
            JLERR.setText("el nombre no puede estar vacio");
            return;
           }
                 if (documento.trim().isEmpty()) {
            JLERR.setForeground(Color.RED);
            JLERR.setText("el numero de documento no puede estar vacio");
            return;
           }
                 if (Correo.trim().isEmpty()) {
            JLERR.setForeground(Color.RED);
            JLERR.setText("el correo no puede estar vacio");
            return;
           }   
                 if (contraseña == null || contraseña.length == 0) {
            JLERR.setForeground(Color.RED);
            JLERR.setText("la contraseña no puede estar vacia");
            return;
           }
        if(Usuarios.getUsuariosBD().containsKey (Nombres)){
                     JLERR.setForeground(Color.RED);
                     JLERR.setText("El nombre de usuario esta en uso");
        } 
        //crear exitosamente al usuario
        else{
        Usuarios.getUsuariosBD().put(Nombres, usuario);
        int cuentaUsuarios = Usuarios.getUsuariosBD().size();
        JLERR.setForeground(Color.GREEN);
        JLERR.setText("usuario creado exitosamente "+ "total de " +cuentaUsuarios +" usuario/s");
        
        }
// TODO add your handling code here:
    }//GEN-LAST:event_JPHRMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    //obtener datos
    String Nombres = JTFNIS.getText();
    char[] contraseña = JPFIS.getPassword();    
    
    Usuarios usuario = null;
    Map UsuariosBD = Usuarios.getUsuariosBD();
    
    if (UsuariosBD != null && UsuariosBD.containsKey(Nombres)){
        usuario = Usuarios.getUsuariosBD().get(Nombres);
        
        //verificar que la contraseña sea correcta
        if(Arrays.equals(usuario.getContraseña(), contraseña)){
            //dar mensaje de que se inicio sesion
            ISR.setForeground(Color.green);
            ISR.setText("inicio de sesion de "+usuario.getNombres()+" exitoso");
            //vaciar los campos y quitar la pantalla de inicio de sesion (aun no lo hago)
            JTFNIS.setText("");
            JPFIS.setText("");
            NombreL.setText(Nombres);
            
            //quitar los botones de inicio de sesion para dar lugar unicamente al boton de administrar usuario
            BIS.setVisible(false);
            BAC.setVisible(true);
            BRG.setVisible(false);
            
            //hacer que en caso de iniciar sesion correctamente se hagan los cambios respectivos
            
            Usuarios u = Usuarios.getUsuariosBD().get(Nombres);   
            JLENU.setText(Nombres);
            JTFECE.setText(u.getCorreo());
            JTFEDID.setText(u.getDocumento());
            JTFEC.setText(new String(contraseña));
            
            PNR.setVisible(false);
            JIP10.setVisible(true);
            JIP11.setVisible(true);
            JIP12.setVisible(false);
        }
            //en caso de que no se pueda iniciar sesion (contraseña equívoca) dar un mensaje de error
        else{
            ISR.setForeground(Color.red);
            ISR.setText("hubo un problema al iniciar sesion como "+usuario.getNombres()+" intente nuevamente");  
        } 
    }
            //en caso de que el nombre usuario no exista se dara un mensaje de error
        else {
            ISR.setForeground(Color.red);
            ISR.setText("El usuario no existe, porfavor registrese si no tiene una cuenta");          
    }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        String Nombres = JLENU.getText();
        Usuarios usuario = new Usuarios();
        usuario.setNombres(Nombres);
        //quita el boton de administrar usuario, lanza un mensaje de sesion cerrada y pone los botones de iniciar sesion y registrarse         
        JLBAUER.setForeground(Color.GREEN);
        JLBAUER.setText("sesion de "+ Nombres +" cerrada exitosamente");
        BIS.setVisible(true);
        BAC.setVisible(false);
        BRG.setVisible(true);
        
        //quitar la informacion de los campos de texto
        JLENU.setText("");
        JTFECE.setText("");
        JTFEDID.setText("");
        JTFEC.setText("");
        NombreL.setText("");
        //bloquear la pagina inicial
            PNR.setVisible(true);
            JIP10.setVisible(false);
            JIP11.setVisible(false);
            JIP12.setVisible(false);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void IBSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IBSAActionPerformed
        JIP11.setVisible(false);
        JIP12.setVisible(true);
    }//GEN-LAST:event_IBSAActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        
        Usuarios usuario = Usuarios.getUsuariosBD().get(JLENU.getText());
        //toma los datos en los campos de texto
        String Correo = JTFECE.getText();
        char[] contraseña = JTFEC.getPassword();
        String documento = JTFEDID.getText();
        
        usuario.setContraseña(contraseña);
        usuario.setCorreo(Correo); 
        usuario.setDocumento(documento);
        //reemplaza los datos teniendo en cuenta los datos en los campos de texto de administrar usuario
        Usuarios.actualizarUsuarioEnBD(usuario.getNombres(), usuario);
        //da el mensaje exlicito de que se editaron los datos
        JLBAUER.setForeground(Color.GREEN);
        JLBAUER.setText("Informacion actualizada con exito");
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        Usuarios usuario = Usuarios.getUsuariosBD().get(JLENU.getText());      
        //eliminar usuario
        Usuarios.borrarUsuarioEnBD(usuario.getNombres(), usuario);
        //dar mensaje
        JLBAUER.setForeground(Color.GREEN);
        JLBAUER.setText("Cuenta eliminada correctamente");
        //vaciar los campos de texto
        JLENU.setText("");
        JTFECE.setText("");
        JTFEDID.setText("");
        JTFEC.setText("");
        //Cambiar el boton de Administrar usuario por los de iniciar sesion y registrarse
        BIS.setVisible(true);
        BAC.setVisible(false);
        BRG.setVisible(true);
        //Salir de la pantalla de administracion de cuentas
        JIP31.setVisible(true);
        JIP32.setVisible(false);
        JIP33.setVisible(false);
        JIP34.setVisible(false); 
    }//GEN-LAST:event_jPanel11MouseClicked

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        JIP11.setVisible(true);
        JIP12.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void PanelBotonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonAceptarMouseClicked
        String Descripcion = CampoTextoDescArt.getText();
        String Nombre = CampoTextoNombreArt.getText();
        String InfoEstado = (String) CampoTextoInfoEstad.getSelectedItem(); 
        String Categoria = (String) CategoriasComboBox.getSelectedItem();
        String Subcategoria = (String) SubcategoriasComboBox.getSelectedItem();
        double PrecioBase = Double.parseDouble(JTextFieldPrecioBase.getText());
        int oferta = Integer.parseInt("0");
        Random rand = new Random();
        int ID = rand.nextInt(9000) + 1000;
        String idString = String.valueOf(ID);
        String UN = JLENU.getText();
        
        Articulos articulo = new Articulos();
        articulo.setDescripcion(Descripcion);
        articulo.setNombre(Nombre);
        articulo.setInfoEstado(InfoEstado);
        articulo.setPrecioBase(PrecioBase);
        articulo.setCategoria(Categoria);
        articulo.setSubcategoria(Subcategoria);
        articulo.setID(ID);
        articulo.setOfertas(oferta);
        articulo.setUN(UN);
        
                 if(Articulos.getArticulosBD() == null){
             Articulos.setArticulosBD(new HashMap<>());
           }
                 if (Nombre.trim().isEmpty() || Descripcion.trim().isEmpty() || InfoEstado == "Estado" || PrecioBase == 0.0 || Categoria == "Categorias") {
    if (Nombre.trim().isEmpty()) {
        LabelInfoSubida.setForeground(Color.RED);
        LabelInfoSubida.setText("El nombre no puede estar vacío");
    } else if (Descripcion.trim().isEmpty()) {
        LabelInfoSubida.setForeground(Color.RED);
        LabelInfoSubida.setText("El artículo necesita tener una descripción");
    } else if (InfoEstado == "Estado") {
        LabelInfoSubida.setForeground(Color.RED);
        LabelInfoSubida.setText("No puedes publicar un artículo sin ofrecer información de su estado");
    } else if (PrecioBase == 0.0){
        LabelInfoSubida.setForeground(Color.RED);
        LabelInfoSubida.setText("No puedes publicar un artículo sin establecer un precio base");
    }else if (Categoria == "Categorias"){
        LabelInfoSubida.setForeground(Color.RED);
        LabelInfoSubida.setText("No puedes publicar un artículo sin seleccionar una categoria");
    }
}
        else{
        Articulos.getArticulosBD().put(idString, articulo);
        int cuentaArticulos = Articulos.getArticulosBD().size();
        LabelInfoSubida.setForeground(Color.GREEN);
        LabelInfoSubida.setText("el articulo de nombre "+Nombre+" ha sido publicado exitosamente para un total de "+cuentaArticulos+" articulo/s");
        }  
           Collection<Articulos> datos = Articulos.getArticulosBD().values();            
          List<Articulos> listaArticulos = new ArrayList(datos);
          String columnas[] = {"Nombre", "InforEstado", "Precio", "Categoria", "Subcategoria", "ID", "Vendedor"};
          int totalArticulos = listaArticulos.size();
          String filas [][] = new String[totalArticulos][columnas.length];
          for(int i = 0; i <listaArticulos.size(); i++ ){
              Articulos A = listaArticulos.get(i);
              String id = String.valueOf(ID);
              
              
              filas[i][0] = A.getNombre();    
              filas[i][1] = A.getInfoEstado();  
              filas[i][2] = String.valueOf(A.getPrecioBase());
              filas[i][3] = A.getCategoria(); 
              filas[i][4] = A.getSubcategoria();
              filas[i][5] = String.valueOf(A.getID());
              filas[i][6] = A.getUN();

             CampoTextoNombreArt.setText("");
             CategoriasComboBox.setSelectedItem("Categorias");
             SubcategoriasComboBox.setSelectedItem("");
             CampoTextoDescArt.setText("");
             CampoTextoInfoEstad.setSelectedItem("Estado");
             JTextFieldPrecioBase.setText("");
          }
          DefaultTableModel datosTabla = new DefaultTableModel();
          datosTabla.setDataVector(filas, columnas);
          ArticulosResultado.setModel(datosTabla);
          ArticulosResultado.setAutoCreateRowSorter(true);
          sorter = new TableRowSorter<>(datosTabla);
          ArticulosResultado.setRowSorter(sorter);
          
          DefaultTableModel datosTabla2 = new DefaultTableModel();
          datosTabla2.setDataVector(filas, columnas);
          MisVentasRes.setModel(datosTabla2);
          MisVentasRes.setAutoCreateRowSorter(true);
          sorter2 = new TableRowSorter<>(datosTabla2);
          MisVentasRes.setRowSorter(sorter2);
          MisVentasRes.getTableHeader().setReorderingAllowed(false);
          
          
    }//GEN-LAST:event_PanelBotonAceptarMouseClicked

    private void CategoriasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasComboBoxActionPerformed


    }//GEN-LAST:event_CategoriasComboBoxActionPerformed
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed

    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BarraBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarraBusquedaKeyReleased
    filtrar();   
    }//GEN-LAST:event_BarraBusquedaKeyReleased

    private void ArticulosResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArticulosResultadoMouseClicked
DefaultTableModel model = (DefaultTableModel) ArticulosResultado.getModel();

int rowIndex = ArticulosResultado.getSelectedRow();

if (rowIndex != -1) {

    jTextPane1.setText(model.getValueAt(rowIndex, 5).toString());
   
    
    String ID = jTextPane1.getText();
    if(Articulos.getArticulosBD().containsKey(ID)){
    Articulos a = Articulos.getArticulosBD().get(ID);
    DescripcionCampo.setText(a.getDescripcion());
    jLabel32.setText(a.getUN());
    }     
    
     Articulos A = Articulos.getArticulosBD().get(jTextPane1.getText());
     
      OtrasOfertas.setText(String.valueOf(A.getOfertas()));
      JTFP.setEnabled(true);
      OfrecerBoton.setEnabled(true);
} 
    }//GEN-LAST:event_ArticulosResultadoMouseClicked

    private void JTextFieldPrecioBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldPrecioBaseKeyTyped
        int key = evt.getKeyChar();
               
        boolean num = key >= 48 && key <= 57;   
        if(!num){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldPrecioBaseKeyTyped

    private void JTFPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPKeyTyped
        int key = evt.getKeyChar();
               
        boolean num = key >= 48 && key <= 57;   
        if(!num){
            evt.consume();
        }
    }//GEN-LAST:event_JTFPKeyTyped

    private void OfrecerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfrecerBotonActionPerformed
     Articulos A = Articulos.getArticulosBD().get(jTextPane1.getText());
      String U = JLENU.getText();
      int oferta = Integer.parseInt(JTFP.getText());    
      int OA = A.getOfertas();
      String V = jLabel32.getText();
      
      
      if(oferta <= OA){
      JLEM.setForeground(Color.red);
      JLEM.setText("la oferta debe ser mayor a la mas alta");
      return;
      }if(U == V){
      JLEM.setForeground(Color.red);
      JLEM.setText("no puedes hacer ofertas por tus propios articulos");
      JTFP.setText("");
      return;
      
      }else{
      JLEM.setForeground(Color.GREEN);
      JLEM.setText("oferta agregada con exito");
      A.setOfertas(oferta);
      String idString = String.valueOf(A.getID());
      Articulos.getArticulosBD().put(idString, A);
      JTFP.setText("");
      OtrasOfertas.setText("Oferta de " + oferta + " ofrecida por " + U);
      OOM.setText(U);
      OML.setText("ofertante mayor");
      }
    }//GEN-LAST:event_OfrecerBotonActionPerformed

    private void CampoTextoNombreArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTextoNombreArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTextoNombreArtActionPerformed

    private void MisVentasResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisVentasResMouseClicked
DefaultTableModel model = (DefaultTableModel) MisVentasRes.getModel();
String o = OOM.getText();

    int rowIndex = MisVentasRes.getSelectedRow();

    if (rowIndex != -1) {

    MID.setText(model.getValueAt(rowIndex, 5).toString());

    String ID = MID.getText();
    if(Articulos.getArticulosBD().containsKey(ID)){
    Articulos a = Articulos.getArticulosBD().get(ID);
    OMY.setText(String.valueOf(a.getOfertas()));
    OFT.setText(o);
    }     
    
     Articulos A = Articulos.getArticulosBD().get(MID.getText());
     
      OtrasOfertas.setText(String.valueOf(A.getOfertas()));
      JTFP.setEnabled(true);
      OfrecerBoton.setEnabled(true);
}     
    }//GEN-LAST:event_MisVentasResMouseClicked

    private void MisVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisVentasMouseClicked
    JIP21.setVisible(false);
    JIP22.setVisible(true);
    MSMA();
    }//GEN-LAST:event_MisVentasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     JIP21.setVisible(true);
     JIP22.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void MIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_MIDActionPerformed

    private void OMYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OMYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OMYActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
   
    private void filtrar(){
    sorter.setRowFilter(RowFilter.regexFilter(BarraBusqueda.getText(),0,3, 4));
    }
    
    private void MSMA(){
    sorter2.setRowFilter(RowFilter.regexFilter(JLENU.getText(), 6));
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ArticulosResultado;
    private javax.swing.JPanel BAC;
    private javax.swing.JPanel BIS;
    private javax.swing.JPanel BRG;
    private javax.swing.JTextField BarraBusqueda;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JLabel BotonCancelarLabel;
    private javax.swing.JTextField CampoTextoDescArt;
    private javax.swing.JComboBox<String> CampoTextoInfoEstad;
    private javax.swing.JTextField CampoTextoNombreArt;
    private javax.swing.JComboBox<String> CategoriasComboBox;
    private javax.swing.JTextArea DescripcionCampo;
    private javax.swing.JButton IBN;
    private javax.swing.JButton IBR;
    private javax.swing.JButton IBSA;
    private javax.swing.JLabel ISR;
    private javax.swing.JLabel IconoUsuario;
    private javax.swing.JPanel JIP10;
    private javax.swing.JPanel JIP11;
    private javax.swing.JPanel JIP12;
    private javax.swing.JPanel JIP21;
    private javax.swing.JPanel JIP22;
    private javax.swing.JPanel JIP30;
    private javax.swing.JPanel JIP31;
    private javax.swing.JPanel JIP32;
    private javax.swing.JPanel JIP33;
    private javax.swing.JPanel JIP34;
    private javax.swing.JLabel JLBAUER;
    private javax.swing.JLabel JLEM;
    private javax.swing.JLabel JLENU;
    private javax.swing.JLabel JLERR;
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP2;
    private javax.swing.JPanel JP3;
    private javax.swing.JPanel JP4;
    private javax.swing.JPasswordField JPFIS;
    private javax.swing.JPasswordField JPFRC;
    private javax.swing.JPanel JPHR;
    private javax.swing.JPasswordField JTFEC;
    private javax.swing.JTextField JTFECE;
    private javax.swing.JTextField JTFEDID;
    private javax.swing.JTextField JTFNIS;
    private javax.swing.JTextField JTFP;
    private javax.swing.JTextField JTFRCE;
    private javax.swing.JTextField JTFRDID;
    private javax.swing.JTextField JTFRNU;
    private javax.swing.JTextField JTextFieldPrecioBase;
    private javax.swing.JLabel LabelBienvenido1;
    private javax.swing.JLabel LabelBienvenido2;
    private javax.swing.JLabel LabelBienvenido3;
    private javax.swing.JLabel LabelContraseña1;
    private javax.swing.JLabel LabelContraseña2;
    private javax.swing.JLabel LabelContraseña3;
    private javax.swing.JLabel LabelDescripcionArticulo;
    private javax.swing.JLabel LabelInfoArticulo;
    private javax.swing.JLabel LabelInfoSubida;
    private javax.swing.JLabel LabelInstruccion;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JLabel LabelNombre2;
    private javax.swing.JLabel LabelNombre3;
    private javax.swing.JLabel LabelNombre4;
    private javax.swing.JLabel LabelNombre5;
    private javax.swing.JLabel LabelNombre6;
    private javax.swing.JLabel LabelNombre7;
    private javax.swing.JLabel LabelNombreArticulo;
    private javax.swing.JLabel LabelPrecioBase;
    private javax.swing.JLabel LabelSeleccionSubcateg;
    private javax.swing.JLabel LabelSelecionCateg;
    private javax.swing.JTextField MID;
    private javax.swing.JPanel MisCompras;
    private javax.swing.JPanel MisVentas;
    private javax.swing.JTable MisVentasRes;
    private javax.swing.JLabel NombreL;
    private javax.swing.JTextField OFT;
    private javax.swing.JLabel OML;
    private javax.swing.JTextField OMY;
    private javax.swing.JLabel OOM;
    private javax.swing.JButton OfrecerBoton;
    private javax.swing.JTextArea OtrasOfertas;
    private javax.swing.JPanel PNR;
    private javax.swing.JPanel PanelBotonAceptar;
    private javax.swing.JComboBox<String> SubcategoriasComboBox;
    private javax.swing.JPanel Tab1;
    private javax.swing.JPanel Tab2;
    private javax.swing.JPanel Tab3;
    private javax.swing.JPanel Tab4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
