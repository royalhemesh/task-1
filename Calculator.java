package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField num1Field, num2Field, resultField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public  void start(Stage primaryStage) {
    	 Label firstNumberLabel = new Label("First Number");
        num1Field = new TextField();
        Label secondNumberLabel = new Label("Second Number:");
        num2Field = new TextField();
        Label resultLabel = new Label("Result:");
        resultField = new TextField();
        resultField.setEditable(false);

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> add());

        Button subtractButton = new Button("Subtract");
        subtractButton.setOnAction(e -> subtract());

        Button multiplyButton = new Button("Multiply");
        multiplyButton.setOnAction(e -> multiply());

        Button divideButton = new Button("Divide");
        divideButton.setOnAction(e -> divide());

        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        layout1.getChildren().addAll(firstNumberLabel,num1Field,secondNumberLabel, num2Field,resultLabel,resultField);
        HBox layout2 =new HBox(10);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        layout2.getChildren().addAll(addButton, subtractButton, multiplyButton, divideButton);
        VBox layout=new VBox(layout1,layout2);
        layout.getChildren();

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void add() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 + num2;
        resultField.setText(String.valueOf(result));
    }

    private void subtract() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 - num2;
        resultField.setText(String.valueOf(result));
    }

    private void multiply() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 * num2;
        resultField.setText(String.valueOf(result));
    }

    private void divide() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        if (num2 != 0) {
            double result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } else {
            resultField.setText("Error: Division by zero");
        }
    }
}
