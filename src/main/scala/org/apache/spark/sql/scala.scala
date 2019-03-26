package org.apache.spark.sql

import org.apache.spark.sql.catalyst.expressions.Expression

object extensions {
  def withExpr(expr: Expression): Column = Column(expr)
}