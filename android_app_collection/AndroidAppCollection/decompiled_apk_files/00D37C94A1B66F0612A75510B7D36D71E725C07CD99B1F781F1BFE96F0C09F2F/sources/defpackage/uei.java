package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
/* compiled from: PG */
/* renamed from: uei  reason: default package */
/* loaded from: classes4.dex */
public final class uei implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Context b;

    public uei(Runnable runnable, Context context) {
        this.a = runnable;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChimeExecutorApiService.a.add(this.a);
        Intent intent = new Intent(this.b, ChimeExecutorApiService.class);
        intent.setAction("ACTION_NEW_TASK");
        this.b.startService(intent);
    }
}
