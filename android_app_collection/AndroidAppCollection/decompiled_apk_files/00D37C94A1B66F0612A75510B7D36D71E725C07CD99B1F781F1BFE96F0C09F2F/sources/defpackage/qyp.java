package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: qyp  reason: default package */
/* loaded from: classes4.dex */
final class qyp implements Runnable {
    private final Runnable a;

    public qyp(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
