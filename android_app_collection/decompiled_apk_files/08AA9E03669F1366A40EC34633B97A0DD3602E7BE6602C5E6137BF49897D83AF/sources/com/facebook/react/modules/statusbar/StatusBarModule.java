package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v4.j.s;
import android.view.View;
import android.view.WindowInsets;
import b.a.a.a.a.b.a;
import com.facebook.react.b.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.l;
import com.facebook.react.uimanager.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String HEIGHT_KEY = "HEIGHT";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StatusBarManager";
    }

    public StatusBarModule(ah ahVar) {
        super(ahVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ah reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", a.ANDROID_CLIENT_TYPE);
        return f.a(HEIGHT_KEY, Float.valueOf(identifier > 0 ? o.c(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : BitmapDescriptorFactory.HUE_RED));
    }

    @al
    public void setColor(final int i, final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            com.facebook.common.e.a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            ap.a(new l(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1
                @Override // com.facebook.react.bridge.l
                @TargetApi(21)
                public void a() {
                    currentActivity.getWindow().addFlags(PKIFailureInfo.systemUnavail);
                    if (z) {
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(currentActivity.getWindow().getStatusBarColor()), Integer.valueOf(i));
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofObject.setDuration(300L).setStartDelay(0L);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @al
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            com.facebook.common.e.a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            ap.a(new l(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2
                @Override // com.facebook.react.bridge.l
                @TargetApi(21)
                public void a() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2.1
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                            }
                        });
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    s.i(decorView);
                }
            });
        }
    }

    @al
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            com.facebook.common.e.a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            ap.a(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(1024);
                        currentActivity.getWindow().clearFlags(2048);
                        return;
                    }
                    currentActivity.getWindow().addFlags(2048);
                    currentActivity.getWindow().clearFlags(1024);
                }
            });
        }
    }

    @al
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            com.facebook.common.e.a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            ap.a(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.4
                @Override // java.lang.Runnable
                @TargetApi(23)
                public void run() {
                    currentActivity.getWindow().getDecorView().setSystemUiVisibility(str.equals("dark-content") ? PKIFailureInfo.certRevoked : 0);
                }
            });
        }
    }
}
