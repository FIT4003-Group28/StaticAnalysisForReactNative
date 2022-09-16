package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: alsv  reason: default package */
/* loaded from: classes.dex */
final class alsv extends also {
    final /* synthetic */ IBinder a;
    final /* synthetic */ alsx b;

    public alsv(alsx alsxVar, IBinder iBinder) {
        this.b = alsxVar;
        this.a = iBinder;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.IInterface, java.lang.Object] */
    @Override // defpackage.also
    public final void a() {
        alsy alsyVar = this.b.a;
        alsyVar.l = alsyVar.h.a(this.a);
        alsy alsyVar2 = this.b.a;
        try {
            alsyVar2.l.asBinder().linkToDeath(alsyVar2.j, 0);
        } catch (RemoteException e) {
            alsyVar2.b.b(e, "linkToDeath failed", new Object[0]);
        }
        this.b.a.f = false;
        for (Runnable runnable : this.b.a.c) {
            runnable.run();
        }
        this.b.a.c.clear();
    }
}
