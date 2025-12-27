// File: CpuBusy.java
import java.util.concurrent.atomic.AtomicBoolean;

public class CpuBusy {
    private static final AtomicBoolean RUN = new AtomicBoolean(true);

    public static void main(String[] args) {
        int threads = Runtime.getRuntime().availableProcessors(); // default
        if (args.length >= 1) {
            try { threads = Integer.parseInt(args[0]); } catch (NumberFormatException ignored) {}
        }

        System.out.printf("Starting %d busy threads. Press Ctrl+C to stop.%n", threads);

        // shutdown hook for graceful stop
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown requested, stopping threads...");
            RUN.set(false);
        }));

        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(() -> {
                // Busy work that the JVM won't easily optimize away
                double value = 0.0;
                while (RUN.get()) {
                    // Some floating math to keep the CPU busy
                    value += Math.sin(Math.random()) * Math.tan(Math.random());
                    // occasionally prevent JVM from optimizing too aggressively
                    if (Double.isInfinite(value) || Double.isNaN(value)) value = 0.0;
                }
            }, "busy-worker-" + i);
            t.setDaemon(false);
            t.start();
        }
    }
}