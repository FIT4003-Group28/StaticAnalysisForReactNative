package defpackage;
/* compiled from: PG */
/* renamed from: ayfy  reason: default package */
/* loaded from: classes2.dex */
final class ayfy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aygi b;
    private final /* synthetic */ int c;

    public ayfy(aygi aygiVar, int i) {
        this.b = aygiVar;
        this.a = i;
    }

    public ayfy(aygi aygiVar, int i, int i2) {
        this.c = i2;
        this.b = aygiVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.e.k(this.a);
        } else if (i == 1) {
            this.b.e.g(this.a);
        } else {
            this.b.e.l(this.a);
        }
    }
}
