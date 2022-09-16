package defpackage;

import android.os.Message;
import android.view.View;
import android.widget.Button;
/* compiled from: PG */
/* renamed from: nl  reason: default package */
/* loaded from: classes3.dex */
final class nl implements View.OnClickListener {
    final /* synthetic */ nv a;

    public nl(nv nvVar) {
        this.a = nvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        nv nvVar = this.a;
        Message message3 = null;
        if (view == nvVar.i && (message2 = nvVar.k) != null) {
            message3 = Message.obtain(message2);
        } else if (view != nvVar.l || (message = nvVar.n) == null) {
            Button button = nvVar.o;
        } else {
            message3 = Message.obtain(message);
        }
        if (message3 != null) {
            message3.sendToTarget();
        }
        nv nvVar2 = this.a;
        nvVar2.G.obtainMessage(1, nvVar2.b).sendToTarget();
    }
}
