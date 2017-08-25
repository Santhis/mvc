$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ToDo.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I should be able to Create and Edit ToDo in the todomvc.com site",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@todo"
    }
  ]
});
formatter.before({
  "duration": 14823004272,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 4652687450,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to create a new item in to do list and be able to view it",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-create-a-new-item-in-to-do-list-and-be-able-to-view-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user creates a new item \"Add first item\"  in ToDo",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he should be able to view it.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Add first item",
      "offset": 29
    }
  ],
  "location": "ToDoSteps.usercreatesnewitem(String)"
});
formatter.result({
  "duration": 1540447428,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.usershouldbeabletoview()"
});
formatter.result({
  "duration": 144614385,
  "status": "passed"
});
formatter.before({
  "duration": 1038794225,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 925802113,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to set an item complete once the task is done.",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-set-an-item-complete-once-the-task-is-done.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user tries to complete the item \"Add first item\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the user should not be able to view the item",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Add first item",
      "offset": 37
    }
  ],
  "location": "ToDoSteps.usercompleteitem(String)"
});
formatter.result({
  "duration": 2225412767,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.theusershouldnotbeabletoviewtheitem()"
});
formatter.result({
  "duration": 101056374,
  "status": "passed"
});
formatter.before({
  "duration": 617975941,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 307915667,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should be able to reactivate a completed item.",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-reactivate-a-completed-item.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user has a completed item \"Add first item\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the user tries to toggle the item",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "he should be able to view it.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Add first item",
      "offset": 27
    }
  ],
  "location": "ToDoSteps.user_has_a_completed_item(String)"
});
formatter.result({
  "duration": 705112489,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.usertriestotoggletheitem()"
});
formatter.result({
  "duration": 111616838,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.usershouldbeabletoview()"
});
formatter.result({
  "duration": 91452035,
  "status": "passed"
});
formatter.before({
  "duration": 508922450,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 303480716,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User should be able to complete all active todo items",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-complete-all-active-todo-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "the user toggles the menu selection",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "all the created items should set complete",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoSteps.the_user_toggles_the_menu_selection()"
});
formatter.result({
  "duration": 633448391,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.all_the_created_items_should_set_complete()"
});
formatter.result({
  "duration": 92221778,
  "status": "passed"
});
formatter.before({
  "duration": 502296503,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 325484692,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User should be able to filter the visible To-dos by Completed state",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-filter-the-visible-to-dos-by-completed-state",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "the user filters the selection",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user should  be able to view the item",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoSteps.the_user_filters_the_selection()"
});
formatter.result({
  "duration": 387130,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.the_user_should_be_able_to_view_the_item()"
});
formatter.result({
  "duration": 35716,
  "status": "passed"
});
formatter.before({
  "duration": 571614424,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 279275891,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User should be able to clear a single To-do item from the list completely",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-clear-a-single-to-do-item-from-the-list-completely",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "the user close an item",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the user should not be able to view the item",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoSteps.the_user_close_an_item()"
});
formatter.result({
  "duration": 408066,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.theusershouldnotbeabletoviewtheitem()"
});
formatter.result({
  "duration": 664523018,
  "status": "passed"
});
formatter.before({
  "duration": 846685261,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on mvc angular page",
  "keyword": "Given "
});
formatter.match({
  "location": "DriverInstance.userisonmvcangular()"
});
formatter.result({
  "duration": 350481018,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User should be able to clear all completed To-do items from the list completely",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-create-and-edit-todo-in-the-todomvc.com-site;user-should-be-able-to-clear-all-completed-to-do-items-from-the-list-completely",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "the user selects clear completed",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the user should see an empty panel",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoSteps.the_user_selects_clear_completed()"
});
formatter.result({
  "duration": 658232473,
  "status": "passed"
});
formatter.match({
  "location": "ToDoSteps.the_user_should_see_an_empty_panel()"
});
formatter.result({
  "duration": 106628493,
  "status": "passed"
});
});