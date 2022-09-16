package defpackage;
/* compiled from: PG */
/* renamed from: alcd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alcd implements Runnable {
    public final /* synthetic */ alci a;
    private final /* synthetic */ int b;

    public /* synthetic */ alcd(alci alciVar, int i) {
        this.b = i;
        this.a = alciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            alci alciVar = this.a;
            synchronized (alciVar.o) {
                alciVar.w();
            }
            return;
        }
        alci alciVar2 = this.a;
        alciVar2.H();
        alciVar2.G();
    }
}
