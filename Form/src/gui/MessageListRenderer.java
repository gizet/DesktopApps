package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import model.Message;

/*
 *  Demonstrates using a arbitrary component as a list box renderer.
 *  
 */

public class MessageListRenderer implements ListCellRenderer {
	
	private JPanel panel;
	private JLabel label;
	
	private Color selectedColor;
	private Color normalColor;
	
	public MessageListRenderer() {
		panel = new JPanel();
		label = new JLabel();
		selectedColor = new Color(210, 210, 255);
		normalColor = Color.WHITE;
		
		
		label.setIcon(Utils.createIcon("/images/Information24.gif"));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT)); //argument for adding the label to the left
		panel.add(label);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		
		//65
		Message message = (Message)value;
		label.setText(message.getTitle());
		panel.setBackground(cellHasFocus ? selectedColor : normalColor);
		label.setBackground(cellHasFocus ? selectedColor : normalColor);
		label.setOpaque(true);
		return panel;
	}
	

}
