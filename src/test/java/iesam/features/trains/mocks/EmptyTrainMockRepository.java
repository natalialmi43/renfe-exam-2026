package iesam.features.trains.mocks;

import iesam.features.trains.domain.Train;
import iesam.features.trains.domain.TrainRepository;

import java.util.ArrayList;

public class EmptyTrainMockRepository implements TrainRepository {

    @Override
    public void saveTrain(Train train) {

    }

    @Override
    public ArrayList<Train> getTrains() {

        ArrayList <Train> trains = new ArrayList<>();

        return trains;
    }

    @Override
    public void deleteTrain(String id) {

    }
}
