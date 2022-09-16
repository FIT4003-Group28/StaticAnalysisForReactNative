package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acwy  reason: default package */
/* loaded from: classes.dex */
public final class acwy implements adny {
    final /* synthetic */ acxb a;

    public acwy(acxb acxbVar) {
        this.a = acxbVar;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        acxb acxbVar = this.a;
        if (acxbVar.n != null) {
            acxbVar.g.d();
            acxbVar.g.a();
            acxi acxiVar = acxbVar.k;
            acxk acxkVar = acxbVar.n;
            acxiVar.a(3, acxkVar.e, acxbVar.p, acxkVar.d.e);
            acxbVar.a();
        }
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        acxb acxbVar = this.a;
        if (acxbVar.n == null || acxbVar.r) {
            return;
        }
        acxbVar.d(3, adntVar);
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        acxb acxbVar = this.a;
        if (acxbVar.n == null) {
            adntVar = null;
        }
        acxbVar.q = adntVar;
    }
}
