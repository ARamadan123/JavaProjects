import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame implements ActionListener {
    //JPanels
    JPanel main = new JPanel(new GridLayout(5,1));
    JPanel screen = new JPanel(new GridLayout(1,2));
    JPanel row789 = new JPanel(new GridLayout(1,4));
    JPanel row456 = new JPanel(new GridLayout(1,4));
    JPanel row123 = new JPanel(new GridLayout(1,4));
    JPanel row0exe = new JPanel(new GridLayout(1,4));
    //JButtons
    JButton nine = new JButton("9");
    JButton eight = new JButton("8");
    JButton seven = new JButton("7");
    JButton six = new JButton("6");
    JButton five = new JButton("5");
    JButton four = new JButton("4");
    JButton three = new JButton("3");
    JButton two = new JButton("2");
    JButton one = new JButton("1");
    JButton zero = new JButton("0");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divide = new JButton("/");
    JButton dot = new JButton(".");
    JButton exe = new JButton("EXE");
    
    //JLabels
    JLabel display = new JLabel("display");
    JLabel filler = new JLabel("");

    // Math
    String exp1 = "";
    int exp1_int;
    String exp2 = "";
    int exp2_int;
    boolean flag = false;
    int result= 999;
    boolean flag_plus = false,flag_minus = false,flag_multiply = false,flag_divide = false;
    public static void main(String[] args){
        new Calculator();
    }
    public Calculator(){
        // Default settings
        setTitle("Calculator");
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        addPanels();
        addButtons();
        actions();
        
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == one){
            if(flag){
                exp2 = refresh(exp2,"1");
            }
            else {
                exp1 = refresh(exp1,"1");
            }
        }
        else if(e.getSource() == two){
            if(flag){
                exp2 = refresh(exp2,"2");
            }
            else {
                exp1 = refresh(exp1,"2");
            }
        }
        else if(e.getSource() == three){
            if(flag){
                exp2 = refresh(exp2,"3");
            }
            else {
                exp1 = refresh(exp1,"3");
            }
        }
        else if(e.getSource() == four){
            if(flag){
                exp2 = refresh(exp2,"4");
            }
            else {
                exp1 = refresh(exp1,"4");
            }
        }
        else if(e.getSource() == five){
            if(flag){
                exp2 = refresh(exp2,"5");
            }
            else {
                exp1 = refresh(exp1,"5");
            }
        }
        else if(e.getSource() == six){
            if(flag){
                exp2 = refresh(exp2,"6");
            }
            else {
                exp1 = refresh(exp1,"6");
            }
        }
        else if(e.getSource() == seven){
            if(flag){
                exp2 = refresh(exp2,"7");
            }
            else {
                exp1 = refresh(exp1,"7");
            }
        }
        else if(e.getSource() == eight){
            if(flag){
                exp2 = refresh(exp2,"8");
            }
            else {
                exp1 = refresh(exp1,"8");
            }
        }
        else if(e.getSource() == nine){
            if(flag){
                exp2 = refresh(exp2,"9");
            }
            else {
                exp1 = refresh(exp1,"9");
            }
        }
        else if(e.getSource() == plus){
            exp1_int = Integer.parseInt(exp1); 
            flag = true;
            flag_plus = true;
        }
        else if(e.getSource() == minus){
            exp1_int = Integer.parseInt(exp1); 
            flag = true;
            flag_minus = true;
        }
        else if(e.getSource() == multiply){
            exp1_int = Integer.parseInt(exp1); 
            flag = true;
            flag_multiply = true;
        }
        else if (e.getSource() == divide){
            exp1_int = Integer.parseInt(exp1); 
            flag = true;
            flag_divide = true;
        }
        else if(e.getSource() == exe){
            exp2_int = Integer.parseInt(exp2);
            if(flag_plus){
            display.setText(String.valueOf(exp1_int+exp2_int));
            }
            else if(flag_minus){
            display.setText(String.valueOf(exp1_int-exp2_int));
            }
            else if(flag_multiply){
                display.setText(String.valueOf(exp1_int*exp2_int));
            }
            else if(flag_divide){
                display.setText(String.valueOf(exp1_int/exp2_int));
            }
            // reseting values for another operation
            exp1 = "";
            exp2 = "";
            flag = false;
            flag_plus = false;
            flag_minus = false;
            flag_multiply = false;
            flag_divide = false;
        }

    }
    public String refresh(String s, String num){
        return (s = s + num);        
    }
    public void addPanels(){
        main.setBackground(Color.red);
        this.add(main);

        main.add(screen);
        main.add(row789);
        main.add(row456);
        main.add(row123);
        main.add(row0exe);
    }
    public void addButtons(){
        screen.add(filler);
        screen.add(display);

        row789.add(seven);
        row789.add(eight);
        row789.add(nine);
        row789.add(plus);

        row456.add(four);
        row456.add(five);
        row456.add(six);
        row456.add(minus);

        row123.add(one);
        row123.add(two);
        row123.add(three);
        row123.add(multiply);

        row0exe.add(zero);
        row0exe.add(dot);
        row0exe.add(exe);
        row0exe.add(divide);

    }
    public void actions(){
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        exe.addActionListener(this);

    }
}
