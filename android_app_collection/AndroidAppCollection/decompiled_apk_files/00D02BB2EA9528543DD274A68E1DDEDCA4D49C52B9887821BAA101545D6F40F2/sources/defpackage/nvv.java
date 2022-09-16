package defpackage;
/* compiled from: PG */
/* renamed from: nvv  reason: default package */
/* loaded from: classes7.dex */
final class nvv extends cknx {
    private final bvrt<dwge> a;

    public nvv(dwge dwgeVar) {
        this.a = bvrt.b(dwgeVar);
    }

    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, String str, int i2, int i3) {
        dwge e = this.a.e((dssr) dwge.m.cu(7), dwge.m);
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        dwfy dwfyVar = (dwfy) dsqpVar;
        dwfs o = o(true);
        n(o, i2, i3);
        j(o, 20, str);
        if (dwfyVar.c) {
            dwfyVar.bF();
            dwfyVar.c = false;
        }
        dwge dwgeVar = (dwge) dwfyVar.b;
        dwfv bK = o.bK();
        bK.getClass();
        dwgeVar.h = bK;
        dwgeVar.a |= 128;
        return dwfyVar.bK();
    }

    @Override // defpackage.cknx
    public final int b(@dzsi ilo iloVar) {
        return 1;
    }
}
