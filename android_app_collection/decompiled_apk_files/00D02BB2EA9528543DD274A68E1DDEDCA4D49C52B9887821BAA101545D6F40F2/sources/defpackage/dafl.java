package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: dafl  reason: default package */
/* loaded from: classes5.dex */
final class dafl implements Handler.Callback {
    final /* synthetic */ dafn a;

    public dafl(dafn dafnVar) {
        this.a = dafnVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        dafn dafnVar = this.a;
        dafm dafmVar = (dafm) message.obj;
        synchronized (dafnVar.a) {
            if (dafnVar.c == dafmVar || dafnVar.d == dafmVar) {
                dafnVar.c(dafmVar, 2);
            }
        }
        return true;
    }
}
