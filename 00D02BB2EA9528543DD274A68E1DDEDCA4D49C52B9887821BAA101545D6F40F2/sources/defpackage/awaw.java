package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: awaw  reason: default package */
/* loaded from: classes3.dex */
public final class awaw extends BroadcastReceiver {
    final /* synthetic */ awax a;

    public awaw(awax awaxVar) {
        this.a = awaxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getLongExtra("DownloadSuccessNotificationId", 0L) == this.a.h.get()) {
            this.a.d();
        }
    }
}
