package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: alvx  reason: default package */
/* loaded from: classes.dex */
final class alvx implements ServiceConnection {
    final /* synthetic */ alvz a;

    public alvx(alvz alvzVar) {
        this.a = alvzVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.a(new alvy(7));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.a(new alvy(6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        alvl alvlVar;
        if (iBinder == null) {
            alvz.c.d("Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        alvz alvzVar = this.a;
        if (iBinder == null) {
            alvlVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof alvl) {
                alvlVar = (alvl) queryLocalInterface;
            } else {
                alvlVar = new alvl(iBinder);
            }
        }
        alvzVar.a(new alvy(i, alvlVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a(new alvy(5));
    }
}
