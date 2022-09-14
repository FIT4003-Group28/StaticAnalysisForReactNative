package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qgd  reason: default package */
/* loaded from: classes7.dex */
public final class qgd implements Runnable {
    private final akta a;
    private final akzh b;
    private final akpq c;
    private float d = 2.0f;

    public qgd(akta aktaVar, akzh akzhVar, akpq akpqVar) {
        this.a = aktaVar;
        this.b = akzhVar;
        this.c = akpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float j = ammd.j(this.b.p().k, true);
        if (Math.abs(j - this.d) > 1.0E-6f) {
            aksz d = this.a.d();
            d.c(j / 2.0f, aksy.PIXEL);
            this.a.c(d);
            this.d = j;
        }
        this.c.b(this);
    }
}
