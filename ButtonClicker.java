import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// grid layout(rows,columns)

public class ButtonClicker extends JFrame implements ActionListener{
    JFrame setCounter = new JFrame("Set Counter");
    JLabel counterLabel = new JLabel("Counter Here");
    JButton inc = new JButton("+");
    JButton dec = new JButton("-");
    JButton rst = new JButton("Reset");
    JButton set = new JButton("Set number");
    JButton ent = new JButton("Enter");
    JPanel main_panel = new JPanel(new GridLayout(4,1));
    JPanel inc_dec = new JPanel(new GridLayout(1,2));
    JTextField newNum = new JTextField("Enter number here");
    int counter = 0;
    public static void main(String[] args){
        new ButtonClicker();
    }
    public ButtonClicker(){
        this.setTitle("Button Clicker counter");
        
        // JLabel ALign
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        
        // inc, dec and rst button Customizations
        inc.setBackground(new Color(59, 89, 182));
        inc.setForeground(Color.white);
        inc.setFont(new Font("Tahoma", Font.BOLD, 12));
        dec.setBackground(new Color(59, 89, 182));
        dec.setForeground(Color.white);
        dec.setFont(new Font("Tahoma", Font.BOLD, 12));
        rst.setFont(new Font("Tahoma", Font.BOLD, 12));
        rst.setBackground(Color.white);
        set.setFont(new Font("Tahoma", Font.BOLD, 12));
        set.setBackground(Color.white);
        
        // Adding to Window
        this.add(main_panel);
        main_panel.add(counterLabel);
        main_panel.add(inc_dec);
        inc_dec.add(inc);
        inc_dec.add(dec);
        main_panel.add(rst);
        main_panel.add(set);
        
        // Adding action Listeners
        inc.addActionListener(this);
        dec.addActionListener(this);
        rst.addActionListener(this);
        set.addActionListener(this);

        // standard window settings
        this.setSize(300,300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void set_new_counter(){
        // 2nd window settings
        setCounter.setVisible(true);
        setCounter.setSize(100,100);
        setCounter.setLocationRelativeTo(null);
        setCounter.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setCounter.setLayout(new GridLayout(2,1));
        
        //add Elements
        setCounter.add(ent);
        setCounter.add(newNum);
        
        // add Action Listener
        setCounter.getRootPane().setDefaultButton(ent);
        ent.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == inc){
           counterLabel.setText(String.valueOf(++counter));
        }
        else if(e.getSource() == dec){
            counterLabel.setText(String.valueOf(--counter));
        }
        else if(e.getSource() == rst){
            this.counter = 0;
            counterLabel.setText(String.valueOf(counter));
        }
        else if(e.getSource() == set){
            set_new_counter();
        }
        else if(e.getSource() == ent){
            try{
                setCounter.setVisible(false);
                counter = Integer.parseInt(newNum.getText());
                counterLabel.setText(String.valueOf(counter));
            } catch(Exception A){
                A.getMessage();
            }
        }
    }

}
