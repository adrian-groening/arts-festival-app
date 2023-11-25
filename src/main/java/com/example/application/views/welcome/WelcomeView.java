package com.example.application.views.welcome;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Welcome")
@Route(value = "welcome")
@RouteAlias(value = "")
@Uses(Icon.class)
public class WelcomeView extends Composite<VerticalLayout> {

    public WelcomeView() {
        H1 h1 = new H1();
        H6 h6 = new H6();
        FormLayout formLayout2Col = new FormLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("Heading");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        h6.setText("Heading");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h6);
        h6.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Button");
        buttonSecondary.setWidth("min-content");
        getContent().add(h1);
        getContent().add(h6);
        getContent().add(formLayout2Col);
        formLayout2Col.add(buttonPrimary);
        formLayout2Col.add(buttonSecondary);
    }
}
