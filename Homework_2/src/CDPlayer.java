// Класс, представляющий виниловый CD-плеер
public class CDPlayer implements Device {
    
    // Реализация метода play() из интерфейса Device.
    // Этот метод воспроизводит медиа, переданное в качестве аргумента.
    public void play(Media media) {
        // Проверяем, что носитель является CD (компакт-диском).
        if (media instanceof CD) {
            System.out.println("Виниловый CD-плеер воспроизводит песни с " + media.getType() + ":");
            // Вывод информации о каждой песне на CD-плеере.
            for (Song song : media.getSongs()) {
                System.out.println("> " + song);
            }
        } else {
            // Виниловый CD-плеер не может воспроизводить музыку с других типов носителей.
            System.out.println("Виниловый CD-плеер не может воспроизвести песни с " + media.getType());
        }
    }
}
