/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;

/**
 *
 * @author juan_
 */
public class FormularioCuestionario extends javax.swing.JFrame {

    //Vamos a generar un List de radioButtons
    List<JRadioButton> radios = new ArrayList<>();
    List<Pregunta> preguntas = new ArrayList<>();
    int preguntaActual=0;

    public FormularioCuestionario() {
        initComponents();
        //Aqui dentro del constructor de nuestro formulario
        //invocamos nuesto metodo generarCuestionario()
        //LLenamos lo radios
        radios.add(radiotituloOpcion0);
        radios.add(radiotituloOpcion1);
        radios.add(radiotituloOpcion2);
        radios.add(radiotituloOpcion3);

        generarCuestionario();

    }

    //Aqui vamos a pegar el metodo
    public void generarCuestionario() {
        //Con el modelo construido debemos representar uestra pregunta
        //y mostrarala
        //Primero creamos las opciones
        Opcion op1 = new Opcion();
        op1.setTitulo("Londres");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("Roma");
        op2.setCorrecta(false);

        Opcion op3 = new Opcion();
        op3.setTitulo("Paris");
        op3.setCorrecta(true);

        Opcion op4 = new Opcion();
        op4.setTitulo("Oslo");
        op4.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones = {op1, op2, op3, op4};
        Pregunta p1 = new Pregunta();
        p1.setTitulo("¿Cual es la capital de Francia");
        p1.setOpciones(opciones);
        
        //Opiciones de la pregumta Numero 2
        Opcion op21 = new Opcion();
        op21.setTitulo("Atlantico");
        op21.setCorrecta(false);

        Opcion op22 = new Opcion();
        op22.setTitulo("Indico");
        op22.setCorrecta(false);

        Opcion op23 = new Opcion();
        op23.setTitulo("Artico");
        op23.setCorrecta(false);

        Opcion op24 = new Opcion();
        op24.setTitulo("Pacifico");
        op24.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones2 = {op21, op22, op23, op24};
        Pregunta p2 = new Pregunta();
        p2.setTitulo("¿Cual es el oceano más grande del mundo?");
        p2.setOpciones(opciones2);
        
        Opcion op30 = new Opcion();
        op30.setTitulo("Rusia");
        op30.setCorrecta(true);
        
        Opcion op31 = new Opcion();
        op31.setTitulo("Mexico");
        op31.setCorrecta(false);
        
        Opcion op32 = new Opcion();
        op32.setTitulo("Alemannia");
        op32.setCorrecta(false);
        
        Opcion op33 = new Opcion();
        op33.setTitulo("Japon");
        op33.setCorrecta(false);
        
        
        Opcion[] opciones3 = {op30,  op31, op32, op33 };
        Pregunta p3 =new Pregunta();
        p3.setTitulo("¿Cual es el pais mas grande  ?");
        p3.setOpciones(opciones3);
        
        
        Opcion op40 = new  Opcion();
        op40.setTitulo("Morado");
        op40.setCorrecta(false);
        
        Opcion op41 = new  Opcion(); 
        op41.setTitulo("Rojo");
        op41.setCorrecta(false);
        
        Opcion op42 = new Opcion();
        op42.setTitulo("Azul");
        op42.setCorrecta(false);
        
        Opcion op43 = new Opcion();
        op43.setTitulo("Amarillo");
        op43.setCorrecta(true);
        
        
        Opcion[] opciones4 ={op40, op41, op42, op43};
        Pregunta p4 = new Pregunta ();
        p4.setTitulo("¿Cual es color que suele relacionarse  con la  felicidad?");
        p4.setOpciones(opciones4);
        
        
        Opcion op50 = new Opcion();
        op50.setTitulo("Neil Armstrong");
        op50.setCorrecta(true);
        
        Opcion op51 = new Opcion();
        op51.setTitulo("Leonardo Campos");
        op51.setCorrecta(false);
        
        Opcion op52 = new Opcion();
        op52.setTitulo("Valentin Becker");
        op52.setCorrecta(false);
        
        Opcion op53 = new Opcion();
        op53.setTitulo("Luisa Will");
        op53.setCorrecta(false);
                
  
        Opcion[] opciones5 ={op50, op51, op52, op53};
        Pregunta p5 = new Pregunta ();
        p5.setTitulo("¿Quien fue el primer hombre en pisar la luna?");
        p5.setOpciones(opciones5);
        
        
        
        Opcion op60 = new Opcion();
        op60.setTitulo("Durango");
        op60.setCorrecta(false);
                
        Opcion op61 = new Opcion();
        op61.setTitulo("Caracas");
        op61.setCorrecta(true);
        
        Opcion op62 =new Opcion();
        op62.setTitulo("Brasilia");
        op62.setCorrecta(false);
        
        Opcion op63 =new Opcion();
        op63.setTitulo("Tokyo");
        op63.setCorrecta(false);
        
        
        Opcion[] opciones6 ={op60, op61, op62, op63};
        Pregunta p6= new Pregunta ();
        p6.setTitulo("¿Cual es la capital de Venezuela?");
        p6.setOpciones(opciones6);
        
        
        Opcion op70= new Opcion();
        op70.setTitulo("Jupiter");
        op70.setCorrecta(false);
        
        Opcion op71= new Opcion();
        op71.setTitulo("Marte");
        op71.setCorrecta(false);
        
        Opcion op72 = new Opcion();
        op72.setTitulo("Tierra");
        op72.setCorrecta(true);
        
        Opcion op73 = new Opcion();
        op73.setTitulo("Saturno");
        op73.setCorrecta(false);
        
                
        Opcion[] opciones7 ={op70, op71, op72, op73};
        Pregunta p7= new Pregunta();
        p7.setTitulo("¿Cual es el tercer planeta del sistema solar ?");
        p7.setOpciones(opciones7);
        
        Opcion op80 = new Opcion();
        op80.setTitulo("Socatres");
        op80.setCorrecta(false);
        
        Opcion op81 = new Opcion();
        op81.setTitulo("Aristoteles");
        op81.setCorrecta(false);
        
        
        Opcion op82 = new Opcion();
        op82.setTitulo("Confusio");
        op82.setCorrecta(false);
        
        Opcion op83 = new Opcion();
        op83.setTitulo("Platon");
        op83.setCorrecta(true);
                
        
        Opcion[] opciones8 ={op80, op81, op82, op83};
        Pregunta p8= new Pregunta();
        p8.setTitulo("¡Quien dijo yo solo se que no se nada? ");
        p8.setOpciones(opciones8);
        
        
        Opcion op90=new Opcion();
        op90.setTitulo("Estocolmo");
        op90.setCorrecta(true);
        
        Opcion op91=new Opcion();
        op91.setTitulo("Luanda");
        op91.setCorrecta(false);
        
        Opcion op92=new Opcion();
        op92.setTitulo("Argel");
        op92.setCorrecta(false);
        
        Opcion op93=new Opcion();
        op93.setTitulo("Riad");
        op93.setCorrecta(false);
        
        
        Opcion[] opciones9 ={op90, op91, op92, op93};
        Pregunta p9= new Pregunta();
        p9.setTitulo("¿Cual es la capital de Suecia?");
        p9.setOpciones(opciones9);
        
        Opcion op100=new Opcion();
        op100.setTitulo("Argentina");
        op100.setCorrecta(false);
        
        Opcion op101=new Opcion();
        op101.setTitulo("China");
        op101.setCorrecta(false);
        
        Opcion op102=new Opcion();
        op102.setTitulo("Cuba");
        op102.setCorrecta(false);
        
        Opcion op103=new Opcion();
        op103.setTitulo("India");
        op103.setCorrecta(true);
        
        
        
        Opcion[] opciones10={op100, op101, op102, op103};
        Pregunta p10=new Pregunta();
        p10.setTitulo("¿En que pais se encuentra el Taj Mahal ?");
        p10.setOpciones(opciones10);


        //Vamos a adaptar el cuestioanario a lo que ya teniamos
        Cuestionario c = new Cuestionario();
        //Creamos el list de preguntas
        
        

        //Se agrega a este list la unica prgunta que tenemos
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        
        
        //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        c.setPreguntas(preguntas);
//Primero ajustamos el titulo de la primer pregunta en la etiqueta de la preunta
    mostrarPregunta(preguntaActual);
        
    }
public void mostrarPregunta(int indicePregunta){
    //Checar si el indice de pregunta no rebaso el numero de preguntas
    //dentro del arraylist preguntas.
    etiquetaTituloPregunta.setText(preguntas.get(indicePregunta).getTitulo());

        //Llenamos con el modelo los radio buttons
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(preguntas.get(indicePregunta).getOpciones()[i].getTitulo());
        }

}
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        etiquetaTituloPregunta = new javax.swing.JLabel();
        radiotituloOpcion0 = new javax.swing.JRadioButton();
        radiotituloOpcion1 = new javax.swing.JRadioButton();
        radiotituloOpcion2 = new javax.swing.JRadioButton();
        radiotituloOpcion3 = new javax.swing.JRadioButton();
        botonRespuesta = new javax.swing.JButton();
        etiquetaRespueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTituloPregunta.setText("jLabel1");

        grupo.add(radiotituloOpcion0);
        radiotituloOpcion0.setText("jRadioButton1");

        grupo.add(radiotituloOpcion1);
        radiotituloOpcion1.setText("jRadioButton2");

        grupo.add(radiotituloOpcion2);
        radiotituloOpcion2.setText("jRadioButton3");

        grupo.add(radiotituloOpcion3);
        radiotituloOpcion3.setText("jRadioButton4");

        botonRespuesta.setText("Checar respuesta");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaRespueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRespuesta)
                            .addComponent(radiotituloOpcion3)
                            .addComponent(radiotituloOpcion2)
                            .addComponent(radiotituloOpcion1)
                            .addComponent(radiotituloOpcion0))
                        .addGap(0, 296, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaTituloPregunta)
                .addGap(18, 18, 18)
                .addComponent(radiotituloOpcion0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiotituloOpcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiotituloOpcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiotituloOpcion3)
                .addGap(18, 18, 18)
                .addComponent(botonRespuesta)
                .addGap(18, 18, 18)
                .addComponent(etiquetaRespueta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaActionPerformed
      
          if(preguntaActual<preguntas.size()){
        Opcion[] opciones = preguntas.get(preguntaActual).getOpciones();
       boolean acierto=false;
        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {   
                acierto=true;
                break;
            }
        } //Aqui termina el for
       etiquetaRespueta.setText("Tu respuesta es  "+acierto);
       //Este incremento hace que la siguiente pregunta sea incrementada en 1
          preguntaActual++;
        //Para  que no se lance la expcion hacer que el metodo mostrar pregunta
        //no muestre la preguta si el tamaño de ArrayList ue se llama preguntas
        // ya no tiene mas preguntas, debes de apoyarte del metodo size()
     
      
      
          }
          
          if(preguntaActual<preguntas.size()){
            mostrarPregunta(preguntaActual);
        }

    }//GEN-LAST:event_botonRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JLabel etiquetaRespueta;
    private javax.swing.JLabel etiquetaTituloPregunta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JRadioButton radiotituloOpcion0;
    private javax.swing.JRadioButton radiotituloOpcion1;
    private javax.swing.JRadioButton radiotituloOpcion2;
    private javax.swing.JRadioButton radiotituloOpcion3;
    // End of variables declaration//GEN-END:variables

    public boolean checarRespuesta(Opcion[] opciones) {
        boolean correcta = false;

        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
                System.out.println("Ya le atinaste");
                correcta = true;
                break;
            }
        }

        return correcta;
    }
}
