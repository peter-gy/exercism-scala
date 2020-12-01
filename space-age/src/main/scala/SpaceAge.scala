object SpaceAge {

  val periodMap = Map(
    "Mercury" -> 0.2408467,
    "Venus" -> 0.61519726,
    "Earth" -> 1.0,
    "Mars" -> 1.8808158,
    "Jupiter" -> 11.862615,
    "Saturn" -> 29.447498,
    "Uranus" -> 84.016846,
    "Neptune" -> 164.79132
  )

  val EARTH_YEAR_IN_SECONDS = 31557600

  def onPlanet(planet: String, seconds: Double) = seconds / EARTH_YEAR_IN_SECONDS / periodMap(planet)
  def onMercury(seconds: Double) = onPlanet("Mercury", seconds)
  def onVenus(seconds: Double) = onPlanet("Venus", seconds)
  def onEarth(seconds: Double) = onPlanet("Earth", seconds)
  def onMars(seconds: Double) = onPlanet("Mars", seconds)
  def onJupiter(seconds: Double) = onPlanet("Jupiter", seconds)
  def onSaturn(seconds: Double) = onPlanet("Saturn", seconds)
  def onUranus(seconds: Double) = onPlanet("Uranus", seconds)
  def onNeptune(seconds: Double) = onPlanet("Neptune", seconds)
}
