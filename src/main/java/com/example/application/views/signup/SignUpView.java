package com.example.application.views.signup;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sign Up")
@Route(value = "signup")
@Uses(Icon.class)
public class SignUpView extends Composite<VerticalLayout> {

    public SignUpView() {
        H1 h1 = new H1();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("Heading");
        h1.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        textField2.setLabel("Text field");
        textField2.setWidth("min-content");
        textField3.setLabel("Text field");
        textField3.setWidth("min-content");
        datePicker.setLabel("Date picker");
        datePicker.setWidth("min-content");
        textField4.setLabel("Text field");
        textField4.setWidth("min-content");
        textField5.setLabel("Text field");
        textField5.setWidth("min-content");
        textField6.setLabel("Text field");
        textField6.setWidth("min-content");
        textField7.setLabel("Text field");
        textField7.setWidth("min-content");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Button");
        buttonSecondary.setWidth("min-content");
        getContent().add(h1);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(textField3);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(textField4);
        formLayout2Col.add(textField5);
        formLayout2Col.add(textField6);
        formLayout2Col.add(textField7);
        formLayout2Col.add(buttonPrimary);
        formLayout2Col.add(buttonSecondary);
    }
}
