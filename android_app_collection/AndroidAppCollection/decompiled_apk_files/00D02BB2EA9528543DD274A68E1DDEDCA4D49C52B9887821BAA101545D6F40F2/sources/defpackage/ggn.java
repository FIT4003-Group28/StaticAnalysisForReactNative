package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ggn  reason: default package */
/* loaded from: classes6.dex */
public final class ggn implements ecs {
    final /* synthetic */ ggo a;

    public ggn(ggo ggoVar) {
        this.a = ggoVar;
    }

    @Override // defpackage.ecs
    public final void Qf() {
        ggo ggoVar = this.a;
        if (!ggoVar.aD) {
            return;
        }
        bvsi bvsiVar = new bvsi(ggoVar.H());
        bvsiVar.d(this.a.g());
        bvsiVar.d(this.a.i());
        ggo ggoVar2 = this.a;
        if (ggoVar2.ag != null) {
            bvsiVar.d(ggoVar2.bv());
        }
        ggo ggoVar3 = this.a;
        ggoVar3.ae.f(ggoVar3.ai, bvsiVar.toString());
    }
}
