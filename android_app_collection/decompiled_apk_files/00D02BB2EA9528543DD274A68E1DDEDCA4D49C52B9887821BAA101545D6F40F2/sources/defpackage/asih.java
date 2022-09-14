package defpackage;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asih  reason: default package */
/* loaded from: classes.dex */
public final class asih implements asim, asjv {
    public static final String a = "asih";
    public final btrm b;
    public final asik c;
    public final bvrb d;
    public final dxio<crfm> e;
    public boolean f;
    public boolean g;
    @dzsi
    public jzd j;
    private final gga k;
    private final efx l;
    private final asjw m;
    private final dxio<awnv> n;
    private final dxio<asmi> o;
    private final dxio<ashs> p;
    private final dxio<arpo> q;
    private final lza r;
    @dzsi
    private Runnable s;
    private boolean t;
    private final ServiceConnection v;
    @dzsi
    private crfr w;
    public crhp h = crhp.a();
    public asig i = asig.WAIT_FOR_OOB_COMPLETE;
    private final asif u = new asif(this);

    public asih(gga ggaVar, btrm btrmVar, efx efxVar, asjw asjwVar, dxio<awnv> dxioVar, dxio<asmi> dxioVar2, asik asikVar, dxio<ashs> dxioVar3, bvrb bvrbVar, dxio<crfm> dxioVar4, dxio<arpo> dxioVar5) {
        asic asicVar = new asic(this);
        this.v = asicVar;
        this.k = ggaVar;
        this.b = btrmVar;
        this.l = efxVar;
        this.o = dxioVar2;
        this.n = dxioVar;
        this.m = asjwVar;
        this.c = asikVar;
        this.p = dxioVar3;
        this.d = bvrbVar;
        this.e = dxioVar4;
        this.q = dxioVar5;
        this.r = new lza(ggaVar, asicVar);
    }

    private final void t() {
        if (this.n.a().j()) {
            this.i = asig.WAIT_FOR_PREREQUISITE_DIALOGS;
        } else {
            this.i = asig.WAIT_FOR_OOB_COMPLETE;
        }
    }

    private final void u() {
        dbsk.l(this.f);
        dbsk.l(this.i == asig.DONE);
        q();
    }

