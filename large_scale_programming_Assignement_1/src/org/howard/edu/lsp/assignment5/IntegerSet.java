package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	/**
     * Default constructor that initializes the IntegerSet.
     */
	public IntegerSet() {
	}

	/**
     * Constructor that initializes the IntegerSet with a pre-existing list of
     * integers.
     * 
     * @param set the list of integers used to initialize the set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	/**
     * Clears the set, removing all elements from it.
     */
    public void clear() {
        set.clear();
    }
	
    /**
     * Returns the number of elements in the set.
     * 
     * @return the length of the set.
     */
	public int length() {
		return set.size();
	}; // returns the length
	
	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class.
	*/
	public boolean equals(Object o) {
        IntegerSet otherSet = (IntegerSet) o;
        if (this.length() != otherSet.length()) {
            return false;
        }

        for (Integer element : set) {
            if (!otherSet.contains(element)) {
                return false;
            }
        }

        return true;
        }; 
	
    /**
     * Checks whether the set contains the given value.
     * 
     * @param value the integer to check for in the set.
     * @return true if the set contains the value, false otherwise.
     */
	public boolean contains(int value) {
		return set.contains(value);
	};    
	
	/**
     * Returns the largest element in the set.
     * 
     * @return the largest integer in the set.
     */
	public int largest()  {
		int largest = set.get(0);
		for (int num : set) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest;
    }; 
	
    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest integer in the set.
     */
	public int smallest()  {
		int smallest = set.get(0);
		for (int num : set) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	};
	
    /**
     * Adds an element to the set. If the element already exists, the set remains unchanged.
     * 
     * @param item the integer to be added to the set.
     */
	public void add(int item) {
		if (!set.contains(item)) {
            set.add(item);
        }
	}; // adds item to the set or does nothing if it is in set
	
	/**
     * Removes an element from the set. If the element does not exist, the set remains unchanged.
     * 
     * @param item the integer to be removed from the set.
     */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}; 
	
    /**
     * Performs the union operation between two sets, adding all elements from the
     * provided set that are not already in this set.
     * 
     * @param intSetb the set to be united with the current set.
     */
	public void union(IntegerSet intSetb) {
		for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
	};
	
	/**
     * Performs the intersection operation between two sets, keeping only the
     * elements that are present in both sets.
     * 
     * @param intSetb the set to intersect with the current set.
     */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 
	
	/**
     * Performs the difference operation between two sets, removing all elements
     * from the current set that are also present in the provided set.
     * 
     * @param intSetb the set to subtract from the current set.
     */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	} // set difference, i.e. s1 - s2
	
	/**
     * Performs the complement operation, returning all elements that are not in the
     * current set.
     * 
     * @param intSetb the set to compare with the current set.
     */
	public void complement(IntegerSet intSetb) {
		ArrayList<Integer> complementSet = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                complementSet.add(item);
            }
        }
        set.clear();
        set.addAll(complementSet);
	}
	
	/**
     * Checks whether the set is empty.
     * 
     * @return true if the set is empty, false otherwise.
     */
	boolean isEmpty() {
		return set.isEmpty();
	} 
	
	/**
     * Returns a string representation of the set.
     * 
     * @return a string displaying the elements in the set.
     */
	public String toString() {
		return set.toString();
	};	// return String representation of your set
}
