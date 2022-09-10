package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auau  reason: default package */
/* loaded from: classes2.dex */
public class auau implements audp {
    final /* synthetic */ auax a;
    private int b = 16777215;
    private int c = 14233637;
    private int d = 14233637;
    private int e = 14233637;
    private int f = 14233637;
    private int g = 16777215;
    private int h = 16777215;

    public auau(auax auaxVar) {
        this.a = auaxVar;
    }

    @Override // defpackage.audp
    @dzsi
    public cjtd A() {
        deaa deaaVar;
        auax auaxVar = this.a;
        if (auaxVar.l < 0 || !auaxVar.n) {
            return null;
        }
        cjta b = cjtd.b();
        ddzy bZ = deab.c.bZ();
        if (this.a.o) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.d = this.a.g;
        if (!s().booleanValue()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }

    @Override // defpackage.audp
    @dzsi
    public cjtd B() {
        deaa deaaVar;
        if (!this.a.o) {
            return null;
        }
        cjta b = cjtd.b();
        ddzy bZ = deab.c.bZ();
        if (s().booleanValue()) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.d = dtxw.bn;
        return b.a();
    }

    @Override // defpackage.audp
    public Integer a() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.audp
    public Integer b() {
        return 0;
    }

    @Override // defpackage.audp
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.audp
    public Integer d() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.audp
    public Integer e() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.audp
    public Integer f() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.audp
    public Integer g() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.audp
    public Integer h() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.audp
    public Boolean i() {
        boolean z = true;
        if (!s().booleanValue() && !t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.audp
    public audo j() {
        return this.a.q;
    }

    @Override // defpackage.audp
    public Boolean k() {
        return Boolean.valueOf(this.a.A == 3);
    }

    @Override // defpackage.audp
    public Integer l() {
        int i;
        if (this.a.j == dowa.MILES) {
            i = u().booleanValue() ? R.string.SPEEDOMETER_LABEL_MPH : R.string.SPEED_LIMIT_LABEL_MPH;
        } else {
            i = R.string.SPEED_LIMIT_LABEL_KPH;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.audp
    public Integer m() {
        return Integer.valueOf(this.a.j == dowa.MILES ? R.plurals.DA_SPEED_FORMAT_MILES_PER_HOUR_EXTENDED : R.plurals.DA_SPEED_FORMAT_KILOMETERS_PER_HOUR_EXTENDED);
    }

    @Override // defpackage.audp
    public String n() {
        int i = this.a.m;
        return i == -1 ? "--" : Integer.toString(i);
    }

    @Override // defpackage.audp
    public Integer o() {
        return Integer.valueOf(this.a.m);
    }

    @Override // defpackage.audp
    public Boolean p() {
        return Boolean.valueOf(this.a.m >= 100);
    }

    @Override // defpackage.audp
    public Boolean q() {
        boolean z = false;
        if (s().booleanValue()) {
            auax auaxVar = this.a;
            if (auaxVar.m >= auaxVar.l) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.audp
    public Boolean r() {
        boolean z = false;
        if (s().booleanValue()) {
            auax auaxVar = this.a;
            if (this.a.m >= auaxVar.l + (auaxVar.j == dowa.MILES ? 5 : 10)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.audp
    public Boolean s() {
        return Boolean.valueOf(this.a.w);
    }

    @Override // defpackage.audp
    public Boolean t() {
        boolean z = false;
        if (u().booleanValue()) {
            auax auaxVar = this.a;
            if (auaxVar.o && (auaxVar.k == dqvj.TWO_WHEELER || this.a.k == dqvj.DRIVE || this.a.k == dqvj.TAXICAB || this.a.k == dqvj.BICYCLE)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.audp
    public Boolean u() {
        return Boolean.valueOf(!this.a.h);
    }

    @Override // defpackage.audp
    public View.OnAttachStateChangeListener w() {
        return this.a.x;
    }

    @Override // defpackage.audp
    public Boolean x() {
        boolean z = false;
        if (u().booleanValue() && s().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.audp
    public cqkl y() {
        if (u().booleanValue() && s().booleanValue()) {
            this.a.b.S(bvjk.eU, !this.a.o);
        }
        return cqkl.a;
    }

    @Override // defpackage.audp
    public Boolean z() {
        auax auaxVar = this.a;
        boolean z = false;
        if (auaxVar.v && auaxVar.w) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.audp
    public cqfd v() {
        int i;
        auax auaxVar = this.a;
        audm audmVar = auaxVar.r;
        if (audmVar == null || audmVar.f) {
            if (auaxVar.s) {
                auaxVar.s = false;
                i = 1;
            } else if (auaxVar.t) {
                auaxVar.t = false;
                i = 2;
            } else if (auaxVar.u) {
                auaxVar.u = false;
                i = 3;
            } else {
                i = 4;
            }
            auaxVar.r = new audm(i, this);
            audm audmVar2 = this.a.r;
            dbsk.s(audmVar2);
            return audmVar2;
        }
        return audmVar;
    }
}
