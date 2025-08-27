package libreDisposicion;

import java.awt.*;

import javax.swing.*;

public class LibreDisposicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre mimarco= new MarcoLibre();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre extends JFrame{
	public MarcoLibre() {
		setBounds(450,350,600,400);
		LaminaLibre milamina= new LaminaLibre();
		add(milamina);
		setVisible(true);
	}
}

class LaminaLibre extends JPanel{
	public LaminaLibre() {
		//establecemos una disposición libre
		setLayout(new EnColumnas());
		JLabel nombre= new JLabel("Nombre");
		JLabel apellido= new JLabel("Apellido");
		JTextField c_nombre= new JTextField();
		JTextField c_apellido= new JTextField();
		JLabel edad= new JLabel("Edad");
		JTextField c_edad= new JTextField();

		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		add(edad);
		add(c_edad);
		
		
	}
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		int contador=0;
		int n= micontenedor.getComponentCount();
		for (int i=0; i<n;i++) {
			contador++;
			Component c= micontenedor.getComponent(i);
			c.setBounds(x, y, 100, 20);
			x+=100;
			if (contador%2==0) {
				x=20;
				y+=40;
			}
		}
	}
	
	private int x=20;
	private int y=20;
	
}