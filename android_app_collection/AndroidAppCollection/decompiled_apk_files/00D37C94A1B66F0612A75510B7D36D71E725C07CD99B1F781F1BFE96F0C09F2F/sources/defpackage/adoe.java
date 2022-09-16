package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: adoe  reason: default package */
/* loaded from: classes.dex */
final class adoe extends Handler {
    final /* synthetic */ adof a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adoe(adof adofVar) {
        super(Looper.getMainLooper());
        this.a = adofVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.c();
        } else if (i != 1) {
        } else {
            this.a.a(message.arg1);
        }
    }
}
