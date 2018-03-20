import javafx.application.Platform;
import javafx.scene.chart.XYChart;

class DataClass implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2000, 120));
                Chart.data2.getData().add(new XYChart.Data(2000, 2 * 20));
            } );

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2001, 102));
                Chart.data2.getData().add(new XYChart.Data(2001,2 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2002,98));
                Chart.data2.getData().add(new XYChart.Data(2002,3 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2003,85));
                Chart.data2.getData().add(new XYChart.Data(2003,1 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2004,95));
                Chart.data2.getData().add(new XYChart.Data(2004, 1 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2005,96));
                Chart.data2.getData().add(new XYChart.Data(2005,2 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2006,98));
                Chart.data2.getData().add(new XYChart.Data(2006, 3 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2007,123));
                Chart.data2.getData().add(new XYChart.Data(2007, 4 * 20));

            });

            Thread.sleep(500);
            Platform.runLater( () -> {
                Chart.data1.getData().add(new XYChart.Data(2008,95));
                Chart.data2.getData().add(new XYChart.Data(2008, 1 * 20));

            });
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}