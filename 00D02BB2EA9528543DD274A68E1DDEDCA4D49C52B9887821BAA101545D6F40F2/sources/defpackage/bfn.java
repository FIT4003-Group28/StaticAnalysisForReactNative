package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: PG */
/* renamed from: bfn  reason: default package */
/* loaded from: classes3.dex */
public final class bfn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SystemForegroundService b;

    public bfn(SystemForegroundService systemForegroundService, int i) {
        this.b = systemForegroundService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.cancel(this.a);
    }
}
