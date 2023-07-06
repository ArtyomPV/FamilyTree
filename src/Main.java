public class Main {
    public static void main(String[] args) {
       FamilyTree myFamily = new FamilyTree();
       Human svetlana = new Human("Светлана Игорева", "1976-02-25", null, null, Gender.Female);
       Human nikolay = new Human("Николай Петров", "1974-08-17", null, null, Gender.Male);
       Human petr = new Human("Петр Петров", "1997-04-23", svetlana, nikolay, Gender.Male);
       Human ivan = new Human("Иван Иванов", "1998-11-10", null, null, Gender.Male);
       Human anna = new Human("Анна Петрова", "2000-05-16", svetlana, nikolay, Gender.Female);
       Human dima = new Human("Дима Иванов", "2020-12-05", anna, ivan, Gender.Male);
       Human egor = new Human("Егор Иванов", "2022-07-12", anna, ivan, Gender.Male);

       myFamily.addHuman(svetlana);
       myFamily.addHuman(nikolay);
       myFamily.addHuman(petr);
       myFamily.addHuman(ivan);
       myFamily.addHuman(anna);
       myFamily.addHuman(dima);
       myFamily.addHuman(egor);

       myFamily.showFamilyMembers();

       myFamily.showHumanTree("Анна Петрова");
    }
}