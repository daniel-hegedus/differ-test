// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        cloneInstance1();
        cloneInstance2();
    }
    
    public static void cloneInstance1() {
        int j = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Clone");
            j++;
        }
        if (j != 0) {
            j = 0;
        } else {
            j = 1;
        }
        System.out.println("Clone end");
    }
    
    public static void cloneInstance2() {
        int j = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Clone");
            j++;
        }
        if (j != 0) {
            j = 0;
        } else {
            j = 1;
        }
        System.out.println("Clone end");
    }
}
