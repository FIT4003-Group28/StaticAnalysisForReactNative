package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cssg  reason: default package */
/* loaded from: classes5.dex */
final class cssg extends BroadcastReceiver {
    final /* synthetic */ dbty a;

    public cssg(dbty dbtyVar) {
        this.a = dbtyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cssd cssdVar = (cssd) this.a.a();
        if (cssdVar != null) {
            cssdVar.h();
        }
    }
}
