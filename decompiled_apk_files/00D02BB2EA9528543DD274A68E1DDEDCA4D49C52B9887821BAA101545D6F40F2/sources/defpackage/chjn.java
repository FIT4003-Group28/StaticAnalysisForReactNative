package defpackage;
/* compiled from: PG */
/* renamed from: chjn  reason: default package */
/* loaded from: classes4.dex */
public class chjn extends chje implements chma {
    private final djfs b;
    @dzsi
    private final jic c;
    @dzsi
    private final chmq d;

    public chjn(chmu chmuVar) {
        super(chmuVar);
        chig chigVar;
        djfs djfsVar;
        chik chikVar = ((chle) chmuVar).a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        chid chidVar = chigVar.c;
        djft djftVar = (chidVar == null ? chid.c : chidVar).b;
        djftVar = djftVar == null ? djft.c : djftVar;
        if (djftVar.a == 2) {
            djfsVar = (djfs) djftVar.b;
        } else {
            djfsVar = djfs.f;
        }
        this.b = djfsVar;
        chkp chkpVar = null;
        this.c = (djfsVar.a & 2) != 0 ? new jic(djfsVar.c, ckqc.FIFE, 0) : null;
        if ((djfsVar.a & 8) != 0) {
            dqei dqeiVar = djfsVar.e;
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
        b.d = dtyc.P;
        return b.a();
    }
}
