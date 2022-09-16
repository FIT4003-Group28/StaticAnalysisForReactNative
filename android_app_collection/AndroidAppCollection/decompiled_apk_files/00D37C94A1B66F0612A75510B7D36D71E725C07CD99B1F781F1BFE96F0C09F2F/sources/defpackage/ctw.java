package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: ctw  reason: default package */
/* loaded from: classes3.dex */
public final class ctw implements Handler.Callback {
    private final /* synthetic */ int a;

    public ctw() {
    }

    public ctw(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a == 0) {
            if (message.what != 1) {
                return false;
            }
            ctx ctxVar = (ctx) message.obj;
            ctxVar.a.j(ctxVar);
            return true;
        } else if (message.what != 1) {
            return false;
        } else {
            ((cku) message.obj).e();
            return true;
        }
    }
}
