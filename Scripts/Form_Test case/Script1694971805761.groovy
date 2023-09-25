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

WebUI.navigateToUrl('http://www.automationpractice.pl/index.php')

WebUI.click(findTestObject('Home_Page_My Shop/a_Sign in'))

WebUI.setText(findTestObject('My account_Page - My Shop/input_Email address_create-account'), 'dod@gmail.com')

WebUI.click(findTestObject('My account_Page - My Shop/button_Create an account'))

WebUI.mouseOver(findTestObject('Registeration_form_page/form_Your personal information'))

WebUI.click(findTestObject('Registeration_form_page/label_Mrs'))

WebUI.setText(findTestObject('Registeration_form_page/input__customer_firstname'), 'stella')

WebUI.setText(findTestObject('Registeration_form_page/input__customer_lastname'), 'abel')

WebUI.setText(findTestObject('Registeration_form_page/input__email'), 'dod@gmail.com')

WebUI.setEncryptedText(findTestObject('Registeration_form_page/input__passwd'), 'NhbHzDFXUPA=')

WebUI.selectOptionByValue(findTestObject('Registeration_form_page/select_--Day'), '15', true)

WebUI.selectOptionByValue(findTestObject('Registeration_form_page/select_--Month'), '8', true)

WebUI.selectOptionByValue(findTestObject('Registeration_form_page/select_--Year'), '1999', true)

WebUI.click(findTestObject('Registeration_form_page/box_Sign up for our newsletter'))

WebUI.click(findTestObject('Registeration_form_page/Register_button'))

WebUI.verifyElementPresent(findTestObject('Registeration_form_page/p_Your account has been created'), 0)

