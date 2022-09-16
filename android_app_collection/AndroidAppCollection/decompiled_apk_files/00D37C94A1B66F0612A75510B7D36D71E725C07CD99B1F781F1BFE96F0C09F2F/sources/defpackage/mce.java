package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: mce  reason: default package */
/* loaded from: classes3.dex */
final class mce extends Handler {
    final /* synthetic */ mcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mce(mcf mcfVar, Looper looper) {
        super(looper);
        this.a = mcfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 23998) {
            this.a.i();
        }
    }
}
