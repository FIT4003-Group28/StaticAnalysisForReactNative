package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgsa  reason: default package */
/* loaded from: classes4.dex */
public final class cgsa implements btzi<djzm, djzq> {
    final /* synthetic */ dwpc a;
    final /* synthetic */ cgsh b;

    public cgsa(cgsh cgshVar, dwpc dwpcVar) {
        this.b = cgshVar;
        this.a = dwpcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djzm> btzrVar, btzy btzyVar) {
        this.b.j.b(this.a, cgsf.SERVER_ERROR);
        this.b.h();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djzm> btzrVar, djzq djzqVar) {
        djzq djzqVar2 = djzqVar;
        if ((djzqVar2.a & 2) != 0) {
            cgen cgenVar = this.b.a;
            dwpe dwpeVar = djzqVar2.c;
            if (dwpeVar == null) {
                dwpeVar = dwpe.a;
            }
            cgenVar.n(dwpeVar);
        }
        int a = djzp.a(djzqVar2.b);
        if (a != 0 && a == 2) {
            this.b.j.c(this.a);
        } else {
            this.b.j.b(this.a, cgsf.SERVER_ERROR);
        }
        this.b.h();
    }
}
