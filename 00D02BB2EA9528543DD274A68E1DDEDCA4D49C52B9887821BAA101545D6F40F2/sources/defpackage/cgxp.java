package defpackage;
/* compiled from: PG */
/* renamed from: cgxp  reason: default package */
/* loaded from: classes4.dex */
final class cgxp implements btzi<djzm, djzq> {
    final /* synthetic */ cgxq a;

    public cgxp(cgxq cgxqVar) {
        this.a = cgxqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djzm> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djzm> btzrVar, djzq djzqVar) {
        djzq djzqVar2 = djzqVar;
        if ((djzqVar2.a & 2) != 0) {
            cgen cgenVar = this.a.a;
            dwpe dwpeVar = djzqVar2.c;
            if (dwpeVar == null) {
                dwpeVar = dwpe.a;
            }
            cgenVar.n(dwpeVar);
        }
    }
}
