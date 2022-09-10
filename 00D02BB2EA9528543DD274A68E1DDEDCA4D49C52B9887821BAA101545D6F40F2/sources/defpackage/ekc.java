package defpackage;

import com.google.android.apps.gmm.cloudmessage.CloudMessageBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekc  reason: default package */
/* loaded from: classes6.dex */
public final class ekc implements dxis {
    final /* synthetic */ fyu a;
    private volatile dzsj<pad> b;

    public ekc(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        CloudMessageBroadcastReceiver cloudMessageBroadcastReceiver = (CloudMessageBroadcastReceiver) obj;
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new ekb(this);
            this.b = dzsjVar;
        }
        cloudMessageBroadcastReceiver.a = dxjc.c(dzsjVar);
    }
}
