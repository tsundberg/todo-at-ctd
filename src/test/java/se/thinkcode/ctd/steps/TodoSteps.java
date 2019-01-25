package se.thinkcode.ctd.steps;

import cucumber.api.java.sv.Givet;
import cucumber.api.java.sv.När;
import cucumber.api.java.sv.Så;
import se.thinkcode.ctd.TodoList;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoSteps {
    private TodoList todoList;
    private String owner;

    @Givet("att kattmaten är slut")
    public void att_kattmaten_är_slut() {
        todoList = new TodoList();
    }

    @När("Thomas skriver upp köp kattmat på sin att göra-lista")
    public void thomas_skriver_upp_köp_kattmat_på_sin_att_göra_lista() {
        owner = "Thomas";
        todoList.addTask(owner, "köp kattmat");
    }

    @Så("ska det stå köp kattmat på hans att göra-listan")
    public void ska_det_stå_köp_kattmat_på_hans_att_göra_listan() {
        List<String> actual = todoList.getTasks(owner);
        assertThat(actual).contains("köp kattmat");
    }
}
