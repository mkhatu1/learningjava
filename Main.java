import java.awt.Color;

// import javax.print.DocFlavor.STRING;

public class Main {

    public static void main(String[] args) {
        
        Tree myTree = new Tree(20, 5, Treetype.PILEA);
        // System.out.println(myTree.treetype);
        // System.out.println(myTree.treetype);
        // System.out.println(myTree.trunkDiameter);


        Tree myOakTree = new Tree(90, 20, Treetype.OAK);

        // if(myTree.height > 100){

        //     System.out.println(myTree.height);
        // }
        System.out.println(myOakTree.treetype);
        myTree.announceTallTree();
        myOakTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();
        Color bluecolor = Color.BLUE;
        Color brightBlue = bluecolor.brighter();
//      System.out.println("Bright blue color "+brightBlue);
        brightBlue.darker();


        // access private attributes
       System.out.println(myOakTree.getHeight()); 

       

    }
    
}
