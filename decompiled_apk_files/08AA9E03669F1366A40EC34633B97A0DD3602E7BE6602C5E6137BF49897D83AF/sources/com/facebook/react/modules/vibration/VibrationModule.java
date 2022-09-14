package com.facebook.react.modules.vibration;

import android.os.Vibrator;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
/* loaded from: classes.dex */
public class VibrationModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Vibration";
    }

    public VibrationModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void vibrate(int i) {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(i);
        }
    }

    @al
    public void vibrateByPattern(am amVar, int i) {
        long[] jArr = new long[amVar.size()];
        for (int i2 = 0; i2 < amVar.size(); i2++) {
            jArr[i2] = amVar.getInt(i2);
        }
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(jArr, i);
        }
    }

    @al
    public void cancel() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
