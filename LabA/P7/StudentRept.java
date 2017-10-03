import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<applet code = "StudentRept.class" width = "400" height = "400"></applet>*/

public class StudentRept extends Applet implements ActionListener {

    Label Title, RollNo, Name, Java, SE, Net, Co, Eng;

    TextField txtNo, txtName, txtJava, txtSE, txtNet, txtCo, txtEng;

    Button cmd1;

    int total;

    float avg;

    public void init() {
        //Setting Labels
        setLayout(null);
        Title = new Label("Enter Student's Details");
        RollNo = new Label("Roll Number:");
        Name = new Label("Name : ");
        Java = new Label("Java : ");
        SE = new Label("Software Engineering : ");
        Net = new Label("Networks : ");
        Co = new Label("Computer Organization : ");
        Eng = new Label("English : ");

        //Setting Text Boxes
        txtNo = new TextField(10);
        txtName = new TextField(25);
        txtJava = new TextField(3);
        txtSE = new TextField(3);
        txtNet = new TextField(3);
        txtCo = new TextField(3);
        txtEng = new TextField(3);

        //Setting Command Button
        cmd1 = new Button("View Student result");

        Title.setBounds(100, 0, 200, 20);
        RollNo.setBounds(0, 50, 100, 20);
        txtNo.setBounds(120, 50, 100, 20);
        Name.setBounds(0, 75, 100, 20);
        txtName.setBounds(120, 75, 250, 20);
        Java.setBounds(0, 100, 100, 20);
        txtJava.setBounds(120, 100, 40, 20);
        SE.setBounds(0, 125, 100, 20);
        txtSE.setBounds(120, 125, 40, 20);
        Net.setBounds(0, 150, 100, 20);
        txtNet.setBounds(120, 150, 40, 20);
        Co.setBounds(0, 175, 100, 20);
        txtCo.setBounds(120, 175, 40, 20);
        Eng.setBounds(0, 200, 100, 20);
        txtEng.setBounds(120, 200, 40, 20);
        cmd1.setBounds(100, 225, 150, 30);


        add(Title);
        add(RollNo);
        add(txtNo);

        add(Name);
        add(txtName);

        add(Java);
        add(txtJava);

        add(SE);
        add(txtSE);

        add(Net);
        add(txtNet);

        add(Co);
        add(txtCo);

        add(Eng);
        add(txtEng);

        add(cmd1);

        //txtNo.addActionListener(this);
        //txtName.addActionListener(this);
        //txtJava.addActionListener(this);
        //txtSE.addActionListener(this);
        //txtNet.addActionListener(this);
        //txtCo.addActionListener(this);
        //txtEng.addActionListener(this);
        cmd1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            int java = Integer.parseInt(txtJava.getText());
            int se = Integer.parseInt(txtSE.getText());
            int net = Integer.parseInt(txtNet.getText());
            int co = Integer.parseInt(txtCo.getText());
            int eng = Integer.parseInt(txtEng.getText());


            total = (java + se + net + co + eng);
            avg = total / 5;

        } catch (NumberFormatException ex) {
        }

        repaint();

    }

    public void paint(Graphics g) {
        g.drawString("STUDENT REPORT", 100, 275);

        g.drawString("Name : " + txtName.getText(), 0, 325);
        g.drawString("Java : " + txtJava.getText(), 0, 350);
        g.drawString("Software Engineering : " + txtSE.getText(), 0, 375);
        g.drawString("Computer Organization : " + txtCo.getText(), 0, 400);
        g.drawString("Networks : " + txtNet.getText(), 0, 425);
        g.drawString("Additional English : " + txtEng.getText(), 0, 450);
        g.drawString("Total : " + total, 0, 475);
        g.drawString("Average : " + avg, 0, 500);
    }
}