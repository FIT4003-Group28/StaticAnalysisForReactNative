package defpackage;
/* compiled from: PG */
/* renamed from: ayvb  reason: default package */
/* loaded from: classes2.dex */
final class ayvb implements Runnable {
    final /* synthetic */ ayve a;

    public ayvb(ayve ayveVar) {
        this.a = ayveVar;
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
