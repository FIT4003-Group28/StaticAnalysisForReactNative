package defpackage;
/* compiled from: PG */
/* renamed from: bkai  reason: default package */
/* loaded from: classes3.dex */
final class bkai implements btzi<djcg, djci> {
    final /* synthetic */ bkaj a;

    public bkai(bkaj bkajVar) {
        this.a = bkajVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcg> btzrVar, btzy btzyVar) {
        bkaj bkajVar = this.a;
        dqjh b = dqjh.b(btzrVar.a.c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        bkajVar.a(b == dqjh.THUMBS_VOTE_NONE);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcg> btzrVar, djci djciVar) {
        if (djciVar.a.isEmpty()) {
            QY(btzrVar, btzy.g);
        }
    }
}
