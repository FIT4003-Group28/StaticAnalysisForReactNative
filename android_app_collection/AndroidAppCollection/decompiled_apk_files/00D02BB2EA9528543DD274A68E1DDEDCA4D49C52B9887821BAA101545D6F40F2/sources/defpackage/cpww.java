package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpww  reason: default package */
/* loaded from: classes5.dex */
public final class cpww extends Handler {
    final /* synthetic */ cpwx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpww(cpwx cpwxVar, Looper looper) {
        super(looper);
        this.a = cpwxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 100) {
            this.a.h();
            return;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(53);
        sb.append("#handleMessage(): unknown msg (");
        sb.append(i);
        sb.append(") is posted");
        sb.toString();
    }
}
