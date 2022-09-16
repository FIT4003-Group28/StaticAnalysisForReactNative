package defpackage;
/* compiled from: PG */
/* renamed from: azeo  reason: default package */
/* loaded from: classes2.dex */
final class azeo implements Runnable {
    final /* synthetic */ azeq a;
    private final Throwable b;

    public azeo(azeq azeqVar, Throwable th) {
        this.a = azeqVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.b(this.b);
        } finally {
            this.a.d.qr();
        }
    }
}
