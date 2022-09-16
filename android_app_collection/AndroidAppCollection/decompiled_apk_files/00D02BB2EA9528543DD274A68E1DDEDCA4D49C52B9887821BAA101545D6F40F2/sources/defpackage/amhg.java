package defpackage;

import android.content.res.Resources;
import android.graphics.RectF;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: amhg  reason: default package */
/* loaded from: classes2.dex */
public final class amhg extends amhk {
    private static final dcqe t = dcqe.c("amhg");
    private boolean B;
    @dzsi
    private bnve C;
    private amkv D;
    private ammu E;
    private amlm F;
    private float G;
    private Resources H;
    @dzsi
    private amfq I;
    @dzsi
    private ardg O;
    public boolean a;
    public float c;
    @dzsi
    public amku d;
    @dzsi
    private aktc w;
    private boolean x;
    @dzsi
    private amhp y;
    @dzsi
    private amhp z;
    private final amkz u = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
    private volatile float v = 0.0f;
    private final akra A = new akra();
    public dmlo b = dmlo.BOTTOM_LEFT;
    private final aktb J = new aktb();
    private final akse K = new akse();
    private final akse L = new akse();
    private amhb M = amhb.CENTERED;
    private amhb N = amhb.CENTERED;

    private final void F() {
        this.K.r(this.M.a(H(), J()), this.N.a(I(), K()));
        if (this.z != null) {
            this.L.r(this.M.b(H(), J()), this.N.b(I(), K()));
        }
    }

    private final boolean G() {
        amku amkuVar = this.d;
        if (amkuVar != null && amkuVar.c == b() && this.d.d == c()) {
            return false;
        }
        float b = b();
        float c = c();
        amhp amhpVar = this.y;
        this.d = new amku(b, c, amhpVar != null ? amhpVar.e : 0.0f, amhpVar != null ? amhpVar.f : 0.0f, this.b, this.h, this.G, true);
        return true;
    }

    private final float H() {
        amhp amhpVar = this.y;
        if (amhpVar != null) {
            return amhpVar.d();
        }
        return 0.0f;
    }

    private final float I() {
        amhp amhpVar = this.y;
        if (amhpVar != null) {
            return amhpVar.e();
        }
        return 0.0f;
    }

    private final float J() {
        amhp amhpVar = this.z;
        if (amhpVar != null) {
            return amhpVar.d();
        }
        return 0.0f;
    }

    private final float K() {
        amhp amhpVar = this.z;
        if (amhpVar != null) {
            return amhpVar.e();
        }
        return 0.0f;
    }

    private final boolean L() {
        amhp amhpVar = this.y;
        if (amhpVar == null || amhpVar.h()) {
            amhp amhpVar2 = this.z;
            if ((amhpVar2 != null && !amhpVar2.h()) || this.d == null) {
                return false;
            }
            bnve bnveVar = this.C;
            if (bnveVar != null) {
                bnveVar.c();
            }
            amku amkuVar = this.d;
            dbsk.s(amkuVar);
            bnvf a = new amlk(amkuVar, this.D, this.H).a();
            if (a == null) {
                return true;
            }
            this.C = a.b(0);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amhk
    public final void a() {
        this.a = true;
        amhp amhpVar = this.y;
        if (amhpVar != null) {
            amhpVar.c();
            this.y = null;
        }
        amhp amhpVar2 = this.z;
        if (amhpVar2 != null) {
            amhpVar2.c();
            this.z = null;
        }
        bnve bnveVar = this.C;
        if (bnveVar != null) {
            bnveVar.c();
            this.C = null;
        }
        this.x = false;
        this.d = null;
        this.w = null;
        this.v = 0.0f;
        super.a();
    }

    final float b() {
        amhb amhbVar = amhb.SECONDARY_FIRST;
        int ordinal = this.M.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return Math.max(H(), J());
            }
            if (ordinal != 4) {
                bvoo.h("Unsupported secondary label horizontal alignment: %s", this.M);
                return H() + J();
            }
        }
        return H() + J();
    }

