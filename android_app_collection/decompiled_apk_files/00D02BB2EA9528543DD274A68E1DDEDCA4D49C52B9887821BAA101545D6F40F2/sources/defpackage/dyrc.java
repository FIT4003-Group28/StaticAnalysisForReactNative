package defpackage;
/* compiled from: PG */
/* renamed from: dyrc  reason: default package */
/* loaded from: classes6.dex */
final class dyrc implements Runnable {
    final /* synthetic */ dyhd a;
    final /* synthetic */ dyfk b;
    final /* synthetic */ dyrd c;

    public dyrc(dyrd dyrdVar, dyhd dyhdVar, dyfk dyfkVar) {
        this.c = dyrdVar;
        this.a = dyhdVar;
        this.b = dyfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyrd dyrdVar = this.c;
        dyrz dyrzVar = dyrdVar.b;
        if (dyrdVar != dyrzVar.s) {
            return;
        }
        dyrzVar.r(this.a);
        if (this.b == dyfk.SHUTDOWN) {
            return;
        }
        this.c.b.G.b(2, "Entering {0} state with picker: {1}", this.b, this.a);
        this.c.b.q.a(this.b);
    }
}
