public class Tree {

    // attributes of class Tree.
    double height;
    double trunkDiameter;
    Treetype treetype;

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

    
}
