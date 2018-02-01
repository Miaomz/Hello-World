package casual.business_logic_service;

import casual.utility.ResultMessage;

import java.io.File;

/**
 * @author miaomuzhi
 * @since 2018/2/1
 */
public interface ListenBLService {

    /**
     * 如果体系结构文档的内容与代码不符，则新建体系结构文档为updatedDoc
     * @param projectRoot 项目根文件
     * @param architectDoc 体系结构设计文档
     * @param updatedDoc 将被更新的文件
     * @return 更新的结果
     */
    ResultMessage listenToCode(File projectRoot, File architectDoc, File updatedDoc);

    /**
     * 如果详细设计的内容与体系结构文档不符，则新建详细设计文档为updatedDoc
     * @param architectDoc 体系结构设计文档
     * @param detailedDoc 详细设计文档
     * @param updatedDoc 更新后的文档
     * @return 更新的结果
     */
    ResultMessage listenToArchitectDoc(File architectDoc, File detailedDoc, File updatedDoc);
}
