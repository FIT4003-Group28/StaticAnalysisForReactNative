package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: daio  reason: default package */
/* loaded from: classes5.dex */
final class daio extends daij {
    final /* synthetic */ IBinder b;
    final /* synthetic */ daiq c;

    public daio(daiq daiqVar, IBinder iBinder) {
        this.c = daiqVar;
        this.b = iBinder;
    }

    @Override // defpackage.daij
    public final void a() {
        damj damjVar;
        dair dairVar = this.c.a;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            damjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            if (queryLocalInterface instanceof damj) {
                damjVar = (damj) queryLocalInterface;
            } else {
                damjVar = new damj(iBinder);
            }
        }
        dairVar.j = damjVar;
        dair dairVar2 = this.c.a;
        dairVar2.b.c("linkToDeath", new Object[0]);
        try {
            dairVar2.j.asBinder().linkToDeath(dairVar2.h, 0);
        } catch (RemoteException unused) {
            dairVar2.b.e("linkToDeath failed", new Object[0]);
        }
        this.c.a.e = false;
        for (daij daijVar : this.c.a.d) {
            daijVar.run();
        }
        this.c.a.d.clear();
    }
}
