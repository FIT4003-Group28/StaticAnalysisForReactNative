package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bes  reason: default package */
/* loaded from: classes2.dex */
public final class bes extends Handler {
    final /* synthetic */ bev a;

    public bes(bev bevVar) {
        this.a = bevVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.h((List) message.obj);
    }
}
