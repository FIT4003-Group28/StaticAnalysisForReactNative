package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
/* compiled from: PG */
/* renamed from: qxf  reason: default package */
/* loaded from: classes4.dex */
final class qxf implements Handler.Callback {
    final /* synthetic */ qxd a;

    public qxf(qxd qxdVar) {
        this.a = qxdVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.a) {
                qxc qxcVar = (qxc) message.obj;
                qxe qxeVar = (qxe) this.a.a.get(qxcVar);
                if (qxeVar != null && qxeVar.c()) {
                    if (qxeVar.c) {
                        qxeVar.g.c.removeMessages(1, qxeVar.e);
                        qxd qxdVar = qxeVar.g;
                        qxdVar.d.b(qxdVar.b, qxeVar);
                        qxeVar.c = false;
                        qxeVar.b = 2;
                    }
                    this.a.a.remove(qxcVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a.a) {
                qxc qxcVar2 = (qxc) message.obj;
                qxe qxeVar2 = (qxe) this.a.a.get(qxcVar2);
                if (qxeVar2 != null && qxeVar2.b == 3) {
                    String valueOf = String.valueOf(qxcVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = qxeVar2.f;
                    if (componentName == null) {
                        componentName = qxcVar2.d;
                    }
                    if (componentName == null) {
                        String str = qxcVar2.c;
                        qnm.b(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    qxeVar2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
