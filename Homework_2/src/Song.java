// Класс, представляющий песню с указанием имени исполнителя и названия композиции
public class Song {
    private String artist; // Имя исполнителя
    private String title; // Название композиции

    // Конструктор класса Song, принимающий имя исполнителя и название композиции
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    // Геттер для получения имени исполнителя
    public String getArtist() {
        return artist;
    }

    // Геттер для получения названия композиции
    public String getTitle() {
        return title;
    }

    // Переопределенный метод toString() для получения строкового представления
    // объекта Song
    public String toString() {
        return artist + " - " + title;
    }
}
