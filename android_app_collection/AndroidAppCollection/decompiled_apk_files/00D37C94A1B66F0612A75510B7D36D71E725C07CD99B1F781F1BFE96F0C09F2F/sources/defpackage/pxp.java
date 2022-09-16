package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: pxp  reason: default package */
/* loaded from: classes4.dex */
public final class pxp implements Handler.Callback {
    final /* synthetic */ pxq a;
    private final Handler b;

    public pxp(pxq pxqVar, avx avxVar) {
        this.a = pxqVar;
        Handler t = pxi.t(this);
        this.b = t;
        avxVar.n(this, t);
    }

    private final void b(long j) {
        pxq pxqVar = this.a;
        if (this != pxqVar.r) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            ((awb) pxqVar).g = true;
            return;
        }
        try {
            pxqVar.av(j);
        } catch (phr e) {
            this.a.k = e;
        }
    }

    public final void a(long j) {
        if (pxi.a < 30) {
            this.b.sendMessageAtFrontOfQueue(Message.obtain(this.b, 0, (int) (j >> 32), (int) j));
            return;
        }
        b(j);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        b(pxi.o(message.arg1, message.arg2));
        return true;
    }
}
