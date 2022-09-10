package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: bmpd  reason: default package */
/* loaded from: classes3.dex */
final class bmpd implements ServiceConnection {
    final /* synthetic */ deig a;

    public bmpd(deig deigVar) {
        this.a = deigVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.j(bmpf.c(bmno.BINDING_DIED));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.j(new bmoo(dbsg.i(((bmsy) iBinder).a()), dbpy.a));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.j(bmpf.c(bmno.SERVICE_DISCONNECTED));
    }
}
