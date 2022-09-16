package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: asic  reason: default package */
/* loaded from: classes2.dex */
final class asic implements ServiceConnection {
    final /* synthetic */ asih a;

    public asic(asih asihVar) {
        this.a = asihVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        asih asihVar = this.a;
        jzd jzdVar = (jzd) iBinder;
        dbsk.s(jzdVar);
        asihVar.j = jzdVar;
        if (this.a.i == asig.WAIT_FOR_SERVICE_START || this.a.i == asig.DONE) {
            this.a.o();
        }
        this.a.q();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bvoo.j(new IllegalStateException("onServiceDisconnected in VanagonTransitionControllerImpl"));
        this.a.p();
        this.a.j = null;
    }
}
