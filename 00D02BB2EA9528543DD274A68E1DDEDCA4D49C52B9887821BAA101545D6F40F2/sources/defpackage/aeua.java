package defpackage;
/* compiled from: PG */
/* renamed from: aeua  reason: default package */
/* loaded from: classes2.dex */
final class aeua implements arbw {
    final /* synthetic */ aeub a;

    public aeua(aeub aeubVar) {
        this.a = aeubVar;
    }

    @Override // defpackage.arbw
    public final void a() {
        aeub aeubVar = this.a;
        if (!aeubVar.h) {
            return;
        }
        aeubVar.e.a().b(new Runnable(this) { // from class: aetz
            private final aeua a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, bvrj.UI_THREAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        akra akraVar = new akra();
        boolean f = this.a.b.a().m().f().f(akraVar);
        aeub aeubVar = this.a;
        if (true != f) {
            akraVar = null;
        }
        bvrj.UI_THREAD.c();
        if (dbsd.a(akraVar, aeubVar.i)) {
            return;
        }
        aeubVar.i = akraVar;
        aeubVar.c(false);
    }
}
