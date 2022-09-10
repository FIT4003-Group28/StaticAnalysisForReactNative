package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgrz  reason: default package */
/* loaded from: classes4.dex */
public final class cgrz implements btzi<djzm, djzq> {
    final /* synthetic */ cgvm a;
    final /* synthetic */ cgsh b;

    public cgrz(cgsh cgshVar, cgvm cgvmVar) {
        this.b = cgshVar;
        this.a = cgvmVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djzm> btzrVar, btzy btzyVar) {
        this.b.c(this.a);
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
    }
}
