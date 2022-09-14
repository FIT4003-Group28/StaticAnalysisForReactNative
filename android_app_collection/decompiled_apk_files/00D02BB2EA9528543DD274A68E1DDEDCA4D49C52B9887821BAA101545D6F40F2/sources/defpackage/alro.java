package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alro  reason: default package */
/* loaded from: classes.dex */
public final class alro {
    final /* synthetic */ alrv a;
    private final bvpi b;

    public alro(alrv alrvVar, final alow alowVar, int i) {
        this.a = alrvVar;
        dbsk.a(i > 0);
        this.b = new bvpi(i, new Runnable(this, alowVar) { // from class: alrn
            private final alro a;
            private final alow b;

            {
                this.a = this;
                this.b = alowVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alro alroVar = this.a;
                alow alowVar2 = this.b;
                dcep<amgj> k = alowVar2.k();
                synchronized (alroVar.a.g) {
                    for (amgj amgjVar : k) {
                        if (alroVar.a.f.a(amgjVar) == null) {
                            return;
                        }
                    }
                    alowVar2.j(true);
                }
            }
        });
    }

    public final void a() {
        this.b.a();
    }
}
