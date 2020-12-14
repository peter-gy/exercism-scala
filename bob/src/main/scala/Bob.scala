import scala.util.matching.Regex

object Bob {
  val patternAnswerMap: Map[Regex, String] = Map(
    "^[^a-z]+$".r -> "Whoa, chill out!", // any non-lowercase characters
    "^.*\\?$".r -> "Sure.", // any sequence of characters ended by a question mark
    "^[ ]*$".r -> "Fine. Be that way!", // Empty string: 0 to multiple blanks
  )
  val defaultAnswer: String = "Whatever."
  def response(statement: String): String = {
    val matchedPattern = patternAnswerMap.keys.filter(_.findFirstIn(statement).isDefined)
    if (matchedPattern.isEmpty) defaultAnswer
    else patternAnswerMap(matchedPattern.toSeq.head)
  }
}
