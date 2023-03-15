package es.studium.Ejercicios;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 implements WindowListener, ActionListener, ItemListener, MouseListener
{
	Frame ventana = new Frame("Provincias Españolas");
	Choice choLista = new Choice();
	String[] provincias =
	{ "Seleccione una provincia", "Álava", "Albacete", "Alicante", "Almería", "Asturias", "Ávila", "Badajoz",
			"Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña",
			"Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén",
			"León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
			"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
			"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };
	String[] gentilicios =
	{ "No ha elegido ninguna opción", "Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na",
			"Almeriense, Urcitano/na", "Asturiano/na, Astur", "Abulense, Avilés/esa",
			"Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña",
			"Gaditano/na", "Cántabro/a", "Castellonense", "Ciudadrealeño/ña", "Cordobés/esa", "Coruñés", "Conquense",
			"Gerundense, Gironés/esa", "Granadino/na", "Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na",
			"Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense", "Leonés/esa", "Leridano",
			"Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
			"Palmense", "Pontevedrés/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
			"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
			"Pucelano/na", "Vizcaíno/na", "Zamorano/na", "Zaragozano/na" };
	TextField seleccionado = new TextField(20);

	Ejercicio6()
	{

		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(275, 300);

		ventana.addWindowListener(this);
		seleccionado.setEditable(false);
		choLista.addItemListener(this);


		for (String provincia : provincias)

		{

			choLista.add(provincia);

		}
		
		ventana.add(choLista);
		ventana.add(seleccionado);

		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{

		new Ejercicio6();
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{

		int index = choLista.getSelectedIndex();

		seleccionado.setText(gentilicios[index]);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		System.exit(0);
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

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

}