    @Override // defpackage.asim
    public final void a(@dzsi Bundle bundle) {
        boolean a2 = this.c.a();
        if (bundle != null) {
            a2 = bundle.getBoolean(asid.a, a2);
        }
        this.g = a2;
        btrm btrmVar = this.b;
        asif asifVar = this.u;
        dceq a3 = dcet.a();
        a3.b(awnt.class, new asii(0, awnt.class, asifVar, bvrj.UI_THREAD));
        a3.b(crhp.class, new asii(1, crhp.class, asifVar, bvrj.UI_THREAD));
        a3.b(asin.class, new asii(2, asin.class, asifVar, bvrj.UI_THREAD));
        btrmVar.g(asifVar, a3.a());
        asig asigVar = null;
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(asid.b);
            if (serializable instanceof asig) {
                asigVar = (asig) serializable;
            }
        }
        if (asigVar != null) {
            this.i = asigVar;
        } else {
            t();
        }
        this.m.b(this);
    }

    @Override // defpackage.asim
    public final void b() {
        dbsk.l(this.f);
    }

    @Override // defpackage.asim
    public final void c() {
        dbsk.l(this.f);
        if (this.i == asig.WAIT_FOR_PREREQUISITE_DIALOGS) {
            this.m.c();
        }
    }

    @Override // defpackage.asim
    public final void d() {
        dbsk.l(!this.f);
        this.b.a(this.u);
    }

    @Override // defpackage.asim
    public final void e(Bundle bundle) {
        bundle.putBoolean(asid.a, this.g);
        bundle.putSerializable(asid.b, this.i);
    }

    @Override // defpackage.asim
    public final void f() {
        dbsk.l(!this.f);
        this.f = true;
        boolean k = k();
        if (this.g) {
            ashs a2 = this.p.a();
            if (!a2.b) {
                a2.b = true;
                a2.a.J(dukj.VANAGON_MODE_STARTED);
            }
            r();
        }
        if (!this.g || k) {
            return;
        }
        l();
    }

    @Override // defpackage.asim
    public final void g() {
        dbsk.l(this.f);
        this.f = false;
        if (this.g) {
            s();
        }
    }

    @Override // defpackage.asim
    public final void h(qcx qcxVar) {
        bvrj.UI_THREAD.c();
        dcdc<amvh> h = qcxVar.h();
        if (!h.isEmpty()) {
            this.t = true;
            this.s = new asia(this, h);
            q();
        }
    }

    @Override // defpackage.asim
    public final void i(amte amteVar, int i) {
        amvh[] amvhVarArr;
        bvrj.UI_THREAD.c();
        if (!dqvj.DRIVE.equals(amteVar.c(i))) {
            dccx dccxVar = new dccx();
            dccxVar.g(amteVar.f());
            if (amteVar.h()) {
                if (amteVar.h()) {
                    amvh[] amvhVarArr2 = amteVar.c;
                    amvhVarArr = (amvh[]) Arrays.copyOfRange(amvhVarArr2, 2, amvhVarArr2.length);
                } else {
                    amvhVarArr = new amvh[0];
                }
                dccxVar.h(amvhVarArr);
            }
            qcw x = qcx.x();
            x.b(dccxVar.f());
            h(x.a());
            return;
        }
        this.t = false;
        this.s = new asib(this, amteVar, i);
        q();
    }

    @Override // defpackage.asim
    public final void j(final dxio<ascb> dxioVar, final aste asteVar) {
        bvrj.UI_THREAD.c();
        this.t = false;
        this.s = new Runnable(dxioVar, asteVar) { // from class: ashz
            private final dxio a;
            private final aste b;

            {
                this.a = dxioVar;
                this.b = asteVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dxio dxioVar2 = this.a;
                ((ascb) dxioVar2.a()).l(this.b);
            }
        };
        q();
    }

    public final boolean k() {
        dbsk.l(this.f);
        boolean a2 = this.c.a();
        if (this.g == a2) {
            return false;
        }
        this.g = a2;
        this.o.a().d();
        this.k.A();
        gn g = this.k.g();
        this.l.a(g.H(gfu.ACTIVITY_FRAGMENT.c));
        if (this.g) {
            g.aq();
        }
        t();
        if (!this.g) {
            dbsk.l(true);
            if (this.h.d()) {
                String f = this.h.e().g().a.f();
                atlr bZ = atls.k.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                atls atlsVar = (atls) bZ.b;
                f.getClass();
                int i = atlsVar.a | 1;
                atlsVar.a = i;
                atlsVar.b = f;
                atlsVar.a = i | 4;
                atlsVar.d = true;
                this.k.D((ggg) gfp.a(atbq.class, atbq.aJ(bZ.bK())));
            } else if (this.h.f()) {
                this.k.D((ggg) gfp.a(aswz.class, null));
            }
        } else {
            l();
        }
        return true;
    }

    public final void l() {
        dbsk.l(this.f);
        dbsk.l(this.g);
        asig asigVar = asig.WAIT_FOR_OOB_COMPLETE;
        int ordinal = this.i.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 || !this.h.b()) {
                return;
            }
            this.i = asig.DONE;
            u();
            return;
        }
        m();
    }

    public final void m() {
        dbsk.l(this.g);
        if (this.i != asig.WAIT_FOR_PREREQUISITE_DIALOGS) {
            return;
        }
        this.m.d(true);
    }

    @Override // defpackage.asjv
    public final void n(boolean z) {
        if (this.i != asig.WAIT_FOR_PREREQUISITE_DIALOGS) {
            return;
        }
        if (!z) {
            Toast.makeText(this.k, (int) R.string.CAR_UI_MODE_PREREQUISITES_NOT_MET_TOAST, 1).show();
            this.k.finish();
            return;
        }
        this.i = asig.WAIT_FOR_SERVICE_START;
        if (this.j != null) {
            o();
        }
        if (!this.f || !this.h.b()) {
            return;
        }
        this.i = asig.DONE;
        u();
    }

    public final void o() {
        boolean z = true;
        if (this.i != asig.WAIT_FOR_SERVICE_START && this.i != asig.DONE) {
            z = false;
        }
        dbsk.l(z);
        if (this.w != null) {
            return;
        }
        crfr a2 = this.q.a().a(this.k);
        this.w = a2;
        a2.a();
    }

    public final void p() {
        crfr crfrVar = this.w;
        if (crfrVar == null) {
            return;
        }
        crfrVar.b();
        this.w = null;
    }

    public final void q() {
        Runnable runnable;
        if (this.i == asig.DONE) {
            if ((this.t && !this.h.f()) || (runnable = this.s) == null || this.j == null) {
                return;
            }
            dbsk.s(runnable);
            this.s = null;
            jzd jzdVar = this.j;
            dbsk.s(jzdVar);
            jzdVar.a().a();
            runnable.run();
        }
    }

    public final void r() {
        dbsk.l(this.g);
        lza lzaVar = this.r;
        Intent intent = new Intent();
        intent.setClassName(lzaVar.a, "com.google.android.apps.gmm.car.androidauto.CarNavigationProviderService");
        intent.setAction("com.google.android.apps.gmm.INTERNAL");
        if (lzaVar.a.bindService(intent, lzaVar.b, 65)) {
            return;
        }
        String valueOf = String.valueOf(intent.getComponent());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Can't bind to ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    public final void s() {
        p();
        this.j = null;
        lza lzaVar = this.r;
        lzaVar.a.unbindService(lzaVar.b);
    }
}
