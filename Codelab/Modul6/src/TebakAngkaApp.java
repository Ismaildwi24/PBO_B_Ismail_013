import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TebakAngkaApp {
    private TebakAngkaGame game = new TebakAngkaGame();
    private boolean sudahMenangSekali = false;

    public void start(Stage primaryStage) {
        Label title = new Label("🎯 Tebak Angka 1–100");
        title.setFont(new Font("Arial", 22));
        title.setStyle("-fx-text-fill: #3366cc;");

        Label feedbackLabel = new Label("Masukkan tebakanmu!");
        feedbackLabel.setFont(new Font(14));
        feedbackLabel.setStyle("-fx-text-fill: #444;");

        TextField inputField = new TextField();
        inputField.setPromptText("Masukkan angka di sini");
        inputField.setMaxWidth(200);

        Button actionButton = new Button("🎲 Coba Tebak!");
        actionButton.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");

        Button stopButton = new Button("⛔ Berhenti Main");
        stopButton.setStyle("-fx-background-color: #e60000; -fx-text-fill: white;");
        stopButton.setVisible(false);

        Label percobaanLabel = new Label("Jumlah percobaan: 0");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #e6f2ff;");
        HBox inputRow = new HBox(10); // 10px jarak antar komponen
        inputRow.setAlignment(Pos.CENTER);
        inputRow.getChildren().addAll(inputField, actionButton);
        layout.getChildren().addAll(title, feedbackLabel, inputRow, percobaanLabel, stopButton);

        actionButton.setOnAction(e -> {
            if (actionButton.getText().equals("🔁 Main Lagi")) {
                game.generateAngkaBaru();
                inputField.clear();
                feedbackLabel.setText("Masukkan tebakanmu!");
                feedbackLabel.setStyle("-fx-text-fill: #444;");
                percobaanLabel.setText("Jumlah percobaan: 0");
                actionButton.setText("🎲 Coba Tebak!");
                return;
            }

            try {
                int tebakan = Integer.parseInt(inputField.getText());
                String hasil = game.tebak(tebakan);
                feedbackLabel.setText(getFeedbackIcon(hasil) + " " + hasil);
                percobaanLabel.setText("Jumlah percobaan: " + game.getJumlahPercobaan());

                if (hasil.equals("Tebakan benar!")) {
                    feedbackLabel.setStyle("-fx-text-fill: #2ecc71;");
                    actionButton.setText("🔁 Main Lagi");
                    sudahMenangSekali = true;
                    stopButton.setVisible(true);
                } else if (hasil.contains("besar")) {
                    feedbackLabel.setStyle("-fx-text-fill: #ff6600;");
                } else if (hasil.contains("kecil")) {
                    feedbackLabel.setStyle("-fx-text-fill: #ff9933;");
                }
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("❌ Masukkan angka valid!");
                feedbackLabel.setStyle("-fx-text-fill: red;");
            }
        });

        stopButton.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Konfirmasi Keluar");
            alert.setHeaderText("Anda yakin ingin berhenti main?");
            alert.setContentText("Pilih Ya untuk keluar dari permainan.");

            ButtonType ya = new ButtonType("Ya");
            ButtonType tidak = new ButtonType("Tidak");
            alert.getButtonTypes().setAll(ya, tidak);

            alert.showAndWait().ifPresent(response -> {
                if (response == ya) {
                    System.exit(0);
                }
            });
        });

        Scene scene = new Scene(layout, 360, 320);
        primaryStage.setTitle("Tebak Angka Advance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getFeedbackIcon(String hasil) {
        return switch (hasil) {
            case "Tebakan benar!" -> "✅";
            case "Terlalu besar!" -> "🔺";
            case "Terlalu kecil!" -> "🔻";
            default -> "";
        };
    }
}
