/*
 * The following example shows insertion in a doubly
 *   linked list in a circular patten
 */

#include <stdio.h>

// insert link at the first location
void insertFirst(int key, int data) {
    // create a link
    struct node *link = (struct node*) malloc(sizeof(struct node));
    link->key = key;
    link->data = data;

    if(isEmpty()) {
        head = link;
        head->next = head;
    } else {
        // point it to the old first node
        link->next = head;

        // point first to new first node
        head = link;
    }
}