package defpackage;
/* compiled from: PG */
/* renamed from: bwto  reason: default package */
/* loaded from: classes4.dex */
final class bwto implements degu<bxal> {
    final /* synthetic */ bwtr a;

    public bwto(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = bwtr.aT;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bxal bxalVar) {
        bxal bxalVar2 = bxalVar;
        bxbs bxbsVar = this.a.ay;
        if (bxbsVar != null) {
            bxak bxakVar = bxalVar2.a;
            if (bxakVar == null) {
                bxakVar = bxak.d;
            }
            bxbsVar.setWireframeRendering(bxakVar.a);
            bxbs bxbsVar2 = this.a.ay;
            bxak bxakVar2 = bxalVar2.a;
            if (bxakVar2 == null) {
                bxakVar2 = bxak.d;
            }
            bxbsVar2.setEnableSingleTap(bxakVar2.b);
            bxbs bxbsVar3 = this.a.ay;
            bxak bxakVar3 = bxalVar2.a;
            if (bxakVar3 == null) {
                bxakVar3 = bxak.d;
            }
            bxbsVar3.setHideNavArrows(bxakVar3.c);
        }
    }
}
