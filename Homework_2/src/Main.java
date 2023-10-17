import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создаем несколько объектов класса Song, представляющих музыкальные композиции
        Song song1 = new Song("Asking Alexandria", "Room 138");
        Song song2 = new Song("Falling in Reverse", "Popular monster");
        Song song3 = new Song("Linkin Park", "Numb");
        Song song4 = new Song("Rise Against", "Savior");
        Song song5 = new Song("Slipknot", "Psychosocial");

        // Создаем несколько объектов различных носителей музыки (Record, CD, FlashDrive)
        Record record = new Record(song1, song2); // Пластинка с двумя песнями
        CD cd = new CD(song3, song4); // CD с двумя песнями
        FlashDrive flashDrive = new FlashDrive(song1, song3, song4, song5); // Флешка с четырьмя песнями

        // Создаем объекты звуковоспроизводящих устройств (Turntable, CDPlayer, FlashPlayer)
        Turntable turntable = new Turntable(); // Виниловая вертушка
        CDPlayer cdPlayer = new CDPlayer(); // CD-плеер
        FlashPlayer universalPlayer = new FlashPlayer(); // Универсальный плеер

        // Создаем объект класса Menu для организации меню с действиями
        Menu menu = new Menu();
        menu.addDevice(turntable); // Добавляем виниловую вертушку в меню
        menu.addDevice(cdPlayer); // Добавляем CD-плеер в меню
        menu.addDevice(universalPlayer); // Добавляем универсальный плеер в меню
        menu.addMedia(record); // Добавляем пластинку в меню
        menu.addMedia(cd); // Добавляем CD в меню
        menu.addMedia(flashDrive); // Добавляем флешку в меню

        menu.show(); // Отображаем меню для пользователя
    }
}
