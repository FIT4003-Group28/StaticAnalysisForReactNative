package defpackage;

import com.google.android.apps.gmm.notification.optout.NotificationOptOutBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvi  reason: default package */
/* loaded from: classes6.dex */
public final class fvi implements dxir {
    final /* synthetic */ fyu a;

    public fvi(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        NotificationOptOutBroadcastReceiver notificationOptOutBroadcastReceiver = (NotificationOptOutBroadcastReceiver) obj;
        return new fvj(this.a);
    }
}
