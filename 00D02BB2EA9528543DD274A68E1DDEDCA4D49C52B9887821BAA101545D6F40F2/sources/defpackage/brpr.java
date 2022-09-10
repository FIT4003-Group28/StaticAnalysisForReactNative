package defpackage;
/* compiled from: PG */
/* renamed from: brpr  reason: default package */
/* loaded from: classes4.dex */
final class brpr implements brpu {
    final double a;
    final /* synthetic */ brps b;

    public brpr(brps brpsVar, double d) {
        this.b = brpsVar;
        this.a = d;
    }

    @Override // defpackage.brpu
    public final boolean a() {
        return this.a > this.b.b;
    }

    @Override // defpackage.brpu
    public final boolean b(brpu brpuVar) {
        return (brpuVar instanceof brpr) && this.a > ((brpr) brpuVar).a;
    }
}
