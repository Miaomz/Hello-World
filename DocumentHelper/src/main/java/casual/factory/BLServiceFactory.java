package casual.factory;

import casual.business_logic_service.CheckBLService;
import casual.business_logic_service.CreateBLService;
import casual.business_logic_service.ListenBLService;
import casual.business_logic_service.SettingBLService;

/**
 * @author miaomuzhi
 * @since 2018/2/2
 */
public interface BLServiceFactory {
    /**
     * produce the implementation of check service
     * @return specified implementation of check service
     */
    CheckBLService produceCheckBLService();

    /**
     * produce the implementation of create service
     * @return specified implementation of create service
     */
    CreateBLService produceCreateBLService();

    /**
     * produce the implementation of listen service
     * @return specified implementation of listen service
     */
    ListenBLService produceListenBLService();

    /**
     * produce the implementation of setting service
     * @return specified implementation of setting service
     */
    SettingBLService produceSettingBLService();
}
