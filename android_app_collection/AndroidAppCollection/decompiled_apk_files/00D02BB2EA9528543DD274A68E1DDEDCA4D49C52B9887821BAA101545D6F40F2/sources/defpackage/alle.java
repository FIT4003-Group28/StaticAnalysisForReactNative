package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alle  reason: default package */
/* loaded from: classes2.dex */
public final class alle extends aljo<akte, dmqg> implements alsj {
    public static final alwo[] c = new alwo[0];
    public float d;
    @dzsi
    public amls e;
    public amls f;
    public final Object g;
    public final List<akuh> h;
    public boolean i;
    public final Map<dmti, akqn> j;
    public dmqg k;
    public amme l;
    private alwo[] m;
    private final aktz n;
    private final bnsn o;
    private final akpq p;
    private final bvnx q;

    public alle(aktz aktzVar, amgl amglVar, bnsn bnsnVar, Map<dmti, akqn> map, akpq akpqVar, btrm btrmVar, Context context, bvnx bvnxVar) {
        super(akpqVar);
        this.d = 0.0f;
        this.g = new Object();
        this.h = new ArrayList();
        this.j = map;
        this.o = bnsnVar;
        this.p = akpqVar;
        this.n = aktzVar;
        this.m = null;
        this.k = null;
        this.l = null;
        this.q = bvnxVar;
        this.l = new amme(amglVar, bnsnVar, this, context.getResources().getDisplayMetrics().density, btrmVar);
    }

