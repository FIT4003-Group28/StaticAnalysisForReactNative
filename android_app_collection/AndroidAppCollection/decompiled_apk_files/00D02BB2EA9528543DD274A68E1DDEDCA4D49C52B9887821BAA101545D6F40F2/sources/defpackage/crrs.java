package defpackage;
/* compiled from: PG */
/* renamed from: crrs  reason: default package */
/* loaded from: classes5.dex */
public final class crrs implements alyi {
    private static final alyi a = new crrr();
    private final int b;
    private final int c;
    @dzsi
    private amub d;
    @dzsi
    private akrk e;
    private int f;
    private int g;
    private int h;
    private final btvo j;
    private int l;
    private int m;
    @dzsi
    private alyi i = null;
    private final btnc<alyh, Boolean> k = new btnc<>(cpnx.a);

    public crrs(int i, int i2, btvo btvoVar) {
        this.c = i;
        this.b = Math.max(i2, 1);
        this.j = btvoVar;
    }

    static int f(int i, akra akraVar) {
        double d = i;
        double r = akraVar.r();
        Double.isNaN(d);
        return (int) Math.round(d * r);
    }

    private final synchronized void g() {
        if (this.d == null) {
            this.i = null;
            return;
        }
        dbsk.s(this.e);
        if (this.f < this.d.h()) {
            amub amubVar = this.d;
            int i = this.f;
            this.f = i + 1;
            akra akraVar = amubVar.o(i).c;
            int i2 = this.c;
            int h = h(akraVar);
            this.i = alwp.a(akraVar, i2, h + h);
            this.l++;
            return;
        }
        this.i = null;
        if (!e(this.g)) {
            return;
        }
        akra m = this.e.m(this.g);
        akra m2 = this.e.m(this.g + 1);
        double K = this.d.K(this.g);
        double K2 = this.d.K(this.g + 1);
        this.d.ab(K);
        this.d.ab(K2);
        this.g++;
        this.m++;
        int i3 = this.c;
        int h2 = h(m);
        this.i = new alwp(m, m2, i3, h2 + h2);
    }

    private final int h(akra akraVar) {
        return f(this.b, akraVar);
    }

    public final synchronized void a() {
        this.e = null;
        this.d = null;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = a;
        this.k.e();
    }

    @Override // defpackage.alyi
    @dzsi
    public final alyh b() {
        while (true) {
            alyi alyiVar = this.i;
            if (alyiVar != null) {
                alyh b = alyiVar.b();
                if (b == null) {
                    g();
                } else if (this.k.a(b) == null) {
                    this.k.Pz(b, Boolean.TRUE);
                    return b;
                }
            } else {
                return null;
            }
        }
    }

    public final synchronized void c(amub amubVar) {
        this.d = amubVar;
        this.e = amubVar.l;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = a;
    }

    public final void d(amuo amuoVar, int i) {
        int i2 = amuoVar.i;
        if (this.f <= i2) {
            this.i = a;
            this.f = i2;
        } else if (this.g > i) {
            if (this.i == null && this.h < i) {
                this.i = a;
            }
            this.h = i;
        } else {
            this.i = a;
        }
        this.g = i;
        this.h = i;
    }

    final synchronized boolean e(int i) {
        dbsk.s(this.d);
        dbsk.s(this.e);
        int i2 = i + 1;
        if (i2 >= this.e.l()) {
            return false;
        }
        if (i == this.h) {
            return true;
        }
        return this.d.H(i2) - this.d.H(this.h) <= ((double) f(this.j.getNavigationParameters().n() * 1000, this.e.m(i2)));
    }
}
