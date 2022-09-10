package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbev  reason: default package */
/* loaded from: classes4.dex */
public class cbev implements cbrr {
    public final ges a;
    public final Runnable b;
    public final cqkj c;
    @dzsi
    private final cbcv d;
    private final cbdt e;
    private final cbeq f;
    private final cbcn g;
    private final cbql h;
    private final cbcp i;
    private final cbcb j;
    private final cbbz k;
    private final cbcs l;
    private final cbdp m;
    @dzsi
    private final cbau n;
    private final cber o;
    private final cbeo p;
    private final dxio<cqhn> q;
    private final cbbc r;
    private boolean s = false;
    private boolean t = false;
    private final cbqg u;
    private final gga v;

    public cbev(@dzsi cbcv cbcvVar, ges gesVar, cbdt cbdtVar, cbcn cbcnVar, cbql cbqlVar, cbcp cbcpVar, cbcb cbcbVar, cbbz cbbzVar, cbcs cbcsVar, cber cberVar, cbdp cbdpVar, @dzsi cbau cbauVar, cbeo cbeoVar, Runnable runnable, cbeq cbeqVar, cqkj cqkjVar, dxio<cqhn> dxioVar, cbbc cbbcVar, cbqg cbqgVar, gga ggaVar) {
        this.d = cbcvVar;
        this.a = gesVar;
        this.e = cbdtVar;
        this.f = cbeqVar;
        this.g = cbcnVar;
        this.h = cbqlVar;
        this.i = cbcpVar;
        this.j = cbcbVar;
        this.k = cbbzVar;
        this.l = cbcsVar;
        this.o = cberVar;
        this.m = cbdpVar;
        this.n = cbauVar;
        this.p = cbeoVar;
        this.b = runnable;
        this.c = cqkjVar;
        this.q = dxioVar;
        this.r = cbbcVar;
        this.u = cbqgVar;
        this.v = ggaVar;
    }

