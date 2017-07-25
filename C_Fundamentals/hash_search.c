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

// Search Operation

struct DataItem *search(int key) {
    // get the hash
    int hashIndex = hashCode(key);

    // move in array until an empty
    while(hashArray[hashIndex] != NULL) {

        if(hashArray[hashIndex]->key == key)
            return hashArray[hashIndex];

        // go to next cell
        ++hashIndex;

        // wrap around the table
        hashIndex %= SIZE;
    }

    return NULL;
}
