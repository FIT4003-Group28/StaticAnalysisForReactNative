package defpackage;
/* compiled from: PG */
/* renamed from: aluw  reason: default package */
/* loaded from: classes.dex */
final class aluw implements Runnable {
    final /* synthetic */ alvd a;
    final /* synthetic */ alux b;

    public aluw(alux aluxVar, alvd alvdVar) {
        this.b = aluxVar;
        this.a = alvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.b.a) {
            aluy aluyVar = this.b.b;
            if (aluyVar != null) {
                alvd alvdVar = this.a;
                synchronized (alvdVar.a) {
                    exc = alvdVar.e;
                }
                aluyVar.a(exc);
            }
        }
    }
}
