package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: aqg  reason: default package */
/* loaded from: classes2.dex */
final class aqg extends Handler {
    final /* synthetic */ aqh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(aqh aqhVar) {
        super(Looper.getMainLooper());
        this.a = aqhVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        Object obj = message.obj;
        Bundle peekData = message.peekData();
        arf arfVar = this.a.e.get(i2);
        if (arfVar == null) {
            return;
        }
        this.a.e.remove(i2);
        if (i == 3) {
            arfVar.a((Bundle) obj);
        } else if (i != 4) {
        } else {
            arfVar.b(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
        }
    }
}
