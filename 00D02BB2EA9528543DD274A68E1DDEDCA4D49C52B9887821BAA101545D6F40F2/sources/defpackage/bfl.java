package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: PG */
/* renamed from: bfl  reason: default package */
/* loaded from: classes3.dex */
public final class bfl implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Notification b;
    final /* synthetic */ int c;
    final /* synthetic */ SystemForegroundService d;

    public bfl(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.d = systemForegroundService;
        this.a = i;
        this.b = notification;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.d.startForeground(this.a, this.b, this.c);
        } else {
            this.d.startForeground(this.a, this.b);
        }
    }
}