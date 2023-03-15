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
	Frame ventana = new Frame("Provincias Espa�olas");
	Choice choLista = new Choice();
	String[] provincias =
	{ "Seleccione una provincia", "�lava", "Albacete", "Alicante", "Almer�a", "Asturias", "�vila", "Badajoz",
			"Barcelona", "Burgos", "C�ceres", "C�diz", "Cantabria", "Castell�n", "Ciudad Real", "C�rdoba", "La Coru�a",
			"Cuenca", "Gerona", "Granada", "Guadalajara", "Guip�zcoa", "Huelva", "Huesca", "Islas Baleares", "Ja�n",
			"Le�n", "L�rida", "Lugo", "Madrid", "M�laga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
			"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
			"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };
	String[] gentilicios =
	{ "No ha elegido ninguna opci�n", "Alav�s/Alavesa o Babazorro/rra", "Albacete�o/�a o Albacetense", "Alicantino/na",
			"Almeriense, Urcitano/na", "Asturiano/na, Astur", "Abulense, Avil�s/esa",
			"Pacense, Badajocense, Badajoce�o/�a", "Barcelon�s/esa, Barcinonense", "Burgal�s/esa", "Cacere�o/�a",
			"Gaditano/na", "C�ntabro/a", "Castellonense", "Ciudadreale�o/�a", "Cordob�s/esa", "Coru��s", "Conquense",
			"Gerundense, Giron�s/esa", "Granadino/na", "Guadalajar�o/�a, Caracense, Arriacense", "Guipuzcoano/na",
			"Onubense", "Oscense", "Balear", "Jaen�s/esa, Jaenero/ro, Jienense, Giennense", "Leon�s/esa", "Leridano",
			"Lucense", "Madrile�o/�a", "Malague�o/�a", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
			"Palmense", "Pontevedr�s/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
			"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
			"Pucelano/na", "Vizca�no/na", "Zamorano/na", "Zaragozano/na" };
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
