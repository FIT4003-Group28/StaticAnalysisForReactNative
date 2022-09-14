package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.debug.b;
import java.util.Locale;
@com.facebook.react.d0.a.a(name = AnimationsDebugModule.NAME)
/* loaded from: classes.dex */
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "AnimationsDebugModule";
    private final com.facebook.react.modules.debug.c.a mCatalystSettings;
    private b mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, com.facebook.react.modules.debug.c.a aVar) {
        super(reactApplicationContext);
        this.mCatalystSettings = aVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.j();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        com.facebook.react.modules.debug.c.a aVar = this.mCatalystSettings;
        if (aVar == null || !aVar.a()) {
            return;
        }
        if (this.mFrameCallback != null) {
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
        this.mFrameCallback = new b(getReactApplicationContext());
        this.mFrameCallback.i();
    }

    @ReactMethod
    public void stopRecordingFps(double d2) {
        b bVar = this.mFrameCallback;
        if (bVar == null) {
            return;
        }
        bVar.j();
        b.C0128b b2 = this.mFrameCallback.b((long) d2);
        if (b2 == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            String str = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(b2.f5663d), Integer.valueOf(b2.f5660a), Integer.valueOf(b2.f5662c)) + "\n" + String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(b2.f5664e), Integer.valueOf(b2.f5661b), Integer.valueOf(b2.f5662c)) + "\nTotal Time MS: " + String.format(Locale.US, "%d", Integer.valueOf(b2.f5665f));
            c.d.d.e.a.a("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }
}
