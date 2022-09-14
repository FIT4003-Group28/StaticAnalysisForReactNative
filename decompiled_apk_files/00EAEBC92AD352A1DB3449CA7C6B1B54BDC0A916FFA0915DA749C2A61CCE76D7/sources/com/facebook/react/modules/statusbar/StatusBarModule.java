package com.facebook.react.modules.statusbar;

import a.g.m.v;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.q;
import java.util.Map;
@com.facebook.react.d0.a.a(name = StatusBarModule.NAME)
/* loaded from: classes.dex */
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    /* loaded from: classes.dex */
    class a extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f5741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5742c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5743d;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0131a implements ValueAnimator.AnimatorUpdateListener {
            C0131a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f5741b.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z, int i) {
            super(reactContext);
            this.f5741b = activity;
            this.f5742c = z;
            this.f5743d = i;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            this.f5741b.getWindow().addFlags(RecyclerView.UNDEFINED_DURATION);
            if (!this.f5742c) {
                this.f5741b.getWindow().setStatusBarColor(this.f5743d);
                return;
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f5741b.getWindow().getStatusBarColor()), Integer.valueOf(this.f5743d));
            ofObject.addUpdateListener(new C0131a());
            ofObject.setDuration(300L).setStartDelay(0L);
            ofObject.start();
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f5745b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5746c;

        /* loaded from: classes.dex */
        class a implements View.OnApplyWindowInsetsListener {
            a(b bVar) {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f5745b = activity;
            this.f5746c = z;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f5745b.getWindow().getDecorView();
            decorView.setOnApplyWindowInsetsListener(this.f5746c ? new a(this) : null);
            v.N(decorView);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f5747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f5748c;

        c(StatusBarModule statusBarModule, boolean z, Activity activity) {
            this.f5747b = z;
            this.f5748c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5747b) {
                this.f5748c.getWindow().addFlags(1024);
                this.f5748c.getWindow().clearFlags(2048);
                return;
            }
            this.f5748c.getWindow().addFlags(2048);
            this.f5748c.getWindow().clearFlags(1024);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f5749b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5750c;

        d(StatusBarModule statusBarModule, Activity activity, String str) {
            this.f5749b = activity;
            this.f5750c = str;
        }

        @Override // java.lang.Runnable
        @TargetApi(23)
        public void run() {
            View decorView = this.f5749b.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(this.f5750c) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return f.a(HEIGHT_KEY, Float.valueOf(identifier > 0 ? q.a(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || Build.VERSION.SDK_INT < 21) ? "black" : String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            c.d.d.e.a.d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            UiThreadUtil.runOnUiThread(new a(this, getReactApplicationContext(), currentActivity, z, i));
        }
    }

    @ReactMethod
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            c.d.d.e.a.d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(this, z, currentActivity));
        }
    }

    @ReactMethod
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            c.d.d.e.a.d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            UiThreadUtil.runOnUiThread(new d(this, currentActivity, str));
        }
    }

    @ReactMethod
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            c.d.d.e.a.d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            UiThreadUtil.runOnUiThread(new b(this, getReactApplicationContext(), currentActivity, z));
        }
    }
}
