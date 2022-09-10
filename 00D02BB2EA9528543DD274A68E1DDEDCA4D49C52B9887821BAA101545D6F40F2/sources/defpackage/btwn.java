package defpackage;
/* compiled from: PG */
/* renamed from: btwn  reason: default package */
/* loaded from: classes4.dex */
final class btwn implements btzi<dunb, dund> {
    final /* synthetic */ ckcq a;
    final /* synthetic */ btzi b;

    public btwn(ckcq ckcqVar, btzi btziVar) {
        this.a = ckcqVar;
        this.b = btziVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dunb> btzrVar, btzy btzyVar) {
        this.a.b();
        this.b.QY(btzrVar, btzyVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dunb> btzrVar, dund dundVar) {
        this.a.b();
        this.b.QZ(btzrVar, dundVar);
    }
}
