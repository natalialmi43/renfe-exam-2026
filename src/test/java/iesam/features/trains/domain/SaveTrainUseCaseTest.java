package iesam.features.trains.domain;

import iesam.features.trains.mocks.TrainMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveTrainUseCaseTest {

    SaveTrainUseCase saveTrainUseCase;
    TrainMockRepository trainMockRepository;

    @Test
    public void shouldCallToSaveMethodCounterWhenExecuteUseCase(){
        //Given
        trainMockRepository = new TrainMockRepository();
        saveTrainUseCase = new SaveTrainUseCase(trainMockRepository);
        Train train = new Train("MD5-001", "Train", "2026", "White");


        //When
        saveTrainUseCase.execute(train);

        //Then
        assertEquals(1, trainMockRepository.saveMethodCounter);
    }

}