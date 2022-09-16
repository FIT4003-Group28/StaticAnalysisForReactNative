package defpackage;
/* compiled from: PG */
/* renamed from: aluz  reason: default package */
/* loaded from: classes.dex */
final class aluz implements Runnable {
    final /* synthetic */ alvd a;
    final /* synthetic */ alva b;

    public aluz(alva alvaVar, alvd alvdVar) {
        this.b = alvaVar;
        this.a = alvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.b.a) {
            alvb alvbVar = this.b.b;
            if (alvbVar != null) {
                alvd alvdVar = this.a;
                synchronized (alvdVar.a) {
                    akpq.k(alvdVar.c, "Task is not yet complete");
                    Exception exc = alvdVar.e;
                    if (exc == null) {
                        obj = alvdVar.d;
                    } else {
                        throw new alvc(exc);
                    }
                }
                alvbVar.a(obj);
            }
        }
    }
}
