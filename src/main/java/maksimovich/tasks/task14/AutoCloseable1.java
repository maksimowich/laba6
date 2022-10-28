package maksimovich.tasks.task14;

public class AutoCloseable1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("From AC1");
    }
}

