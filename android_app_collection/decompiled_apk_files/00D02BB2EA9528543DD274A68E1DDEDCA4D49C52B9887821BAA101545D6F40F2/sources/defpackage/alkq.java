package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alkq  reason: default package */
/* loaded from: classes.dex */
public abstract class alkq extends aljo<aksx, dmmu> implements alsl, aksx {
    private static int m;
    private int A;
    private boolean B;
    private final List<amxj> C;
    final bnsn c;
    final akpq d;
    final akzh e;
    final alrv f;
    @dzsi
    protected final amxl g;
    protected final alko h;
    @dzsi
    protected final allr i;
    protected final akra j;
    public boolean k;
    public akuh l;
    private final int n;
    private final amxp o;
    private final ampw p;
    private final bnvk q;
    @dzsi
    private final ampt r;
    private final dmmu s;
    private final alxp t;
    private float u;
    private final aksp v;
    private boolean w;
    private final dbty<Bitmap> x;
    private final dbty<bnvl> y;
    private boolean z;

    public alkq(dmmu dmmuVar, akqj akqjVar, also alsoVar, alyj alyjVar, akuh akuhVar, alrv alrvVar, alkp alkpVar, bnsn bnsnVar, akzh akzhVar, akpq akpqVar, btrm btrmVar, aksp akspVar) {
        super(akpqVar);
        int[] iArr;
        alvn alvnVar;
        int i;
        altv altvVar;
        akra akraVar;
        ampw ampwVar = new ampw();
        this.p = ampwVar;
        akra akraVar2 = new akra(0, 0);
        this.j = akraVar2;
        this.u = 1.0f;
        this.w = true;
        this.k = true;
        dbty<Bitmap> a = dbud.a(alkd.a);
        this.x = a;
        this.z = false;
        this.A = -1;
        this.B = false;
        this.C = dchl.a();
        this.v = akspVar;
        this.s = dmmuVar;
        this.c = bnsnVar;
        this.d = akpqVar;
        this.e = akzhVar;
        this.f = alrvVar;
        this.l = akuhVar;
        bnvk bnvkVar = new bnvk();
        this.q = bnvkVar;
        this.y = dbud.a(new alkj(a));
        int i2 = m;
        this.n = i2;
        m = i2 + 2;
        try {
            alvn a2 = alvn.a(dmmuVar, akqjVar, alsoVar, alyjVar, true);
            alko a3 = alkpVar.a(this, a2);
            this.h = a3;
            a3.a = a2.k;
            aksc akscVar = a2.g;
            float[] fArr = akscVar.b;
            dbsk.l((fArr != null && fArr.length > 0) || ((iArr = akscVar.a) != null && iArr.length > 0));
            alxp alxpVar = a2.h;
            this.t = alxpVar;
            alxp d = d(akuhVar, alrvVar, alxpVar);
            c(d);
            if (d != null) {
                d.h();
            }
            if (dmmuVar.d && d != null) {
                alvnVar = a2;
                altvVar = null;
                i = i2;
                this.i = e(this, alkpVar, alsoVar, akqjVar, alvnVar, dmmuVar, akuhVar);
            } else {
                alvnVar = a2;
                i = i2;
                altvVar = null;
                this.i = null;
            }
            int[] iArr2 = alvnVar.g.a;
            int length = iArr2.length;
            if (length == 0 || (length & 1) != 0) {
                akraVar = new akra(0, 0, 0);
            } else {
                akxb a4 = akxc.a(iArr2);
                akraVar = new akra(a4.a, a4.c, 0);
            }
            akraVar2.aa(akraVar);
            ampa.f(alvnVar, akraVar2, a3, alvnVar.k);
            int i3 = alvnVar.q;
            alwy alwyVar = alvnVar.p;
            alwx alwxVar = new alwx();
            alwxVar.a = alwyVar.a;
            alwxVar.b = alwyVar.b;
            alwxVar.c = alwyVar.c;
            if (akuhVar != null) {
                alwxVar.b = akuhVar.a();
                dmpz b = akuhVar.b();
                if (b != null) {
                    alwxVar.c = b.b;
                }
            }
            ampt amptVar = new ampt(alwxVar.a(), i3, altvVar);
            this.r = amptVar;
            ampwVar.j(amptVar);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(alvnVar);
            amxl amxlVar = new amxl(arrayList);
            this.g = amxlVar;
            this.o = new amxp(true, false, amxlVar, algp.a, new Object[]{this}, btrmVar);
            a3.n(false);
            StringBuilder sb = new StringBuilder(22);
            sb.append("ClientArea-");
            sb.append(i);
            a3.s = sb.toString();
            a3.n = amxp.a;
            bnvkVar.b(1.0f, 1.0f, 1.0f, 1.0f);
            a3.u = 519;
            A((int) a3.o().a);
            w();
        } catch (IOException unused) {
            this.h = alkpVar.a(this, null);
            this.i = null;
            this.t = alxp.e;
            this.r = null;
            this.g = null;
            this.o = amxp.a;
        }
    }

