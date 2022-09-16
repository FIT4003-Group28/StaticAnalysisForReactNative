package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: adkv  reason: default package */
/* loaded from: classes.dex */
final class adkv extends Handler {
    final /* synthetic */ adlb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkv(adlb adlbVar, Looper looper) {
        super(looper);
        this.a = adlbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1 && this.a.g.a() != 2) {
            this.a.z(0);
            this.a.f.sendMessageDelayed(Message.obtain(this, 1), 1000L);
        }
    }
}
