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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Add to cart_demo'))

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Add to cart_demo2'))

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/a_View cart'))

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Katalon Shop  Katalon Ecommerce/Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_first_name'), 'ppp')

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_last_name'), 'Abc')

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_address_1'), 'xyz')

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_city'), 'houston')

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/Select an option_State'))

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_postcode'), '10112')

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_phone'), '1327894567')

WebUI.setText(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/billing_email'), 'asd@test.com')

WebUI.click(findTestObject('Object Repository/Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/Place order_Button'))

WebUI.verifyElementPresent(findTestObject('Ecommerce_Home-Page Katalon/Page_Checkout  Katalon Shop/header_Katalon Shop                        _4eba8e'), 
    0)

WebUI.closeBrowser()

