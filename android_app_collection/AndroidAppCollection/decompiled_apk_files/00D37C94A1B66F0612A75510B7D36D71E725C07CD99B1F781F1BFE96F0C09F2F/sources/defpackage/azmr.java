package defpackage;
/* compiled from: PG */
/* renamed from: azmr  reason: default package */
/* loaded from: classes2.dex */
final class azmr implements Runnable {
    final /* synthetic */ azmw a;
    private final azms b;

    public azmr(azmw azmwVar, azms azmsVar) {
        this.a = azmwVar;
        this.b = azmsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azms azmsVar = this.b;
        ayqi.i(azmsVar.b, this.a.f(azmsVar));
    }
}
