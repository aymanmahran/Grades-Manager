/*
 * Decompiled with CFR 0_132.
 */
import java.io.PrintStream;
import javax.print.DocPrintJob;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
import javax.print.event.PrintJobListener;
import javax.swing.JOptionPane;

class PrintJobWatcher {
    boolean done = false;

    PrintJobWatcher(DocPrintJob job) {
        job.addPrintJobListener(new PrintJobAdapter(){

            @Override
            public void printJobCanceled(PrintJobEvent pje) {
                this.allDone();
            }

            @Override
            public void printJobCompleted(PrintJobEvent pje) {
                this.allDone();
            }

            @Override
            public void printJobFailed(PrintJobEvent pje) {
                this.allDone();
            }

            @Override
            public void printJobNoMoreEvents(PrintJobEvent pje) {
                this.allDone();
            }

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            void allDone() {
                PrintJobWatcher printJobWatcher = PrintJobWatcher.this;
                synchronized (printJobWatcher) {
                    PrintJobWatcher.this.done = true;
                    System.out.println("Printing done ...");
                    JOptionPane.showMessageDialog(null, "Printing Done!", "Done", 1);
                    PrintJobWatcher.this.notify();
                }
            }
        });
    }

    public synchronized void waitForDone() {
        try {
            while (!this.done) {
                this.wait();
            }
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

}

