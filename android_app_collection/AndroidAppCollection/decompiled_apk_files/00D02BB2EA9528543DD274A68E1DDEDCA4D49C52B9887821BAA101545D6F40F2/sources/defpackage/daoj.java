package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: daoj  reason: default package */
/* loaded from: classes5.dex */
final class daoj implements ServiceConnection {
    final /* synthetic */ daol a;

    public daoj(daol daolVar) {
        this.a = daolVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.a(new daok(7));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.a(new daok(6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        danu danuVar;
        int i = iBinder == null ? 5 : 4;
        daol daolVar = this.a;
        if (iBinder == null) {
            danuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof danu) {
                danuVar = (danu) queryLocalInterface;
            } else {
                danuVar = new danu(iBinder);
            }
        }
        daolVar.a(new daok(i, danuVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a(new daok(5));
    }
}
