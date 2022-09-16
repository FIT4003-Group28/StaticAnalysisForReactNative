package defpackage;

import android.content.res.Resources;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ardh  reason: default package */
/* loaded from: classes2.dex */
public final class ardh implements arci {
    private volatile boolean A;
    private final float[] B;
    public volatile boolean a;
    public float b = 1.0f;
    public volatile boolean c;
    public volatile boolean d;
    @dzsi
    public volatile String e;
    public volatile boolean f;
    @dzsi
    public String g;
    private final arcv h;
    private final pnv i;
    private final Set<arcb> j;
    private final arct k;
    private final arct l;
    private final arct m;
    @dzsi
    private final arcq n;
    @dzsi
    private final arct o;
    @dzsi
    private final arct p;
    @dzsi
    private final arct q;
    private final arch r;
    private final cqat s;
    private final Resources t;
    @dzsi
    private final arch u;
    private final ardg v;
    private volatile long w;
    private volatile boolean x;
    private final float y;
    private final float z;

    public ardh(Resources resources, arcv arcvVar, boolean z, String str, boolean z2, pnv pnvVar, cqat cqatVar, btrm btrmVar, dkiy dkiyVar, Executor executor) {
        ardg ardgVar = new ardg();
        this.v = ardgVar;
        this.c = false;
        this.w = 0L;
        this.x = false;
        this.d = false;
        this.A = true;
        this.B = new float[8];
        this.h = arcvVar;
        this.f = z;
        this.e = str;
        this.c = z2;
        this.s = cqatVar;
        this.t = resources;
        arct a = arcvVar.a(arcu.CHEVRON);
        this.k = a;
        arct a2 = arcvVar.a(arcu.BEARINGLESS_CHEVRON);
        this.l = a2;
        arct a3 = arcvVar.a(arcu.CHEVRON_DISC);
        this.m = a3;
        this.y = k(a, a3, resources);
        boolean z3 = dkiyVar.aD;
        if (z3 && btrmVar != null) {
            arcq d = arcvVar.b.d("Custom chevron picker", 3);
            this.n = d;
            d.d(alhz.INSTANCE, btrmVar, executor);
        } else {
            this.n = null;
        }
        if (z3 && btrmVar != null) {
            a.d(alhz.INSTANCE, btrmVar, executor);
            a2.d(alhz.INSTANCE, btrmVar, executor);
            a3.d(alhz.INSTANCE, btrmVar, executor);
        }
        this.i = pnvVar;
        if (pnvVar.a().h()) {
            pnvVar.a().c(new Runnable(this) { // from class: ardf
                private final ardh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a = true;
                }
            });
        }
        ardc ardcVar = arcvVar.b;
        aktc d2 = ardcVar.b.b.d(dmpn.r, dmti.WORLD_ENCODING_LAT_LNG_E7);
        d2.Pu();
        arch archVar = new arch(ardcVar.b.b, d2);
        this.r = archVar;
        archVar.d(ardgVar);
        arct a4 = arcvVar.a(arcu.DIM_CHEVRON);
        this.o = a4;
        arct a5 = arcvVar.a(arcu.DIM_BEARINGLESS_CHEVRON);
        this.p = a5;
        arct a6 = arcvVar.a(arcu.DIM_CHEVRON_DISC);
        this.q = a6;
        ardc ardcVar2 = arcvVar.b;
        arcw arcwVar = arcvVar.a;
        arch archVar2 = new arch(ardcVar2.b.b, ardcVar2.g(arcwVar.h, arcwVar.e, arcwVar.g));
        this.u = archVar2;
        if (archVar2 != null) {
            archVar2.d(ardgVar);
        }
        this.z = k(a4, a6, resources);
        HashSet d3 = dcnm.d(a, a2, null, a3, archVar, archVar2, a4, a5, a6);
        arcq arcqVar = this.n;
        if (arcqVar != null) {
            d3.add(arcqVar);
        }
        d3.removeAll(Collections.singleton(null));
        this.j = d3;
    }

    private static void g(@dzsi arcq arcqVar, akra akraVar, float f, boolean z, float f2) {
        arcqVar.e(akraVar, Float.valueOf(f2), z ? Float.valueOf(-f) : null, null);
    }

    private static void h(@dzsi arcb arcbVar, boolean z) {
        if (arcbVar != null) {
            arcbVar.a(z);
        }
    }

    private final String i(pnp pnpVar) {
        return j(pnpVar) ? pnpVar.g : pnp.DRIVE.g;
    }

    private final boolean j(pnp pnpVar) {
        return this.i.a().a().contains(pnpVar.g);
    }

    private static float k(@dzsi arcq arcqVar, @dzsi arcq arcqVar2, Resources resources) {
        int c;
        if (arcqVar2 != null) {
            c = arcqVar2.c();
        } else {
            c = arcqVar != null ? arcqVar.c() : 1;
        }
        return resources.getDisplayMetrics() != null ? (resources.getDisplayMetrics().density * 92.0f) / c : 92.0f / c;
    }

    private final void l(arch archVar, akra akraVar, float f, akzh akzhVar) {
        float f2 = akzhVar.p().l;
        float d = akyx.d(akzhVar, akraVar);
        double cos = Math.cos(Math.toRadians(f2));
        archVar.a(this.A);
        akyx.q(akzhVar, akraVar, this.B);
        float[] fArr = this.B;
        akyx.r(akzhVar, fArr[0], fArr[1] + (f * d * ((float) cos)), this.v.a, fArr);
        if (!archVar.c) {
            archVar.b.b(this.v.a);
            archVar.a.a(archVar.b);
            archVar.c = true;
        }
    }

    private final void m(akra akraVar, float f, akzh akzhVar) {
        String str;
        String str2 = this.e;
        boolean z = this.f;
        boolean z2 = !z && this.c && this.u != null;
        arch archVar = this.u;
        boolean z3 = !z && !z2 && str2 != null;
        if (z2) {
            dbsk.s(archVar);
            h(this.r, false);
            l(archVar, akraVar, f, akzhVar);
            this.g = null;
        } else if (z3) {
            dbsk.s(str2);
            h(archVar, false);
            if (!str2.equals(this.g)) {
                String a = anah.a(str2, 26);
                try {
                    try {
                        arcv arcvVar = this.h;
                        dbsk.s(a);
                        arch archVar2 = this.r;
                        ardc ardcVar = arcvVar.b;
                        arcw arcwVar = arcvVar.a;
                        int i = arcwVar.d;
                        int i2 = arcwVar.e;
                        int i3 = arcwVar.f;
                        if (archVar2 != null) {
                            akuh b = ardcVar.c.b(i, i2);
                            akuh a2 = ardcVar.c.a(i3);
                            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                            int a3 = arca.a(4);
                            try {
                                if (dmpkVar.c) {
                                    dmpkVar.bF();
                                    dmpkVar.c = false;
                                }
                                dmpn dmpnVar = (dmpn) dmpkVar.b;
                                dmpnVar.a |= 8192;
                                dmpnVar.m = a3;
                                dmpe dmpeVar = (dmpe) dmph.f.bZ();
                                int a4 = a2.a();
                                if (dmpeVar.c) {
                                    dmpeVar.bF();
                                    dmpeVar.c = false;
                                }
                                dmph dmphVar = (dmph) dmpeVar.b;
                                dmphVar.a |= 1;
                                dmphVar.c = a4;
                                dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                                if (dmpcVar.c) {
                                    dmpcVar.bF();
                                    dmpcVar.c = false;
                                }
                                dmpd dmpdVar = (dmpd) dmpcVar.b;
                                a.getClass();
                                dmpdVar.a |= 1;
                                dmpdVar.b = a;
                                int a5 = b.a();
                                if (dmpcVar.c) {
                                    dmpcVar.bF();
                                    dmpcVar.c = false;
                                }
                                dmpd dmpdVar2 = (dmpd) dmpcVar.b;
                                dmpdVar2.a |= 2;
                                dmpdVar2.c = a5;
                                dmpeVar.b(dmpcVar);
                                if (dmpkVar.c) {
                                    dmpkVar.bF();
                                    dmpkVar.c = false;
                                }
                                dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                                dmph dmphVar2 = (dmph) dmpeVar.bK();
                                dmphVar2.getClass();
                                dmpnVar2.b = dmphVar2;
                                dmpnVar2.a = 1 | dmpnVar2.a;
                                dmlp bZ = dmlq.e.bZ();
                                dmlo dmloVar = dmlo.BOTTOM;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dmlq dmlqVar = (dmlq) bZ.b;
                                dmlqVar.c = dmloVar.j;
                                dmlqVar.a |= 2;
                                if (dmpkVar.c) {
                                    dmpkVar.bF();
                                    dmpkVar.c = false;
                                }
                                dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                                dmlq bK = bZ.bK();
                                bK.getClass();
                                dmpnVar3.d = bK;
                                dmpnVar3.a |= 4;
                                if (dmpkVar.c) {
                                    dmpkVar.bF();
                                    dmpkVar.c = false;
                                }
                                dmpn dmpnVar4 = (dmpn) dmpkVar.b;
                                dmpnVar4.a |= 32;
                                dmpnVar4.g = 3;
                                dsqv<dmpn, akus> dsqvVar = akvj.a;
                                akuq bZ2 = akus.o.bZ();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                akus.b((akus) bZ2.b);
                                dmpkVar.k(dsqvVar, bZ2.bK());
                                archVar2.c(ardcVar.b.b.d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7));
                            } catch (OutOfMemoryError e) {
                                e = e;
                                str = null;
                                bvoo.k(e);
                                h(this.r, false);
                                this.g = str;
                                return;
                            }
                        }
                        this.g = str2;
                        l(this.r, akraVar, f, akzhVar);
                    } catch (NullPointerException e2) {
                        bvoo.k(e2);
                        h(this.r, false);
                        this.g = null;
                    }
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    str = null;
                }
            } else {
                l(this.r, akraVar, f, akzhVar);
            }
        } else {
            h(this.r, false);
            h(archVar, false);
            this.g = null;
        }
    }

    @Override // defpackage.arci
    public final void b(boolean z) {
        this.A = z;
        if (this.a) {
            if (this.A) {
                this.i.a().d();
            } else {
                this.i.a().e();
            }
        }
    }

    @Override // defpackage.arci
    public final void c() {
        for (arcb arcbVar : this.j) {
            arcbVar.a(false);
        }
        this.i.a().e();
    }

    public final void d(arcw arcwVar) {
        arcv arcvVar = this.h;
        arcvVar.a = arcwVar;
        arcvVar.b(this.k);
        this.h.b(this.l);
        this.h.b(this.m);
        this.h.b(this.o);
        this.h.b(this.q);
        arch archVar = this.u;
        if (archVar != null) {
            arcv arcvVar2 = this.h;
            ardc ardcVar = arcvVar2.b;
            arcw arcwVar2 = arcvVar2.a;
            archVar.c(ardcVar.g(arcwVar2.h, arcwVar2.e, arcwVar2.g));
        }
        this.g = null;
    }

    public final void e() {
        this.x = true;
    }

    public final void f() {
        for (arcb arcbVar : this.j) {
            arcbVar.b();
        }
    }

    @Override // defpackage.arci
    public final void a(area areaVar, akzh akzhVar) {
        int c;
        float a;
        arct arctVar;
        arct arctVar2;
        if (areaVar.e()) {
            akra akraVar = areaVar.a;
            dbsk.s(akraVar);
            float a2 = this.y * ardi.a(this.k.c(), areaVar.q * this.b);
            if (!this.i.a().h() || !this.a) {
                this.i.a().e();
                arcq arcqVar = this.n;
                if (arcqVar != null) {
                    arcqVar.a(false);
                }
                arct arctVar3 = this.o;
                if (arctVar3 == null && this.q == null) {
                    a = 0.0f;
                } else {
                    float f = this.z;
                    if (arctVar3 != null) {
                        c = arctVar3.c();
                    } else {
                        arct arctVar4 = this.q;
                        dbsk.s(arctVar4);
                        c = arctVar4.c();
                    }
                    a = f * ardi.a(c, areaVar.q * this.b);
                }
                if (areaVar.k) {
                    if (!this.c || (arctVar2 = this.o) == null) {
                        g(this.k, akraVar, areaVar.e, areaVar.k, a2);
                        h(this.k, this.A);
                        h(this.l, false);
                        h(this.o, false);
                        h(this.p, false);
                    } else {
                        g(arctVar2, akraVar, areaVar.e, areaVar.k, a);
                        h(this.k, false);
                        h(this.l, false);
                        h(this.o, this.A);
                        h(this.p, false);
                    }
                } else if (!this.c || (arctVar = this.p) == null) {
                    g(this.l, akraVar, 0.0f, false, a2);
                    h(this.k, false);
                    h(this.l, this.A);
                    h(this.o, false);
                    h(this.p, false);
                } else {
                    g(arctVar, akraVar, 0.0f, false, a);
                    h(this.k, false);
                    h(this.l, false);
                    h(this.o, false);
                    h(this.p, this.A);
                }
                if (!this.c || this.q == null) {
                    h(this.m, this.A);
                    h(this.q, false);
                } else {
                    h(this.m, false);
                    h(this.q, this.A);
                }
                Float valueOf = Float.valueOf(-akzhVar.p().m);
                this.m.e(akraVar, Float.valueOf(areaVar.r * a2), valueOf, null);
                arct arctVar5 = this.q;
                if (arctVar5 != null) {
                    arctVar5.e(akraVar, Float.valueOf(areaVar.r * a2), valueOf, null);
                }
            } else {
                for (arcb arcbVar : this.j) {
                    arcbVar.a(false);
                }
                arcq arcqVar2 = this.n;
                if (arcqVar2 != null) {
                    arcqVar2.a(true);
                }
                aksm a3 = this.i.a();
                pns b = this.i.b();
                if (!this.A) {
                    a3.e();
                    arcq arcqVar3 = this.n;
                    if (arcqVar3 != null) {
                        arcqVar3.a(false);
                    }
                } else {
                    long e = this.s.e();
                    float f2 = 1.0f;
                    if (e > this.w + b.f()) {
                        this.w = e;
                        if (this.x && j(pnp.START)) {
                            this.w = e;
                            a3.b(i(pnp.START));
                            this.x = false;
                        } else if (!this.d || !j(pnp.ARRIVAL)) {
                            double sin = Math.sin(Math.toRadians((180.0f - areaVar.f) - (180.0f - areaVar.e)));
                            if (sin > b.g()) {
                                a3.b(i(pnp.TURN_LEFT));
                            } else if (sin < (-b.g())) {
                                a3.b(i(pnp.TURN_RIGHT));
                            } else if (areaVar.g > 1.0f) {
                                a3.b(i(pnp.DRIVE));
                            } else {
                                a3.b(i(pnp.IDLE));
                            }
                        } else {
                            this.w = e;
                            a3.b(i(pnp.ARRIVAL));
                            this.d = false;
                        }
                    }
                    float i = b.i() - areaVar.e;
                    if (this.t.getDisplayMetrics() != null) {
                        f2 = this.t.getDisplayMetrics().density;
                    }
                    a3.g(b.e() * ardi.b(akzhVar.p().k, akzhVar.p().l) * f2);
                    a3.f(b.h(), i, b.j());
                    akra akraVar2 = areaVar.a;
                    dbsk.s(akraVar2);
                    a3.j(akraVar2.S());
                    a3.d();
                    float a4 = this.y * ardi.a(this.k.c(), areaVar.q);
                    arcq arcqVar4 = this.n;
                    if (arcqVar4 != null) {
                        arcqVar4.e(areaVar.a, Float.valueOf(a4), null, null);
                    }
                }
            }
            m(akraVar, a2, akzhVar);
            return;
        }
        for (arcb arcbVar2 : this.j) {
            arcbVar2.a(false);
        }
        this.i.a().e();
    }
}
