package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cre  reason: default package */
/* loaded from: classes3.dex */
public final class cre implements Handler.Callback {
    final /* synthetic */ crf a;

    public cre(crf crfVar) {
        this.a = crfVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c((crc) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.a.c.j((crc) message.obj);
            return false;
        }
    }
}
