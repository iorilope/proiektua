/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package proiektua;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class Autoa.
 */
/**
 * 
 */
public class Autoa {


	/** The Modeloa. */
	private String Modeloa;

	/** The Marka. */
	private String Marka;


	/**
	 * Instantiates a new autoa.
	 */
	Autoa () {

	}

	/**
	 * Instantiates a new autoa.
	 *
	 * @param a the a
	 * @param b the b
	 */
	Autoa (String a,String b) {
		Modeloa = a;
		Marka = b;
	}

	/**
	 * Sets the modeloa.
	 *
	 * @param c the new modeloa
	 */
	public void setModeloa ( String c) {
		if (Modeloa == null || Modeloa.isEmpty()) {

			throw new IllegalArgumentException("Modelo atalak ezin du hutsik joan");
		}

		Modeloa = c;
	}


	/**
	 * Sets the marka.
	 *
	 * @param d the new marka
	 */
	public void setMarka (String d) {
		if (Marka == null || Marka.isEmpty()) {

			throw new IllegalArgumentException("Marka atalak ezin du hutsik joan");
		}
		Marka = d;
	}

	/**
	 * Gets the modeloa.
	 *
	 * @return the modeloa
	 */
	public String getModeloa () {
		return Modeloa;
	}

	/**
	 * Gets the marka.
	 *
	 * @return the marka
	 */
	public String getMarka () {
		return Marka;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Autoa autoa = new Autoa("Benz","Mercedes");
		System.out.println(autoa.getModeloa());
		System.out.println(autoa.getMarka());


		String Modeloa2 = JOptionPane.showInputDialog("Sartu zure Autoaren Modeloa");

		try {
			if (Modeloa2 == null || Modeloa2.isEmpty()) {

				throw new IllegalArgumentException("Modelo atalak ezin du hutsik joan");
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}

		String Marka2 = JOptionPane.showInputDialog("Sartu zure Autoaren Marka");
		try {
			if (Marka2 == null || Marka2.isEmpty()) {

				throw new IllegalArgumentException("Marka atalak ezin du hutsik joan");
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}

		//Autoa autoa2 = new Autoa(Modeloa2,Marka2);
		JOptionPane.showMessageDialog(null, "Modeloa " + Modeloa2 + " Marka : " + Marka2);

	}

}
