package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tsm  reason: default package */
/* loaded from: classes4.dex */
public final class tsm implements Runnable {
    final /* synthetic */ tsn a;
    private final Runnable b;

    public tsm(tsn tsnVar, Runnable runnable) {
        this.a = tsnVar;
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
