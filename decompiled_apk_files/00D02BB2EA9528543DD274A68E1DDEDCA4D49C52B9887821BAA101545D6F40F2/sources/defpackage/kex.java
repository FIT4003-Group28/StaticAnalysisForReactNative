package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: kex  reason: default package */
/* loaded from: classes.dex */
public final class kex {
    public final ket a;
    public final cmwz b;
    public boolean c;

    public kex(Context context, ket ketVar) {
        dbsk.s(ketVar);
        this.a = ketVar;
        this.b = kes.a(context, new keu(this), new kev(this), new kew(this));
    }

    public final void a() {
        if (this.c) {
            this.c = false;
            ket ketVar = this.a;
            bvrj.UI_THREAD.c();
            ketVar.c.a().b(false);
            ketVar.a.b(new GmmCarProjectionStateEvent(false));
            if (ketVar.f != null) {
                kfe kfeVar = ketVar.b;
                bvrj.UI_THREAD.c();
                dbsk.l(kfeVar.c != null);
                cnif cnifVar = kfeVar.c;
                try {
                    cnifVar.d.h(cnifVar.a);
                } catch (RemoteException | IllegalStateException unused) {
                }
                kfeVar.a = false;
                kfeVar.c.c = null;
                kfeVar.c = null;
                kfeVar.b = false;
                kfeVar.e(1);
                ketVar.f = null;
            }
            bvrj.UI_THREAD.c();
            kfl kflVar = ketVar.d;
            synchronized (kflVar.a) {
                cmwv cmwvVar = kflVar.d;
                if (cmwvVar != null) {
                    dzkf listIterator = kflVar.c.listIterator();
                    while (listIterator.hasNext()) {
                        cmwvVar.c(kflVar, ((Integer) listIterator.next()).intValue());
                    }
                    kflVar.c.clear();
                    kflVar.d = null;
                }
            }
            ketVar.e = null;
        }
    }
}
