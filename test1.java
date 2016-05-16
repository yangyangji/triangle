package Triangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1{

	@Test
    public void testlsTringle1(){
        Triangle1 t=new Triangle1(1,3,7);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle2(){
        Triangle1 t=new Triangle1(0,3,7);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle3(){
        Triangle1 t=new Triangle1(-2,-5,-7);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle4(){
        Triangle1 t=new Triangle1(2,5,7);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle5(){
        Triangle1 t=new Triangle1(5,5,6);
        assertFalse(t.isTriangle1(t));
    }
   @Test
    public void testlsTringle6(){
        Triangle1 t=new Triangle1(2,2,2);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle7(){
        Triangle1 t=new Triangle1(2,8,9);
        assertFalse(t.isTriangle1(t));
    }
   

     
}