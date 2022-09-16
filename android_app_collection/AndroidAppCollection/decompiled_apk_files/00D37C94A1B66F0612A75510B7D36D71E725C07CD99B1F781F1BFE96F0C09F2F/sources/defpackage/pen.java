package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: pen  reason: default package */
/* loaded from: classes4.dex */
public final class pen extends Handler {
    final /* synthetic */ per a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pen(per perVar, Looper looper) {
        super(looper);
        this.a = perVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (pej pejVar : this.a.a) {
            if (pejVar.n(bArr)) {
                if (pejVar.k == null) {
                    return;
                }
                pejVar.d.i();
                return;
            }
        }
    }
}
