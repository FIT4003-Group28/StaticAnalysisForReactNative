package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: buhp  reason: default package */
/* loaded from: classes4.dex */
final class buhp extends BroadcastReceiver {
    final /* synthetic */ buhq a;

    public buhp(buhq buhqVar) {
        this.a = buhqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        deig<buab<String>> deigVar;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            buhq buhqVar = this.a;
            synchronized (buhqVar) {
                buab<String> b = buhqVar.b();
                if (b != null && (deigVar = buhqVar.a) != null) {
                    deigVar.j(b);
                } else {
                    deig<buab<String>> deigVar2 = buhqVar.a;
                    if (deigVar2 != null && deigVar2.isDone()) {
                        buhqVar.a = null;
                    }
                }
            }
        }
    }
}
