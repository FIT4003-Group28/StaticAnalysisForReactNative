package defpackage;

import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
/* compiled from: PG */
/* renamed from: uej  reason: default package */
/* loaded from: classes4.dex */
final class uej implements Runnable {
    final /* synthetic */ uek a;

    public uej(uek uekVar) {
        this.a = uekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChimeExecutorApiService chimeExecutorApiService;
        chimeExecutorApiService.b--;
        this.a.c.a();
    }
}
