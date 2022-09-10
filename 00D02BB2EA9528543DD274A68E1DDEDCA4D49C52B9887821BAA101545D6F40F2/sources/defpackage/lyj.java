package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lyj  reason: default package */
/* loaded from: classes7.dex */
public final class lyj implements lxs {
    public final bvrj a;
    public boolean b;
    @dzsi
    public kfe c;
    @dzsi
    public lya d;
    @dzsi
    dehu e;
    private final long f;
    private final lxt g;
    private final lxv h;
    private final Executor i;
    private final dehq j;
    private final Runnable k = new lyi(this);

    public lyj(long j, lxt lxtVar, lxv lxvVar, Executor executor, dehq dehqVar, bvrj bvrjVar) {
        dbsk.s(lxtVar);
        this.g = lxtVar;
        this.f = 15000L;
        dbsk.s(lxvVar);
        this.h = lxvVar;
        this.i = executor;
        this.a = bvrjVar;
        this.j = dehqVar;
    }

    @Override // defpackage.lxs
    public final void a(jzs jzsVar) {
        this.a.c();
        if (jzsVar.a) {
            final lya lyaVar = this.d;
            dbsk.s(lyaVar);
            e();
            b();
            lyaVar.getClass();
            d(new Runnable(lyaVar) { // from class: lyg
                private final lya a;

                {
                    this.a = lyaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    public final void b() {
        dbsk.s(this.d);
        this.d = null;
        this.g.b(this);
    }

    public final void c() {
        dbsk.l(this.b);
        this.b = false;
        this.h.b(this);
    }

    public final void d(Runnable runnable) {
        this.i.execute(runnable);
    }

    public final void e() {
        dehu dehuVar = this.e;
        if (dehuVar != null) {
            dehuVar.cancel(false);
            this.e = null;
        }
    }

    public final void f(final lya lyaVar) {
        this.a.c();
        e();
        if (!this.b) {
            this.b = true;
            this.h.a(this);
        }
        kfe kfeVar = this.c;
        if (kfeVar == null || kfeVar.a()) {
            if (this.d != null) {
                b();
            }
            lyaVar.getClass();
            d(new Runnable(lyaVar) { // from class: lyf
                private final lya a;

                {
                    this.a = lyaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
            return;
        }
        if (this.d == null) {
            this.g.a(this);
        }
        this.d = lyaVar;
        this.e = this.j.d(this.k, this.f, TimeUnit.MILLISECONDS);
        kfe kfeVar2 = this.c;
        dbsk.s(kfeVar2);
        kfeVar2.b();
    }
}
