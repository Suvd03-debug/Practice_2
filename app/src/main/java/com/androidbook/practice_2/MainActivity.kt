package com.androidbook.practice_2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var ivObjCrown: ImageView
    private lateinit var ivObjNecklace: ImageView
    private lateinit var ivObjDress: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivObjCrown = findViewById(R.id.ivObjCrown)
        ivObjNecklace = findViewById(R.id.ivObjNecklace)
        ivObjDress = findViewById(R.id.ivObjDress)

        resetItems()
    }

    // 아이템을 선택했을 때 호출되는 메서드
    fun onClickChoice(view: View) {
        when (view.id) {
            // 드레스를 선택한 경우
            R.id.imageViewDress1 -> {
                ivObjDress.visibility = View.VISIBLE
                ivObjDress.setImageResource(R.drawable.dress1)
            }
            R.id.imageViewDress2 -> {
                ivObjDress.visibility = View.VISIBLE
                ivObjDress.setImageResource(R.drawable.dress2)
            }
            R.id.imageViewDress3 -> {
                ivObjDress.visibility = View.VISIBLE
                ivObjDress.setImageResource(R.drawable.dress3)
            }

            // 목걸이를 선택한 경우
            R.id.imageViewNecklace1 -> {
                ivObjNecklace.visibility = View.VISIBLE
                ivObjNecklace.setImageResource(R.drawable.necklace1)
            }
            R.id.imageViewNecklace2 -> {
                ivObjNecklace.visibility = View.VISIBLE
                ivObjNecklace.setImageResource(R.drawable.necklace2)
            }

            // 왕관을 선택한 경우
            R.id.imageViewCrown1 -> {
                ivObjCrown.visibility = View.VISIBLE
                ivObjCrown.setImageResource(R.drawable.crown1)
            }
            R.id.imageViewCrown2 -> {
                ivObjCrown.visibility = View.VISIBLE
                ivObjCrown.setImageResource(R.drawable.crown2)
            }
        }
    }

    // 다시하기 버튼: 캐릭터 초기화
    fun onClickReset(view: View) {
        resetItems()
    }

    private fun resetItems() {
        ivObjCrown.visibility = View.INVISIBLE
        ivObjNecklace.visibility = View.INVISIBLE
        ivObjDress.visibility = View.INVISIBLE
    }
}