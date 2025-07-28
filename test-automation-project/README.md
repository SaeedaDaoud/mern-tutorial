# MERN QA Automation Challenge

This project demonstrates automated testing of a simple MERN web app using Selenium (for UI) and REST Assured (for API). The app allows users to log in and manage goals.

---

## 🚀 Project Structure

mern-tutorial/
├── backend/ # Node.js Express API
├── frontend/ # React.js Frontend
└── test-automation-project/ # Java-based Selenium & REST Assured tests


---

## 🧪 Setup Instructions (⏱️ ~1–2 Minutes)

### 1️⃣ Start Backend
```bash
cd backend
npm install
npm start

Ensure MongoDB is running locally (default port 27017).

2️⃣ Start Frontend
cd frontend
npm install
npm start
App runs at http://localhost:3000

3️⃣ Run Tests
Option A – From Eclipse:
Open test-automation-project in Eclipse.

Right-click testng.xml > Run As > TestNG Suite

Option B – From Command Line:
cd test-automation-project
mvn clean test
# OR
mvn test -DsuiteXmlFile=testng.xml

✅ Test Coverage
🔐 UI Automation
Using Selenium + TestNG, covers:

Login with valid and invalid credentials

Create a new goal

Edit an existing goal

Delete a goal

Assert expected content on the page

🌐 API Automation
Using REST Assured, covers:

POST /login – positive & negative

GET /goals – fetch all

POST /goals – create new

PUT /goals/:id – update existing

DELETE /goals/:id – delete goal

📄 Test Strategy
🧪 What is Being Tested
This project tests the basic functionalities of a MERN stack goal-setting app through both frontend and backend:

UI flows and validations

API responses and CRUD logic

Positive and negative test paths

🔧 Tools Used
| Area          | Tools            |
| ------------- | ---------------- |
| UI Automation | Selenium, TestNG |
| API Testing   | REST Assured     |
| Build         | Maven            |
| Language      | Java             |

📂 Test Coverage Areas
| Area       | Covered Scenarios                           |
| ---------- | ------------------------------------------- |
| Login      | Valid and invalid credentials (UI + API)    |
| Goals CRUD | Create, Edit, Delete, Fetch (UI + API)      |
| Assertions | Page content + API status codes & responses |

📄 How to Run Tests
Start both backend and frontend locally.

Use mvn test or run through Eclipse.

testng.xml organizes suites.

⚠️ Assumptions & Limitations
MongoDB must be installed and running locally.

Backend and frontend assumed to run on localhost:5000 and localhost:3000.

No 3rd-party test data seeding or database mocking.

👩‍💻 Author
Saeeda Daoud
📧 daoudsaeeda@gmail.com
🌍 Based in Cairo (U.S. Citizen)
