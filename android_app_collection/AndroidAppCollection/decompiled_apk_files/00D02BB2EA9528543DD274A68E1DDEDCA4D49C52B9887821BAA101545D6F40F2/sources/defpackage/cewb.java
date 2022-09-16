package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cewb  reason: default package */
/* loaded from: classes4.dex */
public class cewb implements cest {
    private final dkfl a;
    private final jic b;
    @dzsi
    private final cetw c;

    public cewb(cewc cewcVar, dkfl dkflVar) {
        this.a = dkflVar;
        cetw cetwVar = null;
        this.b = new jic(dkflVar.a, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
        if (cewcVar.j().booleanValue() && cewcVar.p == null) {
            cetwVar = cewcVar.h.a();
        }
        this.c = cetwVar;
    }

    @Override // defpackage.cest
    public jic a() {
        return this.b;
    }

    @Override // defpackage.cest
    public String b() {
        return this.a.b;
    }

    @Override // defpackage.cest
    public String c() {
        return this.a.c;
    }

    @Override // defpackage.cest
    @dzsi
    public cetb d() {
        return this.c;
    }
}
