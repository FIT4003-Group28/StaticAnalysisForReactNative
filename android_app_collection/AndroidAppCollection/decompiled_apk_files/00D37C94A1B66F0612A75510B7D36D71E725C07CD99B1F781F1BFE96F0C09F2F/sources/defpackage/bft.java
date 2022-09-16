package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* compiled from: PG */
/* renamed from: bft  reason: default package */
/* loaded from: classes2.dex */
final class bft extends Handler {
    final /* synthetic */ bfu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bft(bfu bfuVar) {
        super(Looper.getMainLooper());
        this.a = bfuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        Object obj = message.obj;
        Bundle peekData = message.peekData();
        ku kuVar = (ku) this.a.e.get(i2);
        if (kuVar == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        this.a.e.remove(i2);
        if (i == 3) {
            kuVar.j((Bundle) obj);
        } else if (i != 4) {
        } else {
            kuVar.i(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
        }
    }
}
