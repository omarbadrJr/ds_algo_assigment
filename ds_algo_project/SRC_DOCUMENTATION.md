# Source Code Documentation

## 🔗 Source Code Link on GitHub

**Repository:** [https://github.com/omarbadrJr/ds_algo_assigment.git](https://github.com/omarbadrJr/ds_algo_assigment.git)

---

This document provides comprehensive documentation for all Java programs in the `src` folder.

---

## 📁 Folder Structure

```
src/
├── PartOne/          (Array-based implementations)
│   ├── ArrayEx1.java
│   ├── ArrayEx2.java
│   └── ArrayEx3.java
└── PartTwo/          (ArrayList-based implementations)
    ├── ArrayListEx1.java
    ├── ArrayListEx2.java
    └── ArrayListEx3.java
```

---

## Part One: Array Examples

These programs demonstrate fundamental array operations using primitive `int[]` arrays.

### 📄 ArrayEx1.java - Array Sum Calculator

**Package:** `PartOne`  
**Purpose:** Calculate the sum of all elements in an array

**Features:**

- Accepts user input for array size
- Reads integer elements into an array
- Calculates and displays the sum of all elements

**Key Method:**

```java
public static void main(String[] args)
```

**Algorithm:**

1. Prompt user for number of elements
2. Create array of specified size
3. Read elements from user input
4. Iterate through array to calculate sum
5. Display the result

**Example Run:**

```
Enter number of elements: 5
Enter the elements:
10 20 30 40 50
Sum = 150
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 📄 ArrayEx2.java - Remove Duplicates from Sorted Array

**Package:** `PartOne`  
**Purpose:** Remove consecutive duplicate elements from a sorted array

**Features:**

- Accepts a sorted array from user
- Removes all consecutive duplicate values
- Returns a new array containing only unique elements
- Preserves the original order

**Key Methods:**

```java
public static void main(String[] args)
public static int[] removeDuplicates(int[] arr)
```

**Algorithm:**

1. Count unique elements by comparing consecutive values
2. Create new array with size equal to unique count
3. Copy non-duplicate elements to new array
4. Return the cleaned array

**Example Run:**

```
Enter number of elements: 7
Enter the sorted elements:
1 1 2 3 3 3 4
Array after removing duplicates:
1 2 3 4
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Important Note:** Array must be sorted for this algorithm to work correctly.

---

### 📄 ArrayEx3.java - Remove All Occurrences of an Element

**Package:** `PartOne`  
**Purpose:** Remove all occurrences of a specific element from an array

**Features:**

- Accepts user input for array elements
- Prompts for an element to remove
- Removes ALL instances of that element (not just first occurrence)
- Handles edge case of empty result array
- Returns a new array without the specified element

**Key Methods:**

```java
public static void main(String[] args)
public static int[] removeAllOccurrences(int[] arr, int element)
```

**Algorithm:**

1. Count elements that are NOT equal to target element
2. Create new array with appropriate size
3. Copy all elements except the target to new array
4. Return the filtered array

**Example Run:**

```
Enter the number of elements: 6
Enter 6 elements:
1 2 3 2 4 2
Enter the element to remove: 2
Array after removing all occurrences of 2:
1 3 4
```

**Edge Case Handling:**

- If all elements are removed, displays "Array is empty after removal."

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## Part Two: ArrayList Examples

These programs demonstrate the same operations using `ArrayList<Integer>`, showcasing Java Collections Framework.

### 📄 ArrayListEx1.java - ArrayList Sum Calculator

**Package:** `PartTwo`  
**Purpose:** Calculate the sum of all elements in an ArrayList

**Features:**

- Uses `ArrayList<Integer>` for dynamic sizing
- Demonstrates `.add()` and `.get()` methods
- Calculates sum using ArrayList operations

**Key Method:**

```java
public static void main(String[] args)
```

**Algorithm:**

1. Create empty ArrayList
2. Get number of elements from user
3. Add elements using `.add()` method
4. Calculate sum using `.get(i)` in loop
5. Display result

**Example Run:**

```
Enter the number of elements: 4
Enter 4 elements:
5 10 15 20
Sum of ArrayList elements: 50
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Advantages over Array:**

- Dynamic sizing (no need to specify size upfront)
- Built-in methods for easier manipulation

---

### 📄 ArrayListEx2.java - Remove Duplicates from Sorted ArrayList

**Package:** `PartTwo`  
**Purpose:** Remove consecutive duplicate elements from a sorted ArrayList

**Features:**

- Uses ArrayList's built-in methods
- Creates new ArrayList with unique elements
- Demonstrates `.equals()` method for comparison
- More flexible than array version

**Key Methods:**

```java
public static void main(String[] args)
public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
```

**Algorithm:**

1. Check if list is empty
2. Create new ArrayList for unique elements
3. Add first element
4. Iterate and add only elements different from previous
5. Return unique ArrayList

**Example Run:**

```
Enter the number of elements: 6
Enter 6 sorted elements:
1 1 2 2 3 3
ArrayList after removing duplicates:
1 2 3
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Key Difference from Array Version:**

- Uses `.equals()` instead of `!=` for comparison
- Works with Integer objects, not primitives
- More readable and maintainable code

---

### 📄 ArrayListEx3.java - Remove All Occurrences (ArrayList)

**Package:** `PartTwo`  
**Purpose:** Remove all occurrences of a specific element from an ArrayList

**Features:**

- Uses modern Java features
- Demonstrates `removeIf()` with lambda expression
- Modifies list in-place (no new ArrayList needed)
- Enhanced for-each loop for output
- Handles empty list edge case

**Key Methods:**

```java
public static void main(String[] args)
public static void removeAllOccurrences(ArrayList<Integer> list, int element)
```

**Algorithm:**

1. Use `removeIf()` with lambda: `list.removeIf(num -> num == element)`
2. Lambda expression checks each element
3. Removes all matching elements in one operation

**Example Run:**

```
Enter the number of elements: 5
Enter 5 elements:
1 2 3 2 4
Enter the element to remove: 2
Array after removing all occurrences of 2:
1 3 4
```

**Edge Case Handling:**

- Displays "Array is empty after removal." when all elements removed

**Time Complexity:** O(n)  
**Space Complexity:** O(1) - modifies in place

**Modern Java Features:**

- Lambda expression: `num -> num == element`
- `removeIf()` method (Java 8+)
- Enhanced for-each loop: `for (int num : numbers)`

**Key Advantage:**

- Much more concise than array version
- Functional programming approach
- No need to count or create new collection

---

## 🔍 Comparison: Arrays vs ArrayLists

| Aspect | Part One (Arrays) | Part Two (ArrayLists) |
|--------|-------------------|----------------------|
| **Data Structure** | `int[]` | `ArrayList<Integer>` |
| **Size** | Fixed at creation | Dynamic |
| **Memory** | Contiguous block | Dynamic allocation |
| **Type** | Primitives (`int`) | Objects (`Integer`) |
| **Syntax** | `arr[i]` | `list.get(i)` |
| **Methods** | Manual operations | Built-in methods |
| **Performance** | Faster (direct access) | Slight overhead (boxing/unboxing) |
| **Flexibility** | Limited | High |
| **Modern Features** | No | Yes (lambdas, streams) |

---

## 🎯 Learning Objectives

### Part One Teaches

- Array declaration and initialization
- Array traversal using loops
- Creating new arrays based on conditions
- Manual memory management
- Index-based operations

### Part Two Teaches

- ArrayList operations (add, get, size)
- Generic types (`<Integer>`)
- Object-oriented collection manipulation
- Lambda expressions
- Modern Java programming patterns

---

## 🚀 How to Compile and Run

### Compile All Files

```bash
# From project root
javac src/PartOne/*.java
javac src/PartTwo/*.java
```

### Run Individual Programs

**Part One:**

```bash
java -cp src PartOne.ArrayEx1
java -cp src PartOne.ArrayEx2
java -cp src PartOne.ArrayEx3
```

**Part Two:**

```bash
java -cp src PartTwo.ArrayListEx1
java -cp src PartTwo.ArrayListEx2
java -cp src PartTwo.ArrayListEx3
```

---

## 📝 Common Programming Patterns

### Input Pattern (Used in All Programs)

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = scanner.nextInt();
// ... process input
scanner.close();
```

### Array Creation Pattern

```java
// Part One
int[] arr = new int[size];

// Part Two
ArrayList<Integer> list = new ArrayList<>();
```

### Iteration Pattern

```java
// Part One
for (int i = 0; i < arr.length; i++) {
    // process arr[i]
}

// Part Two
for (int i = 0; i < list.size(); i++) {
    // process list.get(i)
}
```

---

## 🧪 Testing Suggestions

### Test Cases for All Programs

**Normal Cases:**

- Small arrays (3-5 elements)
- Medium arrays (10-20 elements)
- Large arrays (100+ elements)

**Edge Cases:**

- Empty array (size = 0)
- Single element
- All identical elements
- No duplicates
- Element not in array

**Special Cases:**

- Negative numbers
- Zero values
- Mixed positive and negative

---

## 🎓 Key Takeaways

1. **Arrays** are best when size is known and performance is critical
2. **ArrayLists** are best when size varies or flexibility is needed
3. Both approaches solve the same problems with different trade-offs
4. Modern Java (Part Two) offers more concise and readable code
5. Understanding both is essential for Java programming

---

## 📚 Related Concepts

- **Data Structures:** Arrays, Dynamic Arrays, Lists
- **Algorithms:** Linear Search, Duplicate Removal, Filtering
- **Java Features:** Generics, Lambda Expressions, Collections Framework
- **Complexity Analysis:** Time and Space Complexity

---

*Last Updated: October 31, 2025*
