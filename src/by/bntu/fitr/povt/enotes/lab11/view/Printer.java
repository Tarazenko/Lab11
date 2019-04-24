package by.bntu.fitr.povt.enotes.lab11.view;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger LOG;

    static {
        LOG = Logger.getLogger(Printer.class);
    }

    public static void print(String msg) {
        LOG.info(msg);
    }
}
