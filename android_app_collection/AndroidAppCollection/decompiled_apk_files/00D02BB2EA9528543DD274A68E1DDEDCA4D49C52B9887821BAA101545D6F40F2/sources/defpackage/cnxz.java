package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: cnxz  reason: default package */
/* loaded from: classes.dex */
final class cnxz implements Runnable {
    private final Runnable a;

    public cnxz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
