package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.n;
import com.google.android.gms.common.util.CrashUtils;
/* loaded from: classes.dex */
public class IntentModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IntentAndroid";
    }

    public IntentModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void getInitialURL(af afVar) {
        try {
            Activity currentActivity = getCurrentActivity();
            String str = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if ("android.intent.action.VIEW".equals(action) && data != null) {
                    str = data.toString();
                }
            }
            afVar.a((Object) str);
        } catch (Exception e) {
            afVar.a((Throwable) new n("Could not get the initial URL : " + e.getMessage()));
        }
    }

    @al
    public void openURL(String str, af afVar) {
        if (str == null || str.isEmpty()) {
            afVar.a((Throwable) new n("Invalid URL: " + str));
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            String packageName = getReactApplicationContext().getPackageName();
            ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
            String packageName2 = resolveActivity != null ? resolveActivity.getPackageName() : "";
            if (currentActivity == null || !packageName.equals(packageName2)) {
                intent.addFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
            }
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            afVar.a((Object) true);
        } catch (Exception e) {
            afVar.a((Throwable) new n("Could not open URL '" + str + "': " + e.getMessage()));
        }
    }

    @al
    public void canOpenURL(String str, af afVar) {
        if (str == null || str.isEmpty()) {
            afVar.a((Throwable) new n("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
            afVar.a(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e) {
            afVar.a((Throwable) new n("Could not check if URL '" + str + "' can be opened: " + e.getMessage()));
        }
    }
}
