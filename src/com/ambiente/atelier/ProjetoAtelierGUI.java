/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ambiente.atelier;

import com.logica.atelier.Jogo;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pedrc
 */
public class ProjetoAtelierGUI extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private static int i = 0;
    private final Jogo jogo;

    /**
     * Creates new form ProjetoAtelierGUI
     */
    public ProjetoAtelierGUI() {
        initComponents();
        this.jogo = new Jogo();
        this.jogo.sorteiaPalavra();
        if (this.jogo.getPontos() == 0) {
            String pathImage = this.jogo.getImagem();
            this.labelImagePalavra.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImage)));
        }
        this.txtPalavra.setText(this.jogo.getPalavraFormatada());
        this.jogo.bancoAudio(new File("bancoAudio/musicaProjeto.wav").getAbsolutePath());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBackgroundFim = new javax.swing.JLabel();
        txtLetra = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JLabel();
        labelBalao = new javax.swing.JLabel();
        labelBalaoErros = new javax.swing.JLabel();
        buttonA = new javax.swing.JButton();
        buttonB = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();
        buttonD = new javax.swing.JButton();
        buttonE = new javax.swing.JButton();
        buttonF = new javax.swing.JButton();
        buttonG = new javax.swing.JButton();
        buttonH = new javax.swing.JButton();
        buttonI = new javax.swing.JButton();
        buttonJ = new javax.swing.JButton();
        buttonK = new javax.swing.JButton();
        buttonL = new javax.swing.JButton();
        buttonM = new javax.swing.JButton();
        buttonN = new javax.swing.JButton();
        buttonO = new javax.swing.JButton();
        buttonP = new javax.swing.JButton();
        buttonQ = new javax.swing.JButton();
        buttonR = new javax.swing.JButton();
        buttonS = new javax.swing.JButton();
        buttonT = new javax.swing.JButton();
        buttonU = new javax.swing.JButton();
        buttonV = new javax.swing.JButton();
        buttonX = new javax.swing.JButton();
        buttonZ = new javax.swing.JButton();
        txtErros = new javax.swing.JLabel();
        labelNivel = new javax.swing.JLabel();
        labelPontos = new javax.swing.JLabel();
        labelImagePalavra = new javax.swing.JLabel();
        labelVermelhoVerde = new javax.swing.JLabel();
        labelBackgroundInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(labelBackgroundFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        txtLetra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        txtLetra.setForeground(new java.awt.Color(255, 255, 255));
        txtLetra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 40, 40));

        txtPalavra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        txtPalavra.setForeground(new java.awt.Color(158, 124, 90));
        txtPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, 30));

        labelBalao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 122, 78));

        labelBalaoErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelBalaoErros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 122, 78));

        buttonA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraA.png"))); // NOI18N
        buttonA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonA.setName("A"); // NOI18N
        buttonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 40, 40));

        buttonB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraB.png"))); // NOI18N
        buttonB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonB.setName("B"); // NOI18N
        buttonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 40, 40));

        buttonC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraC.png"))); // NOI18N
        buttonC.setName("C"); // NOI18N
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 40, 40));

        buttonD.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraD.png"))); // NOI18N
        buttonD.setName("D"); // NOI18N
        buttonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 40, 40));

        buttonE.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraE.png"))); // NOI18N
        buttonE.setName("E"); // NOI18N
        buttonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, 40));

        buttonF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraF.png"))); // NOI18N
        buttonF.setName("F"); // NOI18N
        buttonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 40, 40));

        buttonG.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraG.png"))); // NOI18N
        buttonG.setName("G"); // NOI18N
        buttonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 40, 40));

        buttonH.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraH.png"))); // NOI18N
        buttonH.setName("H"); // NOI18N
        buttonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 40, 40));

        buttonI.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraI.png"))); // NOI18N
        buttonI.setName("I"); // NOI18N
        buttonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 40, 40));

        buttonJ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraJ.png"))); // NOI18N
        buttonJ.setName("J"); // NOI18N
        buttonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 40, 40));

        buttonK.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraK.png"))); // NOI18N
        buttonK.setName("K"); // NOI18N
        buttonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 40, 40));

        buttonL.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraL.png"))); // NOI18N
        buttonL.setName("L"); // NOI18N
        buttonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 40, 40));

        buttonM.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraM.png"))); // NOI18N
        buttonM.setName("M"); // NOI18N
        buttonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 40, 40));

        buttonN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraN.png"))); // NOI18N
        buttonN.setName("N"); // NOI18N
        buttonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 40, 40));

        buttonO.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraO.png"))); // NOI18N
        buttonO.setName("O"); // NOI18N
        buttonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 40, 40));

        buttonP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraP.png"))); // NOI18N
        buttonP.setName("P"); // NOI18N
        buttonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        buttonQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraQ.png"))); // NOI18N
        buttonQ.setName("Q"); // NOI18N
        buttonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 40, 40));

        buttonR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraR.png"))); // NOI18N
        buttonR.setName("R"); // NOI18N
        buttonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 40, 40));

        buttonS.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraS.png"))); // NOI18N
        buttonS.setName("S"); // NOI18N
        buttonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 40, 40));

        buttonT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraT.png"))); // NOI18N
        buttonT.setName("T"); // NOI18N
        buttonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 40, 40));

        buttonU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraU.png"))); // NOI18N
        buttonU.setName("U"); // NOI18N
        buttonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonU, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, 40));

        buttonV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraV.png"))); // NOI18N
        buttonV.setName("V"); // NOI18N
        buttonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 40, 40));

        buttonX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraX.png"))); // NOI18N
        buttonX.setName("X"); // NOI18N
        buttonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 40, 40));

        buttonZ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buttonZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/letraZ.png"))); // NOI18N
        buttonZ.setName("Z"); // NOI18N
        buttonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButton(evt);
            }
        });
        getContentPane().add(buttonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 40, 40));

        txtErros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtErros.setForeground(new java.awt.Color(211, 155, 72));
        txtErros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(txtErros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 60, 30));

        labelNivel.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 11)); // NOI18N
        labelNivel.setForeground(new java.awt.Color(166, 96, 51));
        labelNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNivel.setText("1");
        getContentPane().add(labelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 20, 20));

        labelPontos.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 30)); // NOI18N
        labelPontos.setForeground(new java.awt.Color(255, 255, 255));
        labelPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPontos.setText("0");
        getContentPane().add(labelPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 50, 30));

        labelImagePalavra.setBackground(new java.awt.Color(255, 255, 255));
        labelImagePalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagePalavra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/imagemVazia.png"))); // NOI18N
        labelImagePalavra.setOpaque(true);
        getContentPane().add(labelImagePalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 140, 150));

        labelVermelhoVerde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVermelhoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/botaoCinzento.png"))); // NOI18N
        labelVermelhoVerde.setName("labelVermelhoVerde"); // NOI18N
        getContentPane().add(labelVermelhoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 40, 40));

        labelBackgroundInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBackgroundInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ambiente/atelier/bancoImagens/backgroundPersonagensInicio.png"))); // NOI18N
        getContentPane().add(labelBackgroundInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validarButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarButton
        Object obj = evt.getSource();
        JButton btn;
        if (obj instanceof JButton) {
            btn = (JButton) obj;
            this.txtLetra.setText(btn.getName());
            this.jogo.bancoAudio("bancoAudio/letra" + this.txtLetra.getText() + ".wav");
            this.analisarLetra(btn);
            btn.setEnabled(false);
            for (int j = 0; j < this.jogo.getAcertos().length(); j++) {
                if (this.txtLetra.getText().equals(this.jogo.getAcertos().substring(j))) {
                    this.capturaLetra();
                } else {
                    this.txtErros.setText(this.jogo.getErros());
                }
            }
        }
        this.atualizarBalaoErros();
    }//GEN-LAST:event_validarButton

    private void capturaLetra() {   //Capturar a letra e se os pontos forem iguais a 36 acaba o jogo
        if (this.jogo.isVencedor()) {
            int numero = ThreadLocalRandom.current().nextInt(1, 6);
            this.jogo.bancoAudio("bancoAudio/audioVence" + numero + ".wav");
            this.jogo.penalizarErros();
            this.jogo.sorteiaPalavra();
            this.resetarTudo();
            String pathImage = this.jogo.getImagem();
            this.labelImagePalavra.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImage)));
            this.atualizarBalao();
        }
        if (this.jogo.getPontos() >= 36) {
            this.labelPontos.setText("36");
            ImageIcon icon = new ImageIcon("bancoImagens/imagemVazia.png");
            this.txtPalavra.setText("VENCEDOR");
            this.labelImagePalavra.setIcon(icon);
            this.fimJogo();
        } else {
            this.nivelPontos();
            this.labelPontos.setText("" + this.jogo.getPontos());
            this.txtPalavra.setText(this.jogo.getPalavraFormatada());
        }
    }

    private void reiniciarLetras() {    //Habilitar todas as letras do jogo
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonG.setEnabled(true);
        buttonH.setEnabled(true);
        buttonI.setEnabled(true);
        buttonJ.setEnabled(true);
        buttonK.setEnabled(true);
        buttonL.setEnabled(true);
        buttonM.setEnabled(true);
        buttonN.setEnabled(true);
        buttonO.setEnabled(true);
        buttonP.setEnabled(true);
        buttonQ.setEnabled(true);
        buttonR.setEnabled(true);
        buttonS.setEnabled(true);
        buttonT.setEnabled(true);
        buttonU.setEnabled(true);
        buttonV.setEnabled(true);
        buttonX.setEnabled(true);
        buttonZ.setEnabled(true);
    }

    public void analisarLetra(JButton btn) {    //Analisar a letra e retornar o botão correspondente
        String texto = this.txtLetra.getText();
        this.jogo.validaLetra(texto);
        this.txtErros.setText(this.jogo.getErros());
        this.txtPalavra.setText(this.jogo.getPalavraFormatada());
        if (this.jogo.getErros().contains(btn.getName())) {
            ImageIcon icon = new ImageIcon(this.getClass().getResource("bancoImagens/botaoVermelho.png"));
            this.labelVermelhoVerde.setIcon(icon);
        } else {
            ImageIcon icon = new ImageIcon(getClass().getResource("bancoImagens/botaoVerde.png"));
            this.labelVermelhoVerde.setIcon(icon);
        }
    }

    public void resetarTudo() { //Executado ao começar um novo jogo
        this.reiniciarLetras();
        this.txtLetra.setText("");
        this.txtErros.setText("");
        ImageIcon icon = new ImageIcon(getClass().getResource("bancoImagens/botaoCinzento.png"));
        this.labelVermelhoVerde.setIcon(icon);
    }

    public void atualizarBalao() {  //Executado quando o usuário acerta a palavra
        int numero = ThreadLocalRandom.current().nextInt(1, 6);
        ImageIcon icon = new ImageIcon(getClass().getResource("bancoImagens/balao" + numero + ".png"));
        this.labelBalao.setIcon(icon);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                ++i;
                if (i == 3) {
                    ImageIcon icon = new ImageIcon("");
                    labelBalao.setIcon(icon);
                    t.cancel();
                    i = 0;
                }
            }
        }, 1000, 1000);
    }

    public void atualizarBalaoErros() { //Executado quando o usuário erra 5 vezes
        if (this.jogo.getErros().length() >= 5) {
            ImageIcon icon = (new ImageIcon(getClass().getResource("bancoImagens/balaoErros.png")));
            labelBalaoErros.setIcon(icon);
            int numero = ThreadLocalRandom.current().nextInt(1, 6);
            this.jogo.bancoAudio("bancoAudio/audioPerde" + numero + ".wav");
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    ++i;
                    if (i == 3) {
                        ImageIcon icon = new ImageIcon("");
                        labelBalaoErros.setIcon(icon);
                        jogo.sorteiaPalavra();
                        String pathImage = jogo.getImagem();
                        labelImagePalavra.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImage)));
                        labelPontos.setText("" + jogo.getPontos());
                        txtPalavra.setText(jogo.getPalavraFormatada());
                        resetarTudo();
                        nivelPontos();
                        fimJogo();
                        t.cancel();
                        i = 0;
                    }
                }
            }, 1000, 1000);
        }
    }

    public void nivelPontos() {
        if (this.jogo.getPontos() <= 10) {   //Nivel 1: Máximo de pontos: 10
            labelNivel.setText("1");
        }
        if (this.jogo.getPontos() > 10 && this.jogo.getPontos() <= 21) { //Nivel 2: Máximo de pontos: 20
            labelNivel.setText("2");
            ImageIcon icon = (new ImageIcon(getClass().getResource("bancoImagens/backgroundPersonagensFase2.png")));
            labelBackgroundInicio.setIcon(icon);
        }
        if (this.jogo.getPontos() > 21 && this.jogo.getPontos() <= 36) { //Nivel 3: Máximo de pontos: 35
            labelNivel.setText("3");
            ImageIcon icon = (new ImageIcon(getClass().getResource("bancoImagens/backgroundPersonagensFase3.png")));
            labelBackgroundInicio.setIcon(icon);
        }
    }

    public void fimJogo() {
        if (this.jogo.getPontos() >= 36) {
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    ++i;
                    if (i == 1) {
                        ImageIcon icon = (new ImageIcon(getClass().getResource("bancoImagens/backgroundProjetoCreditos.png")));
                        jogo.bancoAudio(new File("bancoAudio/musicaProjetoFim.wav").getAbsolutePath());
                        labelBackgroundFim.setIcon(icon);
                        t.cancel();
                        i = 0;
                    }
                }
            }, 1000, 1000);
            this.jogo.timerSair();
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoAtelierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProjetoAtelierGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonA;
    private javax.swing.JButton buttonB;
    private javax.swing.JButton buttonC;
    private javax.swing.JButton buttonD;
    private javax.swing.JButton buttonE;
    private javax.swing.JButton buttonF;
    private javax.swing.JButton buttonG;
    private javax.swing.JButton buttonH;
    private javax.swing.JButton buttonI;
    private javax.swing.JButton buttonJ;
    private javax.swing.JButton buttonK;
    private javax.swing.JButton buttonL;
    private javax.swing.JButton buttonM;
    private javax.swing.JButton buttonN;
    private javax.swing.JButton buttonO;
    private javax.swing.JButton buttonP;
    private javax.swing.JButton buttonQ;
    private javax.swing.JButton buttonR;
    private javax.swing.JButton buttonS;
    private javax.swing.JButton buttonT;
    private javax.swing.JButton buttonU;
    private javax.swing.JButton buttonV;
    private javax.swing.JButton buttonX;
    private javax.swing.JButton buttonZ;
    private javax.swing.JLabel labelBackgroundFim;
    private javax.swing.JLabel labelBackgroundInicio;
    private javax.swing.JLabel labelBalao;
    private javax.swing.JLabel labelBalaoErros;
    private javax.swing.JLabel labelImagePalavra;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelPontos;
    private javax.swing.JLabel labelVermelhoVerde;
    private javax.swing.JLabel txtErros;
    private javax.swing.JLabel txtLetra;
    private javax.swing.JLabel txtPalavra;
    // End of variables declaration//GEN-END:variables
}
