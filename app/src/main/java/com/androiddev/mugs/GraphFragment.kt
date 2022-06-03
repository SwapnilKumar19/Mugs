package com.androiddev.mugs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries


class GraphFragment : Fragment() {

    lateinit var janBtn : Button
    lateinit var febBtn : Button
    lateinit var marBtn : Button
    lateinit var aprBtn : Button
    lateinit var mayBtn : Button
    lateinit var junBtn : Button
    lateinit var julBtn : Button
    lateinit var augBtn : Button
    lateinit var sepBtn : Button
    lateinit var octBtn : Button
    lateinit var novBtn : Button
    lateinit var decBtn : Button
    lateinit var graphView: GraphView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_graph, container, false)
        janBtn = view.findViewById(R.id.janBtn)
        febBtn = view.findViewById(R.id.febBtn)
        marBtn = view.findViewById(R.id.marBtn)
        aprBtn = view.findViewById(R.id.aprBtn)
        mayBtn = view.findViewById(R.id.mayBtn)
        junBtn = view.findViewById(R.id.junBtn)
        julBtn = view.findViewById(R.id.julBtn)
        augBtn = view.findViewById(R.id.augBtn)
        sepBtn = view.findViewById(R.id.sepBtn)
        octBtn = view.findViewById(R.id.octBtn)
        novBtn = view.findViewById(R.id.novBtn)
        decBtn = view.findViewById(R.id.decBtn)
        graphView = view.findViewById(R.id.graphXY)


        val janseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 32.1),
                DataPoint(2.0, 32.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 32.1),
                DataPoint(7.0, 23.1),
                DataPoint(8.0, 32.1),
                DataPoint(9.0, 32.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 13.1),
                DataPoint(19.0, 14.1),
                DataPoint(20.0, 32.1),
                DataPoint(21.0, 4.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 19.0),
                DataPoint(24.0, 32.1),
                DataPoint(25.0, 17.0),
                DataPoint(26.0, 32.1),
                DataPoint(27.0, 32.1),
                DataPoint(28.0, 6.0),
                DataPoint(29.0, 30.0),
                DataPoint(30.0, 2.0),
                DataPoint(31.0, 3.0)
            )
        )
        val febseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 8.1),
                DataPoint(2.0, 2.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 26.1),
                DataPoint(7.0, 25.1),
                DataPoint(8.0, 4.5),
                DataPoint(9.0, 15.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 5.1),
                DataPoint(13.0, 2.1),
                DataPoint(14.0, 1.0),
                DataPoint(15.0, 0.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 2.1),
                DataPoint(18.0, 3.1),
                DataPoint(19.0, 4.1),
                DataPoint(20.0, 3.1),
                DataPoint(21.0, 14.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 13.0),
                DataPoint(24.0, 22.1),
                DataPoint(25.0, 67.0),
                DataPoint(26.0, 52.1),
                DataPoint(27.0, 32.1),
                DataPoint(28.0, 6.0),
            )
        )
        val marseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 22.1),
                DataPoint(2.0, 12.1),
                DataPoint(3.0, 12.0),
                DataPoint(4.0, 4.0),
                DataPoint(5.0, 60.0),
                DataPoint(6.0, 2.1),
                DataPoint(7.0, 3.1),
                DataPoint(8.0, 12.1),
                DataPoint(9.0, 52.1),
                DataPoint(10.0, 5.1),
                DataPoint(11.0, 6.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 1.0),
                DataPoint(15.0, 17.1),
                DataPoint(16.0, 3.1),
                DataPoint(17.0, 9.3),
                DataPoint(18.0, 12.1),
                DataPoint(19.0, 74.1),
                DataPoint(20.0, 32.1),
                DataPoint(21.0, 24.0),
                DataPoint(22.0, 21.0),
                DataPoint(23.0, 29.0),
                DataPoint(24.0, 37.1),
                DataPoint(25.0, 12.0),
                DataPoint(26.0, 37.1),
                DataPoint(27.0, 38.1),
                DataPoint(28.0, 6.0),
                DataPoint(29.0, 40.0),
                DataPoint(30.0, 22.0),
                DataPoint(31.0, 31.0)
            )
        )
        val aprseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 1.0),
                DataPoint(2.0, 32.0),
                DataPoint(3.0, 1.0),
                DataPoint(4.0, 32.0),
                DataPoint(5.0, 1.0),
                DataPoint(6.0, 32.0),
                DataPoint(7.0, 1.0),
                DataPoint(8.0, 32.0),
                DataPoint(9.0, 1.0),
                DataPoint(10.0, 32.0),
                DataPoint(11.0, 1.0),
                DataPoint(12.0, 32.0),
                DataPoint(13.0, 1.0),
                DataPoint(14.0, 32.0),
                DataPoint(15.0, 1.0),
                DataPoint(16.0, 32.0),
                DataPoint(17.0, 1.0),
                DataPoint(18.0, 32.0),
                DataPoint(19.0, 1.0),
                DataPoint(20.0, 32.0),
                DataPoint(21.0, 1.0),
                DataPoint(22.0, 32.0),
                DataPoint(23.0, 1.0),
                DataPoint(24.0, 32.0),
                DataPoint(25.0, 1.0),
                DataPoint(26.0, 32.0),
                DataPoint(27.0, 1.0),
                DataPoint(28.0, 32.0),
                DataPoint(29.0, 1.0),
                DataPoint(30.0, 32.0),
            )
        )
        val mayseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 12.1),
                DataPoint(2.0, 12.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 10.0),
                DataPoint(5.0, 10.0),
                DataPoint(6.0, 12.1),
                DataPoint(7.0, 13.1),
                DataPoint(8.0, 12.1),
                DataPoint(9.0, 12.1),
                DataPoint(10.0,13.1),
                DataPoint(11.0, 11.1),
                DataPoint(12.0, 17.1),
                DataPoint(13.0, 12.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 19.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 13.1),
                DataPoint(19.0, 14.1),
                DataPoint(20.0, 12.1),
                DataPoint(21.0, 14.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 19.0),
                DataPoint(24.0, 12.1),
                DataPoint(25.0, 17.0),
                DataPoint(26.0, 12.1),
                DataPoint(27.0, 12.1),
                DataPoint(28.0, 16.0),
                DataPoint(29.0, 10.0),
                DataPoint(30.0, 12.0),
                DataPoint(31.0, 13.0)
            )
        )
        val junseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 12.1),
                DataPoint(2.0, 22.1),
                DataPoint(3.0, 36.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 50.0),
                DataPoint(6.0, 62.1),
                DataPoint(7.0, 63.1),
                DataPoint(8.0, 12.1),
                DataPoint(9.0, 22.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 41.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 62.1),
                DataPoint(14.0, 71.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 29.1),
                DataPoint(17.0, 32.1),
                DataPoint(18.0, 43.1),
                DataPoint(19.0, 54.1),
                DataPoint(20.0, 62.1),
                DataPoint(21.0, 74.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 29.0),
                DataPoint(24.0, 32.1),
                DataPoint(25.0, 47.0),
                DataPoint(26.0, 52.1),
                DataPoint(27.0, 62.1),
                DataPoint(28.0, 76.0),
                DataPoint(29.0, 10.0),
                DataPoint(30.0, 2.0),
            )
        )
        val julseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 19.1),
                DataPoint(2.0, 19.2),
                DataPoint(3.0, 19.3),
                DataPoint(4.0, 19.4),
                DataPoint(5.0, 19.5),
                DataPoint(6.0, 19.6),
                DataPoint(7.0, 19.7),
                DataPoint(8.0, 19.8),
                DataPoint(9.0, 19.9),
                DataPoint(10.0, 19.0),
                DataPoint(11.0, 19.1),
                DataPoint(12.0, 19.2),
                DataPoint(13.0, 19.3),
                DataPoint(14.0, 19.4),
                DataPoint(15.0, 19.5),
                DataPoint(16.0, 19.6),
                DataPoint(17.0, 19.7),
                DataPoint(18.0, 19.8),
                DataPoint(19.0, 19.9),
                DataPoint(20.0, 19.0),
                DataPoint(21.0, 19.1),
                DataPoint(22.0, 19.2),
                DataPoint(23.0, 19.3),
                DataPoint(24.0, 19.4),
                DataPoint(25.0, 19.5),
                DataPoint(26.0, 19.6),
                DataPoint(27.0, 19.7),
                DataPoint(28.0, 19.8),
                DataPoint(29.0, 19.9),
                DataPoint(30.0, 19.0),
                DataPoint(31.0, 19.1)
            )
        )
        val augseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 32.1),
                DataPoint(2.0, 32.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 32.1),
                DataPoint(7.0, 23.1),
                DataPoint(8.0, 32.1),
                DataPoint(9.0, 32.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 13.1),
                DataPoint(19.0, 14.1),
                DataPoint(20.0, 32.1),
                DataPoint(21.0, 4.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 19.0),
                DataPoint(24.0, 32.1),
                DataPoint(25.0, 17.0),
                DataPoint(26.0, 32.1),
                DataPoint(27.0, 32.1),
                DataPoint(28.0, 6.0),
                DataPoint(29.0, 30.0),
                DataPoint(30.0, 2.0),
                DataPoint(31.0, 3.0)
            )
        )
        val sepseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 32.1),
                DataPoint(2.0, 32.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 32.1),
                DataPoint(7.0, 23.1),
                DataPoint(8.0, 32.1),
                DataPoint(9.0, 32.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 13.1),
                DataPoint(19.0, 14.1),
                DataPoint(20.0, 32.1),
                DataPoint(21.0, 4.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 19.0),
                DataPoint(24.0, 32.1),
                DataPoint(25.0, 17.0),
                DataPoint(26.0, 32.1),
                DataPoint(27.0, 32.1),
                DataPoint(28.0, 6.0),
                DataPoint(29.0, 30.0),
                DataPoint(30.0, 2.0),
            )
        )
        val octseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 32.1),
                DataPoint(2.0, 32.1),
                DataPoint(3.0, 16.0),
                DataPoint(4.0, 40.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 32.1),
                DataPoint(7.0, 23.1),
                DataPoint(8.0, 32.1),
                DataPoint(9.0, 32.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 13.1),
                DataPoint(19.0, 14.1),
                DataPoint(20.0, 32.1),
                DataPoint(21.0, 4.0),
                DataPoint(22.0, 11.0),
                DataPoint(23.0, 19.0),
                DataPoint(24.0, 32.1),
                DataPoint(25.0, 17.0),
                DataPoint(26.0, 32.1),
                DataPoint(27.0, 32.1),
                DataPoint(28.0, 6.0),
                DataPoint(29.0, 30.0),
                DataPoint(30.0, 2.0),
                DataPoint(31.0, 3.0)
            )
        )
        val novseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 0.0),
                DataPoint(2.0, 1.0),
                DataPoint(3.0, 2.0),
                DataPoint(4.0, 3.0),
                DataPoint(5.0, 4.0),
                DataPoint(6.0, 5.0),
                DataPoint(7.0, 6.0),
                DataPoint(8.0, 7.0),
                DataPoint(9.0, 8.0),
                DataPoint(10.0, 9.0),
                DataPoint(11.0, 10.0),
                DataPoint(12.0, 11.0),
                DataPoint(13.0, 12.0),
                DataPoint(14.0, 13.0),
                DataPoint(15.0, 14.0),
                DataPoint(16.0, 15.0),
                DataPoint(17.0, 16.0),
                DataPoint(18.0, 17.0),
                DataPoint(19.0, 18.0),
                DataPoint(20.0, 19.0),
                DataPoint(21.0, 20.0),
                DataPoint(22.0, 21.0),
                DataPoint(23.0, 22.0),
                DataPoint(24.0, 23.0),
                DataPoint(25.0, 24.0),
                DataPoint(26.0, 25.0),
                DataPoint(27.0, 26.0),
                DataPoint(28.0, 27.0),
                DataPoint(29.0, 28.0),
                DataPoint(30.0, 29.0),
            )
        )
        val decseries: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf( // on below line we are adding
                // each point on our x and y axis.
                DataPoint(1.0, 1.1),
                DataPoint(2.0, 0.1),
                DataPoint(3.0, 1.0),
                DataPoint(4.0, 22.0),
                DataPoint(5.0, 0.0),
                DataPoint(6.0, 32.1),
                DataPoint(7.0, 22.1),
                DataPoint(8.0, 13.1),
                DataPoint(9.0, 21.1),
                DataPoint(10.0, 3.1),
                DataPoint(11.0, 31.1),
                DataPoint(12.0, 57.1),
                DataPoint(13.0, 32.1),
                DataPoint(14.0, 11.0),
                DataPoint(15.0, 10.1),
                DataPoint(16.0, 9.1),
                DataPoint(17.0, 12.1),
                DataPoint(18.0, 11.1),
                DataPoint(19.0, 10.1),
                DataPoint(20.0, 21.1),
                DataPoint(21.0, 24.0),
                DataPoint(22.0, 12.0),
                DataPoint(23.0, 19.9),
                DataPoint(24.0, 30.1),
                DataPoint(25.0, 12.0),
                DataPoint(26.0, 10.1),
                DataPoint(27.0, 30.1),
                DataPoint(28.0, 16.0),
                DataPoint(29.0, 30.0),
                DataPoint(30.0, 23.0),
                DataPoint(31.0, 35.0)
            )
        )

        graphView.addSeries(janseries)
        graphView.title = "January"
        graphView
        graphView.titleTextSize = 30.0f

        janBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(janseries)
            graphView.title = "January"
            graphView
            graphView.titleTextSize = 30.0f
        }
        febBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(febseries)
            graphView.title = "February"
            graphView.titleTextSize = 30.0f
        }
        marBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(marseries)
            graphView.title = "March"
            graphView.titleTextSize = 30.0f
        }
        aprBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(aprseries)
            graphView.title = "April"
            graphView.titleTextSize = 30.0f
        }
        mayBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(mayseries)
            graphView.title = "May"
            graphView.titleTextSize = 30.0f
        }
        junBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(junseries)
            graphView.title = "June"
            graphView.titleTextSize = 30.0f
        }
        julBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(julseries)
            graphView.title = "July"
            graphView.titleTextSize = 30.0f
        }
        augBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(augseries)
            graphView.title = "August"
            graphView.titleTextSize = 30.0f
        }
        sepBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(sepseries)
            graphView.title = "September"
            graphView.titleTextSize = 30.0f
        }
        octBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(octseries)
            graphView.title = "October"
            graphView.titleTextSize = 30.0f
        }
        novBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(novseries)
            graphView.title = "November"
            graphView.titleTextSize = 30.0f
        }
        decBtn.setOnClickListener {
            graphView.removeAllSeries()
            graphView.addSeries(decseries)
            graphView.title = "December"
            graphView.titleTextSize = 30.0f
        }
        return view
    }


}