package com.logicalsapien.datastructures;

import java.util.Objects;

import com.logicalsapien.datastructures.exceptions.NoSuchElementException;
import lombok.Data;

/**
 * Linked list Sample implementation.
 *
 * @author  Elmo Yeldo
 * @version 1.0
 * @since   2020-02-01
 * @param <T> Data Input
 */
@Data
public class LinkedList<T> {

  /**
   * Head Node.
   */
  private LinkedListNode head;

  /**
   * Tail Node.
   */
  private LinkedListNode tail;

  /**
   * Add Data to the Linked List.
   * @param data Data
   */
  public void add(final T data) {
    LinkedListNode node = new LinkedListNode(data);
    if (Objects.isNull(head))  {
      this.head = node;
    }
    LinkedListNode previousTail = tail;
    if (Objects.nonNull(previousTail))  {
      previousTail.setNext(node);
    }
    this.tail = node;
  }

  /**
   * Remove Data from Linked List.
   * @param data Remove Data from the Linked List.
   */
  public void remove(final T data) {
    // if only one element present and that element needs to be remove
    if (head.getData() == data
          && Objects.isNull(head.getNext())) {
      head = null;
      tail = null;
      return;
    }

    LinkedListNode node = head;
    LinkedListNode previousNode = head;
    while (Objects.nonNull(node))  {
      if (node.getData() == data) {
        // found the element to be removed
        // replace it with next node
        if (Objects.nonNull(node.getNext())) {
          node.setData(node.getNext().getData());
          node.setNext(node.getNext().getNext());
        } else {
          // remove tail
          previousNode.setNext(null);
          this.tail = previousNode;
        }
        return;
      }
      previousNode = node;
      node = node.getNext();
    }

    // Reaching here means, the data could not be found
    throw new NoSuchElementException();
  }

}