    private final void f(final boolean z) {
        boolean z2;
        synchronized (this) {
            if (this.b) {
                return;
            }
            synchronized (this.g) {
                if (this.h.isEmpty()) {
                    z2 = true;
                } else {
                    final bvpi bvpiVar = new bvpi(this.h.size(), new Runnable(this, z) { // from class: alkz
                        private final alle a;
                        private final boolean b;

                        {
                            this.a = this;
                            this.b = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.e(this.b);
                        }
                    });
                    for (akuh akuhVar : this.h) {
                        akuhVar.c(new Runnable(bvpiVar) { // from class: alla
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
                    z2 = false;
                }
            }
            if (!z2) {
                return;
            }
            e(z);
        }
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pt(akvo<? super akte> akvoVar) {
        super.Pt(akvoVar);
        amme ammeVar = this.l;
        synchronized (ammeVar.j) {
            if (ammeVar.l) {
                return;
            }
            ammeVar.l = true;
            amxj amxjVar = ammeVar.i;
            if (amxjVar != null) {
                amxjVar.n = ammeVar.k;
            }
        }
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pu() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // defpackage.akte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.amub r12, @defpackage.dzsi com.google.android.apps.gmm.map.model.location.GmmLocation r13, float r14) {
        /*
            r11 = this;
            amme r0 = r11.l
            bvnx r4 = r11.q
            r1 = 0
            double r5 = defpackage.aqzx.b(r13, r12, r1)
            if (r13 == 0) goto L3f
            boolean r3 = r13.hasSpeed()
            if (r3 == 0) goto L3f
            boolean r3 = r13.hasSpeedAccuracy()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L22
            float r3 = r13.getSpeedAccuracyMetersPerSecond()
            float r7 = java.lang.Math.min(r7, r3)
        L22:
            float r3 = r13.getSpeed()
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L3f
            float r3 = r13.getSpeed()
            double r7 = (double) r3
            akra r13 = r13.h
            double r9 = r13.r()
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            goto L40
        L3f:
            r7 = r1
        L40:
            boolean r13 = java.lang.Double.isNaN(r5)
            r3 = 1
            if (r3 == r13) goto L48
            goto L49
        L48:
            r7 = r1
        L49:
            if (r3 == r13) goto L4c
            goto L52
        L4c:
            r1 = -4039728866288205824(0xc7efffffe0000000, double:-3.4028234663852886E38)
            r5 = r1
        L52:
            aqzx r13 = new aqzx
            r1 = r13
            r2 = r12
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r7)
            r0.y = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alle.a(amub, com.google.android.apps.gmm.map.model.location.GmmLocation, float):void");
    }

    @Override // defpackage.akte
    public final void b(@dzsi GmmLocation gmmLocation) {
        double d;
        aqzx aqzxVar = this.l.y;
        if (aqzxVar != null) {
            synchronized (aqzxVar.a) {
                if (gmmLocation != null) {
                    long a = aqzxVar.d.a();
                    double d2 = a - aqzxVar.e;
                    Double.isNaN(d2);
                    double min = Math.min(d2 / 1000.0d, 1.0d);
                    double b = aqzx.b(gmmLocation, aqzxVar.b, aqzxVar.c.d(min));
                    if (!Double.isNaN(b)) {
                        if (gmmLocation.hasSpeed()) {
                            double speed = gmmLocation.getSpeed();
                            double r = gmmLocation.h.r();
                            Double.isNaN(speed);
                            d = speed * r;
                        } else {
                            d = dcyn.a;
                        }
                        double d3 = d;
                        double d4 = b + d3;
                        aqzxVar.e = a;
                        aqzxVar.c.h(min, d4, d3);
                    }
                }
            }
        }
    }

    @Override // defpackage.akte
    public final Set<Long> c() {
        synchronized (this) {
            HashSet hashSet = new HashSet();
            alwo[] alwoVarArr = this.m;
            if (alwoVarArr == null) {
                return hashSet;
            }
            for (alwo alwoVar : alwoVarArr) {
                alxp alxpVar = alwoVar.e;
                HashSet hashSet2 = new HashSet();
                alxo[] alxoVarArr = alxpVar.b;
                if (alxoVarArr != null && (r7 = alxoVarArr.length) != 0) {
                    for (alxo alxoVar : alxoVarArr) {
                        alxl[] alxlVarArr = alxoVar.o;
                        int length = alxlVarArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (!alxlVarArr[i].c()) {
                                hashSet2.add(Long.valueOf(alxoVar.d));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                hashSet.addAll(hashSet2);
            }
            return hashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(alwo[] alwoVarArr) {
        if (alwoVarArr.length == 0) {
            return;
        }
        amme ammeVar = this.l;
        alwo alwoVar = alwoVarArr[0];
        long j = alwoVar.e.c(alwoVar.q).E;
        alwo alwoVar2 = alwoVarArr[0];
        long j2 = alwoVar2.b;
        long j3 = alwoVar2.c;
        synchronized (ammeVar.w) {
            ammeVar.t = j;
            ammeVar.u = j2;
            ammeVar.v = j3;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.a = false;
            amls amlsVar = this.e;
            if (amlsVar != null) {
                amlsVar.b();
            }
            this.m = alwoVarArr;
            this.e = new amls(alwoVarArr, this.l, this.o, this.p);
            f(true);
        }
    }

    public final void e(final boolean z) {
        synchronized (this) {
            amls amlsVar = this.e;
            if (amlsVar != null) {
                amlsVar.l();
                t(new Runnable(this, z) { // from class: alky
                    private final alle a;
                    private final boolean b;

                    {
                        this.a = this;
                        this.b = z;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alle alleVar = this.a;
                        boolean z2 = this.b;
                        bnuq.c();
                        synchronized (alleVar) {
                            if (alleVar.b) {
                                return;
                            }
                            amls amlsVar2 = alleVar.e;
                            if (amlsVar2 == null) {
                                return;
                            }
                            if (alleVar.i) {
                                amls amlsVar3 = alleVar.f;
                                if (amlsVar3 != null) {
                                    amlsVar3.d();
                                }
                                amlsVar2.c();
                            }
                            alleVar.f = amlsVar2;
                            alleVar.e = null;
                            boolean z3 = alleVar.a;
                            alleVar.a = true;
                            if (!z2 || z3) {
                                return;
                            }
                            alleVar.s();
                        }
                    }
                });
            } else {
                alwo[] alwoVarArr = this.m;
                if (alwoVarArr != null) {
                    d(alwoVarArr);
                }
            }
        }
    }

    @Override // defpackage.aktj
    public final void h() {
        this.n.f(this);
    }

    @Override // defpackage.aktj
    public final void i() {
        this.n.h(this);
    }

    @Override // defpackage.aktj
    public final void j() {
        this.n.a(this);
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ dssj k() {
        dmqg dmqgVar = this.k;
        return dmqgVar != null ? dmqgVar : dmqg.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aljo
    public final void o(aktn aktnVar) {
        p(aktnVar, this);
    }

    @Override // defpackage.alsl
    public final void v() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            f(false);
        }
    }

    @Override // defpackage.alsl
    public final void x() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            t(new Runnable(this) { // from class: allb
                private final alle a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alle alleVar = this.a;
                    bnuq.c();
                    synchronized (alleVar) {
                        if (alleVar.b) {
                            return;
                        }
                        if (alleVar.i) {
                            return;
                        }
                        alleVar.i = true;
                        amls amlsVar = alleVar.f;
                        if (amlsVar == null) {
                            return;
                        }
                        amlsVar.c();
                    }
                }
            });
        }
    }

    @Override // defpackage.alsl
    public final void y() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            t(new Runnable(this) { // from class: allc
                private final alle a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alle alleVar = this.a;
                    bnuq.c();
                    synchronized (alleVar) {
                        if (alleVar.b) {
                            return;
                        }
                        if (!alleVar.i) {
                            return;
                        }
                        alleVar.i = false;
                        amls amlsVar = alleVar.f;
                        if (amlsVar == null) {
                            return;
                        }
                        amlsVar.d();
                    }
                }
            });
        }
    }

    @Override // defpackage.alsl
    public final void z() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            t(new Runnable(this) { // from class: alld
                private final alle a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alle alleVar = this.a;
                    bnuq.c();
                    synchronized (alleVar) {
                        if (alleVar.b) {
                            return;
                        }
                        alleVar.b = true;
                        alleVar.u();
                        amls amlsVar = alleVar.e;
                        if (amlsVar != null) {
                            amlsVar.b();
                        }
                        amls amlsVar2 = alleVar.f;
                        if (amlsVar2 == null) {
                            return;
                        }
                        amlsVar2.b();
                    }
                }
            });
        }
    }
}
