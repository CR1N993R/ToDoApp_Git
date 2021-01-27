package ch.denis.todoapp.backend;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TasksTest {
    @Mock
    public Task task = Mockito.mock(Task.class);

    @Before
    public void setUp(){
        Mockito.when(task.getTaskname()).thenReturn("Test");
    }

    @Test
    public void testAddTask(){
        Tasks.addTask(task);
        assertEquals(Tasks.taskList.size(), 1);
        assertEquals(Tasks.taskList.get(0).getTaskname(), "Test");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveTask(){
        Tasks.addTask(task);
        Tasks.removeTask(task);
        assertEquals(Tasks.taskList.size(), 0);
        Tasks.taskList.get(0).getTaskname();
    }
}