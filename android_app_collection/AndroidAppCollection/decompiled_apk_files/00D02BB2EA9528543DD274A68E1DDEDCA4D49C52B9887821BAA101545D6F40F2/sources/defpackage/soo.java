package defpackage;
/* compiled from: PG */
/* renamed from: soo  reason: default package */
/* loaded from: classes7.dex */
final class soo implements degu<dcdc<wdp>> {
    final /* synthetic */ sos a;

    public soo(sos sosVar) {
        this.a = sosVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        long j = sos.a;
        this.a.k(sns.FAILED_TRIPS);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<wdp> dcdcVar) {
        final dcdc<wdp> dcdcVar2 = dcdcVar;
        final sos sosVar = this.a;
        if (sosVar.i.e(sosVar.h)) {
            sosVar.l.postDelayed(new Runnable(sosVar, dcdcVar2) { // from class: sog
                private final sos a;
                private final dcdc b;

                {
                    this.a = sosVar;
                    this.b = dcdcVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(this.b);
                }
            }, sos.a);
        } else {
            sosVar.l(dcdcVar2);
        }
    }
}
