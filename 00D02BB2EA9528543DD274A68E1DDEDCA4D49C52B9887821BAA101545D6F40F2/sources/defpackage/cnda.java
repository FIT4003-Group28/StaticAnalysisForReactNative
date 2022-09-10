package defpackage;
/* compiled from: PG */
/* renamed from: cnda  reason: default package */
/* loaded from: classes5.dex */
final class cnda implements degu<cncj> {
    final /* synthetic */ cncj a;
    final /* synthetic */ cndc b;

    public cnda(cndc cndcVar, cncj cncjVar) {
        this.b = cndcVar;
        this.a = cncjVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = cnjc.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cncj cncjVar) {
        int i = cnjc.a;
        if (!this.b.b()) {
            return;
        }
        cojb cojbVar = new cojb(this.b.f);
        final cndc cndcVar = this.b;
        cojbVar.post(new Runnable(cndcVar) { // from class: cncz
            private final cndc a;

            {
                this.a = cndcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        });
        this.a.j(this.b.e);
        cndc cndcVar2 = this.b;
        cndcVar2.e(cndcVar2.b, cndcVar2.f());
    }
}
