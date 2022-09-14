package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgc  reason: default package */
/* loaded from: classes.dex */
public final class cgc extends BroadcastReceiver {
    final /* synthetic */ cgd a;

    public cgc(cgd cgdVar) {
        this.a = cgdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cgd cgdVar = this.a;
        boolean z = cgdVar.a;
        cgdVar.a = cgd.a(context);
        cgd cgdVar2 = this.a;
        boolean z2 = cgdVar2.a;
        if (z != z2) {
            brz brzVar = cgdVar2.b;
            if (!z2) {
                return;
            }
            synchronized (brzVar.b) {
                cgw cgwVar = brzVar.a;
                for (chs chsVar : cjp.i(cgwVar.a)) {
                    if (!chsVar.e() && !chsVar.f()) {
                        chsVar.b();
                        if (!cgwVar.c) {
                            chsVar.a();
                        } else {
                            cgwVar.b.add(chsVar);
                        }
                    }
                }
            }
        }
    }
}
