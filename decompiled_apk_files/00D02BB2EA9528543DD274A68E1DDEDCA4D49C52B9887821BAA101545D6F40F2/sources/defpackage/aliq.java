package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: aliq  reason: default package */
/* loaded from: classes.dex */
public final class aliq extends Handler {
    final /* synthetic */ alit a;

    public aliq(alit alitVar) {
        this.a = alitVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            alit alitVar = this.a;
            int i2 = alit.g;
            alir alirVar = alitVar.k;
            MotionEvent motionEvent = alitVar.q;
            alirVar.h();
        } else if (i == 2) {
            alit alitVar2 = this.a;
            int i3 = alit.g;
            alitVar2.j.removeMessages(3);
            alitVar2.n = true;
            alitVar2.k.c(alitVar2.q);
        } else if (i == 3) {
            alit alitVar3 = this.a;
            int i4 = alit.g;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = alitVar3.l;
            if (onDoubleTapListener == null || alitVar3.m) {
                return;
            }
            onDoubleTapListener.onSingleTapConfirmed(alitVar3.q);
        } else {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Unknown message ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aliq(alit alitVar, Handler handler) {
        super(handler.getLooper());
        this.a = alitVar;
    }
}
