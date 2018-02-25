import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * MyArrayListWithBugs Tester.
 *
 * @author Danny
 * @version 1.0
 */
public class MyArrayListWithBugsTest {
    private MyArrayListWithBugs myArrayListWithBugs;

    @Before
    public void before() throws Exception {
        myArrayListWithBugs = new MyArrayListWithBugs();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(Object o)
     */
    @Test
    public void testAddO() throws Exception {
        myArrayListWithBugs.add("Test");

        assertEquals("Test", myArrayListWithBugs.get(0));
    }

    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {
        assertEquals(0, myArrayListWithBugs.size());
        myArrayListWithBugs.add("Test");
        assertEquals(1, myArrayListWithBugs.size());

    }

    /**
     * Method: get(int index)
     */
    @Test
    public void testGet() throws Exception {
        myArrayListWithBugs.add("Test");
        myArrayListWithBugs.add("Test2");
        assertEquals("Test2", myArrayListWithBugs.get(1));
    }

    /**
     * Method: get(int index)
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetException() {
        Object o = myArrayListWithBugs.get(2);
    }



    /**
     * Method: add(int index, Object o)
     */
    @Test
    public void testAddForIndexO() throws Exception {
        myArrayListWithBugs.add("Test");
        myArrayListWithBugs.add("Test2");
        myArrayListWithBugs.add("Test3");

        assertEquals("Test2", myArrayListWithBugs.get(1));

        myArrayListWithBugs.add(1, "Overridden");

        assertEquals("Overridden", myArrayListWithBugs.get(1));

    }

    /**
     * Method: remove(int index)
     */
    @Test
    public void testRemove() throws Exception {
        myArrayListWithBugs.add("Test");
        assertEquals(1, myArrayListWithBugs.size());
        myArrayListWithBugs.remove(0);
        assertEquals(0, myArrayListWithBugs.size());
    }

    /**
     * Method: remove(int index)
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveException() throws Exception {
        myArrayListWithBugs.remove(0);

    }


} 
