package com.logicalsapien.datastructures;

import com.logicalsapien.datastructures.exceptions.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Linked List Test class.
 *
 * @author  Elmo Yeldo
 * @version 1.0
 * @since   2020-02-01
 */
public class LinkedListTest {

  /**
   * Linked List Add Head test.
   */
  @Test
  void linkedListAddHeadTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    Assertions.assertEquals("Str1", linkedList.getHead().getData());
    Assertions.assertEquals("Str1", linkedList.getTail().getData());
  }

  @Test
  void linkedListAddDataTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    linkedList.add("Str2");
    linkedList.add("Str3");
    Assertions.assertEquals("Str1", linkedList.getHead().getData());
    Assertions.assertEquals("Str3", linkedList.getTail().getData());
  }

  @Test
  void removeHeadTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    linkedList.remove("Str1");
    Assertions.assertEquals(null, linkedList.getHead());
    Assertions.assertEquals(null, linkedList.getTail());
  }

  @Test
  void removeTailTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    linkedList.add("Str2");
    linkedList.add("Str3");
    linkedList.remove("Str3");
    Assertions.assertEquals("Str1", linkedList.getHead().getData());
    Assertions.assertEquals("Str2", linkedList.getTail().getData());
  }

  @Test
  void removeMidElementTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    linkedList.add("Str2");
    linkedList.add("Str3");
    linkedList.add("Str4");
    linkedList.remove("Str2");
    Assertions.assertEquals("Str3", linkedList.getHead().getNext().getData());
    Assertions.assertEquals("Str1", linkedList.getHead().getData());
    Assertions.assertEquals("Str4", linkedList.getTail().getData());
  }

  @Test
  void removeMidElementNoElementTestTest() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Str1");
    linkedList.add("Str2");
    linkedList.add("Str3");
    Assertions.assertThrows(NoSuchElementException.class, () -> {
      linkedList.remove("Str4");
    });
  }


}
