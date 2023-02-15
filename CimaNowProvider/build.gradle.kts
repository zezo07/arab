plugins {
    id("org.jetbrains.kotlin.android")
}
version = 1
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = ""
    authors = listOf( "ImZaw" )

	language = "ar"
	
    status = 1

    tvTypes = listOf( "TvSeries" , "Movie" )

    iconUrl = "https://www.google.com/s2/favicons?domain=cimanow.cc&sz=%size%"
}