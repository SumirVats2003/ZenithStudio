<img src="https://i.ibb.co/VBnLkFK/zblack.png" alt="zblack" border="0" height=80>

# Zenith Studio

Zenith Studio is an online coding platform developed as a solution for Tally
CodeBrewers as a part of the hackathon with the theme "The Commander of Full
Stack".

<details>
<summary>Problem Statement</summary>

Create an online coding platform that enables users to write and execute code.

- Platform should support at least one compiled language.
- User management is not required (login, sign-up, profile, etc.).

##### Coding Playground

- A place where users can play with code.
- Users can code in a code editor and execute it with custom inputs.
- Users can see errors, output and metrics like execution time & memory usage.

##### Coding Arena

- A place where users can practice their coding skills by solving various
  problems available on the platform.
- A user may upload their own coding problem along with its description,
  constraints and test cases.

##### Coding Battleground

- A place where users can compete in ongoing contests hosted on the platform to
  showcase their skills.
- Users can see real-time leaderboards.
- Any user can conduct their own contest.

</details>

## Tech stack and Resources used

This project makes use of the following technologies and resources:

- [ReactJS](https://reactjs.org/) - Frontend JavaScript Library
- [Vite](https://vitejs.dev/) - ReactJS Host
- [Monaco Editor](https://microsoft.github.io/monaco-editor/) - Library to help
  implement Code Editor
- [Material UI](https://mui.com/material-ui/) - Provide theming and UI design
- [Vercel](https://vercel.com/) - Frontend Hosting Provider
- [MongoDB](https://www.mongodb.com/) - DataBase
- [Spring Boot](https://spring.io/projects/spring-boot) - Backend API Library
  for Java
- [Railway](https://railway.app/) - Backend Hosting Provider
- [Postman](https://www.postman.com/) - API Testing Tool
- [Google Colour Picker](https://g.co/kgs/nWnbZgf) - Helped Selecting Colors for
  the UI
- [Canva](https://canva.com) - Creating Logo
- [Google Fonts](https://fonts.google.com/)

## How to Use

### View the [Live Demo](https://zenithstudio.vercel.app) of the developed application

### Installation Instructions

`NOTE: You can use the link provided above to view the application without having to install the project on your system`

- Clone the repository

  ```
  git clone git@github.com:SumirVats2003/ZenithStudio.git
  ```

- Install frontend(run the commands from the root directory of this repository)

  ```
  cd frontend
  npm install
  npm run dev
  ```

  Then, download the [frontend/.env](https://drive.google.com/drive/folders/1p1Ll5GGVPR-ykc3_NyGJjrdjBeF3flmD?usp=sharing) and place it in the `frontend` directory

- Install frontend(run the commands from the root directory of this repository)

  - Install maven

  ```
  cd backend
  mvn clean install
  mvn spring-boot:run
  ```

  Then, download the [backend/.env](https://drive.google.com/drive/folders/1p1Ll5GGVPR-ykc3_NyGJjrdjBeF3flmD?usp=sharing) and place it in the `backend` directory

## What we created

![Start Page](https://i.ibb.co/g9cQR1x/start-page.png)

![Home Page](https://i.ibb.co/VVR46nB/home-page.png)

![Login Page](https://i.ibb.co/Tbk8s5M/image.png)

![Registration Page](https://i.ibb.co/f4035Qq/image.png)

![After login](https://i.ibb.co/KFshg6v/image.png)

![Code Playground](https://i.ibb.co/n7JQTRn/playground.png)

![Coding Arena](https://i.ibb.co/Yh9WzSw/arena.png)

![Add a Problem](https://i.ibb.co/0JnQ8Zg/upload.png)

![Solve a Problem](https://i.ibb.co/BcKDMV7/image.png)

![Coding Battleground](https://i.ibb.co/pJjGBkR/image.png)

![Create Contest](https://i.ibb.co/2WnCp0B/image.png)

![Contest Page](https://i.ibb.co/zrZB00g/image.png)

![Leaderboard](https://i.ibb.co/1QcTgrC/image.png)

![API](https://i.ibb.co/dK0WfwR/image.png)

### Backend API Details

- GET `/api/users` – to fetch list of all users
- POST `/api/register` – to register a user
- POST `/api/login` – to login a user
- POST `/api/execute` – to execute and run a code
- POST `/api/java/execute` – to compile code using the JavaCompiler interface
- POST `/api/compile` – to compile code using jdoodle api
- POST `/api/problems/upload` – to upload a new coding problem
- GET `/api/problems` – to get lit of all problems
- GET `/api/problems/<problem_id>` - to get problem by id
- GET `/api/problem/search/text?text=<search_string>` - to search problems by keyword.
- POST `/api/contests/upload` – to upload a coding contest
- GET `/api/contests/all` – to get list of all contests
- GET `/api/contests/<contest_id>` - to get a contest detail by id
- POST `/api/contests/<contest_id>/submit` – to submit solution for a contest by a particular user
- GET `/api/contests/<contest_id>/leaderboard` – to get top three contestants of a contest

## References

### Frontend

- [Stackoverflow](https://stackoverflow.com/questions/69722578/react-converting-mongodb-date-to-human-readable-date) - Used to change the format of date and time stored by defualt in MongoDB
- [10Web](https://10web.io/blog/net-err_blocked_by_client-error/) - How to Fix the `Failed to Load Resources: net::ERR_BLOCKED_BY_CLIENT` Error
- [Monaco Docs](https://microsoft.github.io/monaco-editor/docs.html)- Helped integrating the editor to the application
- [ChatGPT](https://chatgpt.com/)- Helped integrating API calls from backend to the frontend, assited with styling and structuring web pages

### Backend

- [Stackoverflow](https://stackoverflow.com/questions/13467307/how-to-get-java-getruntime-exec-to-run-a-command-line-program-with-arguments) - Used to understand and integrate Runtime.getRuntime().exec for compiling code on the command line
- [Stackoverflow](https://stackoverflow.com/questions/4688123/how-to-open-the-command-prompt-and-insert-commands-using-java) - Provided insights on opening and interacting with the command prompt in Java
- [Stackoverflow](https://stackoverflow.com/questions/15464111/run-cmd-commands-through-java)- Helped with executing CMD commands through Java code
- [Geeks for Geeks](https://www.geeksforgeeks.org/java-program-to-create-a-file-with-a-unique-name/) – Assisted in generating unique file names for storing code submissions
- [Java Code Geeks](https://www.javacodegeeks.com/2015/09/java-compiler-api.html) – Guide for creating a Java compiler using the JavaCompiler interface.
- [Leetcode](https://leetcode.com/) – Used for adding coding problems to the project's database
- [ChatGPT](https://chatgpt.com/)- Generated temporary authentication APIs, Get mapping for leaderboard API, and inputs for the problems database. Also helped structure code

## Team Details

**Team Name**: Zenith

**Members:**

- [Sumir Vats](https://github.com/SumirVats2003) [Team Lead]
- [Anannya Hiteshi](https://github.com/Anannya410)
- [Nibras Hasan Zehra](https://github.com/Nibras11)
