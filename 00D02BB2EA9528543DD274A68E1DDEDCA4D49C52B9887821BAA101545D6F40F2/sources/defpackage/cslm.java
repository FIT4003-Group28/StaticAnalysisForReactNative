package defpackage;
/* compiled from: PG */
/* renamed from: cslm  reason: default package */
/* loaded from: classes5.dex */
final class cslm extends csmd {
    final /* synthetic */ csln a;

    public cslm(csln cslnVar) {
        this.a = cslnVar;
    }

    @Override // defpackage.csmd
    public final void a() {
        final csln cslnVar = this.a;
        if (cslnVar.c) {
            String str = cslnVar.b;
            if (!czhw.a(str, str) || cslnVar.ad != 1 || cslnVar.g == null) {
                return;
            }
            cslnVar.i();
            cslnVar.g();
            cslnVar.g.d(new Runnable(cslnVar) { // from class: csll
                private final csln a;

                {
                    this.a = cslnVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }
    }

    @Override // defpackage.csmd
    public final void b() {
        this.a.e();
    }

    @Override // defpackage.csmd
    public final void c() {
        csln cslnVar = this.a;
        long j = cslnVar.d;
        if (j > 0) {
            cslnVar.g.postDelayed(cslnVar.ae, j);
        }
    }

    @Override // defpackage.csmd
    public final void d() {
        csln cslnVar = this.a;
        if (cslnVar.d > 0) {
            cslnVar.g.removeCallbacks(cslnVar.ae);
        }
    }
}
