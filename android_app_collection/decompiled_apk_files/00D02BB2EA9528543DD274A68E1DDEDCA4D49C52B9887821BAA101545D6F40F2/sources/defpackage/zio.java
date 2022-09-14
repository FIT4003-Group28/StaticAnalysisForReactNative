package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: zio  reason: default package */
/* loaded from: classes7.dex */
public class zio implements Serializable, zbs, zrz {
    @dzsi
    private zri A;
    @dzsi
    private transient cjqp B;
    @dzsi
    private transient Dialog C;
    @dzsi
    private cjsz D;
    @dzsi
    private transient qbp E;
    @dzsi
    private transient zfr F;
    @dzsi
    private transient zbb G;
    @dzsi
    private transient Runnable H;
    private boolean J;
    private boolean K;
    @dzsi
    cjrc a;
    transient Activity b;
    transient cqat c;
    transient cqkj d;
    transient cqhu e;
    transient cjqy f;
    transient cjqq g;
    transient vtn h;
    transient vpd i;
    transient cklf j;
    transient vxo k;
    transient zrj l;
    transient vwv m;
    transient dxio<afha> n;
    transient yzs o;
    transient ymn p;
    transient yil q;
    @dzsi
    private Long r;
    private dqvj s;
    private bvrt<dwao> t;
    private bvrt<douz> u;
    private bvrt<yiv> v;
    @dzsi
    private yph w;
    @dzsi
    private transient cjqp x;
    @dzsi
    private yno y;
    @dzsi
    private transient cjqp z;
    private boolean I = false;
    private boolean L = false;

    private final void L(dxip<zio> dxipVar) {
        if (!this.L) {
            dxipVar.b(this);
            this.L = true;
        }
    }

    private final long M(cqat cqatVar) {
        Long l = this.r;
        return l != null ? l.longValue() : cqatVar.b();
    }

    private final dwao N() {
        return this.t.e((dssr) dwao.R.cu(7), dwao.R);
    }

    private final douz O() {
        return this.u.e((dssr) douz.g.cu(7), douz.g);
    }

    private final cjqp P(cjtg cjtgVar) {
        cjrc r = this.f.r(cjtgVar);
        this.a = r;
        return this.g.e(r, cjtgVar);
    }

