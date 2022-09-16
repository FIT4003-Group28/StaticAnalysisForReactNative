package defpackage;

import android.os.Message;
/* compiled from: PG */
/* renamed from: pxd  reason: default package */
/* loaded from: classes4.dex */
public final class pxd {
    public Message a;

    public final void a() {
        this.a = null;
        synchronized (pxe.a) {
            if (pxe.a.size() < 50) {
                pxe.a.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        ptx.a(message);
        message.sendToTarget();
        a();
    }
}
