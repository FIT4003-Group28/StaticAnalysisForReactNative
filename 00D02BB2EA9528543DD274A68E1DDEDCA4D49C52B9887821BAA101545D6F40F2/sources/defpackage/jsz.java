package defpackage;
/* compiled from: PG */
/* renamed from: jsz  reason: default package */
/* loaded from: classes7.dex */
final class jsz implements Runnable {
    final /* synthetic */ jta a;

    public jsz(jta jtaVar) {
        this.a = jtaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jtc jtcVar = this.a.c;
        bvrj.UI_THREAD.c();
        if (jtcVar.U != null) {
            do {
            } while (jtcVar.U.k() == 1);
            jvl jvlVar = jtcVar.Y;
            if (jvlVar != null) {
                jvlVar.b();
            }
        }
        this.a.c.R.a();
    }
}
