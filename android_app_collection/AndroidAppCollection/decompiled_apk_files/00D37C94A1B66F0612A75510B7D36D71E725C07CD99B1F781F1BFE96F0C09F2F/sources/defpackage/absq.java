package defpackage;
/* compiled from: PG */
/* renamed from: absq  reason: default package */
/* loaded from: classes.dex */
final class absq implements Runnable {
    final /* synthetic */ absr a;

    public absq(absr absrVar) {
        this.a = absrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
