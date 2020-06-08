package com.syuheifujita.android_swipe_card

object CardConstant {

    fun getCard(): ArrayList<com.syuheifujita.android_swipe_card.CardModel> {
        val cardList = ArrayList<com.syuheifujita.android_swipe_card.CardModel>()

        val card1 = CardModel(
            1,
            "",
            "",
            ""
        )

        cardList.add(card1)

        val card2 = CardModel(
            2,
            "",
            "",
            ""
        )

        cardList.add(card2)

        val card3 = CardModel(
            3,
            "",
            "",
            ""
        )

        cardList.add(card3)

        return cardList
    }
}