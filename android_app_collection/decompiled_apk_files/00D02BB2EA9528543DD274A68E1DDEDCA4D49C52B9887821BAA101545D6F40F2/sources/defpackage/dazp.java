package defpackage;
/* compiled from: PG */
/* renamed from: dazp  reason: default package */
/* loaded from: classes.dex */
final class dazp implements Runnable {
    final /* synthetic */ dazn a;
    final /* synthetic */ Runnable b;

    public dazp(dazn daznVar, Runnable runnable) {
        this.a = daznVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dazn g = dbaa.g(this.a);
        try {
            this.b.run();
        } finally {
            dbaa.g(g);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
