package es.studium.Ejercicios;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();

	Menu menuArticulos = new Menu("Artículos");
	MenuItem menuArchivoNuevoArticulo = new MenuItem("Nuevo Artículo");
	MenuItem menuArchivoEliminarArticulo = new MenuItem("Eliminar Artículo");
	MenuItem menuArchivoConsultarArticulo = new MenuItem("Consultar Artículo");

	Menu menuClientes = new Menu("Clientes");
	MenuItem menuNuevoCliente = new MenuItem("Nuevo Cliente");
	MenuItem menuEliminarCliente = new MenuItem("Eliminar Cliente");
	MenuItem menuConsultarCliente = new MenuItem("Consultar Cliente");

	Menu menuFacturas = new Menu("Facturas");
	MenuItem menuNuevaFactura = new MenuItem("Nueva Factura");
	MenuItem menuConsultarFactura = new MenuItem("Consultar Factura");
	
	Dialog dlgMensaje = new Dialog(ventana, "Selección", true);
	Label lblMensaje = new Label();
	
	public Ejercicio8()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setMenuBar(barraMenu);
		ventana.addWindowListener(this);
		
		menuArchivoNuevoArticulo.addActionListener(this);
		menuArchivoEliminarArticulo.addActionListener(this);
		menuArchivoConsultarArticulo.addActionListener(this);
		
		menuNuevoCliente.addActionListener(this);
		menuEliminarCliente.addActionListener(this);
		menuConsultarCliente.addActionListener(this);
		
		menuNuevaFactura.addActionListener(this);
		menuConsultarFactura.addActionListener(this);
		
		menuArticulos.add(menuArchivoNuevoArticulo);
		menuArticulos.addSeparator();
		menuArticulos.add(menuArchivoEliminarArticulo);
		menuArticulos.addSeparator();
		menuArticulos.add(menuArchivoConsultarArticulo);
		barraMenu.add(menuArticulos);

		menuClientes.add(menuNuevoCliente);
		menuClientes.addSeparator();
		menuClientes.add(menuEliminarCliente);
		menuClientes.addSeparator();
		menuClientes.add(menuConsultarCliente);
		barraMenu.add(menuClientes);

		menuFacturas.add(menuNuevaFactura);
		menuFacturas.addSeparator();
		menuFacturas.add(menuConsultarFactura);
		barraMenu.add(menuFacturas);

		ventana.setSize(400, 400);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		dlgMensaje.setSize(100,100);
		dlgMensaje.setBackground(Color.red);
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setLayout(new FlowLayout());
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setResizable(false);

	}

	public static void main(String[] args)
	{
		new Ejercicio8();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == menuArchivoNuevoArticulo)
		{
			lblMensaje.setText(menuArchivoNuevoArticulo.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuArchivoEliminarArticulo)
		{
			lblMensaje.setText(menuArchivoEliminarArticulo.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuArchivoConsultarArticulo)
		{
			lblMensaje.setText(menuArchivoConsultarArticulo.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuNuevoCliente)
		{
			lblMensaje.setText(menuNuevoCliente.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuEliminarCliente)
		{
			lblMensaje.setText(menuEliminarCliente.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuConsultarCliente)
		{
			lblMensaje.setText(menuConsultarCliente.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuNuevaFactura)
		{
			lblMensaje.setText(menuNuevaFactura.getLabel());
			dlgMensaje.setVisible(true);
		}
		if (e.getSource() == menuConsultarFactura)
		{
			lblMensaje.setText(menuConsultarFactura.getLabel());
			dlgMensaje.setVisible(true);
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		if(dlgMensaje.isActive()) {
		   dlgMensaje.setVisible(false);
			

		}
		else {
			System.exit(0);
		}		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
