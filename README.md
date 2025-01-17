# Internship training at Exaltasoft

This is an extensive day-by-day log maintained throughout the duration of the internship. All the tasks can be found in this repository. 

Please leave suggestions and feedback [here](suggestions.txt).

## Day 0 
**01-01-2025**
- Introduction of training programme and general discussion.

## Day 1
**02-01-2025**
- On **Day 1** of the training, the focus was on understanding basic HTML elements and creating a simple web page. 
- The tasks involved working with various HTML tags such as headings (`<h1>` to `<h6>`), text formatting tags (`<b>`, `<i>`, `<strong>`, etc.), as well as embedding media elements like images, videos, and audio.

### Task: Create a Signup/Login Page

The main task for the day was to create a **signup/login page**. The page includes:
- Form elements for **first name**, **last name**, **email**, and **password**.
- A **submit** button to send the data.
- Links to navigate between pages (e.g., "Go to the first page" and "Go to Second page").
- Navigate to the task [here](loginSignup/).

This task provided practice in using HTML forms, input fields, and links for basic navigation between pages.

## Day 2
**03-01-2025**
- On **Day 2** of the training, the focus was on understanding different types of HTML tags for listing and table elements. 
- The session covered tags like `<li>`, `<dt>`, `<th>`, and `<tr>`, which are used for creating lists and tables.

### Listing Techniques:
- **Ordered Lists (`<ol>`)** and **Unordered Lists (`<ul>`)** were introduced, and how to use the `<li>` tag to list items.
- **Definition Lists (`<dl>`)** were explained, with the use of the `<dt>` and `<dd>` tags for definitions.

### Task: Create Tables and Lists

The task for the day involved:
- Creating **tables** using `<table>`, `<tr>`, `<th>`, and `<td>` tags.
- Creating **lists** using `<ul>`, `<ol>`, and `<li>` tags for better organization of content.
- - Navigate to the task [here](listsTables/index.html).

### Git and GitHub Introduction:
- **Git** and **GitHub** were introduced as tools for version control.
- We were encouraged to use **Git** for tracking changes to our projects and to upload our tasks to **GitHub** for collaboration and sharing.

This task provided hands-on experience with structuring content using lists and tables, and it laid the foundation for version control using **Git** and **GitHub**.

## Day 3
**06-01-2025**
- On **Day 3** of the training, the focus was on understanding the basics of **CSS** (Cascading Style Sheets) and how to apply styles to HTML elements.
- The session covered inline styling, linking an external `styles.css` file, and applying various CSS properties such as fonts, font colors, background colors, centering, and basic CSS selectors like `class` and `id`.

### CSS Basics:
- **Inline CSS**: We learned how to apply styles directly within HTML tags using the `style` attribute.
- **Linking External CSS**: The method of linking an external CSS file using the `<link>` tag was explained.
- **Font and Background Styling**: We explored how to modify font styles, font colors, and background colors for various elements.
- **Centering Content**: Methods for centering text and block-level elements (using `text-align` and `margin: auto`) were demonstrated.
- **Marquee**: The `<marquee>` tag was introduced for creating scrolling text.

### Task: Add Styling to Signup/Login Page
The main task for the day was to apply **CSS styling** to the **signup/login page** created on Day 1. This included:
- Styling the **form** and **input fields**.
- Adding background colors and text colors.
- Styling the **submit button** and **form layout** to make the page visually appealing.
-- Navigate to the task [here](loginSignup/styles.css).

### CSS Selectors:
- We practiced using **class selectors** (e.g., `.classdata`) and **ID selectors** (e.g., `#loginForm`) to apply styles to specific elements on the page.

This task provided hands-on experience in using **CSS** to style web pages, which is essential for creating user-friendly and visually attractive websites.

## Day 4
**07-01-2025**
- On **Day 4** of the training, we continued exploring **CSS** with a focus on advanced layout techniques such as **Flexbox** and **Grid Layout**. 
- We also began our journey with **JavaScript (JS)**, covering its basics, syntax, and interaction with HTML.

