package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
/* compiled from: PG */
/* renamed from: agyk  reason: default package */
/* loaded from: classes.dex */
public final class agyk extends BroadcastReceiver {
    private volatile boolean b = Environment.getExternalStorageState().equals("mounted");
    agyj a = null;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        agyj agyjVar = this.a;
        if (agyjVar != null) {
            agyjVar.r();
        }
    }
}
