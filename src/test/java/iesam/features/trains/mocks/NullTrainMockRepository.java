package iesam.features.trains.mocks;

import iesam.features.trains.domain.Train;
import iesam.features.trains.domain.TrainRepository;

import java.util.ArrayList;

public class NullTrainMockRepository implements TrainRepository {

    @Override
    public void saveTrain(Train train) {

    }

    @Override
    public ArrayList<Train> getTrains() {
        return null;
    }

    @Override
    public void deleteTrain(String id) {

    }
}
