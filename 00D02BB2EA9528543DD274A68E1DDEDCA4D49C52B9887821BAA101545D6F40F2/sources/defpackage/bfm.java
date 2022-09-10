package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: PG */
/* renamed from: bfm  reason: default package */
/* loaded from: classes3.dex */
public final class bfm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Notification b;
    final /* synthetic */ SystemForegroundService c;

    public bfm(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.c = systemForegroundService;
        this.a = i;
        this.b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.notify(this.a, this.b);
    }
}
