/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author SergioMarquez
 */

public class ViewMayor extends javax.swing.JPanel {

   

    /**
     * Creates new form ViewNotas
     */
    public ViewMayor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jinframe_edad = new javax.swing.JInternalFrame();
        jl_numero1 = new javax.swing.JLabel();
        jl_numero2 = new javax.swing.JLabel();
        jl_numero3 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jtf_numero2 = new javax.swing.JTextField();
        jtf_numero3 = new javax.swing.JTextField();
        jl_mayor = new javax.swing.JLabel();
        jl_menor = new javax.swing.JLabel();
        jbtn_calcular = new javax.swing.JButton();

        jinframe_edad.setClosable(true);
        jinframe_edad.setIconifiable(true);
        jinframe_edad.setMaximizable(true);
        jinframe_edad.setResizable(true);
        jinframe_edad.setTitle("Numero Mayor y Menor");
        jinframe_edad.setVisible(true);

        jl_numero1.setText("Número 1:");

        jl_numero2.setText("Número 2:");

        jl_numero3.setText("Número 3:");

        jl_mayor.setText("***MAYOR***");

        jl_menor.setText("***MENOR***");

        jbtn_calcular.setText("Calcular");

        javax.swing.GroupLayout jinframe_edadLayout = new javax.swing.GroupLayout(jinframe_edad.getContentPane());
        jinframe_edad.getContentPane().setLayout(jinframe_edadLayout);
        jinframe_edadLayout.setHorizontalGroup(
            jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinframe_edadLayout.createSequentialGroup()
                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jinframe_edadLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_mayor)
                            .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jl_numero3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(jl_numero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_numero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jinframe_edadLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_numero1)
                                    .addComponent(jtf_numero2)
                                    .addComponent(jtf_numero3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                            .addGroup(jinframe_edadLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jl_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jinframe_edadLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jbtn_calcular)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jinframe_edadLayout.setVerticalGroup(
            jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinframe_edadLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_numero1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jinframe_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_calcular)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jinframe_edad)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jinframe_edad)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_calcular;
    public static javax.swing.JInternalFrame jinframe_edad;
    public javax.swing.JLabel jl_mayor;
    public javax.swing.JLabel jl_menor;
    private javax.swing.JLabel jl_numero1;
    private javax.swing.JLabel jl_numero2;
    private javax.swing.JLabel jl_numero3;
    public javax.swing.JTextField jtf_numero1;
    public javax.swing.JTextField jtf_numero2;
    public javax.swing.JTextField jtf_numero3;
    // End of variables declaration//GEN-END:variables
}