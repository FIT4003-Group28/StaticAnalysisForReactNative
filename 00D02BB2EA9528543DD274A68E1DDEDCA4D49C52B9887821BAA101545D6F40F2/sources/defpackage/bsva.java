package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gmm.personalscore.library.webview.LocalPreferencesWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bsva  reason: default package */
/* loaded from: classes4.dex */
public final class bsva extends itb implements bsvm {
    public final gga a;
    public final dxio<brlz> b;
    private final akfa c;
    private final cjxd d;
    private final bvkx e;
    private final btvo f;
    private final dxio<bypr> g;
    private final dxio<bvvw> h;
    private final dxio<afha> i;

    public bsva(gga ggaVar, akfa akfaVar, cjxd cjxdVar, dxio<brlz> dxioVar, bvkx bvkxVar, btvo btvoVar, dxio<bypr> dxioVar2, dxio<bvvw> dxioVar3, dxio<afha> dxioVar4) {
        this.a = ggaVar;
        this.c = akfaVar;
        this.d = cjxdVar;
        this.b = dxioVar;
        this.e = bvkxVar;
        this.f = btvoVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.i = dxioVar4;
    }

    private final void D() {
        this.d.f(false, null);
    }

    private final bvxn E() {
        bvxn bZ = bvxu.A.bZ();
        String str = this.f.getLocalPreferencesParameters().b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        int i2 = i | 4;
        bvxuVar.a = i2;
        bvxuVar.d = true;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        int i3 = bvxuVar2.a | 8;
        bvxuVar2.a = i3;
        bvxuVar2.e = true;
        bvxuVar2.a = i3 | 16;
        bvxuVar2.f = 1;
        dkyx dkyxVar = this.f.getEnableFeatureParameters().ap;
        if (dkyxVar == null) {
            dkyxVar = dkyx.f;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyxVar.getClass();
        bvxuVar3.j = dkyxVar;
        bvxuVar3.a |= 256;
        boolean z = this.f.getLocalPreferencesParameters().c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        bvxuVar4.a |= 512;
        bvxuVar4.k = z;
        return bZ;
    }

    @Override // defpackage.bsvm
    public final void B() {
        C(null);
    }

    @Override // defpackage.bsvm
    public final void C(@dzsi bwrs<ilo> bwrsVar) {
        bvvw a = this.h.a();
        bvxn E = E();
        String str = this.f.getLocalPreferencesParameters().b;
        if (E.c) {
            E.bF();
            E.c = false;
        }
        bvxu bvxuVar = (bvxu) E.b;
        bvxu bvxuVar2 = bvxu.A;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        bvxuVar.a = i | 64;
        bvxuVar.h = "aGMM.DiningPreferences";
        a.k(E.bK(), new LocalPreferencesWebViewCallbacks(bwrsVar), dtxn.s);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.e.j(new bsuz(this), bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // defpackage.bsvm
    public final void e() {
        bszv.ba(this.a, new bsuw());
    }

    @Override // defpackage.bsvm
    public final void f() {
        bszv.ba(this.a, new bsvb());
    }

    @Override // defpackage.bsvm
    public final void i() {
        if (btsj.d(this.a)) {
            this.i.a().G(new Runnable(this) { // from class: bsuy
                private final bsva a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cord.b(this.a.a);
                }
            });
            return;
        }
        D();
    }

    @Override // defpackage.bsvm
    public final void j() {
        Account s;
        if (btsj.d(this.a)) {
            btlu j = this.c.j();
            if (btlu.i(j) != btlt.GOOGLE) {
                s = null;
            } else {
                dbsk.s(j);
                s = j.s();
            }
            this.i.a().f(this.a, cord.a(s), 4);
            return;
        }
        D();
    }

    @Override // defpackage.bsvm
    public final void k() {
        gga ggaVar = this.a;
        btem btemVar = new btem();
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSideInfoSheet", false);
        bundle.putBoolean("keepScreenAwake", true);
        bundle.putBoolean("isNavigating", true);
        bundle.putBoolean("allowNightMode", true);
        btemVar.B(bundle);
        bszv.ba(ggaVar, btemVar);
    }

    @Override // defpackage.bsvm
    public final void l() {
        bszv.ba(this.a, new btem());
    }

    @Override // defpackage.bsvm
    public final void m(@dzsi auin auinVar) {
        bszv.ba(this.a, btgc.aS(auinVar));
    }

    @Override // defpackage.bsvm
    public final void n() {
        bszv.ba(this.a, new btfw());
    }

    @Override // defpackage.bsvm
    public final void o(aujb aujbVar) {
        bszv.ba(this.a, btgd.g(aujbVar));
    }

    @Override // defpackage.bsvm
    public final void p() {
        bszv.ba(this.a, new bsts());
    }

    @Override // defpackage.bsvm
    public final boolean q() {
        bypr a = this.g.a();
        dkql dkqlVar = this.f.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        return a.a(dkqlVar);
    }

    @Override // defpackage.bsvm
    public final void r() {
        bszv.ba(this.a, new bsvd());
    }

    @Override // defpackage.bsvm
    public final void s() {
        bszv.ba(this.a, new bsvf());
    }

    @Override // defpackage.bsvm
    public final void t() {
        bvvw a = this.h.a();
        bvxn E = E();
        String str = this.f.getLocalPreferencesParameters().d;
        if (E.c) {
            E.bF();
            E.c = false;
        }
        bvxu bvxuVar = (bvxu) E.b;
        bvxu bvxuVar2 = bvxu.A;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        bvxuVar.a = i | 64;
        bvxuVar.h = "aGMM.PreferencesLandingPage";
        a.k(E.bK(), new LocalPreferencesWebViewCallbacks((bwrs<ilo>) null), dtxy.op);
    }
}
