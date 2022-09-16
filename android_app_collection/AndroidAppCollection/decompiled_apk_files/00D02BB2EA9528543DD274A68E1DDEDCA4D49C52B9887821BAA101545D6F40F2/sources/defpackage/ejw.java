package defpackage;

import com.google.android.apps.gmm.cloudmessage.chime.ChimeCloudMessageReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ejw  reason: default package */
/* loaded from: classes6.dex */
public final class ejw implements dxir {
    final /* synthetic */ fyu a;

    public ejw(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        ChimeCloudMessageReceiver chimeCloudMessageReceiver = (ChimeCloudMessageReceiver) obj;
        return new ejx(this.a);
    }
}
