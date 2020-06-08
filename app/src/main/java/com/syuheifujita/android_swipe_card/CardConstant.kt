package com.syuheifujita.android_swipe_card

object CardConstant {

    fun getCard(): ArrayList<com.syuheifujita.android_swipe_card.CardModel> {
        val cardList = ArrayList<com.syuheifujita.android_swipe_card.CardModel>()

        val card1 = CardModel(
            "",
            "",
            ""
        )

        cardList.add(card1)

        val card2 = CardModel(
            "",
            "",
            ""
        )

        cardList.add(card2)

        val card3 = CardModel(
            "",
            "",
            ""
        )

        cardList.add(card3)

        return cardList
    }
}
