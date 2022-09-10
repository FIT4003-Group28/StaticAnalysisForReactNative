package defpackage;
/* compiled from: PG */
/* renamed from: azgn  reason: default package */
/* loaded from: classes3.dex */
final class azgn implements btzi<dvjt, dvjv> {
    final /* synthetic */ axvz a;

    public azgn(axvz axvzVar) {
        this.a = axvzVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvjt> btzrVar, btzy btzyVar) {
        this.a.a(false);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvjt> btzrVar, dvjv dvjvVar) {
        axvz axvzVar = this.a;
        int a = dnvx.a(dvjvVar.a);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        axvzVar.a(z);
    }
}
