package casual.business_logic_service;

import casual.utility.ResultMessage;
import casual.vo.*;

/**
 * @author miaomuzhi
 * @since 2018/2/1
 */
public interface CreateBLService {

    /**
     *
     * @param useCaseVO 用例文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createUseCaseDoc(UseCaseVO useCaseVO);

    /**
     *
     * @param specificationVO 需求规格说明文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createSpecificationDoc(SpecificationVO specificationVO);

    /**
     *
     * @param requireMeasureVO 需求度量文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createRequireMeasureDoc(RequireMeasureVO requireMeasureVO);

    /**
     *
     * @param testCaseVO 需求测试文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createTestCaseDoc(TestCaseVO testCaseVO);

    /**
     *
     * @param architectVO 体系结构文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createArchitectDoc(ArchitectVO architectVO);

    /**
     *
     * @param detailedVO 详细设计文档的初始信息
     * @return 创建是否成功
     */
    ResultMessage createDetailedDoc(DetailedVO detailedVO);
}
