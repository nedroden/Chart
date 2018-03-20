import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Chart extends Application {
    static XYChart.Series data1;
    static XYChart.Series data2;

    @Override
    public void start(Stage mainStage) {
        NumberAxis xAs = new NumberAxis(2000, 2008,1);
        NumberAxis yAs_verdrinken = new NumberAxis(0,140,20);
        //NumberAxis yAs_Cage = new NumberAxis(0,6,1);
        xAs.setLabel("Jaren");
        yAs_verdrinken.setLabel("Aantal scholen");
        LineChart lineChart = new LineChart(xAs, yAs_verdrinken);
        //LineChart lineChart_2 = new LineChart(xAs, yAs_Cage);

        data1 = new XYChart.Series();
        data1.setName("Verdrinkingen per jaar");

        data2 = new XYChart.Series();
        data2.setName("Aantal films waarin Nicholas Cage speelt");
        lineChart.getData().addAll(data1, data2);

        Group root = new Group(lineChart);
        Scene scene = new Scene(root, 800, 600);
        mainStage.setScene(scene);
        mainStage.show();

        Thread t1 = new Thread(new DataClass());
        t1.start();
    }
}