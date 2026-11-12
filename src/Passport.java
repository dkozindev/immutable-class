import java.time.LocalDate;

public final class Passport {

    private final int passportSeries; // серия
    private final int passportNumber; // номер
    private final Human human; // изменяемый класс по ТЗ
    private final LocalDate dateOfIssue;// сначала использовал String, погуглил узнал про класс LocalDate

    public Passport(int passportSeries, int passportNumber, Human human, LocalDate dateOfIssue) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.human = new Human(human.getName(), human.getSurname(), human.getDateOfBirth(), human.getGender());
        this.dateOfIssue = dateOfIssue;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public Human getHuman() {
        Human copyHuman = new Human(human.getName(), human.getSurname(), human.getDateOfBirth(), human.getGender());
        return copyHuman;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue; //тут не буду копию нашего поля передавать LocalDate - immutable
    }

    @Override
    public String toString() {
        return "Серия: " + passportSeries +
                ", Номер: " + passportNumber +
                "\nИнформация:\n" + human +
                "\nДата выдачи: " + dateOfIssue;
    }

    public static class Human { // реализовал как вложенный статический для практики

        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        private String gender;

        public Human(String name, String surname, LocalDate dateOfBirth, String gender) {
            this.name = name;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
        }

        // добавил сеторы в Human для проверки неизменяемости объекта типа Passport
        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Имя: " + name + "\nФамилия: " + surname + "\nДата Рождения: " + dateOfBirth + "\nПол: " + gender;
        }
    }
}
