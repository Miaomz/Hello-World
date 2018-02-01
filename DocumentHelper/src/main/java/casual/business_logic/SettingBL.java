package casual.business_logic;

import casual.business_logic_service.SettingBLService;
import casual.utility.ResultMessage;
import casual.vo.CodeTemplateVO;
import casual.vo.DocTemplateVO;

/**
 * @author miaomuzhi
 * @since 2018/2/1
 */
public class SettingBL implements SettingBLService {
    /**
     * @param docTemplateVO 文档模版
     * @return 修改是否成功
     */
    public ResultMessage setDocTemplate(DocTemplateVO docTemplateVO) {
        return null;
    }

    /**
     * @return 文档模版
     */
    public DocTemplateVO getDocTemplate() {
        return null;
    }

    /**
     * @param codeTemplateVO 代码模版
     * @return 修改是否成功
     */
    public ResultMessage setCodeTemplate(CodeTemplateVO codeTemplateVO) {
        return null;
    }

    /**
     * @return 代码模版
     */
    public CodeTemplateVO getCodeTemplate() {
        return null;
    }
}
