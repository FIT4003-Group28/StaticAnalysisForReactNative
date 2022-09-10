package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: auh  reason: default package */
/* loaded from: classes2.dex */
final class auh extends Handler {
    final /* synthetic */ aup a;

    public auh(aup aupVar) {
        this.a = aupVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.h();
    }
}
