package act1000.touchjesture;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class touchjesture extends Activity {
	drawview dv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		
       dv = new drawview(this);
       setContentView(dv);
    }
}