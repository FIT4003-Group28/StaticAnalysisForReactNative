package defpackage;
/* compiled from: PG */
/* renamed from: uiq  reason: default package */
/* loaded from: classes7.dex */
public final class uiq implements btzi<dwge, dwgl> {
    private final dcdc<Integer> a;
    private final uip b;

    public uiq(dcdc<Integer> dcdcVar, uip uipVar) {
        this.a = dcdcVar;
        this.b = uipVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwge> btzrVar, btzy btzyVar) {
        bvoo.h("ListEntityPhotos failed with status: %s", btzyVar.toString());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwge> btzrVar, dwgl dwglVar) {
        this.b.a(dwglVar.b, this.a);
    }
}
