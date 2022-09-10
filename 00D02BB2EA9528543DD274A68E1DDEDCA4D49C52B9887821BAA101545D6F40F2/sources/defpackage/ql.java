package defpackage;

import android.os.Message;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ql  reason: default package */
/* loaded from: classes7.dex */
public final class ql implements View.OnClickListener {
    final /* synthetic */ qw a;

    public ql(qw qwVar) {
        this.a = qwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        qw qwVar = this.a;
        Message message4 = null;
        if (view == qwVar.i && (message3 = qwVar.k) != null) {
            message4 = Message.obtain(message3);
        } else if (view == qwVar.l && (message2 = qwVar.n) != null) {
            message4 = Message.obtain(message2);
        } else if (view == qwVar.o && (message = qwVar.q) != null) {
            message4 = Message.obtain(message);
        }
        if (message4 != null) {
            message4.sendToTarget();
        }
        qw qwVar2 = this.a;
        qwVar2.H.obtainMessage(1, qwVar2.b).sendToTarget();
    }
}
