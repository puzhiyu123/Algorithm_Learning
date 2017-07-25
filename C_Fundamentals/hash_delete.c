/*
 * Hash Search Algorithm
 */

// DataItem
struct DataItem {
    int data;
    int key;
};

// Hash Method
int hashCode(int key) {
    return key % SIZE;
}

// Hash Delete Operation
