package Tries;

class Node {
    Node links[] = new Node[26];
    boolean flag;

    boolean containsKey(char ch){
        return links[ch - 'a'] == null;
    }

    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }

    Node get(char ch){
        return links[ch - 'a'];
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}

public class Tries {
    private static Node root;

    Tries() {
        root = new Node();
    }

    public void insert(String word){
        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }

            node = node.get(word.charAt(i));
        }

        node.setEnd();
    }

    public boolean search(String word){
        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                return false;
            }

            node = node.get(word.charAt(i));
        }

        return node.isEnd();
    }

    public boolean prefix(String word){

        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                return false;
            }

            node = node.get(word.charAt(i));
        }
        return true;
    }

    public static void main(String arg[]){
        Tries tries = new Tries();
        System.out.println("Inserting: apple, apps, bat, ball");
        tries.insert("apple");
        tries.insert("apps");
        tries.insert("bat");
        tries.insert("ball");
        tries.insert("coder");

        System.out.println("Search: apple :: " + tries.search("apple"));
        System.out.println("Search: cat :: " + tries.search("cat"));
        System.out.println("StartWith prefix: ap :: " + tries.prefix("ap"));
        System.out.println("StartWith prefix: dc :: " + tries.prefix("dc"));
        System.out.println("Search coder :: " + tries.search("coder"));
    }
}
