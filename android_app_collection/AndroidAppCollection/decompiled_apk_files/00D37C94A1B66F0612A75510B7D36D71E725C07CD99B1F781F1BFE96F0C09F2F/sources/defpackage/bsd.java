package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bsd  reason: default package */
/* loaded from: classes2.dex */
public final class bsd implements bso, bqv, bvy {
    public final Context a;
    public final int b;
    public final String c;
    public final bsi d;
    public final bsp e;
    public PowerManager.WakeLock f;
    public boolean g = false;
    private int i = 0;
    private final Object h = new Object();

    static {
        bqf.b("DelayMetCommandHandler");
    }

    public bsd(Context context, int i, String str, bsi bsiVar) {
        this.a = context;
        this.b = i;
        this.d = bsiVar;
        this.c = str;
        this.e = new bsp(context, bsiVar.j, this);
    }

    private final void d() {
        synchronized (this.h) {
            this.e.b();
            this.d.c.a(this.c);
            PowerManager.WakeLock wakeLock = this.f;
            if (wakeLock != null && wakeLock.isHeld()) {
                bqf a = bqf.a();
                String.format("Releasing wakelock %s for WorkSpec %s", this.f, this.c);
                a.d(new Throwable[0]);
                this.f.release();
            }
        }
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        bqf a = bqf.a();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z));
        a.d(new Throwable[0]);
        d();
        if (z) {
            Intent f = brz.f(this.a, this.c);
            bsi bsiVar = this.d;
            bsiVar.d(new bsf(bsiVar, f, this.b));
        }
        if (this.g) {
            Intent b = brz.b(this.a);
            bsi bsiVar2 = this.d;
            bsiVar2.d(new bsf(bsiVar2, b, this.b));
        }
    }

    @Override // defpackage.bvy
    public final void b(String str) {
        bqf a = bqf.a();
        String.format("Exceeded time limits on execution for %s", str);
        a.d(new Throwable[0]);
        c();
    }

    public final void c() {
        synchronized (this.h) {
            if (this.i >= 2) {
                bqf a = bqf.a();
                String.format("Already stopped work for %s", this.c);
                a.d(new Throwable[0]);
            } else {
                this.i = 2;
                bqf a2 = bqf.a();
                String.format("Stopping work for WorkSpec %s", this.c);
                a2.d(new Throwable[0]);
                Intent g = brz.g(this.a, this.c);
                bsi bsiVar = this.d;
                bsiVar.d(new bsf(bsiVar, g, this.b));
                if (this.d.d.f(this.c)) {
                    bqf a3 = bqf.a();
                    String.format("WorkSpec %s needs to be rescheduled", this.c);
                    a3.d(new Throwable[0]);
                    Intent f = brz.f(this.a, this.c);
                    bsi bsiVar2 = this.d;
                    bsiVar2.d(new bsf(bsiVar2, f, this.b));
                } else {
                    bqf a4 = bqf.a();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c);
                    a4.d(new Throwable[0]);
                }
            }
        }
    }

    @Override // defpackage.bso
    public final void e(List list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.h) {
            if (this.i != 0) {
                bqf a = bqf.a();
                String.format("Already started work for %s", this.c);
                a.d(new Throwable[0]);
            } else {
                this.i = 1;
                bqf a2 = bqf.a();
                String.format("onAllConstraintsMet for %s", this.c);
                a2.d(new Throwable[0]);
                if (this.d.d.g(this.c)) {
                    bwa bwaVar = this.d.c;
                    String str = this.c;
                    synchronized (bwaVar.d) {
                        bqf a3 = bqf.a();
                        String.format("Starting timer for %s", str);
                        a3.d(new Throwable[0]);
                        bwaVar.a(str);
                        bvz bvzVar = new bvz(bwaVar, str);
                        bwaVar.b.put(str, bvzVar);
                        bwaVar.c.put(str, this);
                        bwaVar.a.schedule(bvzVar, 600000L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    d();
                }
            }
        }
    }

    @Override // defpackage.bso
    public final void f(List list) {
        c();
    }
}
