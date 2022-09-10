package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
/* compiled from: PG */
/* renamed from: sbl  reason: default package */
/* loaded from: classes7.dex */
public class sbl implements saa {
    private static final Integer h = 3500;
    public final rzn a;
    public final dpol b;
    public final int c;
    public dngu d;
    public dngu e;
    public boolean f;
    public boolean g;
    private final Context i;
    private final SimpleDateFormat j;
    private final ValueAnimator k;
    private boolean l;
    private boolean m;
    private int n;
    private final cqkn<saa> o = new sbh(this);
    private final cqkn<saa> p = new sbi(this);
    private final AnimatorListenerAdapter q;

    public sbl(Application application, cqhn cqhnVar, cqhu cqhuVar, rzn rznVar, dpol dpolVar, int i) {
        sbj sbjVar = new sbj(this);
        this.q = sbjVar;
        this.i = application;
        this.a = rznVar;
        this.b = dpolVar;
        this.l = false;
        dngt bZ = dngu.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngu dnguVar = (dngu) bZ.b;
        int i2 = dnguVar.a | 1;
        dnguVar.a = i2;
        dnguVar.b = 9;
        dnguVar.a = i2 | 2;
        dnguVar.c = 0;
        this.d = bZ.bK();
        dngt bZ2 = dngu.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dngu dnguVar2 = (dngu) bZ2.b;
        int i3 = dnguVar2.a | 1;
        dnguVar2.a = i3;
        dnguVar2.b = 17;
        dnguVar2.a = i3 | 2;
        dnguVar2.c = 0;
        this.e = bZ2.bK();
        this.j = sht.f(application);
        this.f = false;
        this.m = false;
        this.g = false;
        this.n = i;
        int c = akm.c(application, R.color.qu_daynight_google_blue_500);
        this.c = c;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(c), Integer.valueOf(akm.c(application, R.color.qu_daynight_black_alpha_87)));
        this.k = ofObject;
        ofObject.addListener(sbjVar);
        ofObject.setDuration(h.intValue());
        ofObject.setInterpolator(irf.a);
    }

    @Override // defpackage.saa
    public String a() {
        return sht.e(this.b, this.j);
    }

    @Override // defpackage.saa
    public Boolean b() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.saa
    public void c(boolean z) {
        this.l = z;
    }

    @Override // defpackage.saa
    public void d(boolean z) {
        this.f = z;
    }

    @Override // defpackage.saa
    public void e(dngu dnguVar) {
        this.d = dnguVar;
    }

    @Override // defpackage.saa
    public void f(dngu dnguVar) {
        this.e = dnguVar;
    }

    @Override // defpackage.saa
    public dngu g() {
        return this.d;
    }

    @Override // defpackage.saa
    public dngu h() {
        return this.e;
    }

    @Override // defpackage.saa
    public ValueAnimator i() {
        this.k.removeAllUpdateListeners();
        TextView t = t();
        sbk sbkVar = t != null ? new sbk(t) : null;
        if (sbkVar != null) {
            this.k.addUpdateListener(sbkVar);
        }
        return this.k;
    }

    @Override // defpackage.saa
    public dpol j() {
        return this.b;
    }

    @Override // defpackage.saa
    public CharSequence k() {
        return sht.b(this.i, this.d, this.e);
    }

    @Override // defpackage.saa
    public cqkn<saa> l() {
        return this.o;
    }

    @Override // defpackage.saa
    public cqkn<saa> m() {
        return this.p;
    }

    @Override // defpackage.saa
    public void n(boolean z) {
        this.m = z;
    }

    @Override // defpackage.saa
    public Boolean o() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.saa
    public Boolean p() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.saa
    public void q(boolean z) {
        this.g = false;
    }

    @Override // defpackage.saa
    public cjtd r() {
        cjta b = cjtd.b();
        b.d = dtxl.ca;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.l ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.i(this.n);
        return b.a();
    }

    @Override // defpackage.saa
    public cjtd s() {
        cjta b = cjtd.b();
        b.d = dtxl.cd;
        b.i(this.n);
        return b.a();
    }

    public final TextView t() {
        View o = cqkx.o(this);
        if (o != null) {
            return (TextView) cqkx.e(o, rpe.a, TextView.class);
        }
        return null;
    }
}
