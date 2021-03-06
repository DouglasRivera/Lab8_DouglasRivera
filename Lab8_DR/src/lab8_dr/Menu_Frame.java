/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_dr;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author urs1
 */
public class Menu_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Frame
     */
    private int Id = -1;
     private int IdFavorito = -1;
    
    public Menu_Frame() {
        initComponents();
        setTitle("Menu del Frame");
        setIconImage(new ImageIcon(getClass().getResource("/Icons/View.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Icons/jkcaptura.png"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
       
        /*ClaudiList cl = new ClaudiList();
           DefaultListModel modelo
                    = (DefaultListModel) jList1.getModel();
            ArrayList<ClaudiList> programas = cl.ReadFileScannerArrayList();
            for (int i = 0; i < programas.size(); i++) {
             modelo.addElement(programas.get(i));
            
        }*/
           
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Genero", "Tipo", "Puntos", "Año Lanzamiento"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jTable1.getSelectedRow();
                    }

                });
                 jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Genero", "Tipo", "Puntos", "Año Lanzamiento"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jTable1.getSelectedRow();
                    }

                });
                
                recargarTabla(jTable1);
                recargarTabla(jTable2);
              
    }
    private String Genero = "";
    private String Tipo = "";
    private int Puntuacion = -1;
    public static ArrayList <TipoProgramas> Programas = new ArrayList();
    private TipoProgramas tipoPrograma;
    
    public void vaciarTabla(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] =  new String[]{
                            "Nombre", "Genero", "Tipo", "Puntos", "Año Lanzamiento"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
    
    private void recargarTabla(JTable tabla){
        vaciarTabla(tabla);
          TipoProgramas tp = new TipoProgramas();
                for (TipoProgramas tPrograma : tp.ReadFileScannerArrayList()) {
                    Object row[] = {tPrograma.getNombre(), tPrograma.getGenero(), tPrograma.getTipo(),tPrograma.getPuntos(), tPrograma.getYearLanzamiento()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtModificar = new javax.swing.JButton();
        jbtFavorito = new javax.swing.JButton();
        JbtAgregar1 = new javax.swing.JButton();
        jbtEliminar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbTipoPrograma = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jtxtAño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAgregarPrograma1 = new javax.swing.JButton();
        jtxtNombrePrograma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbGeneroPrograma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JbtAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombreFavorito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jbtFavorito1 = new javax.swing.JButton();
        jbtEliminar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbtModificar.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtFavorito.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtFavorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Yellow file.png"))); // NOI18N
        jbtFavorito.setText("Agregar Favorito");
        jbtFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFavoritoActionPerformed(evt);
            }
        });

        JbtAgregar1.setFont(new java.awt.Font("Century", 2, 24)); // NOI18N
        JbtAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add big.png"))); // NOI18N
        JbtAgregar1.setText("Agregar");
        JbtAgregar1.setBorder(null);
        JbtAgregar1.setBorderPainted(false);
        JbtAgregar1.setContentAreaFilled(false);
        JbtAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtAgregar1ActionPerformed(evt);
            }
        });

        jbtEliminar1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbtEliminar1.setText("Eliminar");
        jbtEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbtModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtEliminar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtFavorito))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(JbtAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtEliminar1)
                    .addComponent(jbtModificar)
                    .addComponent(jbtFavorito))
                .addGap(141, 141, 141)
                .addComponent(JbtAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2);

        jcbTipoPrograma.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jcbTipoPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anime", "Serie", "Documental", "Pelicula" }));
        jcbTipoPrograma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoProgramaItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel4.setText("Puntuacion:");

        jSpinner1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(5, 1, 10, 1));
        jSpinner1.setMaximumSize(new java.awt.Dimension(1, 10));
        jSpinner1.setMinimumSize(new java.awt.Dimension(1, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel5.setText("Año de Lanzamiento:");

        jtxtAño.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setText("Nombre:");

        jBAgregarPrograma1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jBAgregarPrograma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Back.png"))); // NOI18N
        jBAgregarPrograma1.setText("Regresar");
        jBAgregarPrograma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPrograma1ActionPerformed(evt);
            }
        });

        jtxtNombrePrograma.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setText("Genero:");

        jcbGeneroPrograma.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jcbGeneroPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Terror", "SyFy", "Suspenso", "Accion" }));
        jcbGeneroPrograma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGeneroProgramaItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel3.setText("Tipo:");

        JbtAgregar.setFont(new java.awt.Font("Century", 2, 48)); // NOI18N
        JbtAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        JbtAgregar.setText("Guardar");
        JbtAgregar.setBorder(null);
        JbtAgregar.setBorderPainted(false);
        JbtAgregar.setContentAreaFilled(false);
        JbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAgregarPrograma1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addComponent(JbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(36, 36, 36)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtNombrePrograma)
                                    .addComponent(jcbTipoPrograma, 0, 179, Short.MAX_VALUE))
                                .addComponent(jcbGeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(359, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAgregarPrograma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 498, Short.MAX_VALUE)
                .addComponent(JbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtxtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jcbGeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jcbTipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("CRUD", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel6.setText("Nombre lista favorito:");

        jtxtNombreFavorito.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel7.setText("Lista favoritos:");

        jList1.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jList1);

        jbtFavorito1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtFavorito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Yellow file.png"))); // NOI18N
        jbtFavorito1.setText("Agregar Favorito");
        jbtFavorito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFavorito1ActionPerformed(evt);
            }
        });

        jbtEliminar2.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbtEliminar2.setText("Eliminar");
        jbtEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNombreFavorito)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbtFavorito1)
                        .addGap(62, 62, 62)
                        .addComponent(jbtEliminar2)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtxtNombreFavorito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtFavorito1)
                    .addComponent(jbtEliminar2))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Favoritos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoProgramaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoProgramaItemStateChanged
        if (evt.getSource() == jcbTipoPrograma) {
            String seleccionado = (String) jcbTipoPrograma.getSelectedItem();
            this.Tipo = seleccionado;
        }
    }//GEN-LAST:event_jcbTipoProgramaItemStateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if (evt.getSource() == jSpinner1) {
            int seleccionado =(Integer)jSpinner1.getValue();
            this.Puntuacion = seleccionado;
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jBAgregarPrograma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPrograma1ActionPerformed
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jBAgregarPrograma1ActionPerformed

    private void jcbGeneroProgramaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGeneroProgramaItemStateChanged
        if (evt.getSource() == jcbGeneroPrograma) {
            String seleccionado = (String) jcbGeneroPrograma.getSelectedItem();
            this.Genero = seleccionado;
        }
    }//GEN-LAST:event_jcbGeneroProgramaItemStateChanged

    private void JbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtAgregarActionPerformed
       this.Tipo =  (String) jcbTipoPrograma.getSelectedItem();
        this.Genero =  (String) jcbGeneroPrograma.getSelectedItem();
        this.Puntuacion =  (Integer) jSpinner1.getValue();
        boolean valido = true;
        if (this.jtxtNombrePrograma.getText() == null || "".equals(this.jtxtNombrePrograma.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el nombre");
            valido = false; 
        }
        if (this.jtxtAño.getText() == null || "".equals(this.jtxtAño.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el año");
            valido = false;       
        }
        if (this.Genero == null || "".equals(this.Genero)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el genero del programa");
            valido = false;
        }
        if (this.Tipo == null || "".equals(this.Tipo)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el tipo de programa");
            valido = false;       
        }
        if (this.Puntuacion == -1 || "".equals(this.Puntuacion)) {
            JOptionPane.showConfirmDialog(this, "Ingrese la puntuacion");
            valido = false;       
        }
        if (valido && this.Id<0) {
            // int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero
            TipoProgramas tPrograma = new TipoProgramas(Puntuacion, Integer.parseInt(jtxtAño.getText()), jtxtNombrePrograma.getText(), this.Tipo, this.Genero);
            tPrograma.WriteFile();
            JOptionPane.showConfirmDialog(this, "Se agrego correctamente");
            
        } else if(this.Id>=0) {
            TipoProgramas tp = new TipoProgramas();
            ArrayList<TipoProgramas> programas = tp.ReadFileScannerArrayList();
            TipoProgramas tProgramaActualizar = programas.get(Id);
            tProgramaActualizar.setPuntos(Puntuacion);
            tProgramaActualizar.setYearLanzamiento(Integer.parseInt(jtxtAño.getText()));
            tProgramaActualizar.setNombre(jtxtNombrePrograma.getText());
            tProgramaActualizar.setTipo(Tipo);
            tProgramaActualizar.setGenero(Genero);
            // this.Id = -1;
            tp.WriteFileMod(programas);
            this.Id = -1;
            JOptionPane.showConfirmDialog(this, "Se actualizo correctamente");
        }
        recargarTabla(jTable1);
       
    }//GEN-LAST:event_JbtAgregarActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        if(jTable1.getSelectedRow()>=0){
            // mostrar la segunda pestaña para editar
            jTabbedPane1.setSelectedIndex(1);
             TipoProgramas tp = new TipoProgramas();
            ArrayList<TipoProgramas> programas = tp.ReadFileScannerArrayList();
           this.tipoPrograma = programas.get(Id);
            this.jtxtNombrePrograma.setText(tipoPrograma.getNombre());
        this.jtxtAño.setText(tipoPrograma.getYearLanzamiento()+"");
        this.jSpinner1.setValue(tipoPrograma.getPuntos());
        this.jcbGeneroPrograma.setSelectedItem(tipoPrograma.getGenero());
        this.jcbTipoPrograma.setSelectedItem(tipoPrograma.getTipo());
        }
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFavoritoActionPerformed
       if(jTable1.getSelectedRow()>=0){
            // guardar favorito
            
            JOptionPane.showInputDialog(this, "Se guardo favorito correctamente");
        }
    }//GEN-LAST:event_jbtFavoritoActionPerformed

    private void JbtAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtAgregar1ActionPerformed
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_JbtAgregar1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(this.jTabbedPane1.getSelectedIndex()==0){
            TipoProgramas tPrograma = new TipoProgramas();
            tPrograma.ReadFileScanner();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jbtEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminar1ActionPerformed
        if(jTable1.getSelectedRow()>=0){
            // eliminar
            TipoProgramas tp = new TipoProgramas();
            ArrayList<TipoProgramas> programas = tp.ReadFileScannerArrayList();
            programas.remove(Id);
            this.Id = -1;
            tp.WriteFileMod(programas);
            recargarTabla(jTable1);
            JOptionPane.showConfirmDialog(this, "Se elimino correctamente");
        }
    }//GEN-LAST:event_jbtEliminar1ActionPerformed

    private void jbtFavorito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFavorito1ActionPerformed
      agregarDato();
    }//GEN-LAST:event_jbtFavorito1ActionPerformed

    private void jbtEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminar2ActionPerformed
        EliminarDato();
    }//GEN-LAST:event_jbtEliminar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Frame().setVisible(true);
            }
        });
    }
    public DefaultListModel limpiarJlist(){
        DefaultListModel modelo = new DefaultListModel();
        jList1.setModel(modelo);
        return modelo;
    }
        public DefaultListModel agregarDato(){
           DefaultListModel modelo = (DefaultListModel) jList1.getModel();
           modelo.addElement(jtxtNombreFavorito.getText());
           return modelo;
        }
        public DefaultListModel EliminarDato(){
           DefaultListModel modelo = (DefaultListModel) jList1.getModel();
           modelo.remove(jList1.getSelectedIndex());
           return modelo;
        }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtAgregar;
    private javax.swing.JButton JbtAgregar1;
    private javax.swing.JButton jBAgregarPrograma1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtEliminar1;
    private javax.swing.JButton jbtEliminar2;
    private javax.swing.JButton jbtFavorito;
    private javax.swing.JButton jbtFavorito1;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JComboBox<String> jcbGeneroPrograma;
    private javax.swing.JComboBox<String> jcbTipoPrograma;
    private javax.swing.JTextField jtxtAño;
    private javax.swing.JTextField jtxtNombreFavorito;
    private javax.swing.JTextField jtxtNombrePrograma;
    // End of variables declaration//GEN-END:variables
}
