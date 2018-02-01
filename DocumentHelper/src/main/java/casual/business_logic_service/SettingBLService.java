package casual.business_logic_service;

import casual.utility.ResultMessage;
import casual.vo.CodeTemplateVO;
import casual.vo.DocTemplateVO;

/**
 * @author miaomuzhi
 * @since 2018/2/1
 */
public interface SettingBLService {
    /**
     *
     * @param docTemplateVO 文档模版
     * @return 修改是否成功
     */
    ResultMessage setDocTemplate(DocTemplateVO docTemplateVO);

    /**
     *
     * @return 文档模版
     */
    DocTemplateVO getDocTemplate();

    /**
     *
     * @param codeTemplateVO 代码模版
     * @return 修改是否成功
     */
    ResultMessage setCodeTemplate(CodeTemplateVO codeTemplateVO);

    /**
     *
     * @return 代码模版
     */
    CodeTemplateVO getCodeTemplate();
}
