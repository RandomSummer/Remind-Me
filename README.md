# 🎓 Remind-Me: A Smart To-Do Application



Welcome to **Remind-Me**, a dynamic and responsive full-stack to-do web application built with a modern tech stack. This project is designed as an educational companion to help users organize their learning goals and daily tasks in a seamless, interactive environment. It features a sleek, dark-themed glassmorphism UI that updates in real-time without ever needing a page refresh.

---

## 🚀 Features

* **Dynamic Task Management:** Create, toggle (complete/undo), and delete tasks with a single click.
* **Real-Time UI Updates:** The entire user interface is powered by AJAX, providing a smooth, single-page application (SPA) experience with no page reloads.
* **Progress Analytics Dashboard:** A beautiful dashboard visualizes your productivity with stats on total, pending, and completed tasks, including a success rate percentage.
* **Motivational Quotes:** Get a new dose of inspiration with a dynamically loaded quote every time you visit.
* **Modern & Responsive UI:** A stunning glassmorphism design built on a dark theme that looks great on both desktop and mobile devices.
* **Smooth Animations:** Subtle animations and transitions provide a polished and engaging user experience.
* **Empty State Guidance:** Helpful prompts and icons guide the user when the task list is empty.

---

## ✨ Live Preview


*The main dashboard view, showcasing the analytics and task list.*


*The application is fully responsive and functional on smaller screens.*

---
## 📸 Photos and Videos


### Application Screenshot
![Remind-Me Screenshot](https://via.placeholder.com/800x450.png?text=Replace+with+your+app+screenshot)
*A high-quality screenshot of the application's main interface.*

### Video Walkthrough
[![Remind-Me Video Walkthrough](https://via.placeholder.com/800x450.png?text=Replace+with+your+video+thumbnail)](https://www.youtube.com/watch?v=your_video_id)
*Click the thumbnail above to watch a video demonstration of the project's features.*


---

## 🛠️ Tech Stack & Tools

This project is powered by a robust ecosystem of modern development tools and frameworks.

<table>
  <tr>
    <td align="center">
      <a href="https://www.java.com/">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java" width="65" height="65"/>
      </a>
      <br><strong>Java 17</strong>
      <br><small>Core Backend Language</small>
    </td>
    <td align="center">
      <a href="https://spring.io/projects/spring-boot">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original-wordmark.svg" alt="Spring Boot" width="65" height="65"/>
      </a>
      <br><strong>Spring Boot</strong>
      <br><small>Backend Framework</small>
    </td>
    <td align="center">
      <a href="https://www.thymeleaf.org/">
        <img src="https://www.thymeleaf.org/images/thymeleaf.png" alt="Thymeleaf" width="65" height="65"/>
      </a>
      <br><strong>Thymeleaf</strong>
      <br><small>Server-Side Templating</small>
    </td>
     <td align="center">
      <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="JavaScript" width="65" height="65"/>
      </a>
      <br><strong>JavaScript (ES6+)</strong>
      <br><small>Client-Side Logic</small>
    </td>
  </tr>
  <tr>
    <td align="center">
      <a href="https://developer.mozilla.org/en-US/docs/Web/HTML">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/html5/html5-original-wordmark.svg" alt="HTML5" width="65" height="65"/>
      </a>
      <br><strong>HTML5</strong>
      <br><small>Markup Language</small>
    </td>
    <td align="center">
      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/css3/css3-original-wordmark.svg" alt="CSS3" width="65" height="65"/>
      </a>
      <br><strong>CSS3</strong>
      <br><small>Styling</small>
    </td>
    <td align="center">
      <a href="https://getbootstrap.com/">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/bootstrap/bootstrap-original-wordmark.svg" alt="Bootstrap" width="65" height="65"/>
      </a>
      <br><strong>Bootstrap 5</strong>
      <br><small>CSS Framework</small>
    </td>
    <td align="center">
      <a href="https://maven.apache.org/">
        <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/maven/maven-original-wordmark.svg" alt="Maven" width="65" height="65"/>
      </a>
      <br><strong>Maven</strong>
      <br><small>Build & Dependency Tool</small>
    </td>
  </tr>
</table>

---

## 📂 Project Structure

The project is organized following standard Maven and Spring Boot conventions with a clear separation of concerns.

```plaintext
todoapp/
│
├── .mvn/                   # Maven wrapper files
├── src/                    # Main source code and resources directory
│   └── main/
│       ├── java/
│       │   └── com/app/todoapp/
│       │       ├── controller/
│       │       │   └── TaskController.java   # Handles incoming web requests and returns responses
│       │       ├── models/
│       │       │   ├── Task.java             # The JPA entity representing a single task
│       │       │   └── Quote.java            # A simple data model for motivational quotes
│       │       ├── repository/
│       │       │   └── TaskRepository.java   # Spring Data JPA interface for database operations
│       │       ├── services/
│       │       │   └── TaskService.java      # Contains the core business logic for tasks
│       │       └── TodoappApplication.java   # The main entry point for the Spring Boot application
│       │
│       └── resources/
│           ├── static/                     # For static assets like CSS, JavaScript, and images
│           ├── templates/
│           │   └── tasks.html              # The main Thymeleaf template for the user interface
│           └── application.properties      # Configuration for the application (database, server port, etc.)
│
├── .gitignore              # Files and folders to be ignored by Git
├── pom.xml                 # Project dependencies and build configuration (Maven)
└── README.md               # Project documentation (you are here!)
```
---

## ⚙️ Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

Make sure you have the following installed on your machine:
* **Java Development Kit (JDK)** - Version 11 or newer (Project uses 17).
* **Apache Maven** - For building the project and managing dependencies.
* **Git** - For cloning the repository.

### Installation & Setup

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/todoapp.git](https://github.com/your-username/todoapp.git)
    ```

2.  **Navigate to the project directory:**
    ```sh
    cd todoapp
    ```

3.  **Build the project with Maven:**
    This command will download all the necessary dependencies.
    ```sh
    mvn clean install
    ```

4.  **Run the application:**
    ```sh
    mvn spring-boot:run
    ```
    The application will start on the default port `8080`.

5.  **Access the application:**
    Open your favorite web browser and navigate to:
    [http://localhost:8080](http://localhost:8080)

You should now see the Remind-Me application running!

---

## 👤 Author

**[Your Name]**

* **GitHub:** [@RandomSummer](https://github.com/RandomSummer)
* **LinkedIn:** [linkedin.com/in/sofiquee](https://linkedin.com/in/sk-sofiquee-f-31a859250)

Feel free to reach out if you have any questions or suggestions!