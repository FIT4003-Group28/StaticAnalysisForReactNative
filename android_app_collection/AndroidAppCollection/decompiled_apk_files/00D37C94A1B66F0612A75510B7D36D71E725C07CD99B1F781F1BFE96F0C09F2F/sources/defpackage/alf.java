package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: alf  reason: default package */
/* loaded from: classes.dex */
public final class alf extends Thread {
    private final int a;

    public alf(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
