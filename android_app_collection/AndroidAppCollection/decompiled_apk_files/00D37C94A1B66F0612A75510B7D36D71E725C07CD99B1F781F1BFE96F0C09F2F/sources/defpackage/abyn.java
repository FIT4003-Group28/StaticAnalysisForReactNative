package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: abyn  reason: default package */
/* loaded from: classes.dex */
final class abyn extends Handler {
    final /* synthetic */ abyp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyn(abyp abypVar, Looper looper) {
        super(looper);
        this.a = abypVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ylr.c();
        switch (message.what) {
            case 1000:
                abyp abypVar = this.a;
                abypVar.j(abypVar.a, false, false, false);
                return;
            case 1001:
                this.a.j(message.arg1, true, false, true);
                return;
            case 1002:
                this.a.j(message.arg1, true, false, false);
                return;
            case 1003:
                this.a.j(message.arg1, false, true, false);
                return;
            default:
                return;
        }
    }
}
