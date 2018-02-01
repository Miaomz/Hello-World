package casual.business_logic;

import casual.business_logic_service.CheckBLService;

import java.io.File;

/**
 * @author miaomuzhi
 * @since 2018/2/1
 */
public class CheckBL implements CheckBLService {
    /**
     *
     * @param projectRoot 项目的根目录
     * @param doc 详细设计文档
     * @return 两者是否同步
     */
    public boolean isDocSync(File projectRoot, File doc) {
        return false;
    }

    /**
     *
     * @param ArchitectDoc 体系结构设计文档
     * @param detailDoc 详细设计文档
     * @return 两者是否同步
     */
    public boolean isArchitectSync(File ArchitectDoc, File detailDoc) {
        return false;
    }
}
