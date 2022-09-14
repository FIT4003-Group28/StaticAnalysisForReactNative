package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.b.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ap;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ToastAndroid";
    }

    public ToastModule(ah ahVar) {
        super(ahVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap a2 = f.a();
        a2.put(DURATION_SHORT_KEY, 0);
        a2.put(DURATION_LONG_KEY, 1);
        a2.put(GRAVITY_TOP_KEY, 49);
        a2.put(GRAVITY_BOTTOM_KEY, 81);
        a2.put(GRAVITY_CENTER, 17);
        return a2;
    }

    @al
    public void show(final String str, final int i) {
        ap.a(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @al
    public void showWithGravity(final String str, final int i, final int i2) {
        ap.a(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.2
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @al
    public void showWithGravityAndOffset(final String str, final int i, final int i2, final int i3, final int i4) {
        ap.a(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.3
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }
}
