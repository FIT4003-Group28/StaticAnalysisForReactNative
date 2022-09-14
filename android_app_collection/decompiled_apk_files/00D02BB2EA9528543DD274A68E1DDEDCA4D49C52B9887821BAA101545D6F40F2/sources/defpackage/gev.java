package defpackage;
/* compiled from: PG */
/* renamed from: gev  reason: default package */
/* loaded from: classes6.dex */
final class gev extends akxp {
    final /* synthetic */ gew a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gev(gew gewVar, bnsn bnsnVar) {
        super(bnsnVar);
        this.a = gewVar;
    }

    @Override // defpackage.akxp
    public final void a(int i, int i2, float f) {
        this.a.aK.execute(new Runnable(this) { // from class: geu
            private final gev a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gew gewVar = this.a.a;
                if (gewVar.aD) {
                    gewVar.Qm();
                }
            }
        });
    }
}
