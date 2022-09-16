package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bomw  reason: default package */
/* loaded from: classes3.dex */
public final class bomw implements bnyn<dwjr, dwjt> {
    final /* synthetic */ ges a;
    final /* synthetic */ dosc b;
    final /* synthetic */ gga c;
    final /* synthetic */ gen d;
    final /* synthetic */ bnyo e;
    final /* synthetic */ bomy f;

    public bomw(bomy bomyVar, ges gesVar, dosc doscVar, gga ggaVar, gen genVar, bnyo bnyoVar) {
        this.f = bomyVar;
        this.a = gesVar;
        this.b = doscVar;
        this.c = ggaVar;
        this.d = genVar;
        this.e = bnyoVar;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        dwjr dwjrVar = (dwjr) dssjVar;
        dwjt dwjtVar = (dwjt) dssjVar2;
        bomy bomyVar = this.f;
        bomyVar.d = null;
        if (!this.a.aD) {
            return;
        }
        alad p = bomyVar.b.a().p();
        alad aladVar = this.f.a;
        if (aladVar != null && !p.equals(aladVar)) {
            this.f.a(this.b, this.c, this.d, this.e, this.a);
            return;
        }
        dosc doscVar = this.b;
        if (dwjtVar != null) {
            dsrj<dosd> dsrjVar = dwjtVar.a;
            for (int i = 0; i < dsrjVar.size(); i++) {
                dosc b = dosc.b(dsrjVar.get(i).b);
                if (b == null) {
                    b = dosc.TYPE_COPYRIGHTS;
                }
                if (b == doscVar) {
                    this.f.c.a();
                    return;
                }
            }
        }
        this.d.aJ(this.c);
    }
}
