package defpackage;
/* renamed from: cfiq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cfiq {
    private final cfja a;

    public cfiq(cfja cfjaVar) {
        this.a = cfjaVar;
    }

    public final void a(String str) {
        final cfja cfjaVar = this.a;
        cfjaVar.i = dbsg.i(new jic(str, ckqc.FULLY_QUALIFIED, (cqtd) null, 250));
        cfjaVar.f.execute(new Runnable(cfjaVar) { // from class: cfiu
            private final cfja a;

            {
                this.a = cfjaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
    }
}
