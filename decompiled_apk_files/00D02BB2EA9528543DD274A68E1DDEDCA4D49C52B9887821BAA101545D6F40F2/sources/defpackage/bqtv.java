package defpackage;
/* compiled from: PG */
/* renamed from: bqtv  reason: default package */
/* loaded from: classes4.dex */
public class bqtv implements bqst {
    private static final eaok a = earp.W();
    private final eapy b;
    private eapy c;
    private dcdc<bqtu> d;

    public bqtv() {
        eapy a2 = eapy.a(a);
        this.b = a2;
        this.c = a2;
        dcdc<bqtu> l = l(new bqtt(this) { // from class: bqtr
            private final bqtv a;

            {
                this.a = this;
            }

            @Override // defpackage.bqtt
            public final void a(int i) {
                this.a.i(i);
            }
        }, this.c);
        this.d = l;
        m(l, a2.m());
    }

    private final bqtu j() {
        return this.d.get(this.c.m() - 1);
    }

    private final void k(int i) {
        int l = this.b.l();
        int m = this.b.m();
        dbsk.a(i <= l);
        if (i == l && this.c.m() > m) {
            i(m);
        }
        eapy eapyVar = this.c;
        eapy eapyVar2 = new eapy(eapyVar, eapyVar.a.N().q(eapyVar, 0, eapyVar.p(), i));
        this.c = eapyVar2;
        int f = eapyVar2.o().f();
        if (this.d.size() != f) {
            this.d = l(new bqtt(this) { // from class: bqts
                private final bqtv a;

                {
                    this.a = this;
                }

                @Override // defpackage.bqtt
                public final void a(int i2) {
                    this.a.i(i2);
                }
            }, this.c);
        }
        if (i != l) {
            m = f;
        }
        m(this.d, m);
        cqkx.p(this);
    }

    private static dcdc<bqtu> l(bqtt bqttVar, eapy eapyVar) {
        int f = eapyVar.o().f();
        dccx F = dcdc.F();
        int i = 0;
        while (i < f) {
            boolean z = i == eapyVar.m() + (-1);
            i++;
            F.g(new bqtu(eapyVar.n(i), z, bqttVar));
        }
        return F.f();
    }

    private static void m(dcdc<bqtu> dcdcVar, int i) {
        int i2 = 0;
        while (i2 < dcdcVar.size()) {
            dcdcVar.get(i2).a = i2 < i;
            i2++;
        }
    }

    @Override // defpackage.bqst
    public cqkl a() {
        k(d().intValue() + 1);
        return cqkl.a;
    }

    @Override // defpackage.bqst
    public cqkl b() {
        k(d().intValue() - 1);
        return cqkl.a;
    }

    @Override // defpackage.bqst
    public Boolean c() {
        return Boolean.valueOf(this.c.l() < this.b.l());
    }

    @Override // defpackage.bqst
    public Integer d() {
        return Integer.valueOf(this.c.l());
    }

    @Override // defpackage.bqst
    public String e() {
        return j().a();
    }

    @Override // defpackage.bqst
    public dcdc<? extends bqss> f() {
        return this.d;
    }

    public eapy g() {
        return this.c;
    }

    public void h(eapy eapyVar) {
        eaok b = eaor.d(a).b();
        if (b != eapyVar.a) {
            eapy eapyVar2 = new eapy(eapyVar, b);
            b.f(eapyVar2, eapyVar.p());
            eapyVar = eapyVar2;
        }
        i(eapyVar.m());
        k(eapyVar.l());
    }

    public final void i(int i) {
        bqtu j = j();
        j.b = false;
        cqkx.p(j);
        this.c = this.c.n(i);
        bqtu j2 = j();
        j2.b = true;
        cqkx.p(j2);
        cqkx.p(this);
    }
}
