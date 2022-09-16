package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammi  reason: default package */
/* loaded from: classes.dex */
public final class ammi implements Runnable {
    final /* synthetic */ amlv a;
    final /* synthetic */ Runnable b;

    public ammi(amlv amlvVar, Runnable runnable) {
        this.a = amlvVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amlv e = amna.e(this.a);
        try {
            this.b.run();
        } finally {
            amna.e(e);
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
