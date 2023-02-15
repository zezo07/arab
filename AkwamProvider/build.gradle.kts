plugins {
    id("org.jetbrains.kotlin.android")
}
version = 2
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = ""
    authors = listOf( "Blatzar" )
	
	language = "ar"
	
    status = 1

    tvTypes = listOf( "TvSeries" , "Movie" , "Anime" , "Cartoon" )

    iconUrl = "https://www.google.com/s2/favicons?domain=akwam.to&sz=%size%"
}