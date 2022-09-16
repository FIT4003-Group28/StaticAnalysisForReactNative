package defpackage;
/* compiled from: PG */
/* renamed from: albx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class albx implements Runnable {
    public final /* synthetic */ alci a;
    public final /* synthetic */ alcm b;
    private final /* synthetic */ int c;

    public /* synthetic */ albx(alci alciVar, alcm alcmVar) {
        this.a = alciVar;
        this.b = alcmVar;
    }

    public /* synthetic */ albx(alci alciVar, alcm alcmVar, int i) {
        this.c = i;
        this.a = alciVar;
        this.b = alcmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            alci alciVar = this.a;
            alcm alcmVar = this.b;
            synchronized (alciVar.o) {
                alciVar.w();
                alciVar.u(alcmVar);
            }
        } else if (i == 1) {
            alci alciVar2 = this.a;
            alcm alcmVar2 = this.b;
            synchronized (alciVar2.o) {
                alciVar2.w();
                alciVar2.u(alcmVar2);
                alciVar2.d.execute(new albx(alciVar2, alcmVar2, 3));
            }
        } else if (i != 2) {
            alci alciVar3 = this.a;
            String str = this.b.a;
            synchronized (alciVar3.o) {
                if (!alciVar3.q.containsKey(str)) {
                    zep.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                    return;
                }
                alciVar3.C();
                alciVar3.h.e(str);
                alciVar3.G();
            }
        } else {
            alci alciVar4 = this.a;
            alcm alcmVar3 = this.b;
            synchronized (alciVar4.o) {
                alciVar4.u(alcmVar3);
                alciVar4.C();
            }
            alciVar4.G();
        }
    }
}
