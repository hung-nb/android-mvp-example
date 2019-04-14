package com.example.kotlin_mvp_login.tutorial.View

import android.graphics.Color
import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle
import com.example.kotlin_mvp_login.R

import kotlinx.android.synthetic.main.activity_tutorial.*
import android.support.v4.view.ViewPager.OnPageChangeListener
import com.example.kotlin_mvp_login.tutorial.Presenter.TutorialPresenterImpl

class TutorialActivity : AppCompatActivity(), ITutorialView {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null
    private val tutorialPresenter = TutorialPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        container.adapter = mSectionsPagerAdapter
        container.addOnPageChangeListener(object : OnPageChangeListener {

            // This method will be invoked when a new page becomes selected.
            override fun onPageSelected(position: Int) {
                // Update dot color
                tutorialPresenter.setActiveIndicator(position)
            }

            // This method will be invoked when the current page is scrolled
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                // Code goes here
            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            override fun onPageScrollStateChanged(state: Int) {
                // Code goes here
            }
        })
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(
                position + 1
            )
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            return 3
        }
    }

    override fun onSetActiveIndication(position: Int) {
        when (position) {
            0 -> {
                tutorialBtn1?.setColorFilter(Color.parseColor("#0099CC"))
                tutorialBtn2?.setColorFilter(Color.parseColor("#aaaaaa"))
                tutorialBtn3?.setColorFilter(Color.parseColor("#aaaaaa"))
            }
            1 -> {
                tutorialBtn1?.setColorFilter(Color.parseColor("#aaaaaa"))
                tutorialBtn2?.setColorFilter(Color.parseColor("#0099CC"))
                tutorialBtn3?.setColorFilter(Color.parseColor("#aaaaaa"))
            }
            2 -> {
                tutorialBtn1?.setColorFilter(Color.parseColor("#aaaaaa"))
                tutorialBtn2?.setColorFilter(Color.parseColor("#aaaaaa"))
                tutorialBtn3?.setColorFilter(Color.parseColor("#0099CC"))
            }
        }
    }
}
