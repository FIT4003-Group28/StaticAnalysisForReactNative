package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: egx  reason: default package */
/* loaded from: classes.dex */
final class egx extends Handler {
    private final WeakReference<egy> a;

    public egx(WeakReference<egy> weakReference) {
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        egy egyVar = this.a.get();
        if (egyVar != null) {
            if (message.what != 1) {
                bvoo.h("Unsupported message type received %s", Integer.valueOf(message.what));
            } else if (egyVar.d != null) {
            } else {
                egyVar.d = egyVar.c;
                egyVar.c = null;
                egu eguVar = egyVar.d;
                if (eguVar == null) {
                    return;
                }
                egyVar.j();
                egyVar.f.b(eguVar, egyVar.e);
            }
        }
    }
}
