package com.baidu.lbsapi.auth;

import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class ErrorMessage {
    ErrorMessage() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", -1);
            jSONObject.put(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
