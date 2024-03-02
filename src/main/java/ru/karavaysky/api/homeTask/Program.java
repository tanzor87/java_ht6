package ru.karavaysky.api.homeTask;

public class Program {
    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook();

        String[] peaples = {
                "Григорьев 89136854567",
                "Фокин 89141235694",
                "Шестаков 89171478523",
                "Хохлов 89136541232",
                "Шубин 89243156985",
                "Лазарева 88008887755",
                "Брагина 89744569874",
                "Афанасьева 89151545445",
                "Рыбакова 89143569874",
                "Лазарева 9836541214",
                "Фокин 89164563696",
                "Копылов 89761474565",
                "Горбунов 89134563214",
                "Фокин 84952589874",
                "Соколов 84951233223"
        };

        myBook.add(peaples);
//
        System.out.println("Введенный список Фамилий с номерами телефонов:" + "\n" + myBook.printBook());
        System.out.println();

//        myBook.printBook2();
//        myBook.printBook3();

        System.out.println("Справочник отсортирован по убыванию числа телефонов:");
        myBook.printBook4();
    }
}
