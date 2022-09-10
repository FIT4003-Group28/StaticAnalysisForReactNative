package defpackage;

import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fuu  reason: default package */
/* loaded from: classes6.dex */
public final class fuu implements dxir {
    final /* synthetic */ fyu a;

    public fuu(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        MessagingNotificationService messagingNotificationService = (MessagingNotificationService) obj;
        return new fuv(this.a);
    }
}
