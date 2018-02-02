package casual.business_logic.listen_bl;

import casual.business_logic_service.ListenBLService;
import casual.utility.ResultMessage;

import java.io.File;

/**
 * @author miaomuzhi
 * @since 2018/2/2
 */
public class ListenBLController implements ListenBLService {
    /**
     * @param projectRoot  项目根文件
     * @param architectDoc 体系结构设计文档
     * @param updatedDoc   将被更新的文件
     * @return 更新的结果
     */
    public ResultMessage listenToCode(File projectRoot, File architectDoc, File updatedDoc) {
        return null;
    }

    /**
     * @param architectDoc 体系结构设计文档
     * @param detailedDoc  详细设计文档
     * @param updatedDoc   更新后的文档
     * @return 更新的结果
     */
    public ResultMessage listenToArchitectDoc(File architectDoc, File detailedDoc, File updatedDoc) {
        return null;
    }
}
