package org.widok.moment

import scala.scalajs.js

trait Date extends js.Object {
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def isDate(): Boolean = js.native
  def format(): String = js.native
  def format(pattern: String): String = js.native
  def subtract(number: Int, unit: String): Date = js.native
  def startOf(unit: String): Date = js.native
  def endOf(unit: String): Date = js.native
  def calendar(): String = js.native
}