package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* compiled from: PG */
/* renamed from: qrp  reason: default package */
/* loaded from: classes4.dex */
final class qrp extends rfm {
    final /* synthetic */ qrq a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrp(qrq qrqVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = qrqVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int g = this.a.g(this.b);
            if (!qse.g(g)) {
                return;
            }
            this.a.d(this.b, g);
            return;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(50);
        sb.append("Don't know how to handle this message: ");
        sb.append(i);
        Log.w("GoogleApiAvailability", sb.toString());
    }
}
