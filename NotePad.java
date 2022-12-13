import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePad extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem newItem, openItem, saveItem, exitItem;
    public JFrame f,Lspace;
    public NotePad() {
    	
        f = new JFrame("NotePad Application");
       
        
        
//        Lspace = new JFrame();
//        Lspace.setSize(1,1);
//        
//        f.add(Lspace, BorderLayout.EAST);
        //create text area
        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        f.add(new JScrollPane(textArea), BorderLayout.CENTER);
        //create menu bar
        menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);

        //create menu
        menu1 = new JMenu(" File");
        menuBar.add(menu1);
 
        menu2 = new JMenu(" Edit");
        menuBar.add(menu2);
        
        
        menu3 = new JMenu(" Help");
        menuBar.add(menu3);
        
        
        //create menu items
        newItem = new JMenuItem(" New");
//        menu.add(newItem, openItem);
        openItem = new JMenuItem(" Open"); 
        saveItem = new JMenuItem(" Save");
        exitItem = new JMenuItem(" Exit");
        menu1.add(newItem);
        menu1.add(openItem);
        menu1.add(saveItem);
        menu1.add(exitItem);
        
        exitItem.addActionListener(this);
        newItem.addActionListener(this);

        saveItem.addActionListener(this);
        openItem.addActionListener(this);
        
        f.setSize(800, 600);    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true); 
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitItem)
        {
            System.exit(0);
        }

        if(e.getSource() == newItem)
        {
            new NotePad();
        }
//		public void addActionListener(ActionListener a){}
//		
	}	
	
    public static void main(String[] args) {
       new NotePad();
    }
}

