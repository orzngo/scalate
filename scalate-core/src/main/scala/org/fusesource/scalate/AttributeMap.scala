package org.fusesource.scalate

/**
 * Represents a small map like thing which is easy to implement on top of any attribute storage mechanism without
 * having to implement a full Map interface. Note that these methods should use the same arguments and return types
 * as their corresponding methods in the mutable Map
 *
 * @version $Revision : 1.1 $
 */

trait AttributeMap[A, B] {
  
  /**
   * Retries an optional entry for the given attribute
   */
  def get(key: A): Option[B]

  /**
   * Retrieves the value of the given attribute
   */
  def apply(key: A): B

  /**
   * Updates the value of the given attribute
   */
  def update(key: A, value: B): Unit

  /**
   * Removes an attribute
   */
  def remove(key: A): Option[B]
}