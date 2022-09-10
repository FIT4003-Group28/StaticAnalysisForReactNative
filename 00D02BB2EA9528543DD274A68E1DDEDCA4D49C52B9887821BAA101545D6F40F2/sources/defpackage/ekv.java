package defpackage;

import com.google.android.apps.gmm.cloudmessage.receiver.FcmService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekv  reason: default package */
/* loaded from: classes6.dex */
public final class ekv implements dxir {
    final /* synthetic */ fyu a;

    public ekv(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        FcmService fcmService = (FcmService) obj;
        return new ekw(this.a);
    }
}
