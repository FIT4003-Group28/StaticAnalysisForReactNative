package defpackage;
/* compiled from: PG */
/* renamed from: chju  reason: default package */
/* loaded from: classes4.dex */
public class chju extends chjc implements chmh {
    private final djdf a;
    @dzsi
    private final jic c;
    private final jic d;

    public chju(cchz cchzVar, chiu chiuVar, chmu chmuVar) {
        super(chmuVar);
        chhy chhyVar;
        djdf djdfVar;
        chik chikVar = ((chle) chmuVar).a;
        if (chikVar.a == 1) {
            chhyVar = (chhy) chikVar.b;
        } else {
            chhyVar = chhy.e;
        }
        djdm djdmVar = chhyVar.b;
        djdmVar = djdmVar == null ? djdm.c : djdmVar;
        if (djdmVar.a == 2) {
            djdfVar = (djdf) djdmVar.b;
        } else {
            djdfVar = djdf.e;
        }
        this.a = djdfVar;
        ckql ckqlVar = new ckql();
        ckqlVar.f = true;
        this.c = (djdfVar.a & 4) != 0 ? new jic(djdfVar.d, ckqc.FULLY_QUALIFIED, ibm.j(), 250, true, null, ckqlVar) : null;
        ccih l = cchzVar.d().l();
        dbsk.s(l);
        this.d = chiuVar.a(l.b());
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new chdt(), this);
    }

    @Override // defpackage.chmh
    public String c() {
        return this.a.b;
    }

    @Override // defpackage.chmh
    public String d() {
        return this.a.c;
    }

    @Override // defpackage.chmh
    @dzsi
    public jic h() {
        return this.c;
    }

    @Override // defpackage.chmh
    public jic i() {
        return this.d;
    }

    @Override // defpackage.chmh
    public cjtd j() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.t;
        return b.a();
    }
}
