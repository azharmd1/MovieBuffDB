
**MovieBuffDB**

MovieBuffDB is a web application that leverages the Open Movie Database (OMDb) API to provide users with a wealth of movie information. The application enables users to search for their favorite films and access details such as box office collections, ratings, plot summaries, and more.

---

**Table of Contents:**

- [Features](#features)
- [Setup and Run Instructions](#setup-and-run-instructions)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Assumptions and Decisions](#assumptions-and-decisions)
- [Screenshots](#screenshots)
- [API Reference](#api-reference)
- [Technologies Used](#technologies-used)

---

## Features

- **Search Movies:** Users can search for movies by title and retrieve detailed information including box office collections, ratings, and plot summaries.

- **Movie Posters:** Displays movie posters alongside the information.

- **Live Application:** The backend is hosted on Railway for seamless access.

---

## Setup and Run Instructions

1\. **Clone the repository:**

```bash

git clone https://github.com/azharmd1/MovieBuffDB.git

```

2\. **Navigate to the project directory:**

```bash

cd MovieBuffDB

```

3\. **Add API Key:**

- Obtain an API key from the OMDb API.

- Replace the placeholder in the `application.properties` file:

```properties

omdb.api.key=6c9c6e96

```

4\. **Run the application:**

- In the IDE (like IntelliJ or Eclipse) or via the terminal with the following command:

```bash

./mvnw spring-boot:run

```

---

## Prerequisites

- Java JDK 11 or higher.

- Maven.

---

## Usage

1\. **Search Movies:**  

Use the search bar to find movie information by title.

2\. **View Movie Details:**  

Click on the search button to display details such as the movie's ratings, plot summary, and box office collections.

---

## Assumptions and Decisions


- **Assumptions:**

  - If certain data like box office earnings is unavailable via the OMDb API, it is assumed that the information is either unavailable or not applicable for the movie.

- **Decisions:**

  - The application uses a free background image from Unsplash to enhance the UI.

---

## Screenshots
<img width="1384" alt="image" src="https://github.com/user-attachments/assets/34ead5b1-962c-4603-8613-10d66164627d">

1\. **Screenshot 1:** Main Search Page


<img width="1427" alt="image" src="https://github.com/user-attachments/assets/7abca316-d3e8-406f-8dcc-3fbf3602664a">

2\. **Screenshot 2:** Detailed Movie Information

---

## API Reference

1\. **OMDb API:**

   - **Movie Search Endpoint:**


   https://www.omdbapi.com/?t={movie_title}&apikey={API_KEY}

   Purpose: Retrieve movie information based on the movie title.

   - **Movie Poster Endpoint:**


   https://img.omdbapi.com/?i={movie_id}&apikey={API_KEY}

   Purpose: Retrieve movie poster images.

---

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript.

- **Backend:** Java, Spring Boot.

- **API:** OMDb API for retrieving movie data.

- **Hosting:** Railway (backend hosting).

- **Others:** Unsplash for background images.

