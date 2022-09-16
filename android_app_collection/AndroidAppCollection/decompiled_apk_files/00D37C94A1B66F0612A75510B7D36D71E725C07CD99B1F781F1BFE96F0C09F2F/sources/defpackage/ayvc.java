package defpackage;
/* compiled from: PG */
/* renamed from: ayvc  reason: default package */
/* loaded from: classes2.dex */
final class ayvc implements Runnable {
    final /* synthetic */ ayve a;
    private final Throwable b;

    public ayvc(ayve ayveVar, Throwable th) {
        this.a = ayveVar;
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
