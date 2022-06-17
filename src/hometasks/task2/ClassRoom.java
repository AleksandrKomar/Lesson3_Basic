package hometasks.task2;

public class ClassRoom {


    public ClassRoom(Pupil pupil) {
        if (pupil != null)
            show(pupil);
    }

    //так как аргументы однотипные - реализация конструктора через массив
    //можно передавать от 2 и больше аргументов
    public ClassRoom(Pupil... pupil) {

        for (int i = 0; i < pupil.length; i++) {
            if (pupil == null)
                continue;

            show(pupil[i]);
            System.out.println("--------------------");
        }
    }


    void show(Pupil pupil) {
        pupil.study();
        pupil.read();
        pupil.relax();
        pupil.write();
    }


}
