package defpackage;
/* compiled from: PG */
/* renamed from: dzfe  reason: default package */
/* loaded from: classes6.dex */
final class dzfe implements Runnable {
    final dzfd a;
    final /* synthetic */ dzff b;

    public dzfe(dzff dzffVar, dzfd dzfdVar) {
        this.b = dzffVar;
        this.a = dzfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d = true;
        this.b.a.remove(this.a);
    }
}
