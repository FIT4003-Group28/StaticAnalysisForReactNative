package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhh  reason: default package */
/* loaded from: classes3.dex */
public final class bhh implements Runnable {
    final bhi a;
    final Runnable b;

    public bhh(bhi bhiVar, Runnable runnable) {
        this.a = bhiVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
