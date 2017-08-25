@todo
Feature: As a user I should be able to Create and Edit ToDo in the todomvc.com site

Background: 
   Given the user is on mvc angular page
   
Scenario: User should be able to create a new item in to do list and be able to view it
When the user creates a new item "Add first item"  in ToDo 
Then he should be able to view it.


Scenario: User should be able to set an item complete once the task is done.
When the user tries to complete the item "Add first item"
Then the user should not be able to view the item

Scenario: User should be able to reactivate a completed item.
Given user has a completed item "Add first item"
When the user tries to toggle the item 
Then he should be able to view it.

Scenario: User should be able to complete all active todo items
When the user toggles the menu selection
Then all the created items should set complete

Scenario: User should be able to filter the visible To-dos by Completed state
When the user filters the selection
Then the user should  be able to view the item

Scenario: User should be able to clear a single To-do item from the list completely
When the user close an item
Then the user should not be able to view the item

Scenario: User should be able to clear all completed To-do items from the list completely
When the user selects clear completed
Then the user should see an empty panel

