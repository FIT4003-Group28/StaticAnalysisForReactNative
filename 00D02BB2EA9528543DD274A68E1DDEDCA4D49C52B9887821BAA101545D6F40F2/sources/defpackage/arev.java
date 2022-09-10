package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arev  reason: default package */
/* loaded from: classes2.dex */
public final class arev implements btzi<duyo, duyq> {
    final /* synthetic */ arew a;

    public arev(arew arewVar) {
        this.a = arewVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duyo> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duyo> btzrVar, duyq duyqVar) {
        duyq duyqVar2 = duyqVar;
        arew arewVar = this.a;
        arewVar.e = null;
        arewVar.g.a(false);
        for (dulb dulbVar : duyqVar2.b) {
            try {
                this.a.a.p(((dthy) dtid.d.bZ().by(dulbVar.bS())).bK(), duyqVar2.c);
            } catch (dsrm unused) {
            }
        }
        this.a.a.s();
    }
}
