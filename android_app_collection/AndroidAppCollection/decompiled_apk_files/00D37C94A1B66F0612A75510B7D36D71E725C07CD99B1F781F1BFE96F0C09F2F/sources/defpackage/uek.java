package defpackage;

import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
/* compiled from: PG */
/* renamed from: uek  reason: default package */
/* loaded from: classes4.dex */
public final class uek implements Runnable {
    final /* synthetic */ PowerManager.WakeLock a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ ChimeExecutorApiService c;

    public uek(ChimeExecutorApiService chimeExecutorApiService, PowerManager.WakeLock wakeLock, Runnable runnable) {
        this.c = chimeExecutorApiService;
        this.a = wakeLock;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.acquire();
            this.b.run();
        } finally {
            this.a.release();
            uwp.h(new uej(this));
        }
    }
}
