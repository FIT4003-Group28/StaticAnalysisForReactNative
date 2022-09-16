package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: yll  reason: default package */
/* loaded from: classes4.dex */
final class yll implements ServiceConnection {
    final /* synthetic */ ylm a;

    public yll(ylm ylmVar) {
        this.a = ylmVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.b) {
            if (this.a.c) {
                if (!(iBinder instanceof Binder)) {
                    String flattenToString = componentName == null ? "null" : componentName.flattenToString();
                    String name = iBinder == null ? "null" : iBinder.getClass().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(flattenToString).length() + 78 + String.valueOf(name).length());
                    sb.append("Unexpected IBinder non-concrete-Binder for ComponentName: ");
                    sb.append(flattenToString);
                    sb.append(" service className: ");
                    sb.append(name);
                    zep.b(sb.toString());
                }
                ylm ylmVar = this.a;
                ylmVar.d = (Binder) iBinder;
                ylmVar.a.open();
                ylm ylmVar2 = this.a;
                ylmVar2.e(ylmVar2.d);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.b) {
            ylm ylmVar = this.a;
            if (ylmVar.c) {
                ylmVar.c = false;
                ylmVar.a.close();
                this.a.d = null;
            }
        }
    }
}
