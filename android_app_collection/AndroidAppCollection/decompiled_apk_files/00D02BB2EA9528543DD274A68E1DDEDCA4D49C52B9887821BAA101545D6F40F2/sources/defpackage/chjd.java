package defpackage;
/* compiled from: PG */
/* renamed from: chjd  reason: default package */
/* loaded from: classes4.dex */
public abstract class chjd extends chjf implements chmb {
    @dzsi
    public chje a;

    public chjd(chmu chmuVar) {
        super(chmuVar);
    }

    @Override // defpackage.chmb
    @dzsi
    public chmg d() {
        return this.a;
    }

    @Override // defpackage.chjf, defpackage.chmv
    public chik e() {
        chig chigVar;
        chig chigVar2;
        chje chjeVar = this.a;
        if (chjeVar == null) {
            return super.e();
        }
        chik chikVar = ((chle) chjeVar.a).a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        chid chidVar = chigVar.c;
        if (chidVar == null) {
            chidVar = chid.c;
        }
        chik e = super.e();
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        chij chijVar = (chij) dsqpVar;
        if (e.a == 2) {
            chigVar2 = (chig) e.b;
        } else {
            chigVar2 = chig.f;
        }
        dsqp dsqpVar2 = (dsqp) chigVar2.cu(5);
        dsqpVar2.bC(chigVar2);
        chhz chhzVar = (chhz) dsqpVar2;
        if (chhzVar.c) {
            chhzVar.bF();
            chhzVar.c = false;
        }
        chig chigVar3 = (chig) chhzVar.b;
        chidVar.getClass();
        chigVar3.c = chidVar;
        chigVar3.a |= 2;
        if (chijVar.c) {
            chijVar.bF();
            chijVar.c = false;
        }
        chik chikVar2 = (chik) chijVar.b;
        chig bK = chhzVar.bK();
        bK.getClass();
        chikVar2.b = bK;
        chikVar2.a = 2;
        return chijVar.bK();
    }
}
