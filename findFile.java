import java.util.*;


public class Main {

    public static class Node {
        public String name;
        public String data;
        public boolean isDir;
        public List<Node> children;

        public Node(String name, String data, boolean isDir) {
            this.name = name;
            this.data = data;
            this.isDir = isDir;
            this.children = new ArrayList<Node>();
        }

        public static Node getTree() {
            // declare and allocate new node
            Node root = new Node("/", "", true);

            Node dir1 = new Node("dir1", "", true);

            Node file1 = new Node("file.txt", "not the file!", false);

            root.children.add(file1);
            root.children.add(dir1);

            Node dir2 = new Node("dir2", "", true);
            Node dir3 = new Node("dir3", "red herring", false);

            dir1.children.add(dir3);
            dir1.children.add(dir2);

            Node dir = new Node("dir", "", true);
            Node realDir3 = new Node("dir3", "", true);

            dir2.children.add(dir);
            dir2.children.add(realDir3);

            Node realFileTxt = new Node("file.txt", "yay!", false);
            Node file2 = new Node("file", "nope", false);

            realDir3.children.add(realFileTxt);
            realDir3.children.add(file2);

            return(root);
        }

        public String toString() {
            return "(" + this.name + ", " + this.data + ", " + this.isDir + ", " + this.children + ")";
        }
    }
    
// /
// - dir1
//   - dir2
//      - dir (empty)
//      - dir3
//         - file.txt
//         - file
//   - dir3[file]
// - file.txt


/*
    Split path into targets
        Search if target is in Tree
            if child of root node name == target
            if not return target is not found
            if found navigate to target 
                repeat if target is dir
                    if is last of the array && is dir
                        output not file
                    else
                        output data
                        
            
*/

    public static void main(String[]  args) {
      /*create root node*/
      Node rootNode = Node.getTree();
      String path = "dir1/dir2/dir3/file.txt";
      
      System.out.println(rootNode.name);
      System.out.println("" + rootNode);
      
      System.out.println(findFile(path, rootNode));
      
    }
    
    public static String findFile(String path, Node tree){
        String[] targets = path.split("/");
        Node current = tree;
        if
        
            for(int i = 0; i < targets.length -1; i++){
                for(int c = 0; c <{
                    if(tree.name(targets[i]) && tree.isDir == false){
                        return tree.data;
                    }
                    else if(tree.children != targets[i] )
                }
                    
            }
    }
}
