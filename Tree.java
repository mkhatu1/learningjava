import java.awt.*;

public class Tree {

    // attributes of class Tree.
    private double height;
    double trunkDiameter;
    Treetype treetype;
    static Color TRUNK_COLOR = new Color(100, 50, 0); //static does not depend on the instance but the class

    // classes are general blue print, requires Constructor to bring it in life.
    Tree(double height, double trunkDiameter, Treetype treetype){
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treetype = treetype;
    }

    // behavior of Tree class 
    void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    static void announceTree(){
        System.out.println("Look out tree " + TRUNK_COLOR + "tree!");
    }
    
    void announceTallTree(){
        if(this.height > 100){
            System.out.println("That's a tall "+ this.treetype + "tree");
        }
    }

    public double getHeight(){
        return height;
    }
}
