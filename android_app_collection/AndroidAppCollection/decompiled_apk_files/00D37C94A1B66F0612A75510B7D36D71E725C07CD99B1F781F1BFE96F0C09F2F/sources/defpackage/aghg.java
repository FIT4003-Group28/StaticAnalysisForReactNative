package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: aghg  reason: default package */
/* loaded from: classes.dex */
public final class aghg {
    private final Context a;
    private final aadd b;

    public aghg(Context context, aadd aaddVar) {
        this.a = context;
        this.b = aaddVar;
    }

    public final boolean a() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        int i = -1;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= 28) {
            i = telephonyManager.getSimCarrierId();
        }
        athe atheVar = this.b.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        return atheVar.j.contains(Integer.valueOf(i));
    }
}