### Advanced CSS Layouts:
- **Flexbox**: We explored the **flexbox model**, a one-dimensional layout system for distributing space and aligning items in a container.
  - We learned how to use the `display: flex;` property and various flexbox properties like `justify-content`, `align-items`, and `flex-direction`.

- **Grid Layout**: We then moved on to **CSS Grid Layout**, a two-dimensional system for creating complex web layouts. 
  - We understood the use of `display: grid;` and other properties like `grid-template-columns`, `grid-template-rows`, and `grid-gap`.

- **Box Model**: We learned about the **CSS Box Model**, which includes the content, padding, border, and margin areas around an element. Understanding this model is crucial for layout design.
  
- **.container Class**: We discussed the importance of using the `.container` class to wrap content in both flexbox and grid layouts, helping to center or limit content width.

### JavaScript Basics:
- **Basic JS**: We were introduced to Javascript and its basics, how it works and its core functionality. We were also introduced to **DOM** and **BOM** models.

- **Client-Side JavaScript**: We discussed how JavaScript is primarily used as a **client-side scripting language** to create interactive web pages, as opposed to server-side languages.

- **JS Limitations**: We covered some limitations of JavaScript, including its inability to manipulate files directly on the server and its single-threaded nature.

- **JS Syntax**: We learned about **JavaScript syntax**, including rules for writing variables, functions, and expressions.

### Writing First JavaScript Code:
- **Alert Function**: Our first JavaScript code involved using the `alert()` function to display a simple message to the user.

### Task: Hands-on practice with **Flexbox** and **Grid** layouts and revision of JavaScript basics.
- This included revising basics of JS and trying out the newly learnt CSS concepts.
- Navigate to the task [here](flexboxGrid/).

## Day 5  
**08-01-2025**  
- On **Day 5** of the training, the focus was on learning **JavaScript concepts** such as variables, scope, operators, strings, and objects. Additionally, **Bootstrap** was introduced for quickly styling and structuring web pages.

### JavaScript Concepts:
- **Variables and Scope**:
  - We explored `var`, `let`, and `const` and their behavior in different scopes.
    ```javascript
    var a = 10;
    {
        var a = 20; // var is function-scoped, so it reassigns the outer variable.
        console.log(a);
    }
    console.log(a); // Output: 20
    ```

  - Demonstrated the **block-scoping** of `let` and `const`.
    ```javascript
    let b = 5;
    {
        let b = 10; // Block-scoped, so this does not affect the outer 'b'.
        console.log(b); // Output: 10
    }
    console.log(b); // Output: 5
    ```

- **Prompt Input**:
  - Used `prompt()` to take user input and performed operations:
    ```javascript
    var a = prompt("Enter a number");
    document.write("The number entered is: " + a);
    var c = a % 20; // Modulus operation
    console.log(c);
    ```

- **String Operations**:
  - Concatenation of strings using `+` and checking conditions using logical operators:
    ```javascript
    let text = "World";
    let text2 = "Hello";
    let text3 = text + " " + text2; // Concatenates strings
    console.log(text3); // Output: World Hello
    ```

- **Objects**:
  - Introduction to JavaScript objects:
    ```javascript
    let name = { firstname: "Pooja", lastname: "Thakral" };
    console.log(name.firstname); // Output: Pooja
    ```

### Bootstrap Basics:
- **Introduction to Bootstrap**:
  - **Bootstrap** is a CSS framework for quickly designing responsive and mobile-first web pages.
  - The class-based system of Bootstrap simplifies styling without writing custom CSS.

- **Bootstrap Features Covered**:
  - Using **predefined classes** for text formatting, grid systems, and buttons.
  - Examples included adding responsiveness to layouts and using buttons with classes like `.btn-primary` and `.btn-success`.

### Task: Use Basic Bootstrap Functions
- Apply **Bootstrap classes** to a signup/login page to enhance its layout and appearance.
- Use Bootstrap's **grid system** to align elements responsively.
- Style buttons, forms, and other elements using **Bootstrap components**.
- Navigate to the task [here](bootstrapform/)

This session combined hands-on practice with JavaScript operations and introduced the versatility of Bootstrap for efficient web design.

