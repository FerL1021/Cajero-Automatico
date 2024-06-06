package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TransferirDinero extends javax.swing.JFrame {

    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private double sobra;
    private String selec;
    private double cam;
    private ArrayList<TipoCuenta> saldos;
    private ArrayList<Cuenta> cuentas;

    public TransferirDinero() {
        saldos = new ArrayList<>();
        cuentas = new ArrayList<>();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nrocuenta = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Ingrese la cantidad de");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("dinero a transferir:");

        cantidad.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 102));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Ingrese N°de cuenta a");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("transferir:");

        nrocuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        nrocuenta.setForeground(new java.awt.Color(0, 0, 102));
        nrocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrocuentaActionPerformed(evt);
            }
        });

        jButtonConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonConfirmar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Transferir Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historial.setColumns(20);
        historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historial.setForeground(new java.awt.Color(255, 102, 0));
        historial.setRows(5);
        jScrollPane4.setViewportView(historial);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HISTORIAL TRANSACCIONAL");

        jTextField2.setBackground(new java.awt.Color(255, 102, 0));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(nrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField2))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(BotonAtras)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Este metodo se encarga de verificar que los campos de entrada no esten vacios
    y solo contengan numeros, posteriormente luego realizar una trasnferencia*/
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // Verifica que los campos a llenar no estén vacíos y que solo contengan números no letras
        String nrocuentaText = nrocuenta.getText();
        String cantidadText = cantidad.getText();
            if (nrocuentaText.isEmpty() && cantidadText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene los datos porfavor.");
                return;
            }
            if (nrocuentaText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene el campo de Nro de Cuenta porfavor.");
                return;
            }
            if (cantidadText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene el campo de cantidad porfavor.");
                return;
            }
            // Verificar que los campos contengan solo números, y al momento de ingresar letras esto muestra que no es valido
            if (!nrocuentaText.matches("\\d+") || !cantidadText.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "Los campos solo deben contener números.");
                return;
            }
            int nrocuen = Integer.parseInt(nrocuentaText);
            double monto = Double.parseDouble(cantidadText);
            boolean transferenciaRealizada = false;
                if (nrocuen != 0 && monto != 0) {
                    cuentas.clear();
                    llenarListaCuentas();
                    for (int i = 0; i < cuentas.size(); i++) {
                        saldos.clear();
                        String arch = cuentas.get(i).getNroCuenta() + "";
                        llenarLista(arch);
                        for (int j = 0; j < saldos.size(); j++) {
                            if (saldos.get(j).getNroCuenta() == nrocuen) {
                                String histA = cuentas.get(i).getNroCuenta() + saldos.get(j).getTipoMoneda();
                                //String mon = saldos.get(j).getTipoMoneda();
                                System.out.println(histA);
                                String mone = saldos.get(j).getTipoMoneda();
                                double sal = cambiomoneda(saldos.get(j).getSaldo(), mone);
                                System.out.println(sal);
                                saldos.get(j).setSaldo(sal);
                                guardarCambios(cuentas.get(i).getNroCuenta() + "");
                                saldos.clear();
                                descontar();
                                Historial(monto, selec, nrocuen);
                                Historial2(histA, cam, mone);
                                mostrarContenidoArchivo(nombre);
                                transferenciaRealizada = true;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Llene los datos porfavor.");
                    return;
                }
                if (transferenciaRealizada) {
                    JOptionPane.showMessageDialog(null, "Se realizo la Transferencia con éxito!!");
                    // Limpiar los campos de texto, depues de realizar la accion
                    nrocuenta.setText("");
                    cantidad.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Nro de Cuenta Invalido.");
                }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
    public void mostrarContenidoArchivo(String nombreArchivo) {
        historial.setText("");
        try (BufferedReader br = new BufferedReader(new FileReader(nro+selec))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                historial.append(linea + "\n");
                
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }
    /*Este metodo se encarga de escribir en el archivo en el historial de una cuenta
    que ha recibido una trasnferencia de dinero*/
    public void Historial2(String cuen,double z,String mon){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cuen,true))) {
            writer.write("");
                writer.write("Se te transfirio : "+z+" "+mon+" de parte de : "+ nombre +" "+ apellido);
                writer.newLine(); 
            System.out.println("ArrayList guardado en " + nombre+"historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }

    
    public void descontar() {
        double retirar = Double.parseDouble(cantidad.getText());
        llenarLista(nro + "");
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals(selec)) {
                saldos.get(i).setSaldo(saldos.get(i).getSaldo() - retirar);
                sobra=saldos.get(i).getSaldo();
                guardarCambios(nro + "");
            }
        }

    }
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro,apellido,idioma);
        menu.idioma(idioma);
        menu.cargarDatos();
        menu.mantCuenta(selec);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void nrocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrocuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrocuentaActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed
    public void datos(String nombre, int nro,String selec,String apellido,int idioma) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.selec=selec;
        this.nro = nro;
        this.idioma=idioma;
    }
