package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: alhs  reason: default package */
/* loaded from: classes.dex */
final class alhs extends Handler {
    final /* synthetic */ alhv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alhs(alhv alhvVar, Looper looper) {
        super(looper);
        this.a = alhvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dcdc r;
        alht alhtVar;
        alhr alhrVar = (alhr) message.obj;
        synchronized (this.a) {
            r = dcdc.r(this.a.a);
        }
        int size = r.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = z || ((alht) r.get(i)).a(alhrVar);
        }
        if (z || (alhtVar = this.a.b) == null) {
            return;
        }
        alhtVar.a(alhrVar);
    }
}
