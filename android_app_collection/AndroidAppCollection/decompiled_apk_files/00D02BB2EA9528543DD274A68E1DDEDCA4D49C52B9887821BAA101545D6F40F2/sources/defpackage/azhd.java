package defpackage;
/* compiled from: PG */
/* renamed from: azhd  reason: default package */
/* loaded from: classes3.dex */
final class azhd implements btzi<dxco, dxcq> {
    final /* synthetic */ dxco a;
    final /* synthetic */ dcep b;
    final /* synthetic */ long c;
    final /* synthetic */ btlu d;
    final /* synthetic */ azhi e;

    public azhd(azhi azhiVar, dxco dxcoVar, dcep dcepVar, long j, btlu btluVar) {
        this.e = azhiVar;
        this.a = dxcoVar;
        this.b = dcepVar;
        this.c = j;
        this.d = btluVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dxco> btzrVar, btzy btzyVar) {
        djuh djuhVar = this.a.d;
        if (djuhVar == null) {
            djuhVar = djuh.e;
        }
        this.e.f(null, this.b, this.c, djuhVar.d, this.d);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dxco> btzrVar, dxcq dxcqVar) {
        dxcq dxcqVar2 = dxcqVar;
        djuh djuhVar = this.a.d;
        if (djuhVar == null) {
            djuhVar = djuh.e;
        }
        long j = djuhVar.d;
        azhi azhiVar = this.e;
        dbsk.s(dxcqVar2);
        azhiVar.f(dxcqVar2, this.b, this.c, j, this.d);
    }
}
