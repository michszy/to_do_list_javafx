package com.szychiewicz.todolist;

import com.szychiewicz.todolist.datamodel.TodoData;
import com.szychiewicz.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadLinePicker;

    public TodoItem processResult() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadLinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadLineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
