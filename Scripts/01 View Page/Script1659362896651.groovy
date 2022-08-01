import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.verifyElementText(findTestObject('Page_Faktoriall/txt_Kalkulator Faktorial'), 'Kalkulator Faktorial')

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/input_Angka'), '')
variableHoldingValue = WebUI.getAttribute(findTestObject('Object Repository/Page_Faktoriall/input_Angka'), 
    '')

WebUI.verifyEqual(variableHoldingValue, variableHoldingValue)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Faktoriall/btn_Hitung Faktorial'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/link_Terms Of Service'), 'Terms Of Service')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/link_Privacy Policy'), 'Privacy Policy')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/txt-QaAcademy'), 
    '© Qa Academy 2022 - 2022')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/txt_Laravel'), 'Laravel v8.72.0 (PHP v8.0.10)')

