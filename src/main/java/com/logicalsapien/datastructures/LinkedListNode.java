package com.logicalsapien.datastructures;

import lombok.Data;

/**
 * Linked List implementation.
 *
 * @author  Elmo Yeldo
 * @version 1.0
 * @since   2020-02-01
 * @param <T> Data Input
 */
@Data
public class LinkedListNode<T> {

  /**
   * Nest Node.
   */
  private LinkedListNode next;

  /**
   * Data.
   */
  private T data;

  /**
   * Linked Link Node constructor.
   * @param dataToAdd Linked List Node Data
   */
  public LinkedListNode(final T dataToAdd) {
    this.data = dataToAdd;
  }
}
