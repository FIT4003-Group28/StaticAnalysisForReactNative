package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqw  reason: default package */
/* loaded from: classes.dex */
public final class alqw {
    final /* synthetic */ alrc a;

    public alqw(alrc alrcVar) {
        this.a = alrcVar;
    }

    public final void a(Runnable runnable) {
        boolean z;
        almu j = this.a.j();
        synchronized (j) {
            z = j.d;
            if (!z) {
                j.e.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
