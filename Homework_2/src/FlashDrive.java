// Класс, представляющий флеш-накопитель (Flash Drive) как носитель музыки
public class FlashDrive extends Media {

    // Конструктор класса FlashDrive принимает переменное количество песен (Song) и
    // передает их в конструктор родительского класса Media.
    public FlashDrive(Song... songs) {
        super(songs);
    }

    // Переопределение метода getType() из родительского класса Media.
    // Этот метод возвращает тип носителя, который для Flash Drive всегда
    // "FlashDrive".
    public String getType() {
        return "FlashDrive";
    }
}
