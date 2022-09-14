package defpackage;
/* compiled from: PG */
/* renamed from: bvrz  reason: default package */
/* loaded from: classes.dex */
final class bvrz implements Runnable {
    final /* synthetic */ bvsb a;

    public bvrz(bvsb bvsbVar) {
        this.a = bvsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.b = true;
        }
    }
}