## Day 6  
**09-01-2025**  
- On **Day 6** of the training, the focus was on advanced **JavaScript** concepts, including loops, conditional statements, and comparison operators. Practical examples were demonstrated to apply these concepts effectively.

### JavaScript Concepts:
- **Loops**: Covered `for`, `while`, and `do-while` loops for iteration.
- **Conditional Statements**: Discussed `if-else` and `switch` for decision-making.
- **Comparison Operators**: Explored operators like `==`, `===`, `!=`, `<`, `>`, `<=`, and `>=` for comparing values.
- **Multiplication Table**: Wrote a script to output the multiplication table of a given number as a practical exercise.

### Task: Hands-on Problem Solving with JavaScript
- **Find the Largest of Three Numbers**:
  - Implemented logic to compare three numbers and determine the largest.
- **Check if a Number is Even or Odd**:
  - Use conditional statements to check if a number is divisible by 2 using modulo operator.
- Navigate to task [here](JSpractice/).

This session emphasized problem-solving with **JavaScript** and enhanced understanding of its core concepts.

## Day 7  
**10-01-2025**  
- On **Day 7** of the training, the focus was on **dialog boxes**, **arrays and array methods**, **JavaScript objects**, and **string methods**. Practical examples were demonstrated to apply these concepts in real-world scenarios.

### JavaScript Concepts:
- **Dialog Boxes**: Introduced **Confirmation Dialog Box**, explaining how to prompt users for confirmation with `confirm()`.
- **Arrays and Array Methods**: Discussed various array methods such as printing, sorting, reversing, checking array length, and adding elements using `push()`.
- **JavaScript Objects**: Covered the concept of objects in JavaScript, creating and manipulating key-value pairs.
- **Strings and String Methods**: Explored various string methods for manipulating and converting string values.

### String Methods:
- **substr()**  
- **substring()**  
- **toLocaleLowerCase()**   
- **toLocaleUpperCase()**  
- **toLowerCase()**   
- **toString()**  
- **toUpperCase()**  
- **valueOf()** 

### Task: 
- **Dialog Box Task**: Implemented a confirmation dialog box to confirm user actions.
- **Array Manipulation**: Worked on manipulating arrays using various methods like `push()`, sorting, and reversing.
- **JavaScript Objects**: Created and modified JavaScript objects with different key-value pairs.
- **String Manipulation**: Used various string methods to transform and display strings in different cases.
- Navigate to task here: [Dialog Box](JSpractice/dialogBoxes/), [Arrays](JSpractice/arrays/), [Strings and Objects](JSpractice/objAndStrings/).

This session enhanced practical problem-solving skills with **JavaScript**, particularly in managing arrays, objects, and strings, and working with dialog boxes, And various types of string methods.

## Day 8  
**13-01-2025**  
- On **Day 8** of the training, a **doubt-solving session** was conducted to address queries from the previous days. Additionally, tasks were assigned to reinforce the concepts of **Flexbox**, **array manipulation**, and **JavaScript functions**.

### Activities:
- **Doubt-Solving Session**: Addressed any questions any topic covered till this point.
- **Tasks**: Practical tasks were assigned to solidify understanding of key JavaScript and CSS concepts.

### Tasks:
1. **Create a Flexbox**:  
   - Designed a layout using **CSS Flexbox**. Each flex container had images and accompanying text to ensure proper alignment and styling.
   - Navigate to task [here](flexboxGrid/flexboxImg/).

2. **Store an Array and Display in Alert**:  
   - Stored an array in JavaScript and displayed its contents in an alert box.
   - Navigate to task [here](JSpractice/factorial/). 
   > Note: The code for array is commented inside the code for factorial.

3. **Find the Factorial of a Number**:  
   - Implemented a JavaScript function to calculate and display the factorial of a user-provided number.
   - Navigate to task [here](JSpractice/factorial/).

This session provided a hands-on experience with JavaScript functions and CSS Flexbox, fostering better problem-solving and coding practices.

## Day 9  
**15-01-2025**  
- On **Day 9** of the training, the focus was on **dialog boxes**, **regular expressions and RegExp objects**, **JavaScript events**, and **DOM manipulation**. Practical examples were demonstrated to apply these concepts in real-world scenarios.

