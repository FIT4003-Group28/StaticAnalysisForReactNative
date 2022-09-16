package com.google.apps.tiktok.concurrent;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalForegroundService extends Service {
    public ameq a;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ameq ameqVar = this.a;
        synchronized (ameqVar.c) {
            for (Map.Entry entry : ameqVar.d.entrySet()) {
                printWriter.println(entry.toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((ameu) antz.u(this, ameu.class)).in(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ameq ameqVar = this.a;
        synchronized (ameqVar.c) {
            if (intent == null) {
                if (ameqVar.f == amep.STOPPED) {
                    stopSelf(i2);
                }
                return 2;
            }
            ameqVar.e = this;
            ameqVar.g = i2;
            ameqVar.f = amep.STARTED;
            if (ameqVar.d.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    startForeground(174344743, (Notification) intent.getParcelableExtra("fallback_notification"));
                }
                ameqVar.b();
            } else {
                ameqVar.h = ameqVar.a(ameqVar.h);
                Notification notification = ameqVar.h.a;
                startForeground(174344743, null);
            }
            return 2;
        }
    }
}
