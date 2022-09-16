package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: edy  reason: default package */
/* loaded from: classes3.dex */
public final class edy implements MessageQueue.IdleHandler, edw, acux {
    private final Context a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final azpw b = azpw.Y();

    public edy(Context context) {
        this.a = context;
    }

    private final boolean h(Intent intent, String str, Class cls) {
        String name = cls.getName();
        if (name.equals(str)) {
            return true;
        }
        ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        return (resolveActivity == null || resolveActivity.activityInfo == null || !name.equals(resolveActivity.activityInfo.targetActivity)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // defpackage.edw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            azpw r0 = r4.b
            boolean r0 = r0.ac()
            if (r0 != 0) goto L69
            android.content.Context r0 = r4.a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 != 0) goto L16
            r0 = 0
            goto L1a
        L16:
            java.util.List r0 = r0.getAppTasks()
        L1a:
            r1 = 1
            if (r0 != 0) goto L1f
        L1d:
            r0 = 1
            goto L5d
        L1f:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L27
            r0 = 4
            goto L5d
        L27:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0
            if (r0 != 0) goto L31
            goto L1d
        L31:
            android.app.ActivityManager$RecentTaskInfo r0 = r0.getTaskInfo()
            if (r0 != 0) goto L38
            goto L1d
        L38:
            android.content.Intent r0 = r0.baseIntent
            if (r0 != 0) goto L3d
            goto L1d
        L3d:
            android.content.ComponentName r2 = r0.getComponent()
            if (r2 != 0) goto L44
            goto L1d
        L44:
            java.lang.String r2 = r2.getClassName()
            java.lang.Class<com.google.android.apps.youtube.app.application.Shell_HomeActivity> r3 = com.google.android.apps.youtube.app.application.Shell_HomeActivity.class
            boolean r3 = r4.h(r0, r2, r3)
            if (r3 == 0) goto L52
            r0 = 2
            goto L5d
        L52:
            java.lang.Class<com.google.android.apps.youtube.app.application.Shell_UrlActivity> r3 = com.google.android.apps.youtube.app.application.Shell_UrlActivity.class
            boolean r0 = r4.h(r0, r2, r3)
            if (r0 == 0) goto L5c
            r0 = 3
            goto L5d
        L5c:
            r0 = 5
        L5d:
            if (r0 == r1) goto L68
            azpw r1 = r4.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.sh(r2)
        L68:
            return r0
        L69:
            azpw r0 = r4.b
            java.lang.Object r0 = r0.Z()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edy.a():int");
    }

    @Override // defpackage.edw
    public final void b(int i) {
        this.b.sh(Integer.valueOf(i));
    }

    @Override // defpackage.acuw
    public final void c() {
        b(4);
    }

    @Override // defpackage.acux
    public final ayos d() {
        return this.b.E(dzy.c);
    }

    @Override // defpackage.acux
    public final void e() {
        this.c.set(true);
    }

    @Override // defpackage.acux
    public final void f() {
        if (Build.VERSION.SDK_INT < 23) {
            ylr.c();
            Looper.myQueue().addIdleHandler(this);
            return;
        }
        Looper.getMainLooper().getQueue().addIdleHandler(this);
    }

    @Override // defpackage.acux
    public final boolean g() {
        return true;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (!this.c.get()) {
            b(4);
            return false;
        }
        return false;
    }
}
