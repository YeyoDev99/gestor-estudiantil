/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * PROGRAMA: SISTEMA DE GESTION ESTUDIANTIL
 * FECHA: 16-5-2023
 */

package ventana;

import java.awt.EventQueue;

public class main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
