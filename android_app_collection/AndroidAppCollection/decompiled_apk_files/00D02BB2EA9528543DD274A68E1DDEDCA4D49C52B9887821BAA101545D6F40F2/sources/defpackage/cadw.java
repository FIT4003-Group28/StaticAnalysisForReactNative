package defpackage;
/* compiled from: PG */
/* renamed from: cadw  reason: default package */
/* loaded from: classes4.dex */
final class cadw implements bqlb {
    final /* synthetic */ cadx a;

    public cadw(cadx cadxVar) {
        this.a = cadxVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        cadx cadxVar = this.a;
        cadxVar.y(cadxVar.h.getString(bzqf.REVIEW_SUBMITTED_ACCESSIBILITY));
        this.a.t(bqlfVar.a());
        final cadx cadxVar2 = this.a;
        cadxVar2.w = 3;
        cadxVar2.q = false;
        cadxVar2.f.b(new Runnable(cadxVar2) { // from class: cadh
            private final cadx a;

            {
                this.a = cadxVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        }, bvrj.UI_THREAD);
        cqkx.p(this.a);
    }

    @Override // defpackage.bqlb
    public final void e() {
        cadx cadxVar = this.a;
        cadxVar.w = 3;
        cqkx.p(cadxVar);
    }
}
