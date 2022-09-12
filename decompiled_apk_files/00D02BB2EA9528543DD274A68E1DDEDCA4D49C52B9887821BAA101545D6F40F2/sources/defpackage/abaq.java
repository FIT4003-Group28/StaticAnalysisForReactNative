package defpackage;
/* compiled from: PG */
/* renamed from: abaq  reason: default package */
/* loaded from: classes.dex */
final class abaq implements Runnable {
    private final Runnable a;
    private final bvrb b;
    @dzsi
    private bvpk c;

    public abaq(Runnable runnable, bvrb bvrbVar) {
        this.a = runnable;
        this.b = bvrbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvpk a;
        synchronized (this) {
            bvpk bvpkVar = this.c;
            if (bvpkVar != null) {
                bvpkVar.b();
            }
            a = bvpk.a(this.a);
            this.c = a;
        }
        this.b.a(a, bvrj.UI_THREAD, 300L);
    }
}
