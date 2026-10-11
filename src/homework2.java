public static void main(String[] args) {
    int rows = 5;
    System.out.println("Pattern 1:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < i; j++)
        { System.out.print(" "); }
        for (int k = 0; k < rows - i; k++) { System.out.print("*"); }
        System.out.println(); }
    System.out.println(); System.out.println("Pattern 2:");
    for (int i = rows; i >= 1; i--)
    { for (int j = 1; j <= i; j++)
    { System.out.print("*"); }
        System.out.println(); }
    System.out.println(); System.out.println("Pattern 3:");
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j<= i; j++)
        { System.out.print("*"); }
        System.out.println(); }
    System.out.println();
    System.out.println("Pattern 4:");
    for (int i = 1; i <= rows; i++) {
        for (int j= 1; j <= rows - i; j++) {
            System.out.print(" "); }
        for (int k = 1; k <= i; k++) {
            System.out.print("*"); } System.out.println();
    }System.out.println();
     System.out.println("Pattern 5:");
    for (int i = 1; i<= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" "); }
        for (int k = 1; k <= i; k++) {
            System.out.print("* "); }
        System.out.println(); }
    for (int i = rows - 1; i >= 1; i--) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" "); }
        for (int k = 1; k <= i; k++) {
            System.out.print("* "); }
        System.out.println(); }
         }

