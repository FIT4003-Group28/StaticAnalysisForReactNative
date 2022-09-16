package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: pxe  reason: default package */
/* loaded from: classes4.dex */
public final class pxe implements pwa {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public pxe(Handler handler) {
        this.b = handler;
    }

    private static pxd i() {
        pxd pxdVar;
        List list = a;
        synchronized (list) {
            pxdVar = list.isEmpty() ? new pxd() : (pxd) list.remove(list.size() - 1);
        }
        return pxdVar;
    }

    @Override // defpackage.pwa
    public final pxd a(int i) {
        pxd i2 = i();
        i2.a = this.b.obtainMessage(i);
        return i2;
    }

    @Override // defpackage.pwa
    public final pxd b(int i, Object obj) {
        pxd i2 = i();
        i2.a = this.b.obtainMessage(i, obj);
        return i2;
    }

    @Override // defpackage.pwa
    public final pxd c(int i, int i2, int i3) {
        pxd i4 = i();
        i4.a = this.b.obtainMessage(i, i2, i3);
        return i4;
    }

    @Override // defpackage.pwa
    public final boolean d() {
        return this.b.hasMessages(0);
    }

    @Override // defpackage.pwa
    public final void e(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // defpackage.pwa
    public final void f() {
        this.b.removeMessages(2);
    }

    @Override // defpackage.pwa
    public final void g(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.pwa
    public final void h(pxd pxdVar) {
        Handler handler = this.b;
        Message message = pxdVar.a;
        ptx.a(message);
        handler.sendMessageAtFrontOfQueue(message);
        pxdVar.a();
    }
}
