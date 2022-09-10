package defpackage;
/* compiled from: PG */
/* renamed from: aidx  reason: default package */
/* loaded from: classes2.dex */
final class aidx implements arbw {
    @dzsi
    public Runnable a;
    final /* synthetic */ aidy b;

    public aidx(aidy aidyVar) {
        this.b = aidyVar;
    }

    @Override // defpackage.arbw
    public final void a() {
        this.b.a.b(new Runnable(this) { // from class: aidv
            private final aidx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aidx aidxVar = this.a;
                if (aidxVar.a != null) {
                    return;
                }
                aidxVar.a = new Runnable(aidxVar) { // from class: aidw
                    private final aidx a;

                    {
                        this.a = aidxVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aidx aidxVar2 = this.a;
                        aidy aidyVar = aidxVar2.b;
                        btlu btluVar = aidyVar.d;
                        aidyVar.g(btluVar, btluVar);
                        aidxVar2.a = null;
                    }
                };
                aidxVar.b.a.a(aidxVar.a, bvrj.UI_THREAD, 100L);
            }
        }, bvrj.UI_THREAD);
    }
}
