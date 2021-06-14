# SE-O

## (Spring Equipment Organizer)

My project will be a multi-User organization system for sound equipment. Users will be able to see what the company has in stock, mark the equipment as good or broken, and be able to add/edit equipment and categories of equipment available.

This project was inspired by my audio tech job at Harrison's in Oxford. I saw my needs for organization, and want to translate my needs into an application.

## M-1.) Landing page
*(1-3 days)* The page will display available equipment. This will (in time) be accomplished with a CRUD form. The homepage will display a list of entries from the form, each string given under a certain category (Cables, Power-Amps, Speakers, Mics, and Miscellaneous). The first iteration of this homepage will have placeholders.

## M-2.) User Management
*(2-4 Days)* I will be using SQL database tables for users and items. There should be a total of two tables; one for users with their information, and one for items and their information. Users will consist of an id, plus a first name and last name. Items will have a selected category and name. User Entity will be created to create/interact with listed objects. User should be able to signup, login, and logout. Users will also be able to create objects by Feature 1.

## M-3.) Content List Page and Detail Pages
*(2-4 days)* The landing page will contain a small collection of the given categories. For each category, there will be a list of items that have been entered. At the top of a category page there should be a button that serves as an addition button. There will be a form button for editing either at the bottom or an option with each item.

## M-4.) Feature 1 (Adding/removing equipment)
*(1-4 days)* Users will be able to add equipment in to a certain category page of choosing by using CRUD forms. This item's existance can be edited by any user, so if someone sees the equipment in another state before the author, it can be immediately changed.

## M-5.) Feature 2 (Marking as broken)
*(1-4 days)* Users will be able to change the "broken" state of the element of an object (Marking whether an object is good for use or not). This state can be changed by the author and other users.
