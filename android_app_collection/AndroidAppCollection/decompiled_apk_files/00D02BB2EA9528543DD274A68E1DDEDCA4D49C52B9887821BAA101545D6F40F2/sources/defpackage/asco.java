package defpackage;
/* compiled from: PG */
/* renamed from: asco  reason: default package */
/* loaded from: classes2.dex */
final class asco implements Runnable {
    final /* synthetic */ asct a;

    public asco(asct asctVar) {
        this.a = asctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ascu ascuVar = this.a.a;
        if (ascuVar.aD) {
            gn gnVar = ascuVar.A;
            dbsk.s(gnVar);
            gnVar.f();
            this.a.a.ay.Z(bvjk.hr, this.a.a.at.b());
        }
    }
}
