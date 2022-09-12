package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
/* compiled from: PG */
/* renamed from: kew  reason: default package */
/* loaded from: classes7.dex */
final class kew implements cmvr {
    final /* synthetic */ kex a;

    public kew(kex kexVar) {
        this.a = kexVar;
    }

    @Override // defpackage.cmvr
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.cnac
    public final void b(int i) {
        cmvq.b(this);
    }

    @Override // defpackage.cnac
    public final void c() {
        cmvq.a(this);
    }

    @Override // defpackage.cmvr
    public final void d() {
        int i;
        CarUiInfo carUiInfo;
        kex kexVar = this.a;
        ket ketVar = kexVar.a;
        cmwz cmwzVar = kexVar.b;
        bvrj.UI_THREAD.c();
        dbsk.l(cmwzVar.b());
        try {
            CarInfo b = cmwzVar.a().b();
            dbsk.s(b);
            try {
                cmwv d = cmwzVar.a().d();
                dbsk.s(d);
                ketVar.e = d;
                i = ketVar.e.b();
            } catch (cmwn e) {
                bvoo.j(e);
                i = 0;
            }
            try {
                carUiInfo = cmwzVar.a().c();
                dbsk.s(carUiInfo);
            } catch (cmwm e2) {
                bvoo.j(e2);
                carUiInfo = null;
            }
            ketVar.c.a().b(true);
            ketVar.a.b(new GmmCarProjectionStateEvent(true, b.a, b.b, b.c, b.i, b.j, b.l, b.k, i, carUiInfo != null ? key.k(carUiInfo.b, carUiInfo.a, carUiInfo.f, carUiInfo.e, carUiInfo.d) : null));
        } catch (cmwm e3) {
            bvoo.j(e3);
        }
        bvrj.UI_THREAD.c();
        cmwv cmwvVar = ketVar.e;
        if (cmwvVar != null) {
            kfl kflVar = ketVar.d;
            synchronized (kflVar.a) {
                dbsk.a(true);
                dbsk.l(kflVar.d == null);
                dbsk.l(kflVar.c.isEmpty());
                kflVar.d = cmwvVar;
                dzrn<kfm<?>> a = kflVar.b.values().a();
                while (a.hasNext()) {
                    kfm<?> next = a.next();
                    try {
                        kflVar.d(cmwvVar, next);
                    } catch (cmwm unused) {
                        next.a();
                    }
                }
            }
        }
        try {
            cnif e4 = cmwzVar.a().e();
            dbsk.s(e4);
            ketVar.f = e4;
            kfe kfeVar = ketVar.b;
            cnif cnifVar = ketVar.f;
            bvrj.UI_THREAD.c();
            dbsk.s(cnifVar);
            dbsk.l(kfeVar.c == null);
            kfeVar.c = cnifVar;
            cnifVar.c = kfeVar.d;
            if (kfeVar.b) {
                kfeVar.b = false;
                kfeVar.b();
            }
        } catch (cmwm unused2) {
        }
        kexVar.c = true;
    }
}
