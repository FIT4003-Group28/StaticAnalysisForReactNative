package defpackage;
/* compiled from: PG */
/* renamed from: bhzx  reason: default package */
/* loaded from: classes3.dex */
final class bhzx implements btzi<dukb, dukf> {
    final /* synthetic */ bhzy a;

    public bhzx(bhzy bhzyVar) {
        this.a = bhzyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dukb> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dukb> btzrVar, dukf dukfVar) {
        dukf dukfVar2 = dukfVar;
        bvrj.UI_THREAD.c();
        if (!dukfVar2.a.isEmpty()) {
            bhzy bhzyVar = this.a;
            biac biacVar = bhzyVar.e;
            dbsk.s(biacVar);
            biacVar.n(dukfVar2);
            biac biacVar2 = bhzyVar.e;
            dbsk.s(biacVar2);
            cqkx.p(biacVar2);
        }
    }
}
