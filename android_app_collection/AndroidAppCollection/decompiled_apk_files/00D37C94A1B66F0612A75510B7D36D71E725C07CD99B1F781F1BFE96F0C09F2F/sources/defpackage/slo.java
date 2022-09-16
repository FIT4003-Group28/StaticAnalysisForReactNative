package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* compiled from: PG */
/* renamed from: slo  reason: default package */
/* loaded from: classes4.dex */
final class slo extends Handler {
    final /* synthetic */ slp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slo(slp slpVar, Looper looper) {
        super(looper);
        this.a = slpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 100) {
            this.a.d();
            return;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(53);
        sb.append("#handleMessage(): unknown msg (");
        sb.append(i);
        sb.append(") is posted");
        Log.w("AssistantIntegClient", sb.toString());
    }
}
