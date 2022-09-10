package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btow  reason: default package */
/* loaded from: classes4.dex */
public final class btow extends BroadcastReceiver {
    final /* synthetic */ deig a;

    public btow(deig deigVar) {
        this.a = deigVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.j(intent);
    }
}
