package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: PG */
/* renamed from: btq  reason: default package */
/* loaded from: classes2.dex */
public final class btq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SystemForegroundService b;

    public btq(SystemForegroundService systemForegroundService, int i) {
        this.b = systemForegroundService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.cancel(this.a);
    }
}