    private final boolean x(boolean z) {
        cbau cbauVar;
        dccx dccxVar = new dccx();
        dccxVar.i(dcdc.j(this.i, this.j, this.h, this.g, this.l));
        if (!t().booleanValue() || (cbauVar = this.n) == null) {
            dccxVar.g(this.k);
        } else {
            dccxVar.g(cbauVar);
        }
        dcdc f = dccxVar.f();
        int size = f.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            cbrs cbrsVar = (cbrs) f.get(i);
            if (z) {
                if (!cbrsVar.g().booleanValue()) {
                    z2 = false;
                }
            } else if (!cbrsVar.h().booleanValue()) {
                return false;
            }
        }
        return z2;
    }

    @Override // defpackage.cbrr
    public cbrd a() {
        return this.g;
    }

    @Override // defpackage.cbrr
    public cbql b() {
        return this.h;
    }

    @Override // defpackage.cbrr
    public cbre c() {
        return this.i;
    }

    @Override // defpackage.cbrr
    public cbrb d() {
        return this.j;
    }

    @Override // defpackage.cbrr
    public cbra e() {
        return this.k;
    }

    @Override // defpackage.cbrr
    @dzsi
    public cbqt f() {
        return this.n;
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        return Boolean.valueOf(x(true));
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        return Boolean.valueOf(x(false));
    }

    @Override // defpackage.cbrr
    public cbrg i() {
        return this.l;
    }

    @Override // defpackage.cbrr
    public cbri j() {
        return this.m;
    }

    @Override // defpackage.cbrr
    public cbrq k() {
        return this.o;
    }

    @Override // defpackage.cbrr
    public Boolean l() {
        return Boolean.valueOf(this.o.g().booleanValue());
    }

    @Override // defpackage.cbrr
    public Boolean m() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.cbrr
    public cqkl n() {
        v();
        if (!this.t) {
            boolean z = false;
            if (g().booleanValue()) {
                dbsg<dijr> q = q();
                if (q.a()) {
                    cbeq cbeqVar = this.f;
                    dijr b = q.b();
                    String Rp = this.a.Rp(R.string.UGC_EVENTS_THANK_YOU_DIALOG_TEXT);
                    cbeo cbeoVar = this.p;
                    cbeq.a(b, 1);
                    cbeq.a(Rp, 2);
                    buni a = cbeqVar.a.a();
                    cbeq.a(a, 4);
                    gga a2 = cbeqVar.b.a();
                    cbeq.a(a2, 5);
                    cqkj a3 = cbeqVar.c.a();
                    cbeq.a(a3, 6);
                    cztz a4 = cbeqVar.d.a();
                    cbeq.a(a4, 7);
                    cbeq.a(cbeqVar.e.a(), 8);
                    dxio a5 = ((dxjh) cbeqVar.f).a();
                    cbeq.a(a5, 9);
                    dxio a6 = ((dxjh) cbeqVar.g).a();
                    cbeq.a(a6, 10);
                    final cbep cbepVar = new cbep(b, Rp, cbeoVar, a, a2, a3, a4, a5, a6);
                    cbepVar.a();
                    gga ggaVar = cbepVar.d;
                    dbsk.s(ggaVar);
                    cbepVar.l = new ProgressDialog(ggaVar, 0);
                    cbepVar.l.setCancelable(true);
                    cbepVar.l.setOnCancelListener(new DialogInterface.OnCancelListener(cbepVar) { // from class: cbek
                        private final cbep a;

                        {
                            this.a = cbepVar;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            btzc btzcVar = this.a.k;
                            if (btzcVar != null) {
                                btzcVar.a();
                            }
                        }
                    });
                    cbepVar.l.setMessage(cbepVar.d.getString(R.string.EVENT_CREATION_PROGRESS));
                    cbepVar.l.show();
                    cbepVar.k = cbepVar.n.a(cbepVar.b, new cbel(cbepVar), bvrj.UI_THREAD);
                } else {
                    cbcv cbcvVar = this.d;
                    if (cbcvVar != null) {
                        this.p.a(cbcvVar.a());
                    }
                }
                z = true;
            }
            this.t = z;
        }
        this.q.a();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cbrr
    public Boolean o() {
        cbau cbauVar;
        boolean z = false;
        if (!this.t && h().booleanValue()) {
            dccx dccxVar = new dccx();
            dccxVar.i(dcdc.l(this.i, this.j, this.h, this.g, this.k, this.l, this.m));
            if (this.u.c() && (cbauVar = this.n) != null) {
                dccxVar.g(cbauVar);
            }
            dcdc f = dccxVar.f();
            int size = f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                int i2 = i + 1;
                if (((cbrp) f.get(i)).j().booleanValue()) {
                    z = true;
                    break;
                }
                i = i2;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z) {
        this.t = z;
        this.q.a();
        cqkx.p(this);
    }

    @Override // defpackage.cbrr
    public jib r() {
        jhz jhzVar = new jhz();
        jhzVar.a = this.a.Rp(this.d == null ? R.string.UGC_EVENTS_ADD_PUBLIC_EVENT_HEADER : R.string.UGC_EVENTS_EDIT_PUBLIC_EVENT_HEADER);
        jhzVar.f(new View.OnClickListener(this) { // from class: cbeu
            private final cbev a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.J().onBackPressed();
            }
        });
        jhzVar.q = ibm.b();
        jhzVar.i = cqrt.g(2131231591, ibm.t());
        jhzVar.u = ibm.t();
        jhzVar.x = true;
        return jhzVar.b();
    }

    @Override // defpackage.cbrr
    public String s() {
        return this.a.J().getResources().getString(this.d != null ? R.string.UGC_EVENTS_POST_BUTTON_FOR_EDIT : R.string.UGC_EVENTS_POST_BUTTON_FOR_CREATE);
    }

    @Override // defpackage.cbrr
    public Boolean t() {
        cbau cbauVar;
        boolean z = false;
        if (this.u.c() && (cbauVar = this.n) != null && cbauVar.h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbrr
    @dzsi
    public cbrl u() {
        cbau cbauVar = this.n;
        if (cbauVar == null) {
            return null;
        }
        ges gesVar = this.a;
        cbbc cbbcVar = this.r;
        boolean z = this.d == null;
        this.q.a();
        return new cbdr(cbauVar, gesVar, cbbcVar, z, this, this.v);
    }

    public final void v() {
        gga ggaVar = this.a.aE;
        if (ggaVar != null) {
            ((InputMethodManager) ggaVar.getSystemService("input_method")).hideSoftInputFromWindow(ggaVar.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        this.s = true;
    }

    public dbsg<dijr> q() {
        return ((this.d == null ? 2 : 3) + (-1) != 1 ? new cbbu() : new cayy(this.e.a)).a(this.d, this);
    }
}
