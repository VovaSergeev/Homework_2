// Класс, представляющий виниловый проигрыватель
public class Turntable implements Device {

    // Реализация метода play() из интерфейса Device.
    // Этот метод воспроизводит медиа, переданное в качестве аргумента.
    public void play(Media media) {
        // Проверяем, что носитель является пластинкой (Record).
        if (media instanceof Record) {
            System.out.println("Виниловый проигрыватель воспроизводит песни с " + media.getType() + ":");
            // Вывод информации о каждой песне на пластинке.
            for (Song song : media.getSongs()) {
                System.out.println("> " + song);
            }
        } else {
            // Виниловый проигрыватель не может воспроизводить музыку с других типов
            // носителей.
            System.out.println("Виниловый проигрыватель не может воспроизвести песни с " + media.getType());
        }
    }
}
