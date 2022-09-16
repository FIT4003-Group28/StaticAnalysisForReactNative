package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: bjl  reason: default package */
/* loaded from: classes2.dex */
final class bjl extends Handler {
    final /* synthetic */ bjr a;

    public bjl(bjr bjrVar) {
        this.a = bjrVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.q();
    }
}
