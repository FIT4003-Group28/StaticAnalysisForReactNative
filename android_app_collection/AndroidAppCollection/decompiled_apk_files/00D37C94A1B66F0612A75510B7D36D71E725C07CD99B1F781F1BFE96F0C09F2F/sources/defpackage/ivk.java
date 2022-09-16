package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ivk  reason: default package */
/* loaded from: classes3.dex */
public final class ivk implements adlt {
    private final fpf a;
    private final adij b;
    private final fpg c;
    private final Handler d;
    private final adma e;
    private final admj f;

    public ivk(admj admjVar, fpf fpfVar, adij adijVar, fpg fpgVar, Handler handler, adma admaVar) {
        this.f = admjVar;
        fpfVar.getClass();
        this.a = fpfVar;
        this.b = adijVar;
        fpgVar.getClass();
        this.c = fpgVar;
        handler.getClass();
        this.d = handler;
        this.e = admaVar;
    }

    @Override // defpackage.adlt
    public final adij a() {
        return this.b;
    }

    @Override // defpackage.adlt
    public final admj b() {
        return this.f;
    }

    @Override // defpackage.adlt
    public final void c() {
        if (this.f.g) {
            return;
        }
        this.a.d();
    }

    @Override // defpackage.adlt
    public final void d(Runnable runnable) {
        ylr.c();
        this.e.b(this.f.h);
        if (this.f.g) {
            runnable.run();
            return;
        }
        this.c.b(this.a);
        this.d.postDelayed(runnable, 10000L);
    }

    @Override // defpackage.adlt
    public final boolean e() {
        return this.a.f();
    }
}
