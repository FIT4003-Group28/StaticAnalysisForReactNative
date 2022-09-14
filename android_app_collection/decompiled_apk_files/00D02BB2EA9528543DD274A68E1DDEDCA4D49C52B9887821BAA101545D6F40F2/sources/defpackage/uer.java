package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: uer  reason: default package */
/* loaded from: classes7.dex */
public final class uer implements ufg {
    public static final dcqe a = dcqe.c("uer");
    private final Application b;
    private final axru c;
    private final tma d;
    private uew e;

    public uer(Application application, axru axruVar, tma tmaVar) {
        this.b = application;
        this.c = axruVar;
        this.d = tmaVar;
    }

    private final dcdc<amvh> g() {
        amvh amvhVar;
        if (this.c.a("android.permission.ACCESS_FINE_LOCATION")) {
            amvhVar = amvh.i(this.b);
        } else {
            amvhVar = amvh.a;
        }
        return dcdc.g(amvhVar, amvh.a);
    }

    @Override // defpackage.ufg
    public final crzm<uff> a() {
        return f().c();
    }

    @Override // defpackage.ufg
    public final void b(amvh amvhVar, int i) {
        dbsk.z(i, f().j().size());
        f().d(amvhVar, amvh.a, i, false);
    }

    @Override // defpackage.ufg
    public final void c(btlu btluVar) {
        dbsg<tmd> l = this.d.a(btluVar).l();
        dbsk.s(l);
        if (l.a()) {
            uew f = f();
            dbsk.s(l);
            f.i(l.b().c().g(), false);
            return;
        }
        f().i(g(), false);
    }

    @Override // defpackage.ufg
    public final void d(dcdc<amvh> dcdcVar) {
        f().i(dcdcVar, true);
    }

    @Override // defpackage.ufg
    public final void e(amvh amvhVar, int i) {
        f().d(amvhVar, null, i, true);
    }

    public final uew f() {
        if (this.e == null) {
            this.e = uex.a(g());
        }
        return this.e;
    }
}
