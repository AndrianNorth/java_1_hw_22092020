package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Пупкин Виталий Васильевич", "Генеральный директор", "PupkinVV@mail.ru",
                        "+7(913)5001111", 120000, 45),
                new Person("Трущев Геннадий Евгеньевич", "Главный бухгалтер", "TrushevGE@mail.ru",
                        "+7(913)5001102", 90000, 42),
                new Person("Головач Елена Петровна", "Менеджер по продажам", "GolovachEP@mail.ru",
                        "+7(913)5001103", 50000, 25),
                new Person("Мазепа Сергей Максимович", "Менеджер по продажам", "MazepaSM@mail.ru",
                        "+7(913)5001104", 50000, 28),
                new Person("Ибрагимов Олег Алексеевич", "Менеджер по продажам", "IbragimovOA@mail.ru",
                        "+7(913)5001105", 50000, 31),
        };

        System.out.println("Список всех сотрудников");
        for (int i = 0; i < persons.length; i++) {
                persons[i].printInfo();
        }

        System.out.println("Список сотрудников старше 40 лет");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40)
            persons[i].printInfo();
        }

    }


}