    private final void A(int i) {
        bnsn bnsnVar;
        dmmu dmmuVar = this.s;
        long j = dmmuVar.j;
        long j2 = dmmuVar.k;
        long j3 = i;
        this.h.u(new bnrw(j3, j, j2, this.n));
        for (amxj amxjVar : l()) {
            amxjVar.u(new bnrw(j3, j, j2, this.n + 1));
            j2 = j2;
        }
        if (!this.z || (bnsnVar = this.c) == null) {
            return;
        }
        bnsnVar.s(this.h);
    }

    private final void B(boolean z) {
        bnsn bnsnVar;
        synchronized (this) {
            if (this.b) {
                return;
            }
            if (z && !this.z) {
                this.z = true;
                alko alkoVar = this.h;
                if (alkoVar != null && (bnsnVar = this.c) != null) {
                    bnsnVar.i(alkoVar, this);
                    this.c.s(this.h);
                }
            }
            allr allrVar = this.i;
            if (allrVar != null) {
                if (z) {
                    allrVar.x();
                } else {
                    allrVar.y();
                }
            }
            synchronized (this) {
                this.B = z;
            }
            this.d.d();
        }
    }

    private static boolean c(alxp alxpVar) {
        if (alxpVar != null) {
            for (alxo alxoVar : alxpVar.b) {
                if (!alxoVar.I.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static alxp d(akuh akuhVar, alrv alrvVar, alxp alxpVar) {
        if (akuhVar instanceof alow) {
            return ((alow) akuhVar).i();
        }
        return akuhVar instanceof allt ? alrvVar.k.h(((allt) akuhVar).a) : alxpVar;
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pt(akvo<? super aksx> akvoVar) {
        super.Pt(akvoVar);
        this.h.n = this.o;
        allr allrVar = this.i;
        if (allrVar != null) {
            allrVar.Pt(new alkk(this, akvoVar));
        }
    }

    @Override // defpackage.aljo, defpackage.aktj
    public final synchronized void Pu() {
        throw null;
    }

    @Override // defpackage.aksx
    public final synchronized void a(float f) {
        if (this.u != f) {
            this.u = f;
            this.w = true;
            this.d.d();
        }
    }

    @Override // defpackage.aksx
    public final void b(final akuh akuhVar) {
        akuhVar.c(new Runnable(this, akuhVar) { // from class: alkh
            private final alkq a;
            private final akuh b;

            {
                this.a = this;
                this.b = akuhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final alkq alkqVar = this.a;
                akuh akuhVar2 = this.b;
                synchronized (alkqVar) {
                    alkqVar.l = akuhVar2;
                    alkqVar.w();
                }
                alkqVar.q(new Runnable(alkqVar) { // from class: alki
                    private final alkq a;

                    {
                        this.a = alkqVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alkq alkqVar2 = this.a;
                        synchronized (alkqVar2) {
                            alkqVar2.k = true;
                        }
                    }
                });
            }
        });
    }

    @dzsi
    protected abstract allr e(alkq alkqVar, alkp alkpVar, also alsoVar, akqj akqjVar, alvn alvnVar, dmmu dmmuVar, akuh akuhVar);

    public synchronized void f() {
        bnvl a;
        bnuq bnuqVar = bnuq.INVALID;
        if (!this.a) {
            return;
        }
        int max = (int) Math.max(0.0f, this.e.p().k);
        if (this.w) {
            this.w = false;
            float f = this.u;
            this.q.b(f, f, f, f);
            allr allrVar = this.i;
            if (allrVar != null) {
                allrVar.q = f;
                allrVar.d();
            }
        }
        alxp d = d(this.l, this.f, this.t);
        byte f2 = d.f(0);
        for (int i = 1; i < d.h(); i++) {
            if (d.f(i) < max) {
                f2 = max;
            }
        }
        if (f2 > max) {
            f2 = -1;
        }
        if (this.k || this.A != f2) {
            this.k = false;
            this.A = f2;
            alxo c = f2 == -1 ? alxo.c : d.c(f2);
            bnrw o = this.h.o();
            int i2 = c.E;
            if (o.a != i2) {
                A(i2);
            }
            ampt amptVar = this.r;
            if (amptVar != null) {
                ampw ampwVar = this.p;
                if (ampwVar.c.containsKey(amptVar)) {
                    byte byteValue = ampwVar.c.get(amptVar).byteValue();
                    int i3 = c.k;
                    alxl[] alxlVarArr = c.n;
                    ampwVar.g.get(byteValue).a(i3 > 0 ? i3 : 0, alxlVarArr.length > 0 ? alxlVarArr[0].a : 0, 0, c.e, c.f);
                }
            }
            alko alkoVar = this.h;
            bnuv bnuvVar = alkoVar.m;
            bnvk bnvkVar = this.q;
            if (bnuvVar != bnvkVar) {
                alkoVar.t(bnvkVar);
                this.h.s(1, 771);
            }
            if (c(d)) {
                a = this.f.r(c.I);
            } else {
                int i4 = c.k;
                if (c.e) {
                    this.x.a().eraseColor(0);
                } else {
                    this.x.a().setPixel(0, 0, i4);
                }
                a = this.y.a();
            }
            if (a != null) {
                this.h.e(0, a);
            }
        }
        this.h.n(this.B);
    }

    @Override // defpackage.aktj
    public final void h() {
        throw null;
    }

    @Override // defpackage.aktj
    public final void i() {
        this.v.d(this);
    }

    @Override // defpackage.aktj
    public final void j() {
        throw null;
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ dssj k() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<amxj> l() {
        this.C.clear();
        allr allrVar = this.i;
        if (allrVar != null) {
            allrVar.e(this.C);
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aljo
    public final void o(aktn aktnVar) {
        p(aktnVar, this);
    }

    @Override // defpackage.alsl
    public final void v() {
        allr allrVar = this.i;
        if (allrVar != null) {
            allrVar.v();
        }
    }

    public final synchronized void w() {
        int i = 0;
        this.a = false;
        if (this.i != null) {
            i = 1;
        }
        final bvpi bvpiVar = new bvpi(i + 1, new Runnable(this) { // from class: alke
            private final alkq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        });
        this.l.c(new Runnable(bvpiVar) { // from class: alkf
            private final bvpi a;

            {
                this.a = bvpiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        allr allrVar = this.i;
        if (allrVar != null) {
            allrVar.q(new Runnable(bvpiVar) { // from class: alkg
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

    @Override // defpackage.alsl
    public final void x() {
        B(true);
    }

    @Override // defpackage.alsl
    public final void y() {
        B(false);
    }

    @Override // defpackage.alsl
    public final void z() {
        boolean z;
        synchronized (this) {
            z = !this.b;
            this.b = true;
        }
        if (!z) {
            return;
        }
        u();
        if (this.z) {
            this.c.j(this.h);
            this.d.d();
        }
        allr allrVar = this.i;
        if (allrVar == null) {
            return;
        }
        allrVar.z();
    }
}
