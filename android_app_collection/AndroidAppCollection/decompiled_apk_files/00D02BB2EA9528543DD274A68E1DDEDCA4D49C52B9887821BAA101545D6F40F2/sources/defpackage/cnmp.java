package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnmp  reason: default package */
/* loaded from: classes.dex */
public final class cnmp extends cojb {
    final /* synthetic */ cnmq a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnmp(cnmq cnmqVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = cnmqVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int i = this.a.i(this.b);
            if (!cnnl.g(i)) {
                return;
            }
            this.a.b(this.b, i);
            return;
        }
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(50);
        sb.append("Don't know how to handle this message: ");
        sb.append(i2);
        sb.toString();
    }
}
