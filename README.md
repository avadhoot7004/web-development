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