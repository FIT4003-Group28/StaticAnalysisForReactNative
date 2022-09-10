package defpackage;
/* compiled from: PG */
/* renamed from: chiz  reason: default package */
/* loaded from: classes4.dex */
public class chiz extends chje implements chma {
    private final djfp b;
    @dzsi
    private final jic c;
    @dzsi
    private final chmq d;

    public chiz(chmu chmuVar) {
        super(chmuVar);
        chig chigVar;
        djfp djfpVar;
        chik chikVar = ((chle) chmuVar).a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        chid chidVar = chigVar.c;
        djft djftVar = (chidVar == null ? chid.c : chidVar).b;
        djftVar = djftVar == null ? djft.c : djftVar;
        if (djftVar.a == 3) {
            djfpVar = (djfp) djftVar.b;
        } else {
            djfpVar = djfp.f;
        }
        this.b = djfpVar;
        chkp chkpVar = null;
        this.c = (djfpVar.a & 2) != 0 ? new jic(djfpVar.c, ckqc.FIFE, 0) : null;
        if ((djfpVar.a & 8) != 0) {
            dqei dqeiVar = djfpVar.e;
            chkpVar = new chkp(dqeiVar == null ? dqei.e : dqeiVar);
        }
        this.d = chkpVar;
    }

    @Override // defpackage.chma
    public String a() {
        return this.b.b;
    }

    @Override // defpackage.chma
    @dzsi
    public jic b() {
        return this.c;
    }

    @Override // defpackage.chma
    public String c() {
        return this.b.d;
    }

    @Override // defpackage.chma
    @dzsi
    public chmq d() {
        return this.d;
    }

    @Override // defpackage.chmg
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a.d());
        b.d = dtyc.O;
        return b.a();
    }
}
