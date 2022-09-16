package defpackage;
/* compiled from: PG */
/* renamed from: axso  reason: default package */
/* loaded from: classes3.dex */
final class axso implements akeo {
    final /* synthetic */ btlu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bwrs c;
    final /* synthetic */ axtp d;

    public axso(axtp axtpVar, btlu btluVar, boolean z, bwrs bwrsVar) {
        this.d = axtpVar;
        this.a = btluVar;
        this.b = z;
        this.c = bwrsVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        if (btlu.g(this.a, btluVar)) {
            this.d.R(this.b, this.c);
            return;
        }
        baju bajuVar = this.d.t;
        final boolean z = this.b;
        final bwrs bwrsVar = this.c;
        bajuVar.a(new bvqg(this, z, bwrsVar) { // from class: axsm
            private final axso a;
            private final boolean b;
            private final bwrs c;

            {
                this.a = this;
                this.b = z;
                this.c = bwrsVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final axso axsoVar = this.a;
                final boolean z2 = this.b;
                final bwrs bwrsVar2 = this.c;
                if (((Boolean) obj).booleanValue()) {
                    axsoVar.d.h.b(new Runnable(axsoVar, z2, bwrsVar2) { // from class: axsn
                        private final axso a;
                        private final boolean b;
                        private final bwrs c;

                        {
                            this.a = axsoVar;
                            this.b = z2;
                            this.c = bwrsVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            axso axsoVar2 = this.a;
                            axsoVar2.d.R(this.b, this.c);
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        });
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
        this.d.S(this.c);
    }
}
