package maksimovich.tasks.task14;

public class AutoCloseable2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("From AC2");
    }
}
