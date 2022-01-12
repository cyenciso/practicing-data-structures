# Properties
**Static Array**
* fixed in size
* zero-indexed
* each element can be accessed by its index

**Dynamic Array**
* dynamic in size
* zero-indexed
* each element can be accessed by its index
* elements can be added
* elements can be removed
* has a capacity as well as a length

# Complexity

**Static Array**
* Accessing: O(1)
* Searching: O(n)

**Dynamic Array**
* Accessing: O(1)
* Searching: O(n)
* Appending: O(1) most of the time unless array is full, otherwise O(n)
* Insertion: O(n)
	* (might involve shifting)
* Deletion: O(n) 
	* (might involve shifting)
