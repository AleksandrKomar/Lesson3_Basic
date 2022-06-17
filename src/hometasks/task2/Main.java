package hometasks.task2;

public class Main {
    public static void main(String[] args) {

        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new BadPupil();
        Pupil pupil3 = new GoodPupil();
        Pupil pupil4 = new BadPupil();

        new ClassRoom(pupil1);
        System.out.println("--------------------");

        new ClassRoom(pupil1, pupil2);
        new ClassRoom(pupil1, pupil4, pupil3);

    }

}

