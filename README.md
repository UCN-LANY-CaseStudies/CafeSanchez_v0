# Cafe Sanchez Case Study
 This repository contains the first version of the point-of-sale application that is the starting point for the Cafe Sanchez case study.  
 
 ## Introduction
 
 A point-of-sale (POS) system is a combination of hardware and software that allows businesses to process sales transactions, track inventory, and manage customer information. POS systems can include a variety of components, such as a cash register, barcode scanner, receipt printer, and credit card reader. Modern POS systems also often can connect to the internet, allowing for real-time inventory updates and data analysis. Additionally, many POS systems can integrate with other business software, such as accounting or customer relationship management systems. Overall, a POS system is a key tool for businesses to manage sales and inventory effectively.

### Scenario
Café Sanchez is a small coffee shop that is operated by the owner and one employee. This means taking the customers’ orders, processing them, and handing them out from the counter. To help in the day-to-day work, a system that can keep track of customer orders and support the workflow in the café, is desired.  

A typical workflow is described by the owner like this:  

*When a customer comes into the shop, she places an order for one or more beverages. The order is written onto a piece of paper with the customer’s name and is processed. When it is ready, the customer’s name is called and she steps up to the counter, pays, and get the beverages.*  
 
Through meetings with the café owner, the following additional information about the desired system is documented:  
* The system must be able to keep track of several orders simultaneously but does not keep records of the sales. 
* When an order is finished and paid for, it is deleted from the system. 
* Also, there is no need for handling payments.

As mentioned above, there are only two people working in the café and they are reasonably used to using IT systems. However, in certain times in a day there will be a lot of customers at the same time which causes a lot of hustle and bustle. In these situations it is important that the use of the system is as simple as possible, to prevent errors in the customers orders.

## Requirements
Based on the information provided above, the following *functional* requirements has been identified:  
1. **Order creation**: The software should allow the staff to create a new order, specifying the name of the customer, the beverages ordered, and any special instructions or preferences.
1. **Order processing**: Once an order is created, the software should allow the staff to process it, which may involve tracking its progress, and updating its status as it moves through the workflow.
1. **Order tracking**: The software should allow the staff to track the status of each order in real-time, so they can see which orders are in progress, which are ready to be picked up, and which are still waiting to be processed.
1. **Order deletion**: When an order is finished and paid for, the software should allow the staff to remove it from the system.
1. **Multiple order tracking**: The software should be able to keep track of several orders simultaneously, so the staff can work on multiple orders at the same time.

The only *non-functional* requirement identified is that the operation of the system must be fail-safe.

## Implementation
The application is implemented as a desktop application based on a three-tier open architecture. The individual tiers are implemented as packages in the Java project (The IDE used is Eclipse).

![Architecture][architecture]

### UI
The user interface is designed to satisfy the Use Cases shown in Appendix A and consists of two screens; a main window that shows the active orders that are currently being processed, and a modal window where details about a new customer order can be entered.

![Main Window][mainwindow]
![New Order Model][newordermodal]

[architecture]: /Graphics/Architecture.svg "Architecture" 
[mainwindow]: /Graphics/screen1.png "Main Window"
[newordermodal]: /Graphics/screen2.png "New Order Modal"   