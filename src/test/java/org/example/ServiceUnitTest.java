package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class ServiceUnitTest {

    @Test
    public void getUserByIdShouldReturnUser(){
        Repository repoMock = mock(Repository.class);
        Service service = new Service(repoMock);

    }
}