    private final <V extends cqkp> void Q(cqiw<V> cqiwVar, V v, @dzsi cjqp cjqpVar) {
        final cqkf c = this.d.c(cqiwVar, null);
        c.e(v);
        Dialog dialog = new Dialog(this.b, 16974129);
        this.C = dialog;
        dialog.requestWindowFeature(1);
        final View c2 = c.c();
        if (cjqpVar != null) {
            this.g.i(cjqpVar, c2);
        }
        this.C.setContentView(c2);
        this.C.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: zil
            private final zio a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.I();
            }
        });
        this.C.setOnDismissListener(new DialogInterface.OnDismissListener(this, c, c2) { // from class: zim
            private final zio a;
            private final cqkf b;
            private final View c;

            {
                this.a = this;
                this.b = c;
                this.c = c2;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zio zioVar = this.a;
                cqkf cqkfVar = this.b;
                View view = this.c;
                cqkfVar.e(null);
                zioVar.g.h(view);
            }
        });
        Window window = this.C.getWindow();
        dbsk.s(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.C.show();
    }

    public static zio v(dxip<zio> dxipVar, boolean z, dqvj dqvjVar, dwao dwaoVar, douz douzVar, yiv yivVar, @dzsi Long l, @dzsi amvh amvhVar, boolean z2, boolean z3) {
        zio zioVar = new zio();
        zioVar.L(dxipVar);
        zioVar.B(z, dqvjVar, dwaoVar, douzVar, yivVar, l, amvhVar, z2, z3);
        zioVar.y(dxipVar);
        return zioVar;
    }

    public void A(Runnable runnable) {
        this.H = runnable;
    }

    public void B(boolean z, dqvj dqvjVar, dwao dwaoVar, douz douzVar, yiv yivVar, @dzsi Long l, @dzsi amvh amvhVar, boolean z2, boolean z3) {
        akqq akqqVar;
        akqi akqiVar;
        this.I = z;
        this.s = dqvjVar;
        this.t = bvrt.b(dwaoVar);
        this.u = bvrt.b(douzVar);
        this.v = bvrt.b(yivVar);
        this.r = l;
        this.J = z2;
        this.K = z3;
        zbb zbbVar = null;
        this.F = amvhVar != null ? zqw.d(amvhVar.b(), this.h) : null;
        if (amvhVar != null && (akqqVar = amvhVar.e) != null && (akqiVar = amvhVar.d) != null) {
            zbbVar = new zbb(akqiVar, akqqVar, amvhVar.p(), this.b, this.n);
        }
        this.G = zbbVar;
    }

    final yiv C() {
        if (this.m.c()) {
            return this.p.a();
        }
        return this.v.e((dssr) yiv.e.cu(7), yiv.e);
    }

    public void D() {
        if (this.E == null) {
            return;
        }
        if (this.m.a()) {
            s();
        } else if (this.C != null) {
        } else {
            ynz ynzVar = new ynz(this.b, N(), O(), this.p, this.o, this.m, this);
            this.y = ynzVar;
            cjsz cjszVar = new cjsz(dtya.ej);
            this.D = cjszVar;
            this.z = P(cjszVar);
            Q(new ymi(), ynzVar, this.z);
        }
    }

    public void E() {
        if (this.E == null || this.C != null) {
            return;
        }
        zri m = zri.m(this.l, this.s, N(), this);
        cjsz cjszVar = new cjsz(dtya.ej);
        this.D = cjszVar;
        this.B = P(cjszVar);
        this.A = m;
        Q(new uts(), m, this.B);
    }

    public void F() {
        Dialog dialog = this.C;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        yph yphVar = this.w;
        if (yphVar != null) {
            yphVar.w();
        }
        dialog.dismiss();
    }

    public void G() {
        Dialog dialog = this.C;
        if (dialog == null || !dialog.isShowing()) {
            yph yphVar = this.w;
            if (yphVar != null) {
                yphVar.y(true);
                Q(new ylp(), yphVar, this.x);
                yphVar.x();
                yphVar.y(false);
            } else if (this.y != null) {
                Q(new ymi(), this.y, this.z);
            } else if (this.A == null) {
            } else {
                Q(new uts(), this.A, this.B);
            }
        }
    }

    public void H() {
        Dialog dialog = this.C;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        F();
        G();
    }

    public final void I() {
        F();
        this.C = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.F = null;
        Runnable runnable = this.H;
        if (runnable != null) {
            runnable.run();
        }
    }

    public cqkl J() {
        if (this.E != null && this.C == null) {
            yil yilVar = this.q;
            yiv C = C();
            douz O = O();
            Bundle bundle = new Bundle();
            dsuv.d(bundle, "modePreferences", C);
            dsuv.d(bundle, "relevantOptions", O);
            yig yigVar = new yig();
            yigVar.B(bundle);
            yilVar.a(yigVar);
            yilVar.a.D(yigVar);
        }
        return cqkl.a;
    }

    @dzsi
    public cjtg K() {
        return this.D;
    }

    @Override // defpackage.zbs
    public Boolean a() {
        return Boolean.valueOf(this.I);
    }

    @Override // defpackage.zbs
    public Boolean b() {
        return Boolean.valueOf(this.s.equals(dqvj.TRANSIT));
    }

    @Override // defpackage.zbs
    public Boolean c() {
        boolean z = true;
        if (this.K || (this.s != dqvj.TRANSIT && !this.J)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbs
    public Boolean d() {
        boolean z = false;
        if (!this.K && this.s == dqvj.TRANSIT) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbs
    public Boolean e() {
        if (this.s == dqvj.TRANSIT) {
            return true;
        }
        if (this.J) {
            return Boolean.valueOf(!vmu.getDefaultDirectionsOptionsText(this.b).equals(h()));
        }
        return false;
    }

    @Override // defpackage.zbs
    public Boolean f() {
        return Boolean.valueOf(this.s.equals(dqvj.TRANSIT));
    }

    @Override // defpackage.zbs
    public Boolean g() {
        dwao N = N();
        dwbk dwbkVar = N.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        int a = dqvf.a(dwbkVar.k);
        boolean z = true;
        if (a == 0 || a != 6) {
            dosz doszVar = N.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            int a2 = dquo.a(doszVar.b);
            if (a2 == 0 || a2 != 2) {
                dosz doszVar2 = N.B;
                if (doszVar2 == null) {
                    doszVar2 = dosz.e;
                }
                if ((doszVar2.a & 4) == 0) {
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbs
    @dzsi
    public String h() {
        return vmu.getDirectionsOptionsMenuItemText(this.i, this.s, this.b, N());
    }

    @Override // defpackage.zbs
    @dzsi
    public String i() {
        return vmu.getTransitDateTimeOptionsMenuItemText(this.b, M(this.c), this.c, N());
    }

    @Override // defpackage.zbs
    @dzsi
    public String j() {
        douz O = O();
        int size = ynf.j(O).size();
        yis yisVar = C().b;
        if (yisVar == null) {
            yisVar = yis.b;
        }
        int size2 = ynf.g(yisVar, O).size();
        if (size == size2) {
            return this.b.getResources().getString(R.string.DIRECTIONS_PREFERRED_MODES_ALL_TITLE);
        }
        if (size2 == 0) {
            return this.b.getResources().getString(R.string.DIRECTIONS_PREFERRED_MODES_NONE_TITLE);
        }
        return this.b.getResources().getQuantityString(R.plurals.DIRECTIONS_PREFERRED_MODES_SOME_TITLE, size2, Integer.valueOf(size2));
    }

    @Override // defpackage.zbs
    @dzsi
    public String k() {
        Activity activity = this.b;
        yiu yiuVar = C().c;
        if (yiuVar == null) {
            yiuVar = yiu.c;
        }
        dqvb b = dqvb.b(yiuVar.b);
        if (b == null) {
            b = dqvb.TRANSIT_BEST;
        }
        int a = yng.a(b);
        return a > 0 ? activity.getResources().getString(a) : "";
    }

    @Override // defpackage.zbs
    public Boolean l() {
        douz e = this.u.e((dssr) douz.g.cu(7), douz.g);
        int size = ynf.j(e).size();
        yis yisVar = C().b;
        if (yisVar == null) {
            yisVar = yis.b;
        }
        return Boolean.valueOf(size != ynf.g(yisVar, e).size());
    }

    @Override // defpackage.zbs
    public Boolean m() {
        yiu yiuVar = C().c;
        if (yiuVar == null) {
            yiuVar = yiu.c;
        }
        dqvb b = dqvb.b(yiuVar.b);
        if (b == null) {
            b = dqvb.TRANSIT_BEST;
        }
        return Boolean.valueOf(b != dqvb.TRANSIT_BEST);
    }

    @Override // defpackage.zbs
    public cqkl n() {
        if (this.E != null) {
            if (this.s == dqvj.TRANSIT) {
                D();
            } else {
                E();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.zbs
    public cqkl o() {
        if (this.E != null && this.C == null) {
            yph r = yph.r(N(), vxb.f(N(), TimeZone.getDefault(), M(this.c)), DateFormat.is24HourFormat(this.b), vxi.b(N()), this.s, this.c, this.d, this.e, this);
            this.w = r;
            cjsz cjszVar = new cjsz(dtxn.O);
            this.D = cjszVar;
            this.x = P(cjszVar);
            r.y(true);
            Q(new ylp(), r, this.x);
            r.y(false);
        }
        return cqkl.a;
    }

    @Override // defpackage.zbs
    public Boolean p() {
        return Boolean.valueOf(this.G != null);
    }

    @Override // defpackage.zbs
    public cqkl q() {
        zbb zbbVar = this.G;
        if (zbbVar != null) {
            zbbVar.b.a().F(this.b, zbbVar.a, "Activity for launching weather not found");
        }
        return cqkl.a;
    }

    @Override // defpackage.zbs
    public cqkl r() {
        yil yilVar = this.q;
        yis yisVar = C().b;
        if (yisVar == null) {
            yisVar = yis.b;
        }
        douz O = O();
        Bundle bundle = new Bundle();
        dsuv.d(bundle, "modePreferences", yisVar);
        dsuv.d(bundle, "relevantOptions", O);
        yii yiiVar = new yii();
        yiiVar.B(bundle);
        yilVar.a(yiiVar);
        yilVar.a.C(yiiVar, gfu.DIALOG_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }

    @Override // defpackage.zbs
    public cqkl s() {
        yil yilVar = this.q;
        yiu yiuVar = C().c;
        if (yiuVar == null) {
            yiuVar = yiu.c;
        }
        douz O = O();
        Bundle bundle = new Bundle();
        dsuv.d(bundle, "relevantOptions", O);
        dsuv.d(bundle, "routePreferences", yiuVar);
        yik yikVar = new yik();
        yikVar.B(bundle);
        yilVar.a(yikVar);
        yilVar.a.C(yikVar, gfu.DIALOG_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }

    @Override // defpackage.zbs
    @dzsi
    public zfr t() {
        return this.F;
    }

    @Override // defpackage.zbs
    public Boolean u() {
        return Boolean.valueOf(this.F != null);
    }

    @Override // defpackage.zrz
    public void x() {
        I();
    }

    public void y(dxip<zio> dxipVar) {
        cjsz cjszVar;
        cjqp cjqpVar = null;
        this.F = null;
        L(dxipVar);
        cjrc cjrcVar = this.a;
        if (cjrcVar != null && (cjszVar = this.D) != null) {
            cjqpVar = this.g.e(cjrcVar, cjszVar);
        }
        yph yphVar = this.w;
        if (yphVar != null) {
            yphVar.s(this.c, this.d, this.e, this);
            this.x = cjqpVar;
            return;
        }
        yno ynoVar = this.y;
        if (ynoVar != null) {
            ynoVar.g(this, this.p, this.o, this.m);
            this.z = cjqpVar;
            return;
        }
        zri zriVar = this.A;
        if (zriVar == null) {
            return;
        }
        zriVar.o(this, this.k, this.i, this.j, this.b);
        this.B = cjqpVar;
    }

    public void z(@dzsi qbp qbpVar) {
        this.E = qbpVar;
    }

    @Override // defpackage.zrz
    public void w(dwao dwaoVar) {
        ddho ddhoVar;
        if (this.w != null) {
            ddhoVar = dtxn.cn;
        } else {
            ddhoVar = (this.y == null && this.A == null) ? null : dtxn.cz;
        }
        if (ddhoVar != null) {
            dnqg bZ = dnqh.p.bZ();
            ddxw bZ2 = ddxx.j.bZ();
            int i = ((dtxi) ddhoVar).a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ2.b;
            ddxxVar.a |= 8;
            ddxxVar.d = i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            ddxx bK = bZ2.bK();
            bK.getClass();
            dnqhVar.f = bK;
            dnqhVar.a |= 16;
            dnqh bK2 = bZ.bK();
            qbp qbpVar = this.E;
            if (qbpVar != null) {
                qbpVar.h(dwaoVar, bK2);
            }
        }
        I();
    }
}
