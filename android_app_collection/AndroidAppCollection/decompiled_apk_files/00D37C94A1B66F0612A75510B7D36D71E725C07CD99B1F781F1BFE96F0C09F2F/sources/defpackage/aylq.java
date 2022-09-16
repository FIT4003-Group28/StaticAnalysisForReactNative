package defpackage;
/* compiled from: PG */
/* renamed from: aylq  reason: default package */
/* loaded from: classes2.dex */
final class aylq implements Runnable {
    final /* synthetic */ aymm a;
    final /* synthetic */ ayls b;

    public aylq(ayls aylsVar, aymm aymmVar) {
        this.b = aylsVar;
        this.a = aymmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.u.d(this.a);
    }
}
