package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
/* compiled from: PG */
/* renamed from: bdut  reason: default package */
/* loaded from: classes3.dex */
final class bdut extends Handler {
    final /* synthetic */ bduu a;

    public bdut(bduu bduuVar) {
        this.a = bduuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            bduu bduuVar = this.a;
            bduuVar.g.onShowPress(bduuVar.n);
        } else if (i == 2) {
            bduu bduuVar2 = this.a;
            bduuVar2.f.removeMessages(3);
            bduuVar2.j = false;
            bduuVar2.k = true;
            bduuVar2.g.onLongPress(bduuVar2.n);
        } else if (i != 3) {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Unknown message ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } else {
            bduu bduuVar3 = this.a;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = bduuVar3.h;
            if (onDoubleTapListener == null) {
                return;
            }
            if (!bduuVar3.i) {
                onDoubleTapListener.onSingleTapConfirmed(bduuVar3.n);
            } else {
                bduuVar3.j = true;
            }
        }
    }
}
