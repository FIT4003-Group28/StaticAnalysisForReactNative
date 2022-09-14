package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cscu  reason: default package */
/* loaded from: classes.dex */
final class cscu extends Handler {
    final /* synthetic */ cscw a;

    public cscu(cscw cscwVar) {
        this.a = cscwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 3) {
            super.handleMessage(message);
            return;
        }
        brlw brlwVar = this.a.f;
        if (brlwVar == null) {
            int i = message.what;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Message ");
            sb.append(i);
            sb.append(" received after unbind.");
            sb.toString();
            return;
        }
        try {
            brlwVar.a.g = (daqq) dsqw.cq(daqq.g, ((Bundle) message.obj).getByteArray("ssb_service:ssb_state"));
            brlz brlzVar = brlwVar.a;
            brlzVar.d.b(new brcp(brlzVar.g));
        } catch (dsrm e) {
            bvoo.h("Invalid SsbState proto %s", e);
            brlwVar.a.g = null;
        }
    }
}
