/**
 * <p>StringOperations的類別.</p>
 */
public class StringOperations {
  /**
   * <p>start.</p>
   */
  public static void main(String[] args) {

    String name = "MY,NAME,IS,TONY,";
    String id = "MY,ID,IS,D1234567";
    String sentence = name + id;
    System.out.println(sentence);
    System.out.println("total length:" + sentence.length());

    String[] spiltResult = sentence.split(","); //分割sentence
    System.out.println(spiltResult[3].toLowerCase()); //換成小寫

    String replaceResult = sentence.replace(",", ":"); //,換:
    System.out.println(replaceResult);
  }
}
