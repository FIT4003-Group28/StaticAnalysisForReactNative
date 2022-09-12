package defpackage;
/* compiled from: PG */
/* renamed from: brbc  reason: default package */
/* loaded from: classes4.dex */
abstract class brbc implements Runnable {
    boolean b = false;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        a();
    }
}
