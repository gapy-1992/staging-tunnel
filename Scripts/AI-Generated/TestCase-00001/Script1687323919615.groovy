import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_category_khoa-hoc-suc-khoe'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/khoa-hoc-suc-khoe')

'step 2: Add visual checkpoint at Page_category_khoa-hoc-suc-khoe'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
