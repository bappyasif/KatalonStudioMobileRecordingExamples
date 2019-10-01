import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.android.calculator2')

Mobile.tap(findTestObject('Calculator Applications/Native Calculator/android.widget.Button0 - 5'), 0)

Mobile.tap(findTestObject('Calculator Applications/Native Calculator/android.widget.Button0 - '), 0)

Mobile.tap(findTestObject('Calculator Applications/Native Calculator/android.widget.Button0 - 5'), 0)

Mobile.tap(findTestObject('Calculator Applications/Native Calculator/android.widget.Button0 -  (1)'), 0)

Mobile.closeApplication()

/*
// You will need a real .apk file here in order to launch successfully, even if you're not testing it
String appFile = "/fullpathtomyfile/mobile-beta.apk"

// The app info for the built-in app you really want to test
RunConfiguration.setMobileDriverPreferencesProperty("appPackage", 'com.android.vending')
RunConfiguration.setMobileDriverPreferencesProperty("appActivity", 'com.android.vending.AssetBrowserActivity')

// Start the application, but it will actually use the appPackage from above
Mobile.startApplication(appFile, false)

// When we're finished with the first application
Mobile.closeApplication()

// Set the desired capabilities for the built-in second application you want to test
RunConfiguration.setMobileDriverPreferencesProperty("appPackage", 'com.android.calculator2')
RunConfiguration.setMobileDriverPreferencesProperty("appActivity", 'com.android.calculator2.Calculator')

// Start the application again, but it will actually launch the appPackage from above
Mobile.startApplication(appFile, false)
*/