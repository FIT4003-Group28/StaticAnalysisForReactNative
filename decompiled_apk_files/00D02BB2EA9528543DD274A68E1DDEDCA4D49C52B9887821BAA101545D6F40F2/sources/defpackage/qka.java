package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qka  reason: default package */
/* loaded from: classes7.dex */
public final class qka implements amrl {
    boolean a;
    final /* synthetic */ amrl b;
    final /* synthetic */ qkc c;

    public qka(qkc qkcVar, amrl amrlVar) {
        this.c = qkcVar;
        this.b = amrlVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        boolean a = this.b.a(aktcVar, amrkVar, amrjVar);
        final qkc qkcVar = this.c;
        boolean z = this.a;
        if (a) {
            if (!z) {
                final cjtd d = qkc.d();
                qkcVar.d.execute(new Runnable(qkcVar, d) { // from class: qjz
                    private final qkc a;
                    private final cjtd b;

                    {
                        this.a = qkcVar;
                        this.b = d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        qkc qkcVar2 = this.a;
                        qkcVar2.c.g().d(this.b);
                    }
                });
            }
            z = true;
        }
        this.a = z;
        return a;
    }
}
