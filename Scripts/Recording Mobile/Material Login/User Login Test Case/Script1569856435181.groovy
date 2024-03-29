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

Mobile.setText(findTestObject('Material Login Sample App/User Login/android.widget.EditText0'), 'abpayy@email.com', 0)

Mobile.setText(findTestObject('Material Login Sample App/User Login/android.widget.EditText0 (1)'), 'aBappy007', 0)

Mobile.tap(findTestObject('Material Login Sample App/User Login/android.widget.Button0 - LOGIN'), 0)

Mobile.tap(findTestObject('Material Login Sample App/User Login/android.widget.ImageView0'), 0)

Mobile.closeApplication()

