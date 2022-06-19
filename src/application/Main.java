package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Screen screen = Screen.getPrimary();
    //获取屏幕宽高 Rectangle2D [minX = 0.0, minY=0.0, maxX=2560.0, maxY=1440.0, width=2560.0, height=1440.0]
    Rectangle2D rec1 = screen.getBounds();
    // 获取屏幕可视宽高 Rectangle2D [minX = 0.0, minY=0.0, maxX=2560.0, maxY=1400.0, width=2560.0, height=1400.0]
    Rectangle2D rec2 = screen.getVisualBounds();

	// 0->19
	// 1->18
	// 2->17
	//
	// 6->13
	String[][] imageUrlsQ = {
			{
				"application/database/2019/question/2019-1.png",
				"application/database/2019/question/2019-1-a.png",
				"application/database/2019/question/2019-1-b-1.png",
				"application/database/2019/question/2019-1-b-2.png",
				"application/database/2019/question/2019-2-1.png",
				"application/database/2019/question/2019-2-2.png",
				"application/database/2019/question/2019-3-title-1.png",
				"application/database/2019/question/2019-3-title-2.png",
				"application/database/2019/question/2019-3-a-1.png",
				"application/database/2019/question/2019-3-a-2.png",
				"application/database/2019/question/2019-3-b-1.png",
				"application/database/2019/question/2019-3-b-2.png",
				"application/database/2019/question/2019-4-title.png",
				"application/database/2019/question/2019-4-a.png",
				"application/database/2019/question/2019-4-b-1.png",
				"application/database/2019/question/2019-4-b-2.png",
			},
			
			{
				"application/database/2018/question/2018-1-title.png",
				"application/database/2018/question/2018-1-a-1.png",
				"application/database/2018/question/2018-1-a-2.png",
				"application/database/2018/question/2018-1-b.png",
				"application/database/2018/question/2018-2-title.png",
				"application/database/2018/question/2018-2-a-1.png",
				"application/database/2018/question/2018-2-a-2.png",
				"application/database/2018/question/2018-2-b-1.png",
				"application/database/2018/question/2018-2-b-2.png",
				"application/database/2018/question/2018-3-1.png",
				"application/database/2018/question/2018-3-2.png",
				"application/database/2018/question/2018-4-title.png",
				"application/database/2018/question/2018-4-a-1.png",
				"application/database/2018/question/2018-4-a-2.png",
				"application/database/2018/question/2018-4-b-1.png",
				"application/database/2018/question/2018-4-b-2.png",	
			},
			
			{
				"application/database/2017/question/2017-1-title.png",
				"application/database/2017/question/2017-1-a-1.png",
				"application/database/2017/question/2017-1-a-2.png",
				"application/database/2017/question/2017-1-b-1.png",
				"application/database/2017/question/2017-1-b-2.png",
				"application/database/2017/question/2017-2-1.png",
				"application/database/2017/question/2017-2-2.png",
				"application/database/2017/question/2017-2-3.png",
				"application/database/2017/question/2017-3-title.png",
				"application/database/2017/question/2017-3-a-1.png",
				"application/database/2017/question/2017-3-a-2.png",
				"application/database/2017/question/2017-3-b-1.png",
				"application/database/2017/question/2017-3-b-2.png",
				"application/database/2017/question/2017-4-title.png",
				"application/database/2017/question/2017-4-a-1.png",
				"application/database/2017/question/2017-4-a-2.png",
				"application/database/2017/question/2017-4-b-1.png",
				"application/database/2017/question/2017-4-b-2.png",	
			},
			
			{
				"application/database/2016/question/2016-1-title.png",
				"application/database/2016/question/2016-1-a-1.png",
				"application/database/2016/question/2016-1-a-2.png",
				"application/database/2016/question/2016-1-b-1.png",
				"application/database/2016/question/2016-1-b-2.png",
				"application/database/2016/question/2016-2-title.png",
				"application/database/2016/question/2016-2-a.png",
				"application/database/2016/question/2016-2-b-1.png",
				"application/database/2016/question/2016-2-b-2.png",
				"application/database/2016/question/2016-2-c-1.png",
				"application/database/2016/question/2016-2-c-2.png",
				"application/database/2016/question/2016-3-title-1.png",
				"application/database/2016/question/2016-3-title-2.png",
				"application/database/2016/question/2016-3-a-1.png",
				"application/database/2016/question/2016-3-a-2.png",
				"application/database/2016/question/2016-3-b-2.png",
				"application/database/2016/question/2016-4-title.png",
				"application/database/2016/question/2016-4-a.png",
				"application/database/2016/question/2016-4-b-1.png",
				"application/database/2016/question/2016-4-b-2.png",
				"application/database/2016/question/2016-4-c-1.png",
				"application/database/2016/question/2016-4-c-2.png",
			},
			
			{
				"application/database/2015/question/2015-1-title.png",
				"application/database/2015/question/2015-1-a-1.png",
				"application/database/2015/question/2015-1-a-2.png",
				"application/database/2015/question/2015-1-b-1.png",
				"application/database/2015/question/2015-1-b-2.png",
				"application/database/2015/question/2015-1-c-1.png",
				"application/database/2015/question/2015-1-c-2.png",

				"application/database/2015/question/2015-2.png",
				"application/database/2015/question/2015-3-title-1.png",
				"application/database/2015/question/2015-3-title-2.png",
				"application/database/2015/question/2015-3-title-3.png",
				"application/database/2015/question/2015-3-a-1.png",
				"application/database/2015/question/2015-3-a-2.png",
				"application/database/2015/question/2015-3-b-1.png",
				"application/database/2015/question/2015-3-b-2.png",
				"application/database/2015/question/2015-3-b-3.png",
					
				"application/database/2015/question/2015-4-title.png",
				"application/database/2015/question/2015-4-a.png",
				"application/database/2015/question/2015-4-b.png",
				"application/database/2015/question/2015-4-c-1.png",
				"application/database/2015/question/2015-4-c-2.png",
				
				
			},
			
			{
				"application/database/2014/question/2014-1-title.png",
				"application/database/2014/question/2014-1-a-1.png",
				"application/database/2014/question/2014-1-a-2.png",
				"application/database/2014/question/2014-1-b-1.png",
				"application/database/2014/question/2014-1-b-2.png",

				"application/database/2014/question/2014-2.png",
				"application/database/2014/question/2014-3-title.png",
				"application/database/2014/question/2014-3-a-1.png",
				"application/database/2014/question/2014-3-a-2.png",
				"application/database/2014/question/2014-3-b-1.png",
				"application/database/2014/question/2014-3-b-2.png",
				"application/database/2014/question/2014-4-title-1.png",
				"application/database/2014/question/2014-4-title-2.png",
				"application/database/2014/question/2014-4-title-3.png",	
			},
			
			{
				"application/database/2013/question/2013-1-title-1.png",
				"application/database/2013/question/2013-1-title-2.png",
				"application/database/2013/question/2013-1-a-1.png",
				"application/database/2013/question/2013-1-a-2.png",
				"application/database/2013/question/2013-1-b-1.png",
				"application/database/2013/question/2013-1-b-2.png",

				"application/database/2013/question/2013-2-title-1.png",
				"application/database/2013/question/2013-2-title-2.png",
				"application/database/2013/question/2013-2-a.png",
				"application/database/2013/question/2013-2-b.png",

				"application/database/2013/question/2013-3-title.png",
				"application/database/2013/question/2013-3-a-1.png",
				"application/database/2013/question/2013-3-a-2.png",
				"application/database/2013/question/2013-3-b-1.png",
				"application/database/2013/question/2013-3-b-2.png",

				"application/database/2013/question/2013-4-title.png",
				"application/database/2013/question/2013-4-a-1.png",	
				"application/database/2013/question/2013-4-a-2.png",	
				"application/database/2013/question/2013-4-b-1.png",	
				"application/database/2013/question/2013-4-b-2.png",	
				
			},
	};
		
	
	// 0 zuo 1 you  2 shang 3 xia
	
	Button[][] change = new Button[10][4]; 
	
	Image[][] imgQ = new Image[imageUrlsQ.length][30];
	
	ImageView imageView = new ImageView();	
	
	int[] indexQ=new int[7];
	//0->19
	//6->13
	
	
	
	//0->19
	//6->13
	int currentYear=0;
	
	
	
	int[] maxiQ= {16,16,18,22,21,14,20};
	
	
	BorderPane leaf;
	Scene editSc;
	Parent edit;
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			
    		Button btn19=new Button("2019");
    		Button btn18=new Button("2018");
    		Button btn17=new Button("2017");
    		Button btn16=new Button("2016");
    		Button btn15=new Button("2015");
    		Button btn14=new Button("2014");
    		Button btn13=new Button("2013");
    		setChange();
    		
    		btn19.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=0;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn18.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=1;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn17.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=2;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn16.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=3;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn15.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=4;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn14.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=5;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		btn13.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent event) {
    				currentYear=6;
    				leaf=generateLeaf();
    				updateSc();
    			}
    		});
    		
			
    		for(int i=0;i<7;i++) {
    			for(int j=0;j<imageUrlsQ[i].length;j++) {
    				imgQ[i][j]=new Image(imageUrlsQ[i][j]);
    			}
    		}
    		imageView.setPreserveRatio(true);
