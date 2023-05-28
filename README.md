

# Social Media Project

This project will incorporate the design and implementation of an application that maintains the data for a simple social media network.

## Criteria:

1. Each person in the network will have a profile
2. Each profile will have a name, an image, current status, and a list of friends

3. The applcation will allow the user to join the network, leave the network, create a profile, modify the profile, search for other profiles, and add or remove friends

4. This project will not use imported data structures, only those I have written before

## Design Idea:

The Data structures I will be using will be a List and a Dictionary

- Create: Add profile - Add friends
- Read: Read the information of a profile - Search for other profiles
- Update: Update and edit the profile - Update the friends list
- Delete: Delete a profile - Delete a friend of a profile

## How to use
1. git clone the repo into a directory
2. compile and execute network.java

## Questions:
1. What data structures did you use and why
- Arraylist in chosen for one, as it will make the addition and remvoval of friends simple
- HasedDictionary is chosen for the second, this will store the profiles, where the key will be the firstName and the value being the profile object
- This will allow for search for profiles based on firstName
- A hashed implementation will be better suited for this, this is because when searching for profiles preservation of insertion order is not important
- This will allow us a constant O(1) search time, as well as permit duplicates and hash collisions from occuring (profiles with the same name)

2. Show in your code where you used these data structures and where you created objects of their classes
- The social network class creates a hashed dictionary
- The class has personally implemented methods that allow the manipulation of profile data
- A new profile object can join, leave, modify etc
- This is done by associated the profile object username as the key to the corresponding entire profile value

- I used the ArrayList to manipulate the friends list inside the Profile class
- I also used the ArrayList to iterate over each profile name to return an array of all the profile names from the Dictionary

3. Is an array, a data structure? Why?
- Yes an array is a data structure, it is a way of organizing and storing data in computers memory
- This can then be accessed and manipulated

4. What is a data structure?
- A data structure is a way of storing and organizing data into computer memory
- It is done so it can be easily accessed and manipulated to suit the needs of the program

5. What is/are the difference(s) between an Array and an ArrayList?
- Size
- Array are fixed in size, determined from the time they are created, it will not be changed afterwards
- ArrayLists can grow and shrink dynamically
- Type
- Arrays can store any primitive types as well as objects
- ArrayLists can only store objects
- Memory Allocation
- Arrays are allocated as a continuous block of memory
- ArrayLists are allocated like an array but can manage memory dynamically
- In all ArrayLists are more flexibly and can dynamically adapt to the programmers needs

6. What is/are the difference(s) between a LinkedList and ArrayList?
- ArrayLists use an array to store elements while a LinkedList uses Nodes
- When an ArrayList reaches capacity it must create a new Array of larger size
- A linkedlist will dynamically allocate memory resources for each additional node

7. What is the difference between a stack and a queue?
- A stack in LIFO, A queue in FIFO
- The operation are different, push and pop for a stack, enqueue and dequeue for a queue.

8. What is Algorithm complexity? How many complexities are there?
- Algorithm complexity is the analysis of the performances of the characteristics of an algorithm.
- How runtime and memory requirements scale with its input size
- There are two complexities, Time and Space complexity

9. What is the difference between Data Structure's and ADT's
- The difference lies in abstraction and perspective
- A data structure is a concrete imlementation of an abstract data type
- rather an abstract data type is more high level, and involves the conceptual logic behind a data type

