package ${package};

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;


public class ApplicationTest {

    @Mock
    private List<String> mockedList = new ArrayList<>();

    @Test
    public void testUsingJUnit() {
        assertTrue(true);
    }

    @Test
    void testUsingMockito() {
        when(mockedList.get(0)).thenReturn("zero");

        // Assert using Hamcrest
        assertThat("zero", is(mockedList.get(0)));
    }

}