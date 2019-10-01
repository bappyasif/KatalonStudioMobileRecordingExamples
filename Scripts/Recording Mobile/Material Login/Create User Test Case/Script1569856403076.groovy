import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('G:\\coding necessary items\\Some APK\\MaterialLoginExample.apk', true)

Mobile.tap(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.TextView0 - No account yet Create one'), 0)

Mobile.tap(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0'), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (1)'), 'Bappy', 0)

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (2)'), 'Earth', 0)

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (3)'), 'abappy@email.com', 0)

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (4)'), '88088808808880', 0)

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (5)'), 'abappy007', 0)

Mobile.setText(findTestObject('Material Login Sample App/Create User/Material Login/android.widget.EditText0 (6)'), 'abappy007', 0)

Mobile.closeApplication()

