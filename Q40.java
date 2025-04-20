import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Q40 extends JFrame{
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("Country");
    DefaultMutableTreeNode india= new DefaultMutableTreeNode("India");
    DefaultMutableTreeNode i1= new DefaultMutableTreeNode("Maharashtra");
    DefaultMutableTreeNode i2 = new DefaultMutableTreeNode("Banglore");
    DefaultMutableTreeNode i3 = new DefaultMutableTreeNode("Mumbai");
    DefaultMutableTreeNode brazil= new DefaultMutableTreeNode("Brazil");

    public Q40(){
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        root.add(india);
        root.add(brazil);
        india.add(i1);
        india.add(i2);
        india.add(i3);
        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);
    }
    public static void main(String[] args) {
        Q40 q = new Q40();
    }

    
}