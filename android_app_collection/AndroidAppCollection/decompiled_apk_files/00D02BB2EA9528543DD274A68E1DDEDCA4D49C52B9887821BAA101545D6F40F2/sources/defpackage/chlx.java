package defpackage;
/* compiled from: PG */
/* renamed from: chlx  reason: default package */
/* loaded from: classes4.dex */
public class chlx extends chjd implements chna {
    public final bqji c;
    public final djfk d;

    public chlx(bqji bqjiVar, chmu chmuVar) {
        super(chmuVar);
        chig chigVar;
        djfk djfkVar;
        this.c = bqjiVar;
        chik chikVar = ((chle) chmuVar).a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        djfl djflVar = chigVar.b;
        djflVar = djflVar == null ? djfl.e : djflVar;
        if (djflVar.b == 2) {
            djfkVar = (djfk) djflVar.c;
        } else {
            djfkVar = djfk.e;
        }
        this.d = djfkVar;
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new chhp(), this);
    }

    @Override // defpackage.jbc
    public Float a() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.jbc
    public jez b() {
        return new jez(this) { // from class: chlw
            private final chlx a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                chlx chlxVar = this.a;
                ily ilyVar = new ily();
                dwlh dwlhVar = chlxVar.d.b;
                if (dwlhVar == null) {
                    dwlhVar = dwlh.n;
                }
                dniu dniuVar = dwlhVar.b;
                if (dniuVar == null) {
                    dniuVar = dniu.i;
                }
                ilyVar.k(dniuVar.b);
                dwlh dwlhVar2 = chlxVar.d.b;
                if (dwlhVar2 == null) {
                    dwlhVar2 = dwlh.n;
                }
                ilyVar.F(dwlhVar2.c);
                dwlh dwlhVar3 = chlxVar.d.b;
                if (dwlhVar3 == null) {
                    dwlhVar3 = dwlh.n;
                }
                dpum dpumVar = dwlhVar3.d;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                ilyVar.q(akqq.f(dpumVar));
                dwlh dwlhVar4 = chlxVar.d.b;
                if (dwlhVar4 == null) {
                    dwlhVar4 = dwlh.n;
                }
                ilyVar.H(dwlhVar4.j);
                dwlh dwlhVar5 = chlxVar.d.b;
                if (dwlhVar5 == null) {
                    dwlhVar5 = dwlh.n;
                }
                ilyVar.q = dwlhVar5.k;
                bwrs<ilo> a = bwrs.a(ilyVar.d());
                dnqh c = bzwi.c(blpk.THANKS_PAGE);
                if (cjqmVar.a().a()) {
                    dsqp dsqpVar = (dsqp) c.cu(5);
                    dsqpVar.bC(c);
                    dnqg dnqgVar = (dnqg) dsqpVar;
                    String b = cjqmVar.a().b();
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    dnqh dnqhVar2 = dnqh.p;
                    b.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b;
                    c = dnqgVar.bK();
                }
                bqjf r = bqjh.r();
                r.f(c);
                r.j((int) f);
                r.c(dhpj.THANKS_PAGE);
                r.n(chbv.OBEY_SERVER_RESPONSE);
                bqjh o = r.o();
                chlxVar.b.c();
                chlxVar.c.b(a, o);
            }
        };
    }

    @Override // defpackage.jbc
    public cjtd c() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = (this.d.a & 4) != 0 ? dtyc.N : dtyc.M;
        return b.a();
    }

    @Override // defpackage.chna
    public String h() {
        return this.d.c;
    }

    @Override // defpackage.chna
    public String i() {
        return this.d.d;
    }

    @Override // defpackage.chna
    public cjtd j() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.L;
        return b.a();
    }
}
