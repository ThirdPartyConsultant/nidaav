package com.example.vaadinssfe;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.HorizontalLayout;;
@SuppressWarnings("serial")
@Theme("vaadinssfe")
public class VaadinssfeUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VaadinssfeUI.class)
	public static class Servlet extends VaadinServlet {
	}

	/**
	 * connect to SSFE test
	 * */
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		final HorizontalLayout layoutPanel = new HorizontalLayout();
		
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Notification.show("按了按鈕");
			}
		});
		layoutPanel.addComponent(button);
		layout.addComponent(new Label("測試一下..."));
		layout.addComponent(layoutPanel);
		
	}

}