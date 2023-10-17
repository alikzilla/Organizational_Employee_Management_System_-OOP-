package SocialNetwork.TKcourses;
    class MyLinkedList {
        Node head;

        public static class Node {
            static int val;
            static Node next;

            public Node(int x) {
                val = x;
                next = null;
            }
        }

        public MyLinkedList() {
            head = null;
        }

        public int get(int index) {
            int indexFound = 0;
            while (Node.next != null) {
                indexFound++;
                if (indexFound == index) {
                    return Node.val;
                }
            }
            return -1;
        }

        public void addAtHead(int val) {
            while (Node.next !=null){
                head = Node.next;
            }
        }

        public void addAtTail(int val) {

        }

        public void addAtIndex(int index, int val) {

        }

        public void deleteAtIndex(int index) {

        }
    }