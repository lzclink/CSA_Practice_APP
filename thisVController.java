package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.util.ArrayList;
public class thisVController {
	@FXML
	private Label layoutText;
	@FXML
	private Button showAn;
	@FXML
	private Button nex;
	@FXML
	private Button prev;
	@FXML
    private Button showQues;


    private ArrayList<String> ans = (new quizBase()).ans();
    private ArrayList<String> ques = (new quizBase()).ques();
    private int count = -1;
	// Event Listener on Button[#showAn].onAction
	@FXML
	public void showAction(ActionEvent event) {
		if(count >= 0) {
			layoutText.setText(ans.get(count));
		}
	}
	// Event Listener on Button[#nex].onAction
	@FXML
	public void nexAction(ActionEvent event) {
		count++;
		if(count <= ques.size() - 1) {
			layoutText.setText(ques.get(count));
		}
		else {
			count --;
		}
	}
	// Event Listener on Button[#prev].onAction
	@FXML
	public void prevAction(ActionEvent event) {
		count --;
		if(count >= 0 ) {
			layoutText.setText(ques.get(count));
		}
		else {
			count ++;	
		}
	}
	@FXML
    void showQues(ActionEvent event) {
		if(count >= 0) {
			layoutText.setText(ques.get(count));
		}
    }
}
