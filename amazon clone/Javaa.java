import java.util.*;

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class Myll {
//     Node head;

//     public Myll() {
//         this.head = null;
//     }

//     // you can create all your functions
//     public void add(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     public void printlist() {
//         if (head == null) {
//             System.out.println("Empty list");
//             return;
//         }
//         Node curNode = head;
//         while (curNode != null) {
//             System.out.print(curNode.data + "-->");
//             curNode = curNode.next;
//         }
//         System.out.print("null");
//     }

//     public boolean comp(Node head1, Node head2) {
//         Node temp1 = head1;
//         Node temp2 = head2;
//         while (temp1 != null && temp2 != null) {
//             if (temp1.data != temp2.data) {
//                 return false;
//             }
//             temp1 = temp1.next;
//             temp2 = temp2.next;

//         }
//         return true;
//     }
// }

public class Javaa {

    // static boolean pal(String str1, String str2) {
    // if (str1.length() != str2.length()) {
    // return false;
    // }
    // int[] words = new int[256];
    // for (int i = 0; i < str1.length(); i++) {
    // words[str1.charAt(i)]++;
    // words[str2.charAt(i)]--;
    // }
    // return true;
    // }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 2, 3, 4, 4, 5, 6, 7, 8, 4, 4, 4 };
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int j : map.keySet()) {
            if (map.get(j) > j / 3) {
                System.out.println(j);
            }

        }

        // Scanner sc = new Scanner(System.in);
        // Myll list = new Myll();
        // Myll list2 = new Myll();

        // System.out.println("Enter the no of Elements : ");
        // int n = sc.nextInt();
        // System.out.println("Enter the elements :");
        // for (int i = 0; i < n; i++) {
        // list.add(sc.nextInt());
        // }

        // System.out.println("Enter the no of Elements : ");
        // int n2 = sc.nextInt();
        // System.out.println("Enter the elements :");
        // for (int i = 0; i < n2; i++) {
        // list2.add(sc.nextInt());
        // }

        // if (list.comp(list.head, list2.head) != true) {
        // System.out.println("Not equal");
        // } else {
        // System.out.println("ARE Equla");
        // }
        // System.out.println("the output is : " + list.mid());
        // list.printlist();

    }
}
