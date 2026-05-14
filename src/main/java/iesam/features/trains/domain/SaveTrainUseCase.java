package iesam.features.trains.domain;

public class SaveTrainUseCase {

    private TrainRepository trainRepository;

    public SaveTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute (Train train){
        trainRepository.saveTrain(train);
    }
}
