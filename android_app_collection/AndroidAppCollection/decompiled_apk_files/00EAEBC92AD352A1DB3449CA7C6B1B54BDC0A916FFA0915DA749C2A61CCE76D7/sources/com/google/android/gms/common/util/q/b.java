package com.google.android.gms.common.util.q;

import android.os.Process;
/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f7116b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7117c;

    public b(Runnable runnable, int i) {
        this.f7116b = runnable;
        this.f7117c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f7117c);
        this.f7116b.run();
    }
}