/*Este metodo se encarga de convertir una cantidad de dinero de un tipo de moneda a otra
    usando tasas de cambio y suma la cantidad convertidad al saldo actual*/
    public double cambiomoneda(double dinero, String monedaT) {
        double cambio = Double.parseDouble(cantidad.getText());
        cam = cambio;
        DecimalFormat formato = new DecimalFormat("#.###");
        if (selec.equals(monedaT)) {
               cambio= cambio+dinero;
        }else{
            if (selec.equals("Bolivianos")) {
                if (monedaT.equals("Dolares")) {
                    cam=cambio / 6.9;
                    cambio = dinero + (cambio / 6.9);
                    
                }
                if (monedaT.equals("Euros")) {
                    cam=cambio / 7.44;
                    cambio = dinero + (cambio / 7.44);
                    
                }

            } else {
                if (selec.equals("Dolares")) {
                    if (monedaT.equals("Bolivianos")) {
                         cam=cambio *6.9;
                        cambio = dinero + (cambio * 6.9);
                       
                    }
                    if (monedaT.equals("Euros")) {
                        cam=cambio * 0.93;
                        cambio = dinero + (cambio * 0.93);
                        
                    }
                } else {
                    if (selec.equals("Euros")) {
                        if (monedaT.equals("Dolares")) {
                            cam=cambio * 1.08;
                            cambio = dinero + (cambio * 1.08);
                            
                        }
                        if (monedaT.equals("Bolivianos")) {
                             cam=cambio * 7.44;
                            cambio = dinero + (cambio * 7.44);
                           
                        }
                    }
                }
            }
        }
        cam=Math.round(cam * 1000.0 ) / 1000.0;
        return Math.round(cambio * 1000.0) / 1000.0;
        
    }
    
     public void Historial(double m,String tipo,int ncc){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro+selec,true))) {
            writer.write("");
                writer.write("Se transfirio: " +m+ " " +tipo+ " a la cuenta: " + ncc);
                writer.newLine(); 
            System.out.println("ArrayList guardado en " + nombre+"historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            for (int i = 0; i < saldos.size(); i++) {
                writer.write(saldos.get(i).getNroCuenta() + ";" + saldos.get(i).getTipoMoneda() + ";" + saldos.get(i).getSaldo());
                writer.newLine(); 
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }

    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto(archivo);
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) {
                    int nros = Integer.parseInt(tokens.nextToken());
                    String monedas = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, monedas, saldo);
                    saldos.add(tipoMoneda);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }

    public void llenarListaCuentas() {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto("Usuarios");
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 5) { 
                    String nombrec = tokens.nextToken();
                    String apellido = tokens.nextToken();
                    int nroc = 0;
                    try {
                        nroc = Integer.parseInt(tokens.nextToken());
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                    String login = tokens.nextToken();
                    String contraseña = tokens.nextToken();
                    Cuenta cuenta = new Cuenta(nombrec, apellido, nroc, login, contraseña);
                    cuentas.add(cuenta);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferirDinero().setVisible(true);
            }
        });
    }

    public void idioma(int idioma){
        if (idioma==1){
            ingles();
        }else if(idioma==2){
            quechua();
        }
    }
    
    public void ingles(){
        jLabel2.setText("Enter the amount of");
        BotonAtras.setText("Back");
        jLabel3.setText("money to transfer:");
        jLabel4.setText("Enter account number");
        jLabel5.setText("to transfer:");
        jButtonConfirmar.setText("Confirm");
        jLabel1.setText("Transfer Money");
        jLabel7.setText("TRANSACTION HISTORY");
    }

    public void quechua(){
        jLabel2.setText("Qullqiyta waktay");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("ñananchasqa:");
        jLabel4.setText("Qillqayki ruray");
        jLabel5.setText("ñananchasqa:");
        jButtonConfirmar.setText("Kachkanay");
        jLabel1.setText("Qullqi waktay");
        jLabel7.setText("LLAQTANAKUQ WAKT'AYNIN");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextArea historial;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nrocuenta;
    // End of variables declaration//GEN-END:variables
}
