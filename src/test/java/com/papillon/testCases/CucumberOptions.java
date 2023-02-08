package com.papillon.testCases;

public class CucumberOptions {

    /**
    Objective: To test the basic functionality of the website and ensure all links, images and content are
     loading correctly.
Steps:
1.	Open a web browser and navigate to https://papillonakademi.com/
2.	Check if the website loads properly and all images are displayed correctly.
3.	Click on the different links on the homepage (e.g. About Us, Courses, etc.) to ensure they are working and
     redirecting to the correct pages.
4.	Check if the content on each page is displayed correctly and is legible.
5.	Check the website's responsiveness on different devices and screen sizes to ensure proper display.
6.	Check if the website's contact form is functional and submitting properly.
7.	Check if the website's search functionality is working correctly.
Expected Result: The website should load correctly on all devices and screen sizes, all links and images should
     be functional, and all content should be displayed correctly. The contact form should submit properly and
     the search functionality should return relevant results.  */

    /**
    1.	Create a new Java project in your preferred IDE
2.	Add the following dependencies to your project's pom.xml file:
3.	Create a new package called features and within it, create a file called homepage.feature with the
     following contents:
4.	Feature: Papillon Akademi Homepage
5.	  As a user, I want to visit the Papillon Akademi homepage and verify its contents.
6.
7.	  Scenario: Verify Homepage Title
8.	    Given I am on the Papillon Akademi homepage
9.	    When I retrieve the page title
10.	    Then the title should be "Papillon Akademi | Online Eğitimler"
11.
12.	  Scenario: Verify Navigation Menu
13.	    Given I am on the Papillon Akademi homepage
14.	    When I retrieve the navigation menu
15.	    Then it should contain the following items:
16.	      | Eğitimler |
17.	      | Hakkımızda |
18.	      | İletişim |

     */
}
