package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.m;
import com.facebook.react.modules.debug.b;
import java.util.Locale;
/* loaded from: classes.dex */
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "AnimationsDebugModule";
    private final com.facebook.react.modules.debug.a.a mCatalystSettings;
    private b mFrameCallback;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public AnimationsDebugModule(ah ahVar, com.facebook.react.modules.debug.a.a aVar) {
        super(ahVar);
        this.mCatalystSettings = aVar;
    }

    @al
    public void startRecordingFps() {
        if (this.mCatalystSettings == null || !this.mCatalystSettings.a()) {
            return;
        }
        if (this.mFrameCallback != null) {
            throw new m("Already recording FPS!");
        }
        this.mFrameCallback = new b(com.facebook.react.modules.core.a.a(), getReactApplicationContext());
        this.mFrameCallback.d();
    }

    @al
    public void stopRecordingFps(double d2) {
        if (this.mFrameCallback == null) {
            return;
        }
        this.mFrameCallback.e();
        b.a a2 = this.mFrameCallback.a((long) d2);
        if (a2 == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            String str = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(a2.e), Integer.valueOf(a2.f3553a), Integer.valueOf(a2.f3555c)) + "\n" + String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(a2.f), Integer.valueOf(a2.f3554b), Integer.valueOf(a2.f3555c)) + "\nTotal Time MS: " + String.format(Locale.US, "%d", Integer.valueOf(a2.g));
            com.facebook.common.e.a.a("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        if (this.mFrameCallback != null) {
            this.mFrameCallback.e();
            this.mFrameCallback = null;
        }
    }
}
