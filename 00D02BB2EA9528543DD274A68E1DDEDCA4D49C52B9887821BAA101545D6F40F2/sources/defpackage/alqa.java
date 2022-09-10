package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqa  reason: default package */
/* loaded from: classes.dex */
public final class alqa implements alwb {
    final /* synthetic */ alqj a;

    public alqa(alqj alqjVar) {
        this.a = alqjVar;
    }

    @Override // defpackage.alwb
    public final void e(final alwa alwaVar) {
        Object obj = alwaVar.a;
        alqj alqjVar = this.a;
        if (obj != alqjVar.a) {
            return;
        }
        alqjVar.f.execute(new Runnable(this, alwaVar) { // from class: alpz
            private final alqa a;
            private final alwa b;

            {
                this.a = this;
                this.b = alwaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alqa alqaVar = this.a;
                alwa alwaVar2 = this.b;
                alqj alqjVar2 = alqaVar.a;
                int i = alwaVar2.b;
                alqjVar2.g.b(i);
                synchronized (alqjVar2.i) {
                    almu almuVar = alqjVar2.h;
                    dmyo dmyoVar = alqjVar2.j.d().A;
                    synchronized (almuVar) {
                        almuVar.d = true;
                        almuVar.c = i;
                    }
                    almuVar.o(dmyoVar);
                }
                alqjVar2.e.p();
                alqjVar2.aI(true);
            }
        });
    }
}
