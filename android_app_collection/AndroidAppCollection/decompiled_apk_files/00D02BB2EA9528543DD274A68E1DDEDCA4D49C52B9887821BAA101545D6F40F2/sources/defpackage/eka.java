package defpackage;

import com.google.android.apps.gmm.cloudmessage.CloudMessageBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eka  reason: default package */
/* loaded from: classes6.dex */
public final class eka implements dxir {
    final /* synthetic */ fyu a;

    public eka(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        CloudMessageBroadcastReceiver cloudMessageBroadcastReceiver = (CloudMessageBroadcastReceiver) obj;
        return new ekc(this.a);
    }
}
