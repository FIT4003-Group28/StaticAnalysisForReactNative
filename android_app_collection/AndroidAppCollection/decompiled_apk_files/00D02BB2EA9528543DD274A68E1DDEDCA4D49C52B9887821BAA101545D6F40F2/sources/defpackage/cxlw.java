package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cxlw  reason: default package */
/* loaded from: classes5.dex */
public final class cxlw extends BroadcastReceiver {
    public static final Object a = new Object();
    public static final dcha<String, cxkz> b = dckz.b(dbyv.N());
    public static volatile boolean c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dcdc r;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        dcha<String, cxkz> dchaVar = b;
        synchronized (dchaVar) {
            r = dcdc.r(dchaVar.c(stringExtra));
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ((cxkz) r.get(i)).a.b();
        }
    }
}
