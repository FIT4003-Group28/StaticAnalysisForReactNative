package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: bafa  reason: default package */
/* loaded from: classes2.dex */
final class bafa implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bafb b;

    public bafa(bafb bafbVar, Runnable runnable) {
        this.b = bafbVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
