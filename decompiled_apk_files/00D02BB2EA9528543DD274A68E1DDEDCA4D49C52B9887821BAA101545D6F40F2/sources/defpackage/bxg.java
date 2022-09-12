package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: bxg  reason: default package */
/* loaded from: classes.dex */
final class bxg implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ((bxd) message.obj).d();
            return true;
        }
        return false;
    }
}
