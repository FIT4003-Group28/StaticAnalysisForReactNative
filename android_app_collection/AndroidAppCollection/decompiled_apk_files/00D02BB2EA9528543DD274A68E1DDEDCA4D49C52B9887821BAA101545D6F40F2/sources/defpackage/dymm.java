package defpackage;
/* compiled from: PG */
/* renamed from: dymm  reason: default package */
/* loaded from: classes6.dex */
final class dymm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dymv b;

    public dymm(dymv dymvVar, int i) {
        this.b = dymvVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.c(this.a);
    }
}
