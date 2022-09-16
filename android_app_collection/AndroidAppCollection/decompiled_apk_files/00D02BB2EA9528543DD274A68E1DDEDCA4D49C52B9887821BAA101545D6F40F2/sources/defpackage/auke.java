package defpackage;

import android.content.BroadcastReceiver;
import com.google.android.apps.gmm.notification.channels.NotificationChannelBroadcastReceiver;
/* compiled from: PG */
/* renamed from: auke  reason: default package */
/* loaded from: classes2.dex */
public final class auke implements Runnable {
    final /* synthetic */ BroadcastReceiver.PendingResult a;
    final /* synthetic */ NotificationChannelBroadcastReceiver b;

    public auke(NotificationChannelBroadcastReceiver notificationChannelBroadcastReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.b = notificationChannelBroadcastReceiver;
        this.a = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(true);
        this.a.finish();
    }
}
