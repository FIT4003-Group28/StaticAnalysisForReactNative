package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cssh  reason: default package */
/* loaded from: classes5.dex */
final class cssh extends BroadcastReceiver {
    final /* synthetic */ dbty a;

    public cssh(dbty dbtyVar) {
        this.a = dbtyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cssc csscVar = (cssc) this.a.a();
        if (csscVar != null) {
            csscVar.g();
        }
    }
}
