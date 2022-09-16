package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahew  reason: default package */
/* loaded from: classes.dex */
public final class ahew implements ServiceConnection {
    final /* synthetic */ ahez a;

    public ahew(ahez ahezVar) {
        this.a = ahezVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ahez ahezVar = this.a;
        if (!ahezVar.l) {
            afus.b(1, 10, "onServiceConnected called for player service, but the service shouldn't be started.");
        } else if (!ahezVar.d.c()) {
        } else {
            Intent intent = (Intent) this.a.b.get();
            if (Build.VERSION.SDK_INT >= 26) {
                ahez ahezVar2 = this.a;
                if (ahezVar2.c.j) {
                    ahezVar2.a.startForegroundService(intent);
                    ((ainw) this.a.k.get()).i(true);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                this.a.a.startService(intent);
            }
            ahez ahezVar3 = this.a;
            if (!ahezVar3.m) {
                return;
            }
            ahezVar3.c();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ainw) this.a.k.get()).b(true);
        this.a.g();
    }
}
