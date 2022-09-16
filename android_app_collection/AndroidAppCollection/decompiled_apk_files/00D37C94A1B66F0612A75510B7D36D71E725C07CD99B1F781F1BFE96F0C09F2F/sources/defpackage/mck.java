package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: mck  reason: default package */
/* loaded from: classes3.dex */
final class mck extends Handler {
    final /* synthetic */ mcl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mck(mcl mclVar, Looper looper) {
        super(looper);
        this.a = mclVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            fyp fypVar = this.a.d;
            if (mcl.b(fypVar.b())) {
                return;
            }
            mcl.a(fypVar.a(), 0);
        }
    }
}
