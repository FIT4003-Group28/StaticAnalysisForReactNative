package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
/* compiled from: PG */
/* renamed from: fxj  reason: default package */
/* loaded from: classes3.dex */
final class fxj extends Handler {
    final /* synthetic */ fxk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxj(fxk fxkVar, Looper looper) {
        super(looper);
        this.a = fxkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fxk fxkVar;
        fxl fxlVar;
        if (message.what != 153535 || (fxlVar = (fxkVar = this.a).c) == null) {
            return;
        }
        ActiveStateLifecycleController activeStateLifecycleController = fxlVar.a;
        fxk fxkVar2 = fxlVar.c;
        fxr fxrVar = fxlVar.b;
        if (activeStateLifecycleController.b.contains(fxkVar2)) {
            activeStateLifecycleController.j(fxkVar2);
            String valueOf = String.valueOf(fxkVar2);
            String valueOf2 = String.valueOf(fxrVar);
            String.valueOf(valueOf).length();
            String.valueOf(valueOf2).length();
            if (!activeStateLifecycleController.i()) {
                ylx.n(activeStateLifecycleController.d, anlz.v(new fxn(activeStateLifecycleController, fxrVar, 1), activeStateLifecycleController.a), etg.e, ylx.b);
            }
        }
        fxkVar.c = null;
    }
}
