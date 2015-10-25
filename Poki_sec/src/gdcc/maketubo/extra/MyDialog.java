package gdcc.maketubo.extra;


import com.example.poki.R;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

public class MyDialog extends Dialog {
	public MyDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public  MyDialog(Context context, int theme) {  
	    super(context, theme); 
	}


	public static class Builder{
		private Context context;
		private String continueButtonText;
		private String escButtonText;
		private View contentView;
		private String title;
		private DialogInterface.OnClickListener continueButtonClickListener;
		private DialogInterface.OnClickListener escButtonClickListener;
		
		public Builder(Context context){
			this.context = context;
		}
		
		public Builder setContentView(View v){  
			this.contentView = v;  
			return this;  
		} 
		
		public Builder setTitle(int title) {  
		    this.title = (String) context.getText(title);  
			return this;  
		}
		
        public Builder setTitle(String title) {  
            this.title = title;  
            return this;  
        } 


		
		public Builder setContinueButton(int continueButtonText,DialogInterface.OnClickListener listener){
			this.continueButtonText = (String)context.getText(continueButtonText);
			this.continueButtonClickListener = listener;
			return this;
		}
		
		public Builder setContinueButton(String continueButtonText,  
				DialogInterface.OnClickListener listener) {  
				this.continueButtonText = continueButtonText;  
				this.continueButtonClickListener = listener;  
				return this;  
			}  
		
		public Builder setEscButton(int escButtonText,DialogInterface.OnClickListener listener){
			this.escButtonText = (String)context.getText(escButtonText);
			this.escButtonClickListener = listener;
			return this;
		}
		
		public Builder setEscButton(String escButtonText,  
			DialogInterface.OnClickListener listener) {  
			this.escButtonText = escButtonText;  
			this.escButtonClickListener = listener;  
			return this;  
		} 
		
		public MyDialog create(){
			LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			final MyDialog dialog = new MyDialog(context);
			View layout = inflater.inflate(R.layout.mydialog, null);
			dialog.addContentView(layout, new LayoutParams(  
			  LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));  
	//		((TextView) layout.findViewById(R.id.title)).setText(title); 
			if(continueButtonText != null){
				((Button) layout.findViewById(R.id.btncontinue))  
				 .setText(continueButtonText);  

				if(continueButtonClickListener != null){
					((Button)layout.findViewById(R.id.btncontinue)).setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							continueButtonClickListener.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
						}
					});
				}		
			}else {  	
				     layout.findViewById(R.id.btncontinue).setVisibility(View.GONE);  
				   } 
			
			if(escButtonText != null){
				((Button) layout.findViewById(R.id.btnesc))  
				 .setText(escButtonText);  

				if(escButtonClickListener != null){
					((Button)layout.findViewById(R.id.btnesc)).setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							escButtonClickListener.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
						}
					});
				}		
			}else {  	
				     layout.findViewById(R.id.btnesc).setVisibility(View.GONE);  
				   } 
			
			dialog.setContentView(layout);
			return dialog;
			
		}


	}

}




