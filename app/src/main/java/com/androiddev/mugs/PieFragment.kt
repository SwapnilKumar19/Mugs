package com.androiddev.mugs

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel


class PieFragment : Fragment() {

    lateinit var pieChart: PieChart

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_pie, container, false)

        pieChart = view.findViewById(R.id.piechart)

        setData()

        return view
    }

    private fun setData() {
        pieChart.addPieSlice(
            PieModel("Rajasthan", 40f, Color.parseColor("#4D61FC"))
        )
        pieChart.addPieSlice(
            PieModel("Mumbai", 30f, Color.parseColor("#EF5350"))
        )
        pieChart.addPieSlice(
            PieModel("Gujarat", 20f, Color.parseColor("#29B6F6"))
        )
        pieChart.addPieSlice(
            PieModel("Bangalore", 10f, Color.parseColor("#66bb6a"))
        )
    }


}