package defpackage;
/* compiled from: PG */
/* renamed from: iqb  reason: default package */
/* loaded from: classes6.dex */
final class iqb extends cqmr {
    final /* synthetic */ iqd a;
    final /* synthetic */ iqc b;

    public iqb(iqc iqcVar, iqd iqdVar) {
        this.b = iqcVar;
        this.a = iqdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void a(final cqkp cqkpVar, boolean z) {
        iqd iqdVar = this.a;
        final mw mwVar = this.b.a;
        iqdVar.S = new Runnable(mwVar, cqkpVar) { // from class: iqa
            private final mw a;
            private final cqkp b;

            {
                this.a = mwVar;
                this.b = cqkpVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mw mwVar2 = this.a;
                cqkp cqkpVar2 = this.b;
                if (mwVar2 != null) {
                    mwVar2.a(cqkpVar2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        this.a.S = null;
    }
}
