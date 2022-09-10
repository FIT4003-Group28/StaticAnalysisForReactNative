package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: allr  reason: default package */
/* loaded from: classes.dex */
public final class allr extends aljo<aktf, dmqi> implements alsk {
    public static int c;
    private final aktz A;
    private final amgl B;
    private final bnsn C;
    private boolean D;
    @dzsi
    private final aksx E;
    private float F;
    private boolean G;
    private final Runnable H;
    private final Runnable I;
    public also d;
    public also e;
    @dzsi
    public final amxj f;
    public final float g;
    public final akpq h;
    public final akzh i;
    public final Object j;
    public boolean k;
    public final boolean l;
    public final boolean m;
    public final bnrz n;
    public final allp o;
    public float p;
    public float q;
    public float r;
    public int s;
    final dcdc<alrj> t;
    public final Runnable u;
    private final Set<akuh> v;
    private final dmqi w;
    private final Set<Long> x;
    @dzsi
    private final amxm y;
    @dzsi
    private final amxp z;

    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public allr(defpackage.aktz r24, defpackage.amgl r25, defpackage.bnsn r26, defpackage.akpq r27, defpackage.btrm r28, defpackage.akzh r29, float r30, defpackage.dmqi r31, @defpackage.dzsi defpackage.aksx r32, defpackage.also r33, defpackage.akqn r34) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.allr.<init>(aktz, amgl, bnsn, akpq, btrm, akzh, float, dmqi, aksx, also, akqn):void");
    }

    private final void A(boolean z) {
        synchronized (this.j) {
            this.k = z;
        }
        t(this.I);
    }

    private final synchronized void f(also alsoVar) {
        this.a = false;
        this.v.clear();
        for (Long l : this.x) {
            this.v.add(alsoVar.a(l.longValue()));
        }
        if (this.v.isEmpty()) {
            s();
            return;
        }
        final bvpi bvpiVar = new bvpi(this.v.size(), new Runnable(this) { // from class: allg
            private final allr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        });
        for (akuh akuhVar : this.v) {
            akuhVar.c(new Runnable(bvpiVar) { // from class: allh
                private final bvpi a;

                {
                    this.a = bvpiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    private final void l() {
        float f;
        int i;
        int i2;
        amgr amgrVar;
        float f2;
        float f3;
        float f4;
        float f5;
        int i3;
        Iterator<ampl> it;
        int i4;
        float f6;
        int i5;
        Iterator<ampl> it2;
        int i6;
        float f7;
        bnuq bnuqVar = bnuq.INVALID;
        GeometryUtil a = GeometryUtil.getGeometryUtilFactory().a();
        amgr builderWithNormalizedDistance = a.getBuilderWithNormalizedDistance("client_line", 385, false, 0, 0);
        amgr builder = a.getBuilder("client_line", 17, false, 0, 0);
        if (this.m) {
            akzh b = this.i.b();
            f = akyx.x(b.p().k, b.z(), b.n(), b.C());
        } else {
            f = 1.0f;
        }
        dcdc<alrj> dcdcVar = this.t;
        int size = dcdcVar.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            alrj alrjVar = dcdcVar.get(i8);
            int i9 = this.s;
            dbsk.s(alrjVar.l);
            boolean e = alrjVar.e();
            float f8 = 0.0f;
            if (e) {
                alxl g = alrjVar.l.g(alrj.d(alrjVar.l, i9), i7);
                f3 = g.c;
                f4 = g.k;
                float f9 = g.l;
                float f10 = f3 + f4;
                Iterator<ampl> it3 = alrjVar.c.iterator();
                float f11 = 0.0f;
                while (it3.hasNext()) {
                    float f12 = f9;
                    ampl next = it3.next();
                    float f13 = f3;
                    float f14 = next.f;
                    if (f14 > f8) {
                        f5 = f4;
                        i3 = i8;
                        it = it3;
                        i4 = size;
                    } else {
                        Iterator<ampm> it4 = next.b.iterator();
                        while (it4.hasNext()) {
                            ampm next2 = it4.next();
                            Iterator<ampm> it5 = it4;
                            float f15 = next.f;
                            float f16 = f4;
                            float f17 = next2.h;
                            if (f17 <= 0.0f) {
                                f6 = f17;
                                int length = next2.b.length;
                                if (length != 0) {
                                    float[] fArr = new float[length];
                                    i5 = i8;
                                    it2 = it3;
                                    int i10 = 0;
                                    while (true) {
                                        int[] iArr = next2.b;
                                        i6 = size;
                                        if (i10 >= iArr.length) {
                                            break;
                                        }
                                        fArr[i10] = iArr[i10];
                                        i10++;
                                        size = i6;
                                    }
                                    f7 = ampm.a(fArr);
                                    next2.h = f7;
                                } else {
                                    i5 = i8;
                                    it2 = it3;
                                    i6 = size;
                                    float[] fArr2 = next2.c;
                                    if (fArr2.length != 0) {
                                        f7 = ampm.a(fArr2);
                                        next2.h = f7;
                                    }
                                }
                                next.f = f15 + f7;
                                it4 = it5;
                                f4 = f16;
                                i8 = i5;
                                it3 = it2;
                                size = i6;
                            } else {
                                f6 = f17;
                                i5 = i8;
                                it2 = it3;
                                i6 = size;
                            }
                            f7 = f6;
                            next.f = f15 + f7;
                            it4 = it5;
                            f4 = f16;
                            i8 = i5;
                            it3 = it2;
                            size = i6;
                        }
                        f5 = f4;
                        i3 = i8;
                        it = it3;
                        i4 = size;
                        f14 = next.f;
                    }
                    f11 += f14;
                    f3 = f13;
                    f9 = f12;
                    f4 = f5;
                    i8 = i3;
                    it3 = it;
                    size = i4;
                    f8 = 0.0f;
                }
                i = i8;
                i2 = size;
                alrjVar.i = GeometryUtil.getMaxGeneratedVerticesForPointSpriteLine(f11, f, f10);
                amgrVar = builder;
                f2 = f9;
            } else {
                i = i8;
                i2 = size;
                amgrVar = builderWithNormalizedDistance;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
            }
            amgrVar.l();
            float d = alrjVar.a.d();
            if (d != 0.0f) {
                amgrVar.h = 32767.0f / d;
            } else {
                amgrVar.h = 32767.0f;
            }
            amgrVar.j(alrjVar.i);
            alrjVar.e.r(alrjVar.a.a(alrjVar.c, e, new float[]{f3}, new float[]{f4}, new float[]{f2}, f, a, alrjVar.l, amgrVar));
            i8 = i + 1;
            f = f;
            size = i2;
            i7 = 0;
        }
        builderWithNormalizedDistance.b();
        builder.b();
        this.F = w(this.r);
    }

    private static float w(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (Math.floor(d / 0.25d) * 0.25d);
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pt(akvo<? super aktf> akvoVar) {
        super.Pt(akvoVar);
        amxj amxjVar = this.f;
        if (amxjVar == null) {
            return;
        }
        amxp amxpVar = this.z;
        if (amxpVar == null) {
            return;
        }
        amxjVar.n = amxpVar;
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pu() {
        super.Pu();
        amxj amxjVar = this.f;
        if (amxjVar == null) {
            return;
        }
        amxp amxpVar = this.z;
        if (amxpVar == null) {
            return;
        }
        amxjVar.n = amxpVar;
    }

    @Override // defpackage.aktf
    public final void a(akvx akvxVar) {
        final also alsoVar = (also) akvxVar;
        synchronized (this) {
            this.e = alsoVar;
            f(alsoVar);
        }
        q(new Runnable(this, alsoVar) { // from class: alli
            private final allr a;
            private final also b;

            {
                this.a = this;
                this.b = alsoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final allr allrVar = this.a;
                also alsoVar2 = this.b;
                synchronized (allrVar) {
                    if (allrVar.e == alsoVar2) {
                        allrVar.d = alsoVar2;
                        allrVar.t(new Runnable(allrVar) { // from class: allj
                            private final allr a;

                            {
                                this.a = allrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                allr allrVar2 = this.a;
                                allrVar2.c(allrVar2.r, true);
                            }
                        });
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a8, code lost:
        r2 = r29.y;
        r3 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ac, code lost:
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ad, code lost:
        r2.a.add(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b6, code lost:
        monitor-exit(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(float r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.allr.c(float, boolean):void");
    }

    public final void d() {
        bnuq bnuqVar = bnuq.INVALID;
        dcdc<alrj> dcdcVar = this.t;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bnuv bnuvVar = dcdcVar.get(i).m;
            if (bnuvVar instanceof amnt) {
                amnt amntVar = (amnt) bnuvVar;
                amntVar.c = this.p;
                allp allpVar = this.o;
                if (allpVar.a) {
                    float f = allpVar.b;
                    amntVar.a = true;
                    amntVar.b = f;
                } else {
                    amntVar.a = false;
                }
                amntVar.d = this.q;
                amntVar.b(this.r, this.s, this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(List<amxj> list) {
        dcdc<alrj> dcdcVar = this.t;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            list.add(dcdcVar.get(i).e);
        }
    }

    @Override // defpackage.aktj
    public final void h() {
        this.A.g(this);
    }

    @Override // defpackage.aktj
    public final void i() {
        throw null;
    }

    @Override // defpackage.aktj
    public final void j() {
        this.A.b(this);
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ dssj k() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aljo
    public final void o(aktn aktnVar) {
        p(aktnVar, this);
    }

    @Override // defpackage.alsl
    public final void v() {
        this.G = true;
        q(this.H);
    }

    @Override // defpackage.alsl
    public final synchronized void x() {
        if (this.b) {
            return;
        }
        if (!this.D) {
            this.D = true;
            dcdc<alrj> dcdcVar = this.t;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                this.C.h(dcdcVar.get(i).e);
            }
            amxj amxjVar = this.f;
            if (amxjVar != null) {
                aksx aksxVar = this.E;
                if (aksxVar != null) {
                    this.C.i(amxjVar, aksxVar);
                } else {
                    this.C.i(amxjVar, this);
                }
            }
        }
        A(true);
    }

    @Override // defpackage.alsl
    public final void y() {
        A(false);
    }

    @Override // defpackage.alsl
    public final synchronized void z() {
        if (this.b) {
            return;
        }
        this.h.c(this.u);
        this.b = true;
        u();
        if (this.D) {
            dcdc<alrj> dcdcVar = this.t;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                this.C.j(dcdcVar.get(i).e);
            }
            amxj amxjVar = this.f;
            if (amxjVar != null) {
                this.C.j(amxjVar);
            }
        }
    }
}
