import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Класс Menu представляет собой меню для взаимодействия с устройствами и носителями музыки
public class Menu {
    private ArrayList<Device> devices; // Список доступных устройств
    private ArrayList<Media> medias; // Список доступных носителей музыки

    // Конструктор для класса Menu
    public Menu() {
        devices = new ArrayList<>();
        medias = new ArrayList<>();
    }

    // Метод добавления устройства в список
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Метод добавления носителя музыки в список
    public void addMedia(Media media) {
        medias.add(media);
    }

    // Метод отображения меню и обработки действий пользователя
    public void show() throws IOException {
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1) Выбрать устройство");
            System.out.println("2) Выбрать носитель");
            System.out.println("3) Воспроизвести музыку");
            System.out.println("4) Выход");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    selectDevice(); // Выбор устройства
                    break;
                case 2:
                    selectMedia(); // Выбор носителя
                    break;
                case 3:
                    playMusic(); // Воспроизведение музыки
                    break;
                case 4:
                    exit = true; // Выход из меню
                    break;
                default:
                    System.out.println("Некорректный выбор"); // Сообщение об ошибке
                    break;
            }
        }
    }

    public Device currentDevice; // Текущее выбранное устройство
    public Media currentMedia; // Текущий выбранный носитель музыки

    private void selectDevice() {
        Scanner in = new Scanner(System.in);

        System.out.println("Список доступных устройств: ");
        for (int i = 0; i < devices.size(); i++) {
            System.out.println((i + 1) + ") " + devices.get(i).getClass().getSimpleName());
        }

        int chosen = in.nextInt();
        if (chosen > 0 && chosen <= devices.size()) {
            currentDevice = devices.get(chosen - 1);
            System.out.println("Выбранное устройство: " + currentDevice.getClass().getSimpleName());
        }
    }

    private void selectMedia() {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите носитель из списка:");
        for (int i = 0; i < medias.size(); i++) {
            System.out.println((i + 1) + ". " + medias.get(i).getType());
        }

        int choice = in.nextInt();

        if (choice > 0 && choice <= medias.size()) {
            currentMedia = medias.get(choice - 1);
            System.out.println("Вы выбрали " + currentMedia.getType());
        } else {
            System.out.println("Некорректный выбор");
        }
    }

    private void playMusic() {
        if (currentDevice != null && currentMedia != null) {
            currentDevice.play(currentMedia);
        } else {
            System.out.println("Сначала выберите устройство и носитель");
        }
    }
}
