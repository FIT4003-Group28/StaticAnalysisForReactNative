package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vdc  reason: default package */
/* loaded from: classes4.dex */
public final class vdc extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    static final vbu c = vbu.a();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        for (Map.Entry entry : c.entrySet()) {
            if (((String) ((ampr) entry.getKey()).a).equals(stringExtra)) {
                ((vck) entry.getValue()).a.d();
            }
        }
    }
}
