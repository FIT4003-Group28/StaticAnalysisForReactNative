package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: pbz  reason: default package */
/* loaded from: classes4.dex */
public final class pbz {
    public pbw a;
    public boolean b;
    private final ExecutorService c;

    public pbz(String str) {
        this.c = pcx.m(str);
    }

    public final void a() {
        pce.d(this.b);
        pbw pbwVar = this.a;
        pbwVar.a.i();
        if (pbwVar.b != null) {
            pbwVar.b.interrupt();
        }
    }

    public final void b() {
        c(null);
    }

    public final void c(Runnable runnable) {
        if (this.b) {
            a();
        }
        if (runnable != null) {
            this.c.submit(runnable);
        }
        this.c.shutdown();
    }

    public final void d(pbx pbxVar, pbv pbvVar) {
        Looper myLooper = Looper.myLooper();
        pce.d(myLooper != null);
        e(myLooper, pbxVar, pbvVar);
    }

    public final void e(Looper looper, pbx pbxVar, pbv pbvVar) {
        pce.d(!this.b);
        this.b = true;
        pbw pbwVar = new pbw(this, looper, pbxVar, pbvVar);
        this.a = pbwVar;
        this.c.submit(pbwVar);
    }
}
