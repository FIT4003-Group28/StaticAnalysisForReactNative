package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfm  reason: default package */
/* loaded from: classes4.dex */
public final class cfm implements Handler.Callback {
    final /* synthetic */ cfn a;

    public cfm(cfn cfnVar) {
        this.a = cfnVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.f((cfk) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.a.c.l((cfk) message.obj);
            return false;
        }
    }
}
