/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

/**
 *
 * @author Administrador
 */
public class ctlBase extends JInternalFrame
{

    //classe pai dos objetos que serão instanciadas por essa classe
    private frmMenu telaPrincipal;

    //método construtor da tela
    public ctlBase(String titulo, frmMenu telaPrincipal)
    {
        //reescreve o método construtor da classe pai, ajustando o título da janela (neste caso)
        super(titulo, false, true, false, false);

        setVisible(true);

        this.telaPrincipal = telaPrincipal;

        telaPrincipal.jdPane.add(this);
    }
    
    public void dispose()
    {
        frmMenu.setCtlTela(null);
        super.dispose();
    }

}
