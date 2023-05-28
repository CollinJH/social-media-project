

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

## Questions:
1. What data structures did you use and why
<font size ="1"> 
- Arraylist in chosen for one, as it will make the addition and remvoval of friends simple
- HasedDictionary is chosen for the second, this will store the profiles, where the key will be the firstName and the value being the profile object
- This will allow for search for profiles based on firstName
- A hashed implementation will be better suited for this, this is because when searching for profiles preservation of insertion order is not important
- This will allow us a constant O(1) search time until hash collisions occur (multiple users of the same name)
</font>

2. Show in your code where you used these data structures and where you created objects of their classes
3. Is an array, a data structure? Why?
4. What is a data structure?
5. What is/are the difference(s) between an Array and an ArrayList?
6. What is/are the difference(s) between a LinkedList and ArrayList?
7. What is the difference between a stack and a queue?
8. What is Algorithm complexity? How many complexities are there?
9. What is the difference between Data Structure's and ADT's

