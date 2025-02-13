# Internship training at Exaltasoft

This is an extensive day-by-day log maintained throughout the duration of the internship. All the tasks can be found in this repository.

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

This session provided understanding of the flexbox model, grid layouts and basic JavaScript concepts.

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

- On **Day 11** of the training, the focus was on building a deeper understanding of SQL concepts and their practical applications. The session included extensive discussions and hands-on practice on the following topics:

### SQL Concepts Covered:
1. **CRUD Operations**:
   - Refreshed the four fundamental SQL operations—**Create**, **Read**, **Update**, and **Delete**.
   - Practiced modifying records in a database using these operations to manage data effectively.

2. **WHERE Clause**:
   - Learned how to use the `WHERE` clause to filter data based on specific conditions.
   - Explored various operators, such as comparison operators (`=`, `<`, `>`, `!=`) and logical operators (`AND`, `OR`, `NOT`).

3. **ORDER BY Clause**:
   - Discussed how to sort data in ascending or descending order using the `ORDER BY` clause.
   - Applied sorting on different columns to better analyze data.

4. **GROUP BY Clause**:
   - Understood the role of `GROUP BY` in grouping data based on one or more columns.
   - Used aggregate functions like `SUM`, `AVG`, `COUNT`, `MIN`, and `MAX` in combination with `GROUP BY` to perform calculations on grouped data.

5. **Fetching Top N Entries**:
   - Explored methods to retrieve the top `n` rows from a table using clauses like `LIMIT` (in MySQL) and `FETCH FIRST` (in SQL Server).

### Hands-On Practice:
- Queries were executed on the **sign-in/sign-up database** created during Day 10's session. These queries focused on real-world scenarios, such as:
  - Filtering users based on their name.
  - Sorting records by username or other attributes.
  - Grouping users by account type and calculating the total number of users in each category.
  - Fetching the most recent sign-ups or the top 5 most active users.

### Learning Outcome:
This session emphasized the practical execution of SQL queries, enhancing participants' confidence in:
- Applying SQL concepts in real-life projects.
- Understanding how to filter, sort, group, and manipulate data effectively.
- Gaining proficiency in using `CRUD`, `WHERE`, `ORDER BY`, and `GROUP BY` clauses.

By combining theoretical knowledge with hands-on practice, this session significantly strengthened the foundation of SQL concepts.

## Day 12  
**20-01-2025**  
- On **Day 12** of the training, the focus was on advanced SQL concepts and database design principles. This included examples of grouping and sorting data, various types of SQL joins, and steps for designing an efficient database.

### SQL Concepts:
- **Examples on `GROUP BY` and `ORDER BY`**: Explored how to group data using `GROUP BY` and sort the data with `ORDER BY` clauses for better data organization and analysis.
- **Joins and Its Types**: Covered the concept of joins in SQL and their practical use cases to retrieve data from multiple tables:
  - **Inner Join**: Discussed how to fetch only matching rows between tables.
  - **Outer Join**: Explored retrieving rows that do not have matches in one or both tables.
- **Using the `HAVING` Clause**: Explained how to filter grouped records using the `HAVING` clause in SQL.

### Database Design Concepts:
- **Steps for Designing a Database**:
  1. **Purpose of Database**: Identified the purpose, such as creating an **Employee** database.
  2. **Information**: Gathered the dataset and defined the data requirements.
  3. **Divide Data into Tables**: Split the dataset into multiple tables (e.g., **Employee**, **Manager**).
  4. **Columns**: Defined the columns required for each table (e.g., `id`, `name`).
  5. **Primary Keys**: Established unique identifiers for each table.
  6. **Table Relationships**: Defined relationships between tables (e.g., Employee and Manager).
  7. **Design**: Created a preliminary design for the database schema.
  8. **Normalization Rules**: Applied normalization principles to reduce redundancy and ensure data integrity.

- **Primary Key and Foreign Key**:
  - **Primary Key**: Defined as a unique identifier for each record in a table.
  - **Foreign Key**: Used to establish relationships between tables by referencing the primary key of another table.

- **Database Relationships**:
  - **One-to-One**
  - **Many-to-Many**
  - **Many-to-One**
  - **One-to-Many**

- **ERD Drawing Tool**: Introduced tools for drawing Entity-Relationship Diagrams (ERDs) to visualize the database structure.

### Task:
- **Database Design Task**: Designed a database for a **Bank** with either an ERD or the actual database implementation.
  - Navigate to task [here](bankDatabase/).

This session provided a deeper understanding of how to design efficient databases and visually represent them using ER diagrams. Covered the purpose and components of ER diagrams, including entities, attributes, and relationships, as well as how they connect to relational schemas.

