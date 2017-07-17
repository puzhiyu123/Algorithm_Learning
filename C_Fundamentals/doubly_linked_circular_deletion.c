/*
 * The following example shows deletion in a doubly
 *   linked list in a circular patten
 */

#include <stdio.h>

// delete first item
struct node * deleteFirst() {
    // save reference to first link
    struct node *temLink = head;

    if(head->next == head) {
        head == NULL;
        return temLink;
    }

    // mark next to first link as first
    head = head->next;

    // return to the deleted link
    return temLink;
}