package defpackage;

import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* renamed from: dapd  reason: default package */
/* loaded from: classes5.dex */
public final class dapd {
    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return intent.getBooleanExtra("isSetupFlow", false);
        }
        return intent.getBooleanExtra("firstRun", false) || intent.getBooleanExtra("preDeferredSetup", false) || intent.getBooleanExtra("deferredSetup", false);
    }
}
