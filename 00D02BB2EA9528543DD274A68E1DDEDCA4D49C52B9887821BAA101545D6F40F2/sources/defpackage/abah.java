package defpackage;
/* compiled from: PG */
/* renamed from: abah  reason: default package */
/* loaded from: classes2.dex */
public final class abah implements abaz {
    public final ditt a;
    public final dcvu b;
    public final int c;
    public final abat d;
    public final bvrb e;
    public final abba f;
    private final eape g;
    private final eape h;
    @dzsi
    private alax i;
    private boolean j;
    @dzsi
    private bvpk k;
    private final alay l;
    private final dxio<akox> m;
    private final cqat n;
    private int o;

    public abah(ditt dittVar, abat abatVar, alay alayVar, dxio<akox> dxioVar, cqat cqatVar, bvrb bvrbVar, abba abbaVar) {
        dcvu c;
        int i;
        this.a = dittVar;
        this.d = abatVar;
        this.l = alayVar;
        this.m = dxioVar;
        this.n = cqatVar;
        this.e = bvrbVar;
        this.f = abbaVar;
        dits ditsVar = dittVar.e;
        dpuo dpuoVar = (ditsVar == null ? dits.f : ditsVar).c;
        dpuoVar = dpuoVar == null ? dpuo.b : dpuoVar;
        int i2 = 3;
        if (dpuoVar.a.size() < 3) {
            c = dcvu.d();
        } else {
            dcvt d = dcvt.d();
            for (dpum dpumVar : dpuoVar.a) {
                d.e(dcvs.b(dpumVar.b, dpumVar.c));
            }
            c = d.c();
        }
        this.b = c;
        dits ditsVar2 = dittVar.e;
        if (((ditsVar2 == null ? dits.f : ditsVar2).a & 8) != 0) {
            dits ditsVar3 = dittVar.e;
            i = (ditsVar3 == null ? dits.f : ditsVar3).e;
        } else {
            dits ditsVar4 = dittVar.e;
            i = (ditsVar4 == null ? dits.f : ditsVar4).d;
        }
        this.c = i;
        dits ditsVar5 = dittVar.e;
        dpop dpopVar = (ditsVar5 == null ? dits.f : ditsVar5).b;
        dpopVar = dpopVar == null ? dpop.d : dpopVar;
        long j = dpopVar.b;
        eape eapeVar = new eape(j, Math.max(dpopVar.c, j));
        this.g = eapeVar;
        dpop dpopVar2 = dittVar.h;
        dpopVar2 = dpopVar2 == null ? dpop.d : dpopVar2;
        long max = Math.max(dpopVar2.b, dpopVar.b);
        eape eapeVar2 = new eape(max, Math.max(Math.min(dpopVar2.c, eapeVar.c), max));
        this.h = eapeVar2;
        long b = cqatVar.b();
        if (eapeVar.k(b)) {
            i2 = 1;
        } else if (eapeVar.c <= b) {
            i2 = 5;
        } else if (!eapeVar2.i(b)) {
            i2 = eapeVar2.k(b) ? 2 : 4;
        }
        this.o = i2;
        this.i = null;
        this.j = false;
        this.k = null;
        e();
    }

    private final void f() {
        int i = this.o;
        int i2 = 5;
        if (i == 5) {
            c();
        } else if (!this.j) {
            alax alaxVar = this.i;
            if (alaxVar == null || !alaxVar.d()) {
                return;
            }
            this.i.b();
        } else if (!abag.a(i)) {
        } else {
            if (this.i == null) {
                this.i = alay.c(aknz.a(this.a.j), this.m.a(), new abaf(this));
            }
            alax alaxVar2 = this.i;
            int i3 = this.o;
            dbsk.l(abag.a(i3));
            if (i3 == 3) {
                i2 = 7;
            }
            if (!g(alaxVar2, i2)) {
                int[] iArr = {7, 5, 8, 6};
                int i4 = 0;
                while (true) {
                    if (i4 >= 4) {
                        i2 = 1;
                        break;
                    }
                    int i5 = iArr[i4];
                    if (g(alaxVar2, i5)) {
                        i2 = i5;
                        break;
                    }
                    i4++;
                }
            }
            int i6 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            alaxVar2.e(i6);
            this.i.a();
            abba abbaVar = this.f;
            ditt dittVar = this.a;
            abbaVar.a(dittVar.c, dittVar.b);
        }
    }

    private static boolean g(alax alaxVar, int i) {
        int i2 = i - 1;
        if (i != 0) {
            return alaxVar.f(i2);
        }
        throw null;
    }

    public final synchronized void a() {
        if (!this.j) {
            this.j = true;
            f();
        }
    }

    public final synchronized void b() {
        if (this.j) {
            this.j = false;
            f();
        }
    }

    @Override // defpackage.abaz
    public final synchronized void c() {
        alax alaxVar = this.i;
        if (alaxVar != null) {
            alaxVar.b();
            this.i.c();
            this.i = null;
        }
        bvpk bvpkVar = this.k;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.k = null;
        }
    }

    public final synchronized void d() {
        if (this.k == null) {
            return;
        }
        dbsk.l(abag.b(this.o));
        int i = this.o - 1;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                throw new IllegalStateException("There is no next state after this");
            } else {
                i2 = 5;
            }
        }
        this.o = i2;
        f();
        e();
    }

    private final void e() {
        eapd Ti;
        if (!abag.b(this.o)) {
            this.k = null;
            return;
        }
        int i = this.o;
        eape eapeVar = this.g;
        eape eapeVar2 = this.h;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            Ti = eapeVar.e().Ti();
        } else if (i2 == 1) {
            Ti = eapeVar2.e().Ti();
        } else if (i2 == 2) {
            Ti = eapeVar2.g().Ti();
        } else if (i2 != 3) {
            throw new IllegalStateException("Not allowed");
        } else {
            Ti = eapeVar.g().Ti();
        }
        bvpk a = bvpk.a(new Runnable(this) { // from class: abad
            private final abah a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
        this.k = a;
        this.e.a(a, bvrj.UI_THREAD, Math.max(Ti.a - this.n.b(), 0L));
    }
}
