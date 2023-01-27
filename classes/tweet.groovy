package classes
@groovy.transform.ToString()

class tweet {

   String username
   String text
    Integer retweets
    Integer favourites
    Date createdon
     
       public tweet(String user, String tweet) {
        username = user
        text = tweet
        retweets = 0
        favourites = 0
        createdon = new Date()

     }

     void addtoretweets(){

        retweets +=1
     }

     void addtofavourites(){

        favourites +=1
     }


}

