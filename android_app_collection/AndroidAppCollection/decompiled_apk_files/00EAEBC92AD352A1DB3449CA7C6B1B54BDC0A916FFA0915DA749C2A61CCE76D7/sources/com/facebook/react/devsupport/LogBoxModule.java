package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
@com.facebook.react.d0.a.a(name = LogBoxModule.NAME)
/* loaded from: classes.dex */
public class LogBoxModule extends ReactContextBaseJavaModule {
    public static final String NAME = "LogBox";
    private final com.facebook.react.devsupport.h.c mDevSupportManager;
    private com.facebook.react.devsupport.d mLogBoxDialog;
    private View mReactRootView;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LogBoxModule.this.mReactRootView == null) {
                LogBoxModule logBoxModule = LogBoxModule.this;
                logBoxModule.mReactRootView = logBoxModule.mDevSupportManager.a(LogBoxModule.NAME);
                if (LogBoxModule.this.mReactRootView != null) {
                    return;
                }
                c.d.d.e.a.b("ReactNative", "Unable to launch logbox because react was unable to create the root view");
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LogBoxModule.this.mLogBoxDialog == null) {
                Activity currentActivity = LogBoxModule.this.getCurrentActivity();
                if (currentActivity == null || currentActivity.isFinishing()) {
                    c.d.d.e.a.b("ReactNative", "Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
                    return;
                }
                LogBoxModule logBoxModule = LogBoxModule.this;
                logBoxModule.mLogBoxDialog = new com.facebook.react.devsupport.d(currentActivity, logBoxModule.mReactRootView);
                LogBoxModule.this.mLogBoxDialog.setCancelable(false);
                LogBoxModule.this.mLogBoxDialog.show();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LogBoxModule.this.mLogBoxDialog != null) {
                if (LogBoxModule.this.mReactRootView.getParent() != null) {
                    ((ViewGroup) LogBoxModule.this.mReactRootView.getParent()).removeView(LogBoxModule.this.mReactRootView);
                }
                LogBoxModule.this.mLogBoxDialog.dismiss();
                LogBoxModule.this.mLogBoxDialog = null;
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LogBoxModule.this.mReactRootView != null) {
                LogBoxModule.this.mDevSupportManager.a(LogBoxModule.this.mReactRootView);
                LogBoxModule.this.mReactRootView = null;
            }
        }
    }

    public LogBoxModule(ReactApplicationContext reactApplicationContext, com.facebook.react.devsupport.h.c cVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = cVar;
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void hide() {
        UiThreadUtil.runOnUiThread(new c());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        UiThreadUtil.runOnUiThread(new d());
    }

    @ReactMethod
    public void show() {
        UiThreadUtil.runOnUiThread(new b());
    }
}
