package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjok  reason: default package */
/* loaded from: classes4.dex */
public final class cjok implements agbi {
    final /* synthetic */ cjoo a;

    public cjok(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // defpackage.agbi
    public final void a() {
        this.a.aU.k(false);
        ahin ahinVar = this.a.aR;
        if (ahinVar != null) {
            ahinVar.M();
        }
        this.a.g(false);
    }

    @Override // defpackage.agbi
    public final void b() {
        this.a.aU.k(true);
        cjoo cjooVar = this.a;
        if (cjooVar.aR != null && cjooVar.aU.o() == cjpp.FOR_YOU) {
            ahin ahinVar = this.a.aR;
            dbsk.s(ahinVar);
            ahinVar.L();
        }
        this.a.g(true);
        cjoo cjooVar2 = this.a;
        if (cjooVar2.aV != null) {
            akyc e = akyt.e(this.a.aV);
            e.b = 0;
            cjooVar2.ag.a().p(e);
        }
    }
}
