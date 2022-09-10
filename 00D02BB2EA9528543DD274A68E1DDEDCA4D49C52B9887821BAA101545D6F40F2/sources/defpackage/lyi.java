package defpackage;
/* compiled from: PG */
/* renamed from: lyi  reason: default package */
/* loaded from: classes7.dex */
final class lyi implements Runnable {
    final /* synthetic */ lyj a;

    public lyi(lyj lyjVar) {
        this.a = lyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c();
        final lya lyaVar = this.a.d;
        dbsk.s(lyaVar);
        this.a.b();
        this.a.c();
        lyj lyjVar = this.a;
        lyaVar.getClass();
        lyjVar.d(new Runnable(lyaVar) { // from class: lyh
            private final lya a;

            {
                this.a = lyaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lya lyaVar2 = this.a;
                bvrj.UI_THREAD.c();
                lyd lydVar = lyaVar2.a;
                if (lydVar != lyaVar2.b.k) {
                    return;
                }
                dbsk.s(lydVar);
                lydVar.c();
                lyaVar2.b.k = null;
            }
        });
    }
}
