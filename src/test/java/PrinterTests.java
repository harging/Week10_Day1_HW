import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTests {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 100);
    }

    @Test
    public void hasPaperCount(){
        assertEquals(20, printer.getPaperCount());
    }

    @Test
    public void canPrint(){
        printer.print(1, 2);
        assertEquals(18, printer.getPaperCount());
        assertEquals(98, printer.getTonerVolume());
    }

    @Test
    public void cannotPrint(){
        printer.print(1, 30);
        assertEquals(20, printer.getPaperCount());
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getTonerVolume());
    }
}
