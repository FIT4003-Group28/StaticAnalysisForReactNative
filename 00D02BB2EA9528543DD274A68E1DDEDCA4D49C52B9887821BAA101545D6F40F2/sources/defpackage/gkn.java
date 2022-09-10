package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: gkn  reason: default package */
/* loaded from: classes.dex */
final class gkn extends Handler {
    final /* synthetic */ gkq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkn(gkq gkqVar, Looper looper) {
        super(looper);
        this.a = gkqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dbsk.a(message.what == 0);
        this.a.e();
    }
}