### JavaScript Concepts:
- **Dialog Boxes**: A brief review of dialog boxes was made to ensure clarity on how to prompt users for interactions with `confirm()`, `alert()`, and `prompt()` functions.
- **Regular Expressions and RegExp Objects**: Introduced the concept of regular expressions (regex) in JavaScript, explaining their use for pattern matching and text validation.
- **RegExp Object Methods**: Covered RegExp object methods like `exec()` to search for matches in a string.
- **JavaScript Events**: Focused on JavaScript event handling, demonstrating common events and their use cases in HTML elements.
- **DOM (Document Object Model)**: Explored the importance of DOM as a language- and platform-independent interface for interacting with HTML and XML documents.

### DOM Structure:
- **Core DOM**: The basic structure of the DOM, representing the entire document.
- **XML DOM**: The XML version of the DOM for XML document manipulation.
- **HTML DOM**: Methods and properties used specifically for manipulating HTML elements in the DOM.
- **HTML DOM Events**: Covered various HTML DOM events like `click`, `submit`, `keypress`, and more.
- **onfocus and onblur Functions**: Explained how these functions are used for handling focus and blur events on form elements.
- **Parsing Parameters**: Discussed how parameters can be parsed within JavaScript for dynamic content manipulation.

### Tasks:
1. **CSS DOM**: Worked on integrating CSS with DOM elements to manipulate styles dynamically. This was demonstrated by manipulating images on a page i.e removing, hiding and resetting.
  - Navigate to task [here](CSS-DOM/).

2. **Calculator**: Developed a basic calculator app, utilizing DOM manipulation, events, and RegExp for   input validation.
  - Navigate to task [here](JSpractice/Calculator/).

This session enhanced practical skills in **JavaScript** event handling, working with the **DOM**, and implementing **regular expressions** for pattern matching, as well as using **dialog boxes** to interact with users.

## Day 10  
**16-01-2025**  
- On **Day 10** of the training, the focus shifted towards **animating HTML elements with CSS**, **using `@keyframes` for animations**, **gradients** (linear and radial), **CSS transitions**, and **SQL database CRUD operations**.

### CSS Animation Concepts:
- **Animating HTML Elements with CSS**: Covered the concept of animating HTML elements using pure CSS. This includes smooth transitions between different states for a better user experience.
- **@keyframes**: Introduced the `@keyframes` rule in CSS, explaining how to define animations and set keyframes to change styles during the animation.
  - **Keyframes Data**: Explained how keyframes are structured to define the start and end of the animation, as well as intermediate steps.
- **Gradients**: Discussed the use of gradients in CSS for background effects.
  - **Linear Gradient**: Introduced linear gradients to create smooth color transitions.
  - **Radial Gradient**: Covered the use of radial gradients for creating circular or elliptical color transitions.
- **CSS Transitions**: Focused on smooth transitions between property changes, such as `hover` effects, using CSS transitions.

### SQL Database Concepts:
- **CRUD Operations**: Introduced the basics of SQL operations—**Create**, **Read**, **Update**, and **Delete**. Discussed how these operations are the foundation of interacting with databases.

### Tasks:
1. **CSS Animations**: Worked on creating animations for HTML elements. Applied `@keyframes`, gradients, and transitions to enhance the user interface.
  - Navigate to task [here](cssAnimations/).

2. **Write SQL Queries for Login and Sign-Up Forms**: Created SQL queries for handling the login and sign-up functionality. Implemented CRUD operations to manage user data.
  - Navigate to task [here](loginSignup/data.sql).

This session enhanced practical skills in **CSS animations**, including **keyframes** and **gradients**, and provided hands-on experience with **SQL CRUD operations** for managing user data.

## Day 11  
**17-01-2025**  
- On **Day 11** of the training, more SQL concepts were discussed including **CURD operations**, **WHERE clause**, **order by**, **group by**, **fetching top n entries in a table**, and **join and its types**.
- In this session many examples of above mentioned concepts were implemented which provided deeper understanding of the concept.
- Queries were executed on the **sign in**-**sign up** database which was created yesterday.

This session provided insights on how SQL queries are executed in practice, which strengthened SQL understanding and its concepts.