    final float c() {
        amhb amhbVar = amhb.SECONDARY_FIRST;
        int ordinal = this.N.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return Math.max(I(), K());
            }
            if (ordinal != 4) {
                bvoo.h("Unsupported secondary label vertical alignment: %s", this.N);
                return Math.max(I(), K());
            }
        }
        return I() + K();
    }

    public final boolean d() {
        alyd alydVar = this.h.r;
        if (alydVar != null) {
            return alydVar.m().contains(this.b);
        }
        return false;
    }

    @Override // defpackage.amhk, defpackage.amhh
    public final void e() {
        Semaphore semaphore;
        this.e.acquireUninterruptibly();
        try {
            if (!this.a) {
                semaphore = this.e;
            } else if (!L()) {
                semaphore = this.e;
            } else {
                this.a = false;
                semaphore = this.e;
            }
            semaphore.release();
        } catch (Throwable th) {
            this.e.release();
            throw th;
        }
    }

    @Override // defpackage.amhh
    public final float f() {
        return this.v;
    }

    @Override // defpackage.amhk, defpackage.amhh
    public final boolean g() {
        return true;
    }

    public final boolean h() {
        dmph dmphVar;
        this.e.acquireUninterruptibly();
        try {
            if (this.x) {
                return true;
            }
            dmph dmphVar2 = this.f.a().b;
            if (dmphVar2 == null) {
                dmphVar2 = dmph.f;
            }
            dmph dmphVar3 = dmphVar2;
            if ((this.f.a().a & 2) != 0) {
                dmphVar = this.f.a().c;
                if (dmphVar == null) {
                    dmphVar = dmph.f;
                }
            } else {
                dmphVar = null;
            }
            amhp a = amhp.a(dmphVar3, this.f, this.H, this.D, this.E, this.F, this.I, this.k);
            amhp a2 = amhp.a(dmphVar, this.f, this.H, this.D, this.E, this.F, this.I, this.k);
            this.x = a != null && (dmphVar == null || a2 != null);
            amhp amhpVar = this.y;
            if (amhpVar != null) {
                amhpVar.c();
            }
            this.y = a;
            amhp amhpVar2 = this.z;
            if (amhpVar2 != null) {
                amhpVar2.c();
            }
            this.z = a2;
            this.a = true;
            if (this.x && d()) {
                G();
                if (L()) {
                    this.a = false;
                }
            }
            this.e.release();
            return this.x;
        } finally {
            this.e.release();
        }
    }

    public final void i(akra akraVar) {
        this.A.aa(akraVar);
        this.B = true;
    }

    @Override // defpackage.amhh
    public final amla j() {
        amkz amkzVar = this.u;
        amla amlaVar = new amla();
        float f = amkzVar.a;
        float f2 = amkzVar.c;
        float f3 = amkzVar.b;
        float f4 = amkzVar.d;
        amlaVar.h((f + f2) * 0.5f, (f3 + f4) * 0.5f, dcyn.a, (f2 - f) * 0.5f, (f4 - f3) * 0.5f);
        return amlaVar;
    }

    @Override // defpackage.amhk, defpackage.amhh
    @dzsi
    public final aktd k() {
        return this.w;
    }

    @Override // defpackage.amhk, defpackage.amhh
    public final /* bridge */ /* synthetic */ void l(boolean z) {
    }

    @Override // defpackage.amhk, defpackage.amhh, defpackage.amyg
    public final int m(amxr amxrVar, boolean z, akra akraVar) {
        aktc aktcVar = this.w;
        int i = 1;
        if (aktcVar == null || aktcVar.f()) {
            this.e.acquireUninterruptibly();
            try {
                akraVar.aa(this.A);
                amkz amkzVar = this.u;
                akse akseVar = amkzVar.e;
                if (true == amxrVar.a(akseVar.b, akseVar.c, dcyn.a, amkzVar.b(), this.u.c())) {
                    i = 2;
                }
                return i;
            } finally {
                this.e.release();
            }
        }
        return 1;
    }

    @Override // defpackage.amhk, defpackage.amhh
    public final void n(akra akraVar, int i, btrm btrmVar) {
        aktc aktcVar = this.w;
        if (aktcVar != null) {
            btrmVar.b(new algo(aktcVar));
        }
    }

    public final void o(@dzsi ardg ardgVar) {
        this.e.acquireUninterruptibly();
        try {
            this.O = ardgVar;
        } finally {
            this.e.release();
        }
    }

    public final void p(amkk amkkVar, int i, float f, amlm amlmVar, ammu ammuVar, amkv amkvVar, @dzsi amfq amfqVar, bntn bntnVar, Resources resources, @dzsi dmlo dmloVar, @dzsi dmpm dmpmVar, amky amkyVar, aktc aktcVar) {
        Iterable iterable;
        dmlo dmloVar2;
        dmpn a = amkkVar.a();
        dmph dmphVar = a.b;
        if (dmphVar == null) {
            dmphVar = dmph.f;
        }
        alxo b = amlmVar.b(dmphVar, a, amkkVar.c(), 0);
        super.E(amkkVar, i, b, bntnVar, amkyVar);
        this.a = true;
        amje i2 = amkkVar.i();
        if (i2.f()) {
            i(i2.a().a);
        } else {
            this.B = false;
        }
        this.F = amlmVar;
        this.E = ammuVar;
        this.D = amkvVar;
        this.G = f;
        this.I = amfqVar;
        if (dmloVar != null) {
            dmloVar2 = dmloVar;
        } else {
            if (!b.c()) {
                iterable = dcmr.a;
            } else {
                iterable = dcep.K(b.r.m());
            }
            dmloVar2 = (dmlo) dcft.r(iterable, dmlo.BOTTOM_LEFT);
        }
        this.b = dmloVar2;
        if (dmpmVar != null) {
            this.M = amhb.c(dmpmVar);
            this.N = amhb.d(dmpmVar);
        }
        this.c = 1.0f;
        this.H = resources;
        this.w = aktcVar;
        h();
    }

    @Override // defpackage.amhh
    public final boolean q(amjo amjoVar, akzh akzhVar, bntz bntzVar) {
        Object b;
        amku amkuVar;
        boolean z = false;
        if (this.e.tryAcquire()) {
            try {
                if (this.B && akzhVar.p().k >= this.f.k() - 1.0f) {
                    float[] fArr = amjoVar.g;
                    ardg ardgVar = this.O;
                    if (ardgVar != null) {
                        aktb aktbVar = this.J;
                        aktbVar.b(ardgVar.a);
                        aktbVar.b = dmlo.BOTTOM;
                        i(this.J.a);
                        akyx.o(akzhVar, this.A, fArr);
                        dmlo dmloVar = this.b;
                        dmlo dmloVar2 = this.J.b;
                        if (dmloVar != dmloVar2) {
                            this.b = dmloVar2;
                            if (d() && (amkuVar = this.d) != null) {
                                amkuVar.b(this.b);
                            }
                            this.a = true;
                        }
                    } else {
                        akyx.o(akzhVar, this.A, fArr);
                    }
                    if (!this.a) {
                        aktc aktcVar = this.w;
                        if (aktcVar != null) {
                            float f = fArr[0];
                            float f2 = fArr[1];
                            dmpn k = ((alkx) aktcVar).k();
                            dsqv<dmpn, akuj> dsqvVar = akvj.b;
                            k.f(dsqvVar);
                            Object l = k.V.l(dsqvVar.d);
                            if (l == null) {
                                b = dsqvVar.b;
                            } else {
                                b = dsqvVar.b(l);
                            }
                            akwy.a(f, f2, ((akuj) b).b, this.b, fArr);
                        }
                        float f3 = fArr[0];
                        float f4 = fArr[1];
                        amku amkuVar2 = this.d;
                        dbsk.s(amkuVar2);
                        float f5 = this.c;
                        akse akseVar = amjoVar.a;
                        amkz amkzVar = amkuVar2.k;
                        amkuVar2.d(f3, f4, f5, amkuVar2.g, amkuVar2.j, amkzVar);
                        RectF rectF = amkuVar2.j;
                        float c = amkuVar2.c(amkuVar2.a) / 2.0f;
                        amkzVar.a(amkzVar.a + (((rectF.left + c) - amkuVar2.e) * f5), amkzVar.b + (rectF.top * f5), amkzVar.c - (((rectF.right + c) - amkuVar2.f) * f5), amkzVar.d - (rectF.bottom * f5));
                        amkuVar2.k = amkzVar;
                        akseVar.s(amkuVar2.k.e);
                        amkuVar2.f(f3, f4, this.c, amkuVar2.g, amkuVar2.j, amjoVar.b);
                        amkuVar2.e(f3, f4, this.u);
                        F();
                        akse akseVar2 = amjoVar.a;
                        akse akseVar3 = amjoVar.c;
                        akse akseVar4 = amjoVar.d;
                        float f6 = akseVar2.b;
                        akse akseVar5 = this.K;
                        akseVar3.r(f6 + akseVar5.b, akseVar2.c + akseVar5.c);
                        float f7 = akseVar2.b;
                        akse akseVar6 = this.L;
                        akseVar4.r(f7 + akseVar6.b, akseVar2.c + akseVar6.c);
                        bnve bnveVar = this.C;
                        if (bnveVar != null) {
                            bnrz bnrzVar = this.i;
                            akse akseVar7 = amjoVar.b;
                            float f8 = akseVar7.b;
                            float f9 = akseVar7.c;
                            float f10 = bnveVar.d;
                            float f11 = bnveVar.f;
                            float f12 = this.c;
                            float f13 = bnveVar.e;
                            bntzVar.c(bnveVar, bnrzVar, f8, f9, f10 * f11 * f12, f11 * f13 * f12, bnveVar.b, bnveVar.c, f10, f13, this.l);
                            amhp amhpVar = this.y;
                            if (amhpVar != null) {
                                akse akseVar8 = amjoVar.c;
                                amhpVar.m(bntzVar, akseVar8.b, akseVar8.c, this.c, this.l, this.i);
                            }
                            amhp amhpVar2 = this.z;
                            if (amhpVar2 != null) {
                                akse akseVar9 = amjoVar.d;
                                amhpVar2.m(bntzVar, akseVar9.b, akseVar9.c, this.c, this.l, this.i);
                            }
                            z = true;
                        }
                        amhp amhpVar3 = this.y;
                        this.v = amhpVar3 != null ? amhpVar3.g() : 0.0f;
                    }
                    return z;
                }
                z = true;
                return z;
            } finally {
                this.e.release();
            }
        }
        return false;
    }

    @Override // defpackage.amhh
    public final boolean r(amjo amjoVar, akzh akzhVar) {
        Object b;
        float[] fArr = amjoVar.g;
        if (!h()) {
            return false;
        }
        this.e.acquireUninterruptibly();
        try {
            if (!d()) {
                return false;
            }
            if (this.B) {
                akyx.o(akzhVar, this.A, fArr);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
            }
            if (G()) {
                this.a = true;
            }
            amku amkuVar = this.d;
            if (amkuVar != null) {
                aktc aktcVar = this.w;
                if (aktcVar != null) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    dmpn k = ((alkx) aktcVar).k();
                    dsqv<dmpn, akuj> dsqvVar = akvj.b;
                    k.f(dsqvVar);
                    Object l = k.V.l(dsqvVar.d);
                    if (l == null) {
                        b = dsqvVar.b;
                    } else {
                        b = dsqvVar.b(l);
                    }
                    akwy.a(f, f2, ((akuj) b).b, this.b, fArr);
                }
                amkuVar.e(fArr[0], fArr[1], this.u);
                F();
            }
            return true;
        } finally {
            this.e.release();
        }
    }
}
