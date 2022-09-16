package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: aeru  reason: default package */
/* loaded from: classes.dex */
final class aeru extends Handler {
    final /* synthetic */ aerv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeru(aerv aervVar, Looper looper) {
        super(looper);
        this.a = aervVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.o(message.obj);
        } else if (i != 1) {
        } else {
            aerv aervVar = this.a;
            Object obj = message.obj;
            int i2 = aervVar.h;
            if (i2 != 3 && i2 != 4) {
                return;
            }
            if (obj instanceof Exception) {
                aervVar.n((Exception) obj);
                return;
            }
            aervVar.b.n();
            aervVar.b.s();
            try {
                aervVar.a.a.provideKeyResponse(aervVar.i, (byte[]) obj);
                aervVar.h = 4;
            } catch (Exception e) {
                aervVar.n(e);
            }
            aervVar.b.r();
        }
    }
}