## Day 13  
**21-01-2025**  
- On **Day 13** of the training, the focus was on understanding the foundational concepts of Java programming. The session covered the basics of Java, including its features, object-oriented principles, and practical applications.

### Features of Java:
- **Objects and Classes**:
  - **Class**: Represents a logical existence and blueprint for objects.
  - **Object**: Represents a physical entity created based on a class.

### Applications of Java:
- Discussed various real-world applications of Java, including web development, mobile applications, desktop GUI applications, and enterprise systems.

### IDEs for Java:
- Introduced popular IDEs for Java development:
  - **Eclipse**
  - **IntelliJ IDEA**

### First Java Program:
- Created a simple Java program to print "Hello, World!" and explained the structure of a Java program, including the `main` method and the importance of the `public` and `static` keywords.

### Identifiers:
- Discussed the naming conventions and rules for defining identifiers in Java.
  - Identifiers must start with a letter, `_`, or `$`.
  - They cannot use Java reserved keywords.

### Data Types:
- Covered the different data types in Java:
  - **Primitive Data Types**: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
  - **Non-Primitive Data Types**: Strings, arrays, and objects.

### Local and Global Variables:
- **Local Variables**: Declared inside a method and accessible only within that method.
- **Global Variables**: Declared outside methods but inside a class. Available to all methods in the class.

### Static and Non-Static Variables:
- **Static Variables**: Shared among all instances of a class. Declared with the `static` keyword.
- **Non-Static Variables**: Instance-specific variables. Each object has its own copy of these variables.

### Task:
- **Java Code Task**: Write a Java program demonstrating all data types in Java.
  - Navigate to task [here](java/DataTypes/)

This session provided a solid foundation in Java programming concepts and practices.

## Day 14  
**22-01-2025**  
- On **Day 14** of the training, the focus was on understanding classes, objects, and array operations in Java. The session also delved into Java strings and their methods.

### Classes and Objects:
- **Class Declaration**:
  - Discussed how to declare a class in Java, including the syntax and structure.

- **Access Modifiers**:
  - **`public`**: Accessible from any other class.
  - **`private`**: Accessible only within the class it is declared.
  - **`protected`**: Accessible within the same package and subclasses.

- **Object Creation**:
  - Demonstrated how to create an object using the `new` keyword.

- **Accessing Class Members**:
  - Explained how to use objects to access fields and methods of a class.

### Arrays and Their Operations:
- **Sum of Array Elements**:
  - Created a program to calculate the sum of all elements in an array.

- **`Arrays.binarySearch`**:
  - Covered how to search for an element in a sorted array using the `binarySearch` method from the `Arrays` class.

- **`Arrays.sort`**:
  - Demonstrated sorting an array using the `sort` method from the `Arrays` class.

- **String Arrays**:
  - Explained how to declare and manipulate arrays of strings.

### Java Strings and Their Methods:
- Discussed the properties and methods of the `String` class in Java, including:
  - **`length()`**: Retrieves the length of the string.
  - **`substring()`**: Extracts a portion of the string.
  - **`equals()`**: Compares two strings for equality.
  - **`toUpperCase()` and `toLowerCase()`**: Converts the string to uppercase or lowercase.

### Task:
1. **Java Code Task**:
   - Write a Java program to demonstrate the use of classes and objects.
    - Navigate to task [here](java/ClassesAndObjects/).

