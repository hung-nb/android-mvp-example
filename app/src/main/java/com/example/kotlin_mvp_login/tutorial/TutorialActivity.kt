package com.example.kotlin_mvp_login.tutorial

import android.graphics.Color
import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_mvp_login.R

import kotlinx.android.synthetic.main.activity_tutorial.*
import kotlinx.android.synthetic.main.fragment_tutorial.view.*
import android.support.v4.view.ViewPager.OnPageChangeListener



class TutorialActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        container.adapter = mSectionsPagerAdapter
        container.addOnPageChangeListener(object : OnPageChangeListener {

            val viewBtn1 = this@TutorialActivity?.tutorialBtn1
            val viewBtn2 = this@TutorialActivity?.tutorialBtn2
            val viewBtn3 = this@TutorialActivity?.tutorialBtn3

            // This method will be invoked when a new page becomes selected.
            override fun onPageSelected(position: Int) {
                // Update dot color
                if (position === 0) {
                    viewBtn1?.setColorFilter(Color.parseColor("#0099CC"))
                    viewBtn2?.setColorFilter(Color.parseColor("#aaaaaa"))
                    viewBtn3?.setColorFilter(Color.parseColor("#aaaaaa"))
                } else if (position === 1) {
                    viewBtn1?.setColorFilter(Color.parseColor("#aaaaaa"))
                    viewBtn2?.setColorFilter(Color.parseColor("#0099CC"))
                    viewBtn3?.setColorFilter(Color.parseColor("#aaaaaa"))
                } else if (position === 2) {
                    viewBtn1?.setColorFilter(Color.parseColor("#aaaaaa"))
                    viewBtn2?.setColorFilter(Color.parseColor("#aaaaaa"))
                    viewBtn3?.setColorFilter(Color.parseColor("#0099CC"))
                }
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

    class PlaceholderFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val rootView = inflater.inflate(R.layout.fragment_tutorial, container, false)
            rootView.section_label.text = getString(
                R.string.section_format, arguments?.getInt(
                    ARG_SECTION_NUMBER
                ))
            return rootView
        }

        companion object {
            private val ARG_SECTION_NUMBER = "section_number"

            fun newInstance(sectionNumber: Int): PlaceholderFragment {
                val fragment = PlaceholderFragment()
                val args = Bundle()
                args.putInt(ARG_SECTION_NUMBER, sectionNumber)
                fragment.arguments = args
                return fragment
            }
        }
    }
}
