document.getElementById('search-button').addEventListener('click', async () => {
    const title = document.getElementById('search').value;
    const response = await fetch(`/movies/search?title=${title}`);
    const data = await response.json();

    if (data.Response === "True") {
        const movieList = document.getElementById('movie-list');
        movieList.innerHTML = `
            <div class="movie-result">
                <img src="${data.Poster}" alt="${data.Title} Poster">
                <div class="movie-title">${data.Title}</div>
                <div class="movie-info">Year: ${data.Year}</div>
                <div class="movie-info">Plot: ${data.Plot}</div>
                <div class="movie-info">Director: ${data.Director}</div>
                <div class="movie-info">Actors: ${data.Actors}</div>
                <div class="movie-info">Box Office: ${data.BoxOffice}</div>
                <div class="movie-info">Ratings: ${data.imdbRating}</div>
            </div>
        `;
    } else {
        document.getElementById('movie-list').innerHTML = "No movies found.";
    }
});
