package defpackage;
/* compiled from: PG */
/* renamed from: dau  reason: default package */
/* loaded from: classes3.dex */
final class dau implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dav b;

    public dau(dav davVar, Runnable runnable) {
        this.b = davVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.b.a) {
            Integer num = (Integer) this.b.a.get(this.a);
            z = false;
            if (num != null) {
                if (num.intValue() > 0) {
                    z = true;
                }
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                if (valueOf.intValue() > 0) {
                    this.b.a.put(this.a, valueOf);
                } else {
                    this.b.a.remove(this.a);
                }
            }
        }
        if (z) {
            this.a.run();
        }
    }
}
