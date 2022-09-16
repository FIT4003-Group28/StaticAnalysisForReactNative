package defpackage;
/* compiled from: PG */
/* renamed from: pcd  reason: default package */
/* loaded from: classes7.dex */
final class pcd implements btzi<dutm, duto> {
    final /* synthetic */ deig a;

    public pcd(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dutm> btzrVar, btzy btzyVar) {
        if (this.a.isCancelled()) {
            return;
        }
        this.a.k(new pcf(btzyVar.p));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dutm> btzrVar, duto dutoVar) {
        duto dutoVar2 = dutoVar;
        if (this.a.isCancelled()) {
            return;
        }
        this.a.j(dutoVar2);
    }
}
