import static entities.exercise2.Ex2.*;

void main(String[] args) {
    List<Integer> list = randomList(10);

    System.out.println("Starting list:");
    System.out.println(list);

    List<Integer> mirrorList = mirrorList(list);
    System.out.println("\nMirrored list:");
    System.out.println(mirrorList);

    System.out.println("\nEven positions:");
    printList(mirrorList, true);

    System.out.println("\nOdd positions:");
    printList(mirrorList, false);
}
