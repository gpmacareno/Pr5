package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ActionListener, ItemListener

{
	Frame ventana = new Frame("Vehículos");
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo3 = new CheckboxGroup();
	Label lblNombre = new Label("Tipo de motorización:");
	Checkbox checkbox1 = new Checkbox("Gasolina", false, chkgrGrupo1);
	Checkbox checkbox2 = new Checkbox("Diésel", false, chkgrGrupo1);
	Checkbox checkbox3 = new Checkbox("Híbrido", false, chkgrGrupo1);
	Checkbox checkbox4 = new Checkbox("Eléctrico", false, chkgrGrupo1);
	Label lblNombre2 = new Label("Número de puertas:");
	Checkbox checkbox5 = new Checkbox("3 puertas", false, chkgrGrupo2);
	Checkbox checkbox6 = new Checkbox("4 puertas", false, chkgrGrupo2);
	Checkbox checkbox7 = new Checkbox("5 puertas", false, chkgrGrupo2);
	Label lblNombre3 = new Label("Pintura Metalizada:");
	Checkbox chkUno = new Checkbox("Sí", false, chkgrGrupo3);
	Checkbox chkDos = new Checkbox("No", false, chkgrGrupo3);
	Button btnComprobar = new Button("Calcular presupuesto");
	TextField campopresupuesto = new TextField(20);
	Panel pnlCheckboxes = new Panel();
	Panel pnlBoton = new Panel();

	Ejercicio5()
	{
		ventana.setBackground(Color.pink);
		ventana.setSize(450, 160);
		ventana.setLayout(new BorderLayout());
		ventana.addWindowListener(this);
		btnComprobar.addActionListener(this);
		campopresupuesto.setEditable(false);

		pnlCheckboxes.setLayout(new FlowLayout());

		pnlCheckboxes.add(lblNombre);
		pnlCheckboxes.add(checkbox1);
		pnlCheckboxes.add(checkbox2);
		pnlCheckboxes.add(checkbox3);
		pnlCheckboxes.add(checkbox4);
		pnlCheckboxes.add(lblNombre2);
		pnlCheckboxes.add(checkbox5);
		pnlCheckboxes.add(checkbox6);
		pnlCheckboxes.add(checkbox7);
		pnlCheckboxes.add(lblNombre3);
		pnlCheckboxes.add(chkUno);
		pnlCheckboxes.add(chkDos);
		

		pnlBoton.setLayout(new FlowLayout());
		pnlBoton.add(btnComprobar);
		pnlBoton.add(campopresupuesto);

		ventana.add(pnlCheckboxes, "Center");
		ventana.add(pnlBoton, "South");

		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Ejercicio5();

	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		boolean gasolina = checkbox1.getState();
		boolean diesel = checkbox2.getState();
		boolean hibrido = checkbox3.getState();
		boolean electrico = checkbox4.getState();
		boolean trespuertas = checkbox5.getState();
		boolean cuatropuertas = checkbox6.getState();
		boolean cincopuertas = checkbox7.getState();
		boolean pinturametalica = chkUno.getState();

		int presupuesto = 0;

		if (gasolina)
		{
			presupuesto += 8000; /*
									 * += se denomina operador de asignacion compuesta y sirve para sumarle una
									 * cantidad al valor de una variable.
									 */
		} else if (diesel)
		{
			presupuesto += 10000;
		} else if (hibrido)
		{
			presupuesto += 12000;
		} else if (electrico)
		{
			presupuesto += 15000;
		}

		if (trespuertas)
		{
			presupuesto += 0;
		} else if (cuatropuertas)
		{
			presupuesto += 2000;
		} else if (cincopuertas)
		{
			presupuesto += 4000;
		}

		if (pinturametalica)
		{
			presupuesto += 1000;
		}
		

		campopresupuesto.setText(String.valueOf(presupuesto)+" €");
		
		

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
}
