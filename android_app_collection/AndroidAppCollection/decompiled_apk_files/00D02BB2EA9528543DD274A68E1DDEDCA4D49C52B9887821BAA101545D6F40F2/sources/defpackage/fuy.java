package defpackage;

import com.google.android.apps.gmm.notification.log.NotificationBlockStateReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fuy  reason: default package */
/* loaded from: classes6.dex */
public final class fuy implements dxir {
    final /* synthetic */ fyu a;

    public fuy(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        NotificationBlockStateReceiver notificationBlockStateReceiver = (NotificationBlockStateReceiver) obj;
        return new fuz(this.a);
    }
}
