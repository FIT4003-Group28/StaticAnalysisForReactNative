package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqv  reason: default package */
/* loaded from: classes2.dex */
public final class aqv extends Handler {
    final /* synthetic */ aqy a;

    public aqv(aqy aqyVar) {
        this.a = aqyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            aqy aqyVar = this.a;
            aqyVar.j = false;
            aqyVar.a(aqyVar.i);
            return;
        }
        aqy aqyVar2 = this.a;
        aqyVar2.l = false;
        aqp aqpVar = aqyVar2.h;
        if (aqpVar == null) {
            return;
        }
        ara araVar = aqyVar2.k;
        arm armVar = ((ark) aqpVar).a;
        arp f = armVar.f(aqyVar2);
        if (f == null) {
            return;
        }
        armVar.g(f, araVar);
    }
}
