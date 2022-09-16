package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: vuh  reason: default package */
/* loaded from: classes4.dex */
final class vuh extends Handler {
    final /* synthetic */ vui a;

    public vuh(vui vuiVar) {
        this.a = vuiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b.n();
            this.a.c.n();
            this.a.b.h();
            this.a.c.h();
            this.a.d.quit();
            return;
        }
        String valueOf = String.valueOf(message.toString());
        vqy.d(valueOf.length() != 0 ? "Unhandled message: ".concat(valueOf) : new String("Unhandled message: "));
    }
}
