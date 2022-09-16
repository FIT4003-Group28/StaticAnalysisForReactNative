package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: zmo  reason: default package */
/* loaded from: classes4.dex */
final class zmo extends Handler {
    private final WeakReference a;

    public zmo(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zmp zmpVar;
        if (message.what == 1 && (zmpVar = (zmp) this.a.get()) != null && zmpVar.ap()) {
            zmpVar.ao.setText(zmpVar.q(System.currentTimeMillis() - zmpVar.ak));
        }
    }
}
