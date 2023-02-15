plugins {
    id("org.jetbrains.kotlin.android")
}
version = 6
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = ""
    authors = listOf( "ImZaw" )

	language = "ar"
	
    status = 1

    tvTypes = listOf( "TvSeries" , "Movie" , "Anime" , "AsianDrama" )

    iconUrl = "https://www.google.com/s2/favicons?domain=faselhd.io&sz=%size%"
}