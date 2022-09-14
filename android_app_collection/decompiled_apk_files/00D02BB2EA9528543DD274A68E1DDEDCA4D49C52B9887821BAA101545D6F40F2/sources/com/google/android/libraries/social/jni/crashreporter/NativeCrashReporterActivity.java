package com.google.android.libraries.social.jni.crashreporter;

import android.app.Activity;
import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NativeCrashReporterActivity extends Activity {
    private static final void a(String str, Map<String, String> map) {
        try {
            ((Runnable) Class.forName(str).getDeclaredConstructor(Map.class).newInstance(map)).run();
        } catch (ClassNotFoundException unused) {
            if (str.length() != 0) {
                return;
            }
            new String("Failed to find class: ");
        } catch (InstantiationException unused2) {
            if (str.length() != 0) {
                return;
            }
            new String("Failed to instantiate class: ");
        } catch (NoSuchMethodException unused3) {
        } catch (Exception unused4) {
            if (str.length() != 0) {
                return;
            }
            new String("Failed to execute runnable: ");
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("runnableName");
        Serializable serializableExtra = getIntent().getSerializableExtra("runnableArgs");
        HashMap hashMap = serializableExtra != null ? (HashMap) serializableExtra : null;
        if (stringExtra != null) {
            a(stringExtra, hashMap);
        }
        czhz.f(new cxok(getIntent().getStringExtra("description"), (Exception) getIntent().getSerializableExtra("exception")), 3000L);
    }
}
