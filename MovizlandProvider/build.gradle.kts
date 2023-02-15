plugins {
    id("org.jetbrains.kotlin.android")
}
version = 5
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = "Not recommended for series."
    authors = listOf( "Spoonge" )
	
	language = "ar"

    status = 1

    tvTypes = listOf( "TvSeries" , "Movie" , "Anime" , "AsianDrama" )

    iconUrl = "https://www.google.com/s2/favicons?domain=movizland.online&sz=%size%"
}
