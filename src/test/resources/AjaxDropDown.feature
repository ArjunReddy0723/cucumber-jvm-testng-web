Feature: Show how to automate AJAX dropdown using webdriver

Scenario: Launch the url and select India from the AJAX dropdown
Given http://dhtmlx.com/docs/products/dhtmlxCombo/ , Austra
Then Australia should be highligted and shown