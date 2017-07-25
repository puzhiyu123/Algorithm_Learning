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

// Hash Insert Operation
void insert(int key,int data) {
    struct DataItem *item = (struct DataItem*) malloc(sizeof(struct DataItem));
    item->data = data;
    item->key = key;

    //get the hash
    int hashIndex = hashCode(key);

    //move in array until an empty or deleted cell
    while(hashArray[hashIndex] != NULL && hashArray[hashIndex]->key != -1) {
        //go to next cell
        ++hashIndex;

        //wrap around the table
        hashIndex %= SIZE;
    }

    hashArray[hashIndex] = item;
}