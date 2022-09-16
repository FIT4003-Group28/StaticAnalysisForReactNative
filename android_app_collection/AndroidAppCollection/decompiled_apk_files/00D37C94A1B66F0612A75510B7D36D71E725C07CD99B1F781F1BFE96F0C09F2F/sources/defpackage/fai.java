package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* renamed from: fai  reason: default package */
/* loaded from: classes3.dex */
public final class fai extends fag {
    public yus a;
    public aacz b;

    @Override // defpackage.fag, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && Build.VERSION.SDK_INT >= 26) {
            a(context);
            if (this.b.b() == null) {
                return;
            }
            asxj asxjVar = this.b.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (!asxjVar.y) {
                return;
            }
            this.a.a();
        }
    }
}
