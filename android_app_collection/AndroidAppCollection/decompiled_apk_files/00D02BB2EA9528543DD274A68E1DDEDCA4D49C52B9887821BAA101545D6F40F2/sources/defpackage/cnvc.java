package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cnvc  reason: default package */
/* loaded from: classes5.dex */
final class cnvc implements Handler.Callback {
    final /* synthetic */ cnvd a;

    public cnvc(cnvd cnvdVar) {
        this.a = cnvdVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.a) {
                cnuz cnuzVar = (cnuz) message.obj;
                cnvb cnvbVar = this.a.a.get(cnuzVar);
                if (cnvbVar != null && cnvbVar.b()) {
                    if (cnvbVar.c) {
                        cnvbVar.g.c.removeMessages(1, cnvbVar.e);
                        cnvd cnvdVar = cnvbVar.g;
                        cnvdVar.d.c(cnvdVar.b, cnvbVar);
                        cnvbVar.c = false;
                        cnvbVar.b = 2;
                    }
                    this.a.a.remove(cnuzVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a.a) {
                cnuz cnuzVar2 = (cnuz) message.obj;
                cnvb cnvbVar2 = this.a.a.get(cnuzVar2);
                if (cnvbVar2 != null && cnvbVar2.b == 3) {
                    String valueOf = String.valueOf(cnuzVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    ComponentName componentName = cnvbVar2.f;
                    if (componentName == null) {
                        componentName = cnuzVar2.c;
                    }
                    if (componentName == null) {
                        String str = cnuzVar2.b;
                        cnwc.a(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    cnvbVar2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
