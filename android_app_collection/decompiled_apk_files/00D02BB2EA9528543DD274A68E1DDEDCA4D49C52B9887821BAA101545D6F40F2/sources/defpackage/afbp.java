package defpackage;
/* compiled from: PG */
/* renamed from: afbp  reason: default package */
/* loaded from: classes2.dex */
public class afbp implements afbn {
    @dzsi
    private afbo a;

    @Override // defpackage.afbn
    public cqkl a() {
        afbo afboVar = this.a;
        if (afboVar != null) {
            afgq afgqVar = (afgq) afboVar;
            ((ckcn) afgqVar.b.e.b.a().a(ckfn.i)).a();
            try {
                afgr afgrVar = ((afgq) afboVar).b;
                afgrVar.c.j((Boolean) afgrVar.d.call());
            } catch (Exception e) {
                afgqVar.b.c.k(e);
            }
            afgqVar.a.dismiss();
        }
        return cqkl.a;
    }

    @Override // defpackage.afbn
    public cqkl b() {
        afbo afboVar = this.a;
        if (afboVar != null) {
            afgq afgqVar = (afgq) afboVar;
            ((ckcn) afgqVar.b.e.b.a().a(ckfn.h)).a();
            afgqVar.b.c.j(false);
            afgqVar.a.dismiss();
        }
        return cqkl.a;
    }

    public void c(afbo afboVar) {
        this.a = afboVar;
    }
}
