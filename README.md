# MovieBuffDB

## Introduction
MovieBuffDB is a web application that leverages the Open Movie Database (OMDb) API to provide users with a wealth of movie information. The application enables users to search for their favorite films and access details such as box office collections, ratings, plot summaries, and more.

## Technologies Used
The project uses various technologies:
- **Frontend:** Used HTML, CSS, and JavaScript for the UI.
- **Backend:** Developed with Java and Spring Boot, for a robust server-side structure.
- **API:** Utilizes the OMDb API for getting movie data.
- **Hosting:** The backend is hosted on Railway for better experience within free tier.

## Live Application
The live application can be accessed at: [MovieBuffDB](https://moviebuffdb-production.up.railway.app/)

## Project Setup
To set up and run the application locally:

1. Ensure Java JDK 11 or higher is installed and open the project in an IDE like IntelliJ or Eclipse.

2. Add the required dependencies in the `pom.xml` file if they are not already present.

3. Configure the OMDb API key by signing up at OMDb API to obtain an API key. This key is added to the `application.properties` file:
   ```properties
   omdb.api.key=YOUR_API_KEY
The application can be run from the IDE or via the command line using:

Run the application from the IDE or via the command line using the command: `./mvnw spring-boot:run`.

## Prerequisites
To work with the project, Java JDK 11 or higher and Maven are required.

## Dependencies


1. Spring Boot Starter Web
3. Spring Boot Starter Test

## Notes on Data Sources
Movie data is retrieved from the OMDb API, and a background image for the application is taken for free from Unsplash.

## Assumptions 
In cases where certain movie data, such as box office earnings, is not available through the OMDb API, it is assumed that such information is either unavailable or not applicable for the selected movie.
