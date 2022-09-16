package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uqs  reason: default package */
/* loaded from: classes4.dex */
public final class uqs extends BroadcastReceiver {
    final /* synthetic */ upx a;
    final /* synthetic */ uqt b;

    public uqs(uqt uqtVar, upx upxVar) {
        this.b = uqtVar;
        this.a = upxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        amnt.g(this.a.a(), new uqr(this), anjk.a);
    }
}
