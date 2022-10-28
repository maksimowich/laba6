package maksimovich.tasks.task14;

public class AutoCloseable3 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("From AC3");
    }
}
