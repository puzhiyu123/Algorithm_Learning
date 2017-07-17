/*
 * This example demonstrates the deletion operations
 *   in a Doubly Linked List, the deletion happens
 *   at the beginning of a doubly linked list
 */

#include <stdio.h>

// delete first item
struct node* deleteFirst() {

    // save reference to first link
    struct node *tempLink = head;

    // if only one link
    if(head->next == NULL) {
        last = NULL;
    } else {
        head->next->prev = NULL;
    }

    head = head->next;

    // return the deleted link
    return tempLink;
}

