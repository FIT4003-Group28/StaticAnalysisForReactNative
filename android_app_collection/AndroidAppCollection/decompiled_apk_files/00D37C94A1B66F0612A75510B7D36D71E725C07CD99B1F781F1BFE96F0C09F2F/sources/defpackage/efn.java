package defpackage;
/* compiled from: PG */
/* renamed from: efn  reason: default package */
/* loaded from: classes3.dex */
final class efn implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ efq b;

    public efn(efq efqVar, boolean z) {
        this.b = efqVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aacu aacuVar = (aacu) this.b.n.get();
        aacuVar.d(this.b.b);
        efq efqVar = this.b;
        ((aaqd) this.b.o.get()).h(efqVar.a, efqVar.n, efqVar.j);
        if (!this.a) {
            this.b.c();
        } else {
            efq efqVar2 = this.b;
            aynr B = efqVar2.c.B(azpj.b(efqVar2.a));
            final efq efqVar3 = this.b;
            B.R(new aypv() { // from class: efm
                @Override // defpackage.aypv
                public final void a() {
                    efq.this.c();
                }
            });
        }
        ((zen) this.b.f.get()).c(this.b.b, aacuVar.a());
    }
}
