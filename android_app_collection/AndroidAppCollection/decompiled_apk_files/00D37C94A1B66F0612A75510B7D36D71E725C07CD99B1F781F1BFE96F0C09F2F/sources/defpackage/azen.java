package defpackage;
/* compiled from: PG */
/* renamed from: azen  reason: default package */
/* loaded from: classes2.dex */
final class azen implements Runnable {
    final /* synthetic */ azeq a;

    public azen(azeq azeqVar) {
        this.a = azeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.sm();
        } finally {
            this.a.d.qr();
        }
    }
}
