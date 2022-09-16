package defpackage;

import com.google.android.apps.gmm.notification.channels.NotificationChannelBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fva  reason: default package */
/* loaded from: classes6.dex */
public final class fva implements dxir {
    final /* synthetic */ fyu a;

    public fva(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        NotificationChannelBroadcastReceiver notificationChannelBroadcastReceiver = (NotificationChannelBroadcastReceiver) obj;
        return new fvb(this.a);
    }
}
