package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ahlc  reason: default package */
/* loaded from: classes.dex */
final class ahlc extends Handler {
    private final WeakReference a;

    public ahlc(ahld ahldVar) {
        this.a = new WeakReference(ahldVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        afng afngVar;
        ahld ahldVar = (ahld) this.a.get();
        if (ahldVar == null) {
            return;
        }
        if (message.what == 0) {
            ahldVar.b = null;
            ahldVar.c = null;
            ahldVar.a = (Surface) message.obj;
            afng afngVar2 = ahldVar.g;
            if (afngVar2 == null) {
                return;
            }
            afngVar2.c();
            return;
        }
        boolean z = true;
        if (message.what == 1) {
            ahldVar.a = null;
            ahldVar.b = (pgg) message.obj;
            ahldVar.c = (pxs) message.obj;
            afng afngVar3 = ahldVar.g;
            if (afngVar3 != null) {
                afngVar3.a();
            }
            ahldVar.I();
        } else if (message.what == 2) {
            if (message.arg1 <= 0) {
                z = false;
            }
            ahldVar.i = z;
            ahldVar.J(ahldVar.getLeft(), ahldVar.getTop(), ahldVar.getRight(), ahldVar.getBottom());
        } else {
            if (message.what == 3 && (afngVar = ahldVar.g) != null) {
                afngVar.e();
            }
            super.handleMessage(message);
        }
    }
}
