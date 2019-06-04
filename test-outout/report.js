$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/CucumberDemo/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks in cucumber",
  "description": "",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 415372,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add new customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on add customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user fills customer details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_add_customer_page()"
});
formatter.result({
  "duration": 149005009,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_fills_customer_details()"
});
formatter.result({
  "duration": 107466,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.customer_is_added()"
});
formatter.result({
  "duration": 103240,
  "status": "passed"
});
formatter.after({
  "duration": 97806,
  "status": "passed"
});
formatter.before({
  "duration": 290398,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Edit customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is on edit customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user edits contact details",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "customer details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_edit_customer_page()"
});
formatter.result({
  "duration": 162405,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_edits_contact_details()"
});
formatter.result({
  "duration": 115314,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.customer_details_updated()"
});
formatter.result({
  "duration": 103239,
  "status": "passed"
});
formatter.after({
  "duration": 100221,
  "status": "passed"
});
formatter.before({
  "duration": 152746,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Delete customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user is on delete customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user delets the customer",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "customer is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_delete_customer_page()"
});
formatter.result({
  "duration": 120747,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_delets_the_customer()"
});
formatter.result({
  "duration": 106861,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.customer_is_deleted()"
});
formatter.result({
  "duration": 103239,
  "status": "passed"
});
formatter.after({
  "duration": 138256,
  "status": "passed"
});
});