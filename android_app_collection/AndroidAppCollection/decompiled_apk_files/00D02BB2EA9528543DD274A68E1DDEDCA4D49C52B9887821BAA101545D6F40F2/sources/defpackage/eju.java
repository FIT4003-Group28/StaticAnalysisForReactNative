package defpackage;

import com.google.android.apps.gmm.notification.receiver.CancelNotificationBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eju  reason: default package */
/* loaded from: classes6.dex */
public final class eju implements dxir {
    final /* synthetic */ fyu a;

    public eju(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        CancelNotificationBroadcastReceiver cancelNotificationBroadcastReceiver = (CancelNotificationBroadcastReceiver) obj;
        return new ejv(this.a);
    }
}
