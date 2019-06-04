Feature: Tags in cucumber

@SanityTest
Scenario: Verify login
Given This is valid login test

@SanityTest @EndToEndTest
Scenario: Verify Logout
Given This is logout test

@RegressionTest
Scenario: Verify Search Functionality
Given This is search test

@RegressionTest @EndToEndTest
Scenario: Verify advanced search
Given This is advanced search test

@EndtoEndTest
Scenario: Verify prepaid recharge
Given This is prepaid test

@EndtoEndTest
Scenario: Verify post paid recharge
Given This is post paid test