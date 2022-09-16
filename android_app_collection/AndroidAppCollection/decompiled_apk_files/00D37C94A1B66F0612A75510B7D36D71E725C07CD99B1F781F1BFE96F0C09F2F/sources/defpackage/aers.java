package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aers  reason: default package */
/* loaded from: classes.dex */
public final class aers extends Handler {
    final /* synthetic */ aerv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aers(aerv aervVar, Looper looper) {
        super(looper);
        this.a = aervVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aerv aervVar = this.a;
        if (aervVar.g != 0) {
            int i = aervVar.h;
            if (i != 3 && i != 4) {
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.a.h = 3;
                this.a.p();
            } else if (i2 == 2) {
                this.a.g();
            } else if (i2 != 3) {
            } else {
                this.a.h = 3;
                this.a.m(new oxf());
            }
        }
    }
}
