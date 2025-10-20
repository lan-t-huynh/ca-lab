package app;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AppBuilder appBuilder = new AppBuilder();
        JFrame application = appBuilder
                .addLogoutUseCase()
                .addLoginView()
                .addSignupView()
                .addLoggedInView()
                .addSignupUseCase()
                .addLoginUseCase()
                .addChangePasswordUseCase()
                .build();

        application.pack();
        application.setLocationRelativeTo(null);
        application.setVisible(true);
    }
}
