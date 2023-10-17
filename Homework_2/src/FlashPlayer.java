// Класс, представляющий универсальный проигрыватель, способный воспроизводить музыку с различных носителей
public class FlashPlayer implements Device {
    
    // Реализация метода play() из интерфейса Device.
    // Этот метод воспроизводит медиа, переданное в качестве аргумента.
    public void play(Media media) {
        System.out.println("Универсальный проигрыватель воспроизводит песни с " + media.getType() + ":");
        // Вывод информации о каждой песне на носителе.
        for (Song song : media.getSongs()) {
            System.out.println("> " + song);
        }
    }
}
