/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.view;

import org.example.controller.*;
import org.example.exception.*;

//import do controller model
import org.example.model.*;
import org.example.model.Funcionario;
import org.example.model.Locacao;
import org.example.model.Reserva;
import org.example.model.Cliente;

//import da biblioteca swing
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
/**
 *
 * @author Lana S. Silva
 */
public class TelaFuncionario {

    private JFrame tela_funcionario;
    private final int WIDTH = 500;
    private final int HEIGHT = 300;
    private final int V_GAP = 10;
    private final int H_GAP = 5;

    private Funcionario funcionario = null;

    private JList<Locacao> jlLocacao;
    private JList<Reserva> jlReserva;
    private JList<Cliente> jlCliente;

    //inicialização do menu
    private JMenuBar menuBarra;
    private JMenu menuConsulta;
    private JMenu menuVoltar;

    //inicializacao do menuItem
    private JMenuItem miLocacoes, miReservas;

    //inicializacao dos botões utilizados
    private JButton adicionaLocacao, adicionaReserva, calculaComissao, calculaSalario;
    private JButton validaCredito;

    public void desenha(Funcionario f){
        
        funcionario = f;

        tela_funcionario = new JFrame("Espaço do admnistrador");
        tela_funcionario.setSize(WIDTH, HEIGHT);
        tela_funcionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela_funcionario.setLocationRelativeTo(null);
        tela_funcionario.setVisible(true);
        tela_funcionario.setLayout(new BorderLayout());
        
        inicializaComponentes();
        desenhaPaginaInicial();
        
        tela_funcionario.pack();
    }

    public void inicializaComponentes(){

        //inicializa os menus
        menuBarra = new JMenuBar();
        menuConsulta = new JMenu("Consulta");
        //menuAtualiza = new JMenu("Atualiza dados");
        menuVoltar = new JMenu("Página Inicial");

        //inicializa os itens do menu consulta
        miLocacoes = new JMenuItem("Consulta Locações ");
        miReservas = new JMenuItem("Consulta Reservas");

        //definindo o actionListener
        miConsultaLocacao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listaLocacao();
            }
        });

        miConsultaReservas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listaReserva();
            }
        });

        /*menuAtualiza.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });*/

        menuVoltar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                desenha(cliente);
            }
        });

        //adicionando os itens ao menu consulta
        menuConsulta.add(miConsultaLocacao);
        menuConsulta.add(miConsultaReservas);

        //adicionando ao menu barra
        menuBarra.add(menuVoltar);
        //menuBarra.add(menuAtualiza);
        menuBarra.add(menuConsulta);

    }

    public void desenhaPaginaInicial(){

    }
}
