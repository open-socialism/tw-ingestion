package aggregator

import models.WealthBracketType
import models.country.CountryData

object Wenao1PercentWealthAggregator {
  def process(countryData: Vector[CountryData]) : Long = {
    countryData
      .filter(_.isWenao)
      .map(countryToWealthBracketTotal)
      .sum
  }

  def countryToWealthBracketTotal(countryData: CountryData) : Long = {
    val totalWealth = countryData.wealthDetails.totalWeatlh

    val bracket = countryData.wealthBracketDetails
                    .filter((wb) => wb.bracket == .01 && wb.bracketType == WealthBracketType.Top)
                    .head

    (totalWealth * bracket.value).toLong
  }
}
