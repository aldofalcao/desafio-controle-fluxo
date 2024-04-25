
public class ParametrosInvalidosException extends Exception {
    public static void contarParametros() throws ParametrosInvalidosException {
        throw new ParametrosInvalidosException();
    }
}
