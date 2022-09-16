package defpackage;
/* compiled from: PG */
/* renamed from: ahnc  reason: default package */
/* loaded from: classes.dex */
final class ahnc implements Runnable {
    final /* synthetic */ ahnh a;
    private final /* synthetic */ int b;

    public ahnc(ahnh ahnhVar) {
        this.a = ahnhVar;
    }

    public ahnc(ahnh ahnhVar, int i) {
        this.b = i;
        this.a = ahnhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ahnh ahnhVar = this.a;
            ahnhVar.i.removeView(ahnhVar.j);
            return;
        }
        this.a.j.invalidate();
    }
}
