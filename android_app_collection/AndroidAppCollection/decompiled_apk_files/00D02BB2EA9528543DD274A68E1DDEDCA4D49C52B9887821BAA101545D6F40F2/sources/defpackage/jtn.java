package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: jtn  reason: default package */
/* loaded from: classes7.dex */
final class jtn implements ServiceConnection {
    final /* synthetic */ jtu a;

    public jtn(jtu jtuVar) {
        this.a = jtuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jtu jtuVar = this.a;
        dbsk.s(iBinder);
        jtuVar.au = (jzd) iBinder;
        jtu jtuVar2 = this.a;
        jtuVar2.J.j(jtuVar2.au.a.n);
        jtu jtuVar3 = this.a;
        jtuVar3.K.j(jtuVar3.L);
        this.a.a();
        this.a.O.e();
        jtu jtuVar4 = this.a;
        jsq jsqVar = jtuVar4.Z;
        jzd jzdVar = jtuVar4.au;
        dbsk.s(jzdVar);
        boolean z = jzdVar.a.A;
        jsqVar.g = z;
        if (!z || !jsqVar.f) {
            return;
        }
        jsqVar.b.g().d(cjtd.a(dtxm.aP));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.au = null;
    }
}