//    		imageView.setFitHeight(400);
//    		imageView.setFitWidth(400);
    		
    		VBox centV=new VBox();
    		
			centV.getChildren().add(btn19);
			centV.getChildren().add(btn18);
			centV.getChildren().add(btn17);
			centV.getChildren().add(btn16);
			centV.getChildren().add(btn15);
			centV.getChildren().add(btn14);
			centV.getChildren().add(btn13);
			root.setCenter(centV);
			root.setAlignment(centV,Pos.CENTER);
			//Scene scene = new Scene(root,rec2.getWidth()-100,rec2.getHeight()-100);
			
			Scene scene = new Scene(root,200,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			primaryStage.setTitle("The Main Page");
			
			edit = FXMLLoader.load(getClass().getResource("editor.fxml"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateSc() {
		Scene leafSc=new Scene(leaf);
		Stage stg2 = new Stage();
		
		stg2.setScene(leafSc);
		
		
		stg2.setTitle("Questions&Answers Displayer");
		
		stg2.setX(rec2.getMinX()+10);
		stg2.setY(rec2.getMinY()+10);
		stg2.setWidth(rec2.getWidth()/2-5);
		stg2.setHeight(rec2.getHeight()-10);
		
		stg2.show();
		
		
		Stage stageEdit = new Stage();
		
	    editSc = new Scene(edit);
	    stageEdit.setTitle("Your Code Editor");
	    stageEdit.setScene(editSc);
	    stageEdit.setX(rec2.getMinX()+rec2.getWidth()/2+5);
	    stageEdit.setY(rec2.getMinY()+10);
	    stageEdit.setWidth(rec2.getWidth()/2-5);
	    stageEdit.setHeight(rec2.getHeight()-10);
	    stageEdit.show();
	    
	}
	public BorderPane generateLeaf() {
		//0 zuo   1 you
		BorderPane leaf=new BorderPane();
		leaf.setLeft(change[currentYear][0]);
		leaf.setRight(change[currentYear][1]);
		leaf.setTop(change[currentYear][2]);
		leaf.setBottom(change[currentYear][3]);
		indexQ[currentYear]=0;
		//imageView.setFitHeight(imgQ[currentYear][indexQ[currentYear]].getHeight()*1.2);
		//imageView.setFitWidth(imgQ[currentYear][indexQ[currentYear]].getWidth()*1.2);
		imageView.setImage(imgQ[currentYear][indexQ[currentYear]]);
		leaf.setCenter(imageView);
		
		
		leaf.setAlignment(change[currentYear][0],Pos.CENTER);
		leaf.setAlignment(change[currentYear][1],Pos.CENTER);
		leaf.setAlignment(change[currentYear][2],Pos.CENTER);
		leaf.setAlignment(change[currentYear][3],Pos.CENTER);
		
		
		leaf.setPrefWidth(rec2.getWidth()/2);
		leaf.setPrefHeight(rec2.getHeight()-30);
		return leaf;
	}
	int tempi,tempj;
	public void setChange() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<4;j++) {
				tempi=i;
				tempj=j;
				if(j==0) {
					change[i][j]=new Button("prev");
					change[i][j].setOnAction(new EventHandler<ActionEvent>() {
		    			public void handle(ActionEvent event) {
		    				indexQ[tempi]--;
		    		    	if(indexQ[tempi]==-1) indexQ[tempi]=maxiQ[tempi]-1;
		    		    	imageView.setImage(imgQ[tempi][indexQ[tempi]]);
		    			}
		    		});
				}
				if(j==1) {
					change[i][j]=new Button("next");
					
					change[i][j].setOnAction(new EventHandler<ActionEvent>() {
		    			public void handle(ActionEvent event) {
		    				indexQ[tempi]++;
		    		    	if(indexQ[tempi]==maxiQ[tempi]) indexQ[tempi]=0;
		    		    	imageView.setImage(imgQ[tempi][indexQ[tempi]]);
		    			}
		    		});
				}
				if(j==2) {
					change[i][j]=new Button("show answer");
					
				}
				if(j==3) {
					change[i][j]=new Button("hide answer");
				}
				tempi=0;
				tempj=0;
			}
		}
		
	}
	
	
	
	
	
	public void showNext(int bian) {
    	indexQ[bian]++;
    	if(indexQ[bian]==maxiQ[bian]) indexQ[bian]=0;
    	imageView.setImage(imgQ[bian][indexQ[bian]]);
    }
	public static void main(String[] args) {
		launch(args);
	}
}
