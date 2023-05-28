## Design of Project

** start Profile Class **

Profile Class

    declare an array of status options
    declare three separate integers to identify status option

    declare instance variables to be used in constructor
    name
    status
    List<friends>

    constructor
        construct will set name to name input
        status will be initially set to online
        and list of friends create a new arraylist of friends that will be empty

    // getters and setters

    // satisfy conditions create, read, update, and delete

    getList<friends>

    addFriend

    removeFriend

** end Profile Class **

** start Network Class **

Network Class

    This class will have main inside
    This class will also act as a network simulation
    The class we pre load some profiles into the social network class
    After preloading a simulation of a already running network
    We will create a new menu object of the menu class
    This is where the user will be given the choice to move around the application


** end Network class **


** start SocialNetwork class **

SocialNetwork Class

    This class will be doing a lot of the work of the program
    This HashedDictionary will map the profile name to the profile object
    Thus we will be able to search, create, and delete profiles with ease

    joinNetwork inserts a profile into the dictionary
    leaveNetwork removes profile from the dictionary based on profile name


** end SocialNetwork class **

** start Menu class **

Menu Class

    This class will take in the bank of users from the generated network
    it will allow the user to manipulate this bank of users and create new users through choice of input

    there will be a system menu

    there will be a user menu, after the user has picked a profile to login into


** end Menu class **




