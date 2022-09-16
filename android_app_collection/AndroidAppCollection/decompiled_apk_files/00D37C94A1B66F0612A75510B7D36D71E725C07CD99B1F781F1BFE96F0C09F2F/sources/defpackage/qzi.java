package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: qzi  reason: default package */
/* loaded from: classes4.dex */
public final class qzi implements Runnable, qub, qvh {
    private static qzi d;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public int b = 0;
    public final Handler c;
    private final qxb e;

    private qzi(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        rfm rfmVar = new rfm(handlerThread.getLooper());
        this.c = rfmVar;
        this.e = new qzd(context, rfmVar.getLooper(), this, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized qzi c(Context context) {
        qzi qziVar;
        synchronized (qzi.class) {
            if (d == null) {
                d = new qzi(context);
            }
            qziVar = d;
        }
        return qziVar;
    }

    private final void f(String str) {
        while (true) {
            qze qzeVar = (qze) this.a.poll();
            if (qzeVar == null) {
                return;
            }
            qzeVar.b(new qzh(this, str, qzeVar.f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzi.g():void");
    }

    @Override // defpackage.qub
    public final void a(int i) {
        qnm.f(this.c);
        StringBuilder sb = new StringBuilder(25);
        sb.append("Disconnected: ");
        sb.append(i);
        f(sb.toString());
    }

    @Override // defpackage.qub
    public final void b() {
        qnm.f(this.c);
        g();
    }

    public final void d() {
        if (!this.a.isEmpty() || this.b != 0 || !this.e.w()) {
            return;
        }
        this.e.l();
    }

    public final void e(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.qvh
    public final void i(ConnectionResult connectionResult) {
        qnm.f(this.c);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Connection failed: ");
        sb.append(valueOf);
        f(sb.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        qnm.f(this.c);
        if (this.e.w()) {
            g();
        } else if (this.e.x() || this.a.size() <= 0) {
        } else {
            this.e.G();
        }
    }
}
