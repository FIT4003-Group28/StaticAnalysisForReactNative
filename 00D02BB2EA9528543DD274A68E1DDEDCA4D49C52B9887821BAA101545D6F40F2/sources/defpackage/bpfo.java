package defpackage;
/* compiled from: PG */
/* renamed from: bpfo  reason: default package */
/* loaded from: classes3.dex */
final class bpfo implements cqhm {
    final /* synthetic */ bpfq a;

    public bpfo(bpfq bpfqVar) {
        this.a = bpfqVar;
    }

    @Override // defpackage.cqhm
    public final void a() {
        bpfq bpfqVar = this.a;
        boxg boxgVar = bpfqVar.b;
        boxgVar.a = (bpfqVar.a.c().booleanValue() || bpfqVar.f != 1) ? boxf.DIRECTIONALITY_HINT : boxgVar.c;
        boxgVar.b = boxgVar.a;
        this.a.g.b();
        this.a.h.b();
        this.a.j.a();
        this.a.d.aR();
    }
}
