package models.country

case class WealthDetails(incomeGroup: String,
                         gdpPerAdult2016: Option[Int],
                         wealthPerAdult2000: Int,
                         weatlhPerAdult2016: Int,
                         totalWeatlh: Long,
                         shareOfWorldWealth2016: Double
                        )