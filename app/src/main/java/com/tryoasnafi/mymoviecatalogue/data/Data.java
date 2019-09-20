package com.tryoasnafi.mymoviecatalogue.data;

import com.tryoasnafi.mymoviecatalogue.pojo.Movie;
import com.tryoasnafi.mymoviecatalogue.pojo.TvShow;

import java.util.ArrayList;

public class Data {
    public static String[][] movieData = new String[][]{
            {"A Star Is Born", "7.7", "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.", "Bradley Cooper", "October 5, 2018", "2h 15min", "Drama, Romance, Music", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg"},
            {"Alita: Battle Angel", "7.4", "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.", "Robert Rodriguez", "February 14, 2019", "2h 2min", "Action, Sci-Fi, Thriller, Adventure", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg"},
            {"Aquaman", "7.0", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.", "James Wan", " December 21, 2018", "2h 24min", "Action, Adventure, Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"},
            {"Bohemian Rhapsody", "8.0", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.", "Bryan Singer"," October 30, 2018", "2h 15min", "Drama, Music", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"},
            {"Creed II", "7.2", "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.", "Steven Caple Jr."," November 14, 2018", "2h 10min", "Action, Drama, Sports", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg"},
            {"Glass", "6.7", "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.", "M. Night Shyamalan"," January 18, 2019", "2h 9min", "Thriller, Drama, Sci-Fi", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg"},
            {"Master Z: Ip Man Legacy", "6.5", "Following his defeat by Master Ip, Cheung Tin Chi (Zhang) tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it s not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.", "Yuen Woo-ping"," April 12, 2019", "1h 47min", "Action, Crime", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6VxEvOF7QDovsG6ro9OVyjH07LF.jpg"},
            {"Mortal Engines", "6.1", "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.", "Christian Rivers"," December 14, 2018", "2h 9min", "Action, Adventure, Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"},
            {"Ralph Breaks the Internet", "7.1", "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.", "Phil Johnston"," November 5, 2018", "1h 52min", "Animation, Comedy, Family", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg"},
            {"Serenity", "7.1", "Baker Dill is a fishing boat captain leading tours off a tranquil, tropical enclave called Plymouth Island. His quiet life is shattered, however, when his ex-wife Karen tracks him down with a desperate plea for help.", "Steven Knight"," January 25, 2019", "1h 46min", "Thriller, Mystery", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"},
            {"T-34", "6.3", "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.", "Aleksey Sidorov"," December 27, 2018", "2h 19min", "Action, War", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jqBIHiSglRfNxjh1zodHLa9E7zW.jpg"}

    };


    public static String[][] tvShowData = new String[][]{
            {"Arrow", "7.6", "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.", "Greg Berlanti, Marc Guggenheim, Andrew Kreisberg", "October 10, 2012", "42min","170eps (8 Seasons)","Action, Adventure, Crime, Drama, Mystery ", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"},
            {"Doom Patrol", "8.1", "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.", "Jeremy Carver", "February 15, 2019", "60min","15eps (1 Season)","Action, Adventure, Fantasy, Sci-Fi ", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg"},
            {"Fairy Tail", "8.0", "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.", "Hiro Mashima, Masashi Sogo", "October 12, 2009", "25min","339eps (8 Seasons)","Action, Adventure, Animation, Comedy, Fantasy, Sci-Fi ", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg"},
            {"The Flash", "7.8", "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.", "Greg Berlanti, Geoff Johns, Andrew Kreisberg", "October 7, 2014", "44min","125eps (6 Seasons)","Action, Drama, Fantasy, Sci-Fi ", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg"},
            {"Gotham", "7.8", "Before there was Batman, there was GOTHAM.\n" + "\n" +"Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?", "Bruno Heller", "September 22, 2014", "43min, 60min","100eps (5 Seasons)","Drama, Fantasy, Crime ", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg"},
            {"Grey\'s Anatomy", "7.6", "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital. A drama centered on the personal and professional lives of five surgical interns and their supervisors.", "Shonda Rhimes", "March 27, 2005", "43min","344eps (16 Seasons)","Drama, Romance", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eqgIOObafPJitt8JNh1LuO2fvqu.jpg"},
            {"Hanna", "7.6", "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.", "David Farr", "March 28, 2019", "50min","9eps (1 Season)","Action, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg"},
            {"NCIS", "7.8", "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.", "Donald P. Bellisario, Don McGill", "September 23, 2003", "45min","379eps (17 Seasons)","Action, Adventure, Crime, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eoj15m14Zpf2bUWXqNIs7itZK9w.jpg"},
            {"Shameless", "8.6", "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.", "Paul Abbott", "January 9, 2011", "60min,50min","122eps (10 Seasons)","Comedy, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iRyQTp2L437k6zfFCvZSOWaxQFA.jpg"},
            {"Supergirl", "6.4", "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.", "Ali Adler, Greg Berlanti, Andrew Kreisberg", "October 26, 2015", "42min","109eps (5 Seasons)","Action, Adventure, Drama, Sci-Fi", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"},
            {"The Umbrella Academy", "8.0", "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more. A family of former child heroes, now grown apart, must reunite to continue to protect the world.", "Steve Blackman, Jeremy Slater", "February 15, 2019", "60min","10eps (1 Season)","Action, Adventure, Sci-Fi, Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg"}

    };


    public static ArrayList<Movie> getListMovieData() {
        ArrayList<Movie> movieList = new ArrayList<>();
        for (String[] data : movieData) {
            Movie movie = new Movie();
            movie.setTitle(data[0]);
            movie.setScore(data[1]);
            movie.setOverview(data[2]);
            movie.setDirector(data[3]);
            movie.setRelease(data[4]);
            movie.setRuntime(data[5]);
            movie.setGenre(data[6]);
            movie.setPoster(data[7]);

            movieList.add(movie);
        }
        return movieList;
    }

    public static ArrayList<TvShow> getListTvShowData() {
        ArrayList<TvShow> tvShowsList = new ArrayList<>();
        for (String[] data : tvShowData) {
            TvShow tvShow = new TvShow();
            tvShow.setTitle(data[0]);
            tvShow.setScore(data[1]);
            tvShow.setOverview(data[2]);
            tvShow.setCreator(data[3]);
            tvShow.setRelease(data[4]);
            tvShow.setRuntime(data[5]);
            tvShow.setEpisode(data[6]);
            tvShow.setGenre(data[7]);
            tvShow.setPoster(data[8]);

            tvShowsList.add(tvShow);
        }
        return tvShowsList;
    }
}