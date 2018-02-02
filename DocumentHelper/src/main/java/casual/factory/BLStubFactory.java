package casual.factory;

import casual.business_logic.check_bl.CheckBLStub;
import casual.business_logic.create_bl.CreateBLStub;
import casual.business_logic.listen_bl.ListenBLStub;
import casual.business_logic.setting_bl.SettingBLStub;
import casual.business_logic_service.CheckBLService;
import casual.business_logic_service.CreateBLService;
import casual.business_logic_service.ListenBLService;
import casual.business_logic_service.SettingBLService;

/**
 * @author miaomuzhi
 * @since 2018/2/2
 */
public class BLStubFactory implements BLServiceFactory {
    /**
     * produce the implementation of check service
     *
     * @return specified implementation of check service
     */
    public CheckBLService produceCheckBLService() {
        return new CheckBLStub();
    }

    /**
     * produce the implementation of create service
     *
     * @return specified implementation of create service
     */
    public CreateBLService produceCreateBLService() {
        return new CreateBLStub();
    }

    /**
     * produce the implementation of listen service
     *
     * @return specified implementation of listen service
     */
    public ListenBLService produceListenBLService() {
        return new ListenBLStub();
    }

    /**
     * produce the implementation of setting service
     *
     * @return specified implementation of setting service
     */
    public SettingBLService produceSettingBLService() {
        return new SettingBLStub();
    }
}
