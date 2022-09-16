package defpackage;
/* compiled from: PG */
/* renamed from: ayga  reason: default package */
/* loaded from: classes2.dex */
final class ayga implements Runnable {
    final /* synthetic */ aygi a;
    private final /* synthetic */ int b;

    public ayga(aygi aygiVar) {
        this.a = aygiVar;
    }

    public ayga(aygi aygiVar, int i) {
        this.b = i;
        this.a = aygiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.r();
        } else if (i == 1) {
            this.a.e.f();
        } else if (i == 2) {
            this.a.e.d();
        } else {
            this.a.e.e();
        }
    }
}
