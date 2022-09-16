package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pyj  reason: default package */
/* loaded from: classes7.dex */
public final class pyj extends Handler {
    final /* synthetic */ pyl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyj(pyl pylVar) {
        super(Looper.getMainLooper());
        this.a = pylVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        removeMessages(1);
        sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (!hasMessages(1)) {
            sendEmptyMessageDelayed(1, this.a.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (hasMessages(1)) {
            removeMessages(1);
            sendEmptyMessageDelayed(1, this.a.h);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        pyl pylVar = this.a;
        xkl xklVar = pylVar.g;
        amte p = xklVar.h.l().d().p();
        bzdk c = xklVar.c.c();
        if (p != null) {
            for (amub amubVar : p.a(xklVar.a)) {
                if (c.a(amubVar)) {
                    pylVar.e(pyl.f(pylVar.f, pylVar.d));
                    break;
                }
            }
        }
        deha.q(pylVar.b.f(pylVar.f.c() && pylVar.j, pylVar.f.c()), pylVar, pylVar.e);
        pylVar.i = pylVar.c.b();
        pylVar.j = false;
        removeMessages(1);
        sendEmptyMessageDelayed(1, this.a.h);
    }
}
