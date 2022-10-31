package com.cydeo.Repository;

import com.cydeo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name
 Optional<Movie> findByName(String name);

    //Write a derived query to list all movies between a range of prices
List<Movie> findAllByPriceBetween(BigDecimal price, BigDecimal price2);

    //Write a derived query to list all movies where duration exists in the specific list of duration
List<Movie> findAllByDurationIn(List<Integer> durations);

    //Write a derived query to list all movies with higher than a specific release date


    //Write a derived query to list all movies with a specific state and type


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices
    @Query("select m from Movie m where m.price between ?1 and ?2")
List<Movie> getmoviesinrange(@Param("price1") BigDecimal price1, @Param("price2") BigDecimal price2);

    //Write a JPQL query that returns all movie names


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name


    //Write a native query that return the list of movies in a specific range of prices


    //Write a native query to return all movies where duration exists in the range of duration


    //Write a native query to list the top 5 most expensive movies


}
