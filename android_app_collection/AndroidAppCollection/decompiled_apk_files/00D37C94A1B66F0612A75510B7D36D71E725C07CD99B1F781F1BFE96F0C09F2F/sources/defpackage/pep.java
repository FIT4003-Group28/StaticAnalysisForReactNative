package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: pep  reason: default package */
/* loaded from: classes4.dex */
public final class pep extends Handler {
    final /* synthetic */ per a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pep(per perVar, Looper looper) {
        super(looper);
        this.a = perVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (pej pejVar : this.a.a) {
            if (pejVar.n(bArr)) {
                int i = message.what;
                if (!pejVar.o()) {
                    return;
                }
                if (i == 1) {
                    pejVar.i = 3;
                    pejVar.l();
                    return;
                } else if (i == 2) {
                    pejVar.h(false);
                    return;
                } else if (i != 3 || pejVar.i != 4) {
                    return;
                } else {
                    pejVar.i = 3;
                    pejVar.i(new poc(), 2);
                    return;
                }
            }
        }
    }
}