2. **Java Code Task**:
   - Write a Java program to demonstrate arrays and their operations.
     - Navigate to task [here](java/Arrays/).`

This session provided an in-depth understanding of working with classes, objects, and arrays in Java, along with practical exposure to string manipulation.

## Day 15

**25-01-2025**

- On **Day 15** of the training, the focus was on advanced Object-Oriented Programming (OOP) concepts, including object creation, methods, polymorphism, constructors, destructors, and inheritance. The session also explored encapsulation and static members in detail.

### Object Creation:

- **Arrays of Objects**:
  - Discussed how to create and use arrays to store and manipulate multiple objects.

### Methods:
- **Types of Methods**:

  - **Pre-defined Methods**: Functions provided by the language/library.
  - **User-defined Methods**: Functions created by the user for specific operations.

- **Getters and Setters**:
  - Implemented getters and setters to provide controlled access to private variables.

- **Abstract Methods**:
  - Discussed abstract methods and how they enforce implementation in child classes.

### Polymorphism:
- **Compile-Time Polymorphism**:
  - Achieved using **method overloading**.

- **Runtime Polymorphism**:
  - Achieved using **method overriding**.

### Constructors:
- **Parameterized and Non-Parameterized Constructors**:
  - **Non-Parameterized Constructor**: Initializes an object with default values.
  - **Parameterized Constructor**: Allows setting initial values for fields.

- **Constructor Overloading**:
  - Explored multiple constructors with different parameters.

- **Constructor Overriding (Task)**:
  - Investigated inheritance and constructor behavior during overriding.

### Destructor:
- Understood destructors for cleanup operations (e.g., `finalize()` in Java).

### `this` Keyword:
- Used `this` keyword to refer to the current instance of the class.

### Static Members:
- Learned how static variables and methods belong to the class, not instances.
- Implemented static methods and accessed them directly without creating an object.

### Inheritance:

- **`extends`** Keyword:
  - Used `extends` to establish parent-child relationships between classes.

- **Types of Inheritance**:

  1. **Single Inheritance**: One class inherits from another.
  2. **Multilevel Inheritance**: A class inherits from another class which itself inherits from another.
  3. **Hierarchical Inheritance**: Multiple classes inherit from a single parent class.
  4. **Multiple Inheritance**: Achieved using interfaces in Java.

### Encapsulation:
- Implemented encapsulation by bundling data (fields) and methods into a single class.
- Restricted access to fields using private access modifiers and exposed them through getters/setters.

### Task:
1. **Overloading and overriding**:
- Write a Java program to demonstrate method overloading and overriding.
  - Navigate to task [here](java/oops/).

2. **Inheritance types**:
- Write a Java program to demonstrate inheritance types.
  - Navigate to task [here](java/oops/).

This session provided an in-depth understanding of advanced OOP concepts and their practical implementation.

## Day 16  
**27-01-2025**  
- On **Day 16** of the training, the focus was on understanding **Exception Handling in Java**, covering various types of exceptions, errors, and handling techniques. The session also explored keywords like `throw` and `throws`, and how the Java Virtual Machine (JVM) handles exceptions.

### Exception Handling in Java:
#### Types of Exceptions:
1. **Checked Exceptions**:
   - Exceptions that are checked at compile time.
   - Examples:
     - `IOException`
     - `SQLException`

2. **Unchecked Exceptions**:
   - Exceptions that occur at runtime.
   - Examples:
     - `ArithmeticException`
     - `NullPointerException`

#### Errors:
- Errors are serious issues that cannot be handled by the program.
- Examples:
  1. **OutOfMemoryError**:
     - Occurs when the JVM runs out of memory.
  2. **VirtualMachineError**:
     - Indicates a problem with the JVM.
  3. **StackOverflowError**:
     - Happens when a recursive call does not terminate properly.

### Exception Handling Techniques:
#### How JVM Handles an Exception:
- When an exception occurs:
  1. JVM searches for an appropriate **catch block** in the current method.
  2. If none is found, it propagates the exception to the caller method.
  3. If no catch block is found in the call stack, the program terminates abnormally.

#### Multiple Catch Statements:
- Allows handling multiple exceptions in a single `try` block.
- Example:
  ```java
  try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
  } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception: " + e.getMessage());
  } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
  }
  ```

#### `throw` Keyword:
- Used to explicitly throw an exception.
- Example:
  ```java
  public void validateAge(int age) {
      if (age < 18) {
          throw new IllegalArgumentException("Age must be 18 or above.");
      }
  }
  ```

#### `throws` Keyword:
- Declares exceptions that a method might throw.
- Example:
  ```java
  public void readFile() throws IOException {
      FileReader file = new FileReader("test.txt");
  }
  ```

### Task:
- **Create Exception Cases for an Electronics Shop**:
  - Example scenarios include:
    1. **OutOfStockException**:
       - Thrown when an item requested by a customer is not available.
    2. **InvalidPaymentException**:
       - Thrown when payment details are invalid.
    3. **WarrantyExpiredException**:
       - Thrown when a customer tries to claim a warranty after its expiration.
  
  -Navigate to task [here](java/exceptionHandling/).

This session provided a detailed understanding of exception handling mechanisms in Java and how they can be used to build robust applications.

## Day 17  
**30-01-2025**  

On **Day 17** of the training, the focus was on understanding **Collections in Java**. The session covered the Java Collections Framework, various interfaces, classes, and their specific use cases. Additionally, practical implementations and differences between collection types were explored.

### Collections in Java:
#### Java Collections Framework:
- A framework that provides an architecture to store and manipulate groups of objects efficiently.
- Includes interfaces and classes that help manage data structures dynamically.

### Important Interfaces and Classes:

#### **Collection Interface:**
- The root interface of the Java Collections Framework.
- Methods:
  - `add(E e)`: Adds an element to the collection.
  - `remove(Object o)`: Removes a specific element.
  - `size()`: Returns the number of elements.
  - `clear()`: Removes all elements.
  - `contains(Object o)`: Checks if an element exists.

#### **List Interface:**
- An ordered collection (also known as a sequence).
- Allows duplicate elements.
- Implementations:
  1. **ArrayList**:
     - Resizable-array implementation.
     - Fast for retrieving elements.
     - Slower for insertions and deletions in the middle.
  2. **LinkedList**:
     - Doubly-linked list implementation.
     - Fast insertions and deletions.
     - Slower random access.
  3. **Vector**:
     - Synchronized and thread-safe.
     - Similar to `ArrayList` but less preferred due to overhead.
  4. **Stack**:
     - Follows **LIFO (Last In, First Out)** principle.
     - Methods:
       - `push(E e)`: Adds an element to the stack.
       - `pop()`: Removes and returns the top element.
       - `peek()`: Returns the top element without removing it.

#### **Queue Interface:**
- Follows **FIFO (First In, First Out)** principle.
- Implementations:
  - **PriorityQueue**: Orders elements based on priority.
  - **Deque (Double-ended Queue)**: Allows insertion and deletion from both ends.

#### **Set Interface:**
- A collection that does not allow duplicate elements.
- Implementations:
  1. **HashSet**:
     - Unordered collection.
     - Uses hashing for fast access.
  2. **LinkedHashSet**:
     - Maintains insertion order.
  3. **TreeSet** (Implements **SortedSet Interface**):
     - Maintains elements in sorted order.

#### **Iterator Interface:**
- Used to traverse collections.
- Methods:
  - `hasNext()`: Checks if more elements are available.
  - `next()`: Returns the next element.
  - `remove()`: Removes the current element.
  
### Task:
- **Practice Methods of Collections & Compare Their Use Cases**
  - Implement various collection methods.
  - Write differences between `ArrayList`, `LinkedList`, `HashSet`, and `TreeSet`.
  - Explain their specific use cases with examples.
  
  - Navigate to task [here](java/collections/).

This session provided a deep dive into Java Collections and how to use them effectively for data management in applications.

## Day 18  
**31-01-2025**  

On **Day 18** of the training, the focus was on understanding **File Handling in Java**. The session covered file operations, path handling, working with packages and classes, and different types of links.

### File Handling in Java:
- File handling allows Java programs to create, read, update, and delete files.

### Absolute and Relative Paths:
- **Absolute Path**: Specifies the complete path from the root directory.
- **Relative Path**: Specifies the path relative to the current working directory.

### Packages and Classes:
- **Packages** help organize Java classes into namespaces to avoid name conflicts.
- **Classes** inside packages must be imported to be used in other files.

### Path Interfaces:
- `Path` is an interface in Java used to represent file and directory paths.
- Commonly used with `java.nio.file` package.
- Methods:
  - `getFileName()`: Returns the name of the file or directory.
  - `getParent()`: Returns the parent path.
  - `toAbsolutePath()`: Converts a relative path to an absolute path.

### File Handling Methods:
- `createNewFile()`: Creates a new file.
- `mkdir()`: Creates a new directory.
- `delete()`: Deletes a file or directory.
- `exists()`: Checks if a file or directory exists.
- `length()`: Returns the size of the file.

### Symbolic Links and Hard Links:
- **Symbolic Link**:
  - A pointer to another file or directory.
  - Can point to files across different file systems.
- **Hard Link**:
  - A duplicate reference to the same file in the file system.
  - Remains valid even if the original file is deleted.

### Task:
- **Practice File Handling Operations & Path Methods**
  - Create files and directories using Java.
  - Implement symbolic and hard links.
  - Explore `Path` interface methods.
  
  - Navigate to task [here](java/fileHandling/).

This session provided an in-depth understanding of Java File Handling and how it helps in managing file operations efficiently.

## Day 19  
**03-02-2025**  

On **Day 19** of the training, the focus was on understanding the **Spring Framework**. The session covered an introduction to Spring, its architecture, important annotations, dependency injection, and Spring MVC. Additionally, logic-building tasks related to inheritance and method overriding were covered.

### Spring Framework:
#### Overview:
- Spring is a powerful framework for Java-based applications that simplifies development and management.
- It provides comprehensive infrastructure support for developing Java applications.

#### Why Use Spring?
- Simplifies enterprise application development.
- Provides loose coupling through dependency injection.
- Reduces boilerplate code.
- Supports multiple configurations (XML, Java-based, and annotation-based).

#### Components of Spring:
- **Spring Core**: Manages bean creation and dependency injection.
- **Spring AOP (Aspect-Oriented Programming)**: Provides cross-cutting concerns (e.g., logging, security).
- **Spring Data Access**: Simplifies database operations.
- **Spring MVC**: Supports web application development.
- **Spring Security**: Provides authentication and authorization.

### Spring Framework Architecture:
#### Spring Container:
- The **Spring Container** is responsible for managing the lifecycle and configuration of beans.
- Uses **IoC (Inversion of Control)** to handle dependencies.

#### Beans and Dependencies:
- **Beans** are objects managed by the Spring container.
- Dependencies are injected into beans using **Dependency Injection (DI)**.

### Spring Annotations:
#### Introduction:
- Annotations in Spring simplify configuration and eliminate the need for XML.

#### Important Annotations:
- **@Component**: Marks a class as a Spring-managed component.
- **@Service**: Specifies a service component.
- **@Repository**: Marks a DAO (Data Access Object) component.
- **@Controller**: Defines a Spring MVC controller.
- **@Autowired**: Automatically injects dependencies.
- **@Value**: Injects values into fields.

### Spring Dependency Injection:
#### Introduction:
- Dependency Injection (DI) is a design pattern used to implement IoC.
- Helps achieve **loose coupling** between objects.

#### Types of Dependency Injection:
1. **Constructor-based Injection**:
   - Dependencies are injected via the constructor.

2. **Setter-based Injection**:
   - Dependencies are injected using setter methods.

#### **@Qualifier Annotation**:
- Used when multiple beans of the same type exist.
- Helps specify which bean to inject.

### Spring MVC:
#### Introduction:
- Spring MVC is a module for building web applications.

#### Important Components:
- **DispatcherServlet**: Front controller that handles requests and responses.
- **@Controller**: Marks a class as a web controller.
- **@RequestMapping**: Maps URLs to controller methods.
- **@RequestParam**: Extracts request parameters.

### Hands-on Logic Building Tasks:
#### **1. Inheritance Example & Method Overriding:**

#### **2. Check if a Number is Armstrong or Not:**

### Task:
- **1.Demonstrate Inheritance and Method Overloading**
  - Navigate to tasks [here](java/springBasics/).

- **2.Write java code for Armstrong Number Problem.**
  - Navigate to tasks [here](java/ArmstrongNumebr/).

This session provided a solid foundation for understanding the Spring Framework and its core concepts.

## Day 20  
**10-02-2025**  

On **Day 20** of the training, the session was a **Practice Session** focused on strengthening Java understanding and revising HTML, CSS concepts. This was done in preparation for moving on to **Spring Boot** and **React**.

### Tasks:
#### **1. Java program to check if a given string or number is a palindrome.**
- A palindrome is a word, number, phrase, or other sequence of characters that reads the same forward and backward.
  - Navigate to task [here](java/Palindrome/).

#### **2. Implementing a Contact Us Form with SQL Database:**
- This task involved creating a fully functional **Contact Us** form using **HTML, CSS**, and **SQL** for storing user inputs in a database.
  - Navigate to task [here](contactUsForm/).

This session helped reinforce fundamental Java concepts and revise web development technologies, ensuring a strong foundation for upcoming topics like **Spring Boot** and **React**.

## Day 21  
**11-02-2025**  

On **Day 21** of the training, the session focused on setting up the development environment for **React** by installing necessary tools and initializing a React project.

#### **1. Installed Node.js**
- Installed **Node.js** to enable running JavaScript outside the browser and use npm (Node Package Manager) for managing dependencies.

#### **2. Setting up Environment for React Project**
- Configured the development environment by ensuring the necessary tools like **Node.js, npm, and VS Code** were properly set up.

#### **3. Initialized React Project**
- Created a new **React** project using `create-react-app` and verified the setup by running the development server.

This session established the groundwork for working with **React**, ensuring that the necessary tools and environment were properly configured for future development.

## Day 22  
**12-02-2025**  

On **Day 22** of the training, the session focused on understanding the core concepts of **Props and State** in React.

### Tasks:
#### **1. Understanding Props in React**
- Explored how **props** allow passing data from parent to child components in a React application.
  - Navigate to task [here](my-react-app/src/App.js).

#### **2. Managing State in React**
- Learned about **state** in React, how it helps in managing component data dynamically, and the difference between props and state.
  - Navigate to task [here](my-react-app/src/App.js).

This session provided a foundational understanding of how **React components** communicate and manage data efficiently using **props and state**.

