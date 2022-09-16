package defpackage;
/* compiled from: PG */
/* renamed from: alby  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alby implements Runnable {
    public final /* synthetic */ alci a;
    public final /* synthetic */ alfd b;
    private final /* synthetic */ int c;

    public /* synthetic */ alby(alci alciVar, alfd alfdVar) {
        this.a = alciVar;
        this.b = alfdVar;
    }

    public /* synthetic */ alby(alci alciVar, alfd alfdVar, int i) {
        this.c = i;
        this.a = alciVar;
        this.b = alfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            alci alciVar = this.a;
            alfd alfdVar = this.b;
            synchronized (alciVar.o) {
                if (!alciVar.q.containsKey(alfdVar.b)) {
                    zep.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                    return;
                }
                alciVar.C();
                alciVar.h.j(alfdVar);
                alciVar.G();
                return;
            }
        }
        alci alciVar2 = this.a;
        alfd alfdVar2 = this.b;
        synchronized (alciVar2.o) {
            alciVar2.w();
            alcl a = alcm.a(alfdVar2.b);
            a.b = alfdVar2.i;
            a.d = alfdVar2.a;
            alciVar2.u(a.a());
            alciVar2.x(alfdVar2);
        }
    }
}
