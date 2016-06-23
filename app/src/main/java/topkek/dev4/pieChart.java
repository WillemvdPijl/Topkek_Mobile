//package topkek.dev4;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.AppCompatActivity;
//
//import com.github.mikephil.charting.charts.BarChart;
//import com.github.mikephil.charting.charts.PieChart;
//import com.github.mikephil.charting.data.BarData;
//import com.github.mikephil.charting.data.BarDataSet;
//import com.github.mikephil.charting.data.BarEntry;
//import com.github.mikephil.charting.data.Entry;
//import com.github.mikephil.charting.data.PieData;
//import com.github.mikephil.charting.data.PieDataSet;
//import com.github.mikephil.charting.*;
//import com.github.mikephil.charting.utils.ColorTemplate;
//
//import java.util.ArrayList;
//
//public class pieChart extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_pie_chart);
//        PieChart chart = (PieChart) findViewById(R.id.chart);
//
//        PieData data = new PieData(getXAxisValues(), getDataSet());
//        chart.setData(data);
//        chart.setDescription("My Chart");
//        chart.animateXY(2000, 2000);
//        chart.invalidate();
//    }
//
//    private ArrayList<PieDataSet> getDataSet() {
//        ArrayList<PieDataSet> dataSets = null;
//        ArrayList<Entry> entries = new ArrayList<>();
//
//
//        entries.add(new Entry(4f, 0));
//        entries.add(new Entry(8f, 1));
//        entries.add(new Entry(6f, 2));
//        entries.add(new Entry(2f, 3));
//        entries.add(new Entry(18f, 4));
//        entries.add(new Entry(9f, 5));
//
//
////        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
////        BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
////        valueSet2.add(v2e1);
////        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
////        valueSet2.add(v2e2);
////        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
////        valueSet2.add(v2e3);
////        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
////        valueSet2.add(v2e4);
////        BarEntry v2e5 = new BarEntry(20.000f, 4); // May
////        valueSet2.add(v2e5);
////        BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
////        valueSet2.add(v2e6);
//
//        PieDataSet pieDataSet1 = new PieDataSet(entries, "Brand 1");
//        pieDataSet1.setColor(Color.rgb(0, 155, 0));
////        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
////        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        dataSets = new ArrayList<>();
//        dataSets.add(pieDataSet1);
////        dataSets.add(pieDataSet2);
//        return dataSets;
//    }
//
//    private ArrayList<String> getXAxisValues() {
//        ArrayList<String> xAxis = new ArrayList<>();
//        xAxis.add("JAN");
//        xAxis.add("FEB");
//        xAxis.add("MAR");
//        xAxis.add("APR");
//        xAxis.add("MAY");
//        xAxis.add("JUN");
//        return xAxis;
//    }
//}