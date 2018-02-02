package casual.business_logic.create_bl;

import casual.business_logic_service.CreateBLService;
import casual.utility.ResultMessage;
import casual.vo.*;

/**
 * @author miaomuzhi
 * @since 2018/2/2
 */
public class CreateBLStub implements CreateBLService {
    /**
     * @param useCaseVO 用例文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createUseCaseDoc(UseCaseVO useCaseVO) {
        return null;
    }

    /**
     * @param specificationVO 需求规格说明文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createSpecificationDoc(SpecificationVO specificationVO) {
        return null;
    }

    /**
     * @param requireMeasureVO 需求度量文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createRequireMeasureDoc(RequireMeasureVO requireMeasureVO) {
        return null;
    }

    /**
     * @param testCaseVO 需求测试文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createTestCaseDoc(TestCaseVO testCaseVO) {
        return null;
    }

    /**
     * @param architectVO 体系结构文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createArchitectDoc(ArchitectVO architectVO) {
        return null;
    }

    /**
     * @param detailedVO 详细设计文档的初始信息
     * @return 创建是否成功
     */
    public ResultMessage createDetailedDoc(DetailedVO detailedVO) {
        return null;
    }
}
