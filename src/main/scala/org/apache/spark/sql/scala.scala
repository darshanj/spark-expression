package org.apache.spark.sql

import org.apache.spark.sql.catalyst.expressions.{Expression, GenArrayData}
import org.apache.spark.sql.types.UserDefinedType

object extensions {
  def withExpr(expr: Expression): Column = Column(expr)
  object GenArrayDataCodeGen {
    val genCodeToCreateArrayData = GenArrayData.genCodeToCreateArrayData _
  }
}
object UserDefinedTypes {
  abstract class UserDefinedTypesPublic[UserType >: Null] extends UserDefinedType[UserType]
}