package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio11 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Tres en raya");

	Button btnBoton1 = new Button("");
	Button btnBoton2 = new Button("");
	Button btnBoton3 = new Button("");
	Button btnBoton4 = new Button("");
	Button btnBoton5 = new Button("");
	Button btnBoton6 = new Button("");
	Button btnBoton7 = new Button("");
	Button btnBoton8 = new Button("");
	Button btnBoton9 = new Button("");

	int turno = 0; // 0 --> O, 1 --> X

	Ejercicio11()
	{
		ventana.setLayout(new GridLayout(3, 3));
		ventana.addWindowListener(this);

		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		btnBoton3.addActionListener(this);
		btnBoton4.addActionListener(this);
		btnBoton5.addActionListener(this);
		btnBoton6.addActionListener(this);
		btnBoton7.addActionListener(this);
		btnBoton8.addActionListener(this);
		btnBoton9.addActionListener(this);

		ventana.add(btnBoton1);
		ventana.add(btnBoton2);
		ventana.add(btnBoton3);
		ventana.add(btnBoton4);
		ventana.add(btnBoton5);
		ventana.add(btnBoton6);
		ventana.add(btnBoton7);
		ventana.add(btnBoton8);
		ventana.add(btnBoton9);

		ventana.setSize(250, 250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setResizable(false);
	}

	public static void main(String[] args)
	{
		new Ejercicio11();
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if (evento.getSource().equals(btnBoton1))
		{
			if (turno == 0)
			{
				btnBoton1.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton1.setLabel("X");
				turno = 0;
			}
			btnBoton1.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton2))
		{
			if (turno == 0)
			{
				btnBoton2.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton2.setLabel("X");
				turno = 0;
			}
			btnBoton2.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton3))
		{
			if (turno == 0)
			{
				btnBoton3.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton3.setLabel("X");
				turno = 0;
			}
			btnBoton3.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton4))
		{
			if (turno == 0)
			{
				btnBoton4.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton4.setLabel("X");
				turno = 0;
			}
			btnBoton4.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton5))
		{
			if (turno == 0)
			{
				btnBoton5.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton5.setLabel("X");
				turno = 0;
			}
			btnBoton5.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton6))
		{
			if (turno == 0)
			{
				btnBoton6.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton6.setLabel("X");
				turno = 0;
			}
			btnBoton6.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton7))
		{
			if (turno == 0)
			{
				btnBoton7.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton7.setLabel("X");
				turno = 0;
			}
			btnBoton7.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton8))
		{
			if (turno == 0)
			{
				btnBoton8.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton8.setLabel("X");
				turno = 0;
			}
			btnBoton8.removeActionListener(this);
		} else if (evento.getSource().equals(btnBoton9))
		{
			if (turno == 0)
			{
				btnBoton9.setLabel("O");
				turno = 1;
			} else
			{
				btnBoton9.setLabel("X");
				turno = 0;
			}
			btnBoton9.removeActionListener(this);
		}
		comprobar();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}

	void comprobar()
	{
		if ((btnBoton1.getLabel()).equals(btnBoton2.getLabel()) && (btnBoton2.getLabel()).equals(btnBoton3.getLabel())
				&& !btnBoton1.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton1.getLabel());
			fin();
		} else if ((btnBoton4.getLabel()).equals(btnBoton5.getLabel())
				&& (btnBoton5.getLabel()).equals(btnBoton6.getLabel()) && !btnBoton4.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton4.getLabel());
			fin();
		} else if ((btnBoton7.getLabel()).equals(btnBoton8.getLabel())
				&& (btnBoton8.getLabel()).equals(btnBoton9.getLabel()) && !btnBoton7.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton7.getLabel());
			fin();
		} else if ((btnBoton1.getLabel()).equals(btnBoton4.getLabel())
				&& (btnBoton4.getLabel()).equals(btnBoton7.getLabel()) && !btnBoton1.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton1.getLabel());
			fin();
		} else if ((btnBoton5.getLabel()).equals(btnBoton2.getLabel())
				&& (btnBoton2.getLabel()).equals(btnBoton8.getLabel()) && !btnBoton5.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton5.getLabel());
			fin();
		} else if ((btnBoton6.getLabel()).equals(btnBoton9.getLabel())
				&& (btnBoton9.getLabel()).equals(btnBoton3.getLabel()) && !btnBoton6.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton6.getLabel());
			fin();
		} else if ((btnBoton1.getLabel()).equals(btnBoton5.getLabel())
				&& (btnBoton5.getLabel()).equals(btnBoton9.getLabel()) && !btnBoton1.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton1.getLabel());
			fin();
		} else if ((btnBoton7.getLabel()).equals(btnBoton5.getLabel())
				&& (btnBoton5.getLabel()).equals(btnBoton3.getLabel()) && !btnBoton7.getLabel().equals(""))
		{
			System.out.println("Ha ganado " + btnBoton7.getLabel());
			fin();
		}
	}

	void fin()
	{
		btnBoton1.removeActionListener(this);
		btnBoton2.removeActionListener(this);
		btnBoton3.removeActionListener(this);
		btnBoton4.removeActionListener(this);
		btnBoton5.removeActionListener(this);
		btnBoton6.removeActionListener(this);
		btnBoton7.removeActionListener(this);
		btnBoton8.removeActionListener(this);
		btnBoton9.removeActionListener(this);
	}
}
