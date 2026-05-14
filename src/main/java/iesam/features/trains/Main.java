package iesam.features.trains;

import iesam.features.trains.domain.Train;
import iesam.features.trains.presentation.TrainView;

public class Main {

    public static void main(String[] args) {

        Train train = new Train("MD5-001", "Train", "2026", "White");

        TrainView.printTrains();

        TrainView.saveTrain();

        TrainView.deleteTrain();
    }
}
