public class Person {
    public static void staticPersonInfo(String name, String surname, String town, long phoneNumber) {
        System.out.println("Зателефонувати громадянину " + name + " " +surname + " з міста " +
                town + " можна за номером телефону " + phoneNumber+ ".");
    }

    public void personInfo(String name, String surname,  String town, long phoneNumber) {
        System.out.println("Зателефонувати громадянину " + name + " " +surname + " з міста " +
                town + " можна за номером телефону " + phoneNumber+ ".");
    }

    public String returnPersonInfo(String name, String surname,  String town, long phoneNumber){
        return "Зателефонувати громадянину " + name + " " +surname + " з міста " +
        town + " можна за номером телефону " + phoneNumber+ ".";
    }
}
