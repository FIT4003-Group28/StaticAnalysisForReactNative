package defpackage;
/* compiled from: PG */
/* renamed from: aajo  reason: default package */
/* loaded from: classes2.dex */
final class aajo implements btzi<diji, dijk> {
    private final bvqg<dbsg<diwb>> a;

    public aajo(bvqg<dbsg<diwb>> bvqgVar) {
        this.a = bvqgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diji> btzrVar, btzy btzyVar) {
        this.a.NU(dbpy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diji> btzrVar, dijk dijkVar) {
        diwb diwbVar;
        dijk dijkVar2 = dijkVar;
        bvqg<dbsg<diwb>> bvqgVar = this.a;
        if ((dijkVar2.a & 2) != 0) {
            diwbVar = dijkVar2.b;
            if (diwbVar == null) {
                diwbVar = diwb.U;
            }
        } else {
            diwbVar = null;
        }
        bvqgVar.NU(dbsg.j(diwbVar));
    }
}
