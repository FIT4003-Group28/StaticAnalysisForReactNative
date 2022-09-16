package defpackage;
/* compiled from: PG */
/* renamed from: ahnb  reason: default package */
/* loaded from: classes.dex */
final class ahnb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahnh b;
    private final /* synthetic */ int c;

    public ahnb(ahnh ahnhVar, int i) {
        this.b = ahnhVar;
        this.a = i;
    }

    public ahnb(ahnh ahnhVar, int i, int i2) {
        this.c = i2;
        this.b = ahnhVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.j.setGravity(this.a);
        } else {
            this.b.j.setTextColor(this.a);
        }
    }
}
