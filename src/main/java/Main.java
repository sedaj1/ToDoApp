import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    private ObservableList<Task> taskList = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(15);
        root.setPadding(new Insets(15));

        TextField taskInputField = new TextField();
        taskInputField.setPromptText("Írd ide a feladat nevét...");

        Button addButton = new Button("+");
        addButton.setPrefWidth(40);

        HBox topBar = new HBox(10, taskInputField, addButton);
        HBox.setHgrow(taskInputField, Priority.ALWAYS);

        TableView<Task> tableView = new TableView<>();
        TableColumn<Task, String> taskColumn = new TableColumn<>("Feladatok");
        taskColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableView.getColumns().add(taskColumn);

        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setVgrow(tableView, Priority.ALWAYS);
        tableView.setItems(taskList);

        addButton.setOnAction(e -> {
            String text = taskInputField.getText().trim();
            if (!text.isEmpty()) {
                taskList.add(new Task(text));
                taskInputField.clear();
            }
        });

        Button doneButton = new Button("Kész");
        doneButton.setMaxWidth(Double.MAX_VALUE);

        doneButton.setOnAction(e -> {
            Task selectedTask = tableView.getSelectionModel().getSelectedItem();
            if (selectedTask != null) {
                selectedTask.setDone(true);
                tableView.refresh();
            }
        });

        tableView.setRowFactory(tv -> new TableRow<Task>() {
            @Override
            protected void updateItem(Task item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null && item.isDone()) {
                    setStyle("-fx-background-color: lightgreen;");
                } else {
                    setStyle("");
                }
            }
        });

        root.getChildren().addAll(topBar, tableView, doneButton);

        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("To Do App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Task {
    private String name;
    private boolean done;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}