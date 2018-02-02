package casual.factory;

/**
 * @author miaomuzhi
 * @since 2018/2/2
 */
public class BLFactorySingleton {
    private static BLFactorySingleton ourInstance = new BLFactorySingleton();

    private BLServiceFactory blServiceFactory;

    public static BLFactorySingleton getInstance() {
        return ourInstance;
    }

    private BLFactorySingleton() {
    }

    public BLServiceFactory getBLServiceFactory(){
        if (this.blServiceFactory == null){
            blServiceFactory = new BLStubFactory();
        }
        return blServiceFactory;
    }
}
