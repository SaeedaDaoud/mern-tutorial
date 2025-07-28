# Test Plan for MERN Goal Setter App

## Overview

This test plan outlines the strategy and scope for automated testing of a small MERN stack web application (React frontend + Node.js backend API). The application allows users to log in and manage a list of goals (create, update, delete).

---

## Objectives

- Ensure that the UI behaves as expected for valid and invalid inputs.
- Validate core backend API endpoints for both happy and error paths.
- Ensure regression testing can be run consistently and independently.

---

## Tools & Frameworks

| Layer       | Tool/Framework        | Reason |
|-------------|------------------------|--------|
| UI Testing  | Selenium + TestNG (Java) | Robust and widely supported automation stack |
| API Testing | REST Assured (Java)      | Clean syntax, tight integration with TestNG |
| Test Runner | TestNG                  | Supports suites and multiple test layers |
| Backend     | Node.js, Express, MongoDB | Default stack used for app |

---

## Test Scope

### ✅ UI Tests
- Login with valid credentials
- Login with invalid credentials
- Create a new goal
- Edit an existing goal
- Delete a goal
- Assert presence of expected success messages or elements

### ✅ API Tests
- `POST /login`: valid and invalid credentials
- `GET /items`: retrieve existing items
- `POST /items`: create a new item (valid/missing fields)
- `PUT /items/:id`: update an existing item (valid/invalid)
- `DELETE /items/:id`: delete an item (valid/invalid)

---

## Test Data

- Test user credentials: `testuser@test.com` / `Test1234!`
- Goals created in test: "Drink water", "Read a book"

---

## Setup Instructions

1. Backend: `npm install && npm start` in `/backend`
2. Frontend: `npm install && npm start` in `/frontend`
3. MongoDB: Ensure local MongoDB is running on default port (27017)
4. Tests:
   - UI: `mvn test -DsuiteXmlFile=testng.xml`
   - API: `mvn test -Dtest=GoalAPITest`

---

## Assumptions / Limitations

- Data must be pre-seeded (test user should already exist in DB).
- Tests are currently run locally only.
- CI and coverage are not integrated (out of scope for this task).
