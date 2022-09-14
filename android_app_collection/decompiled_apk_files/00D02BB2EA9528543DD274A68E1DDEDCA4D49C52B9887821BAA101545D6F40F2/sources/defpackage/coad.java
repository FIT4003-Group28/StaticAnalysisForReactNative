package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: coad  reason: default package */
/* loaded from: classes5.dex */
public final class coad implements Runnable, cnpv, cnsi {
    private static coad d;
    public final LinkedBlockingQueue<cnzy> a = new LinkedBlockingQueue<>();
    public int b = 0;
    public final Handler c;
    private final cnuw<coah> e;

    private coad(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        cojb cojbVar = new cojb(handlerThread.getLooper());
        this.c = cojbVar;
        this.e = new cnzx(context, cojbVar.getLooper(), this, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized coad c(Context context) {
        coad coadVar;
        synchronized (coad.class) {
            if (d == null) {
                d = new coad(context);
            }
            coadVar = d;
        }
        return coadVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|8|9|(1:11)|12|(4:14|(1:16)(1:258)|17|(2:21|(7:23|24|25|26|27|8d|(39:38|39|40|41|42|43|44|45|46|47|48|f1|(2:222|223)|(2:220|221)|137|138|139|140|141|1e1|152|153|154|155|156|157|158|159|160|161|162|(2:179|180)|164|165|166|167|168|169|170)(3:246|141|1e1))(3:255|256|257)))|259|164|165|166|167|168|169|170) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03c2, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coad.f():void");
    }

    private final void g(String str) {
        while (true) {
            cnzy poll = this.a.poll();
            if (poll == null) {
                return;
            }
            poll.d(new coac(this, str, poll.e));
        }
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        cnwc.j(this.c);
        f();
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        cnwc.j(this.c);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Connection failed: ");
        sb.append(valueOf);
        g(sb.toString());
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        cnwc.j(this.c);
        StringBuilder sb = new StringBuilder(25);
        sb.append("Disconnected: ");
        sb.append(i);
        g(sb.toString());
    }

    public final void d(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    public final void e() {
        if (!this.a.isEmpty() || this.b != 0 || !this.e.r()) {
            return;
        }
        this.e.o();
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnwc.j(this.c);
        if (this.e.r()) {
            f();
        } else if (this.e.s() || this.a.size() <= 0) {
        } else {
            cnuw<coah> cnuwVar = this.e;
            int j = cnuwVar.d.j(cnuwVar.c, 12800000);
            if (j != 0) {
                cnuwVar.E(1, null);
                cnuwVar.G(new cnuf(cnuwVar), j, null);
                return;
            }
            cnuwVar.n(new cnuf(cnuwVar));
        }
    }
}
