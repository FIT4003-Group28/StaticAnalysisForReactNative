package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lym  reason: default package */
/* loaded from: classes7.dex */
public final class lym implements lxs {
    public final bvrj a;
    @dzsi
    public kfe b;
    @dzsi
    public lxy c;
    @dzsi
    dehu d;
    private final long e;
    private final lxt f;
    private final lxv g;
    private final Executor h;
    private final dehq i;
    private final Runnable j = new lyl(this);

    public lym(long j, lxt lxtVar, lxv lxvVar, Executor executor, dehq dehqVar, bvrj bvrjVar) {
        dbsk.s(lxtVar);
        this.f = lxtVar;
        this.e = 15000L;
        dbsk.s(lxvVar);
        this.g = lxvVar;
        this.h = executor;
        this.i = dehqVar;
        this.a = bvrjVar;
    }

    private final void e() {
        dehu dehuVar = this.d;
        if (dehuVar != null) {
            dehuVar.cancel(false);
            this.d = null;
        }
    }

    @Override // defpackage.lxs
    public final void a(jzs jzsVar) {
        this.a.c();
        if (jzsVar.a) {
            e();
            return;
        }
        lxy lxyVar = this.c;
        dbsk.s(lxyVar);
        e();
        b();
        d(lxyVar);
    }

    public final void b() {
        dbsk.s(this.c);
        this.c = null;
        this.f.b(this);
        this.g.b(this);
    }

    public final void c(lxy lxyVar) {
        this.a.c();
        dbsk.s(lxyVar);
        e();
        if (this.c == null) {
            this.g.a(this);
            this.f.a(this);
        }
        this.c = lxyVar;
        kfe kfeVar = this.b;
        if (kfeVar != null && !kfeVar.a()) {
            this.d = this.i.d(this.j, this.e, TimeUnit.MILLISECONDS);
            kfe kfeVar2 = this.b;
            dbsk.s(kfeVar2);
            kfeVar2.b();
        }
    }

    public final void d(final lxy lxyVar) {
        this.h.execute(new Runnable(lxyVar) { // from class: lyk
            private final lxy a;

            {
                this.a = lxyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lxy lxyVar2 = this.a;
                bvrj.UI_THREAD.c();
                lxyVar2.a.j();
            }
        });
    }
}
