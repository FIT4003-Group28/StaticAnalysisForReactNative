package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnyl  reason: default package */
/* loaded from: classes3.dex */
public final class bnyl implements btzi {
    final /* synthetic */ bnyn a;
    final /* synthetic */ dssj b;

    public bnyl(bnyn bnynVar, dssj dssjVar) {
        this.a = bnynVar;
        this.b = dssjVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        if (!btzyVar.equals(btzy.d)) {
            this.a.Rb(this.b, null);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        this.a.Rb(this.b, (dssj) obj);
    }
}