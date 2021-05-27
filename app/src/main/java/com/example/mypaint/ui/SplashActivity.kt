package com.example.mypaint.ui

import com.example.mypaint.R
import com.stephentuso.welcome.BasicPage
import com.stephentuso.welcome.ParallaxPage
import com.stephentuso.welcome.WelcomeActivity
import com.stephentuso.welcome.WelcomeConfiguration


class SplashActivity : WelcomeActivity() {
    override fun configuration(): WelcomeConfiguration {
        return WelcomeConfiguration.Builder(this)
            .defaultTitleTypefacePath("Montserrat-Bold.ttf")
            .defaultHeaderTypefacePath("Montserrat-Bold.ttf")
            .page(
                BasicPage(
                    R.drawable.ic_front_desk_white,
                    "Welcome to Palette",
                    "An interactive palette for onboard, paint, design, and more..",
                )
                    .background(R.color.orange_background)
            )
            .page(
                BasicPage(
                    R.drawable.ic_thumb_up_white,
                    "Simple to use",
                    "Simple, easily understandable UI. Create anything!!"
                )
                    .background(R.color.red_background)
            )
            .page(
                ParallaxPage(
                    R.layout.parallax_example,
                    "Save RightAway",
                    "Save directly to your gallery, without fear of losing it."
                )
                    .lastParallaxFactor(2f)
                    .background(R.color.purple_background)
            )
            .page(
                BasicPage(
                    R.drawable.ic_edit_white,
                    "Customizable",
                    "All elements of the palette can be customized."
                )
                    .background(R.color.blue_background)
            )
            .swipeToDismiss(true)
            .exitAnimation(android.R.anim.fade_out)
            .build()
    }

    companion object {
        fun welcomeKey(): String {
            return "WelcomeScreen"
        }
    }
}