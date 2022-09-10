package defpackage;

import com.google.android.apps.gmm.notification.log.NotificationLoggingReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvg  reason: default package */
/* loaded from: classes6.dex */
public final class fvg implements dxir {
    final /* synthetic */ fyu a;

    public fvg(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        NotificationLoggingReceiver notificationLoggingReceiver = (NotificationLoggingReceiver) obj;
        return new fvh(this.a);
    }
}
