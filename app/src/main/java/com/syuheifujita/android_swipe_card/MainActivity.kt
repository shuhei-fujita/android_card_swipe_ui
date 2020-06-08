package com.syuheifujita.android_swipe_card

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kidach1.tinderswipe.model.CardModel
import com.kidach1.tinderswipe.model.CardModel.OnCardDismissedListener
import com.kidach1.tinderswipe.view.CardContainer
import com.kidach1.tinderswipe.view.CardContainer.OnLikeListener
import com.kidach1.tinderswipe.view.SimpleCardStackAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardModel = CardModel(
            "TinderSwipe",
            "Description for card.",
            "http://example.com/example.png"
        ) // title, desc, imgUrl

        val cardAdapter = SimpleCardStackAdapter(this)
        cardAdapter.add(cardModel)

        val cardContainer = findViewById(R.id.cardContainer) as CardContainer
        cardContainer.adapter = cardAdapter

    }

    private fun addDissmissListener(cardModel: CardModel) {
        cardModel.onCardDismissedListener = object : OnCardDismissedListener {
            override fun onLike(callback: OnLikeListener) {
                Log.i("", "I like the card")
            }

            override fun onDislike() {
                Log.i("", "I dislike the card")
            }
        }
    }
}
