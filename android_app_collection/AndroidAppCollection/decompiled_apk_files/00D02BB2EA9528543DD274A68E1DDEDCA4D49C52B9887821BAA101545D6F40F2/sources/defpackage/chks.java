package defpackage;
/* compiled from: PG */
/* renamed from: chks  reason: default package */
/* loaded from: classes4.dex */
public class chks extends chje implements chms {
    public chks(chmu chmuVar) {
        super(chmuVar);
    }

    @Override // defpackage.chms
    public String a() {
        chig chigVar;
        chik chikVar = ((chle) this.a).a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        chid chidVar = chigVar.c;
        if (chidVar == null) {
            chidVar = chid.c;
        }
        djft djftVar = chidVar.b;
        if (djftVar == null) {
            djftVar = djft.c;
        }
        return djftVar.a == 1 ? (String) djftVar.b : "";
    }

    @Override // defpackage.chmg
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a.d());
        b.d = dtyc.Q;
        return b.a();
    }
}
