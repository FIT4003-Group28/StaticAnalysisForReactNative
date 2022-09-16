package defpackage;
/* compiled from: PG */
/* renamed from: ppz  reason: default package */
/* loaded from: classes.dex */
final class ppz implements Runnable {
    final /* synthetic */ pqa a;

    public ppz(pqa pqaVar) {
        this.a = pqaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            pqa pqaVar = this.a;
            if (pqaVar.d != 0 && !pqaVar.e) {
                pqaVar.a.registerReceiver(pqaVar.b, pqaVar.c);
                this.a.e = true;
            }
        }
    }
}
