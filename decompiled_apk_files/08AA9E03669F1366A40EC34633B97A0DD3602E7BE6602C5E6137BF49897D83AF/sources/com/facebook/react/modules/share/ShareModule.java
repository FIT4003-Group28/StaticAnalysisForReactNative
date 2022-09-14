package com.facebook.react.modules.share;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
/* loaded from: classes.dex */
public class ShareModule extends ReactContextBaseJavaModule {
    static final String ACTION_SHARED = "sharedAction";
    static final String ERROR_INVALID_CONTENT = "E_INVALID_CONTENT";
    static final String ERROR_UNABLE_TO_OPEN_DIALOG = "E_UNABLE_TO_OPEN_DIALOG";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ShareModule";
    }

    public ShareModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void share(an anVar, String str, af afVar) {
        if (anVar == null) {
            afVar.a(ERROR_INVALID_CONTENT, "Content cannot be null");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setTypeAndNormalize("text/plain");
            if (anVar.hasKey("title")) {
                intent.putExtra("android.intent.extra.SUBJECT", anVar.getString("title"));
            }
            if (anVar.hasKey(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE)) {
                intent.putExtra("android.intent.extra.TEXT", anVar.getString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE));
            }
            Intent createChooser = Intent.createChooser(intent, str);
            createChooser.addCategory("android.intent.category.DEFAULT");
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(createChooser);
            } else {
                getReactApplicationContext().startActivity(createChooser);
            }
            ar b2 = b.b();
            b2.putString("action", ACTION_SHARED);
            afVar.a(b2);
        } catch (Exception unused) {
            afVar.a(ERROR_UNABLE_TO_OPEN_DIALOG, "Failed to open share dialog");
        }
    }
}
