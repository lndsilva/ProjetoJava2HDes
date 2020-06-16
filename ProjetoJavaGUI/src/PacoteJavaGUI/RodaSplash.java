package PacoteJavaGUI;

public class RodaSplash {

    public static void main(String[] args) {
        JFSpash splash = new JFSpash();

        splash.setVisible(true);

        JFLogin janelaLogin = new JFLogin();

        try {

            for (int i = 0; i <= 100; i++) {
                
                Thread.sleep(30);
                splash.lblLoad.setText(Integer.toString(i) + "%");
                splash.prbSplash.setValue(i);
                if (i == 100) {
                    splash.dispose();
                    janelaLogin.setVisible(true);

                }
            }

        } catch (Exception e) {
        }

    }

}
