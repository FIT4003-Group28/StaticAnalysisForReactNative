package defpackage;
/* compiled from: PG */
/* renamed from: rnp  reason: default package */
/* loaded from: classes7.dex */
final class rnp implements akey {
    final /* synthetic */ Runnable a;
    final /* synthetic */ rnq b;

    public rnp(rnq rnqVar, Runnable runnable) {
        this.b = rnqVar;
        this.a = runnable;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (this.b.C()) {
            baju bajuVar = this.b.c;
            final Runnable runnable = this.a;
            bajuVar.a(new bvqg(this, runnable) { // from class: rno
                private final rnp a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    rnp rnpVar = this.a;
                    Runnable runnable2 = this.b;
                    if (((Boolean) obj).booleanValue()) {
                        rnpVar.b.d.b(runnable2, bvrj.UI_THREAD);
                    }
                }
            });
        }
    }

    @Override // defpackage.akey
    public final void b() {
        dcdc<ror> dcdcVar = rnq.a;
    }
}
