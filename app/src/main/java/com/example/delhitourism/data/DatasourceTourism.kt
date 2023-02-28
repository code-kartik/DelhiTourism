package com.example.delhitourism.data

import com.example.delhitourism.R
import com.example.delhitourism.model.Tour

class Datasource{

    fun loadData(): List<Tour> {
        return listOf(
            Tour(R.string.card1Name.toString(), R.string.card1CS.toString(), R.string.card1Dist, R.string.card1details.toString(), R.drawable.india_gate, false),
            Tour(R.string.card2Name.toString(), R.string.card2CS.toString(), R.string.card2Dist, R.string.card2details.toString(), R.drawable.qutub_minar, false),
            Tour(R.string.card3Name.toString(), R.string.card3CS.toString(), R.string.card3Dist, R.string.card3details.toString(), R.drawable.rastrapati_bhavan, false),
            Tour(R.string.card4Name.toString(), R.string.card4CS.toString(), R.string.card4Dist, R.string.card4details.toString(), R.drawable.red_fort, false),
            Tour(R.string.card5Name.toString(), R.string.card5CS.toString(), R.string.card5Dist, R.string.card5details.toString(), R.drawable.jantar_mantar, false),
            Tour(R.string.card6Name.toString(), R.string.card6CS.toString(), R.string.card6Dist, R.string.card6details.toString(), R.drawable.national_zoological_park, false),
            Tour(R.string.card7Name.toString(), R.string.card7CS.toString(), R.string.card7Dist, R.string.card7details.toString(), R.drawable.lotus_temple, false),
            Tour(R.string.card8Name.toString(), R.string.card8CS.toString(), R.string.card8Dist, R.string.card8details.toString(), R.drawable.national_meseum, false),
            Tour(R.string.card9Name.toString(), R.string.card9CS.toString(), R.string.card9Dist, R.string.card9details.toString(), R.drawable.railway_museum, false),
            Tour(R.string.card10Name.toString(), R.string.card10CS.toString(), R.string.card10Dist, R.string.card10details.toString(), R.drawable.museum_of_illusions, false),
            Tour(R.string.card11Name.toString(), R.string.card11CS.toString(), R.string.card11Dist, R.string.card11details.toString(), R.drawable.agrasen_ki_baoli, false),
            Tour(R.string.card12Name.toString(), R.string.card12CS.toString(), R.string.card12Dist, R.string.card12details.toString(), R.drawable.akshardham_mandir, false),
            Tour(R.string.card13Name.toString(), R.string.card13CS.toString(), R.string.card13Dist, R.string.card13details.toString(), R.drawable.banglasahib_gurudwara, false),
            Tour(R.string.card14Name.toString(), R.string.card14CS.toString(), R.string.card14Dist, R.string.card14details.toString(), R.drawable.birla_mandir, false)
        )
    }
}