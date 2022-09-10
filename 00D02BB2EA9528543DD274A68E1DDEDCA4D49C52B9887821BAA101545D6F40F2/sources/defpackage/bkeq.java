package defpackage;

import android.app.Activity;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bkeq  reason: default package */
/* loaded from: classes3.dex */
public class bkeq implements beer {
    private final acmv b;
    private final jkf d;
    private final Activity e;
    private final cys f;
    private final cwy g;
    private final boolean h;
    @dzsi
    private final Runnable i;
    private final dxio<afha> j;
    private final btvo k;
    private cjta l = cjtd.b();
    @dzsi
    private cut a = null;
    private jic c = new jic(null, ckqc.FULLY_QUALIFIED, null, 250, null);

    public bkeq(acmv acmvVar, boolean z, @dzsi Runnable runnable, jkf jkfVar, Activity activity, cyt cytVar, cwy cwyVar, dxio<afha> dxioVar, btvo btvoVar) {
        this.i = runnable;
        this.h = z;
        this.b = acmvVar;
        this.d = jkfVar;
        this.e = activity;
        this.f = cytVar.a();
        this.g = cwyVar;
        this.j = dxioVar;
        this.k = btvoVar;
    }

    private final boolean A() {
        return B().a == 7;
    }

    private final djiu B() {
        djie y = y();
        if (y != null) {
            djiu djiuVar = y.e;
            return djiuVar == null ? djiu.h : djiuVar;
        }
        return djiu.h;
    }

    private final boolean z() {
        return B().a == 8;
    }

    @Override // defpackage.beer
    public Integer a() {
        return Integer.valueOf(true != z() ? 80 : R.styleable.AppCompatTheme_windowFixedHeightMajor);
    }

    @Override // defpackage.beer
    public cqtv b() {
        return cqrp.d(z() ? 80.0d : 56.0d);
    }

    @Override // defpackage.beer
    public cqtv c() {
        return cqrp.d(z() ? 80.0d : 56.0d);
    }

    @Override // defpackage.beer
    public Boolean d() {
        return Boolean.valueOf(z());
    }

    @Override // defpackage.beer
    public String e() {
        djis djisVar;
        if (A()) {
            djiu B = B();
            if (B.a == 7) {
                djisVar = (djis) B.b;
            } else {
                djisVar = djis.d;
            }
            return djisVar.a;
        }
        return B().d;
    }

    @Override // defpackage.beer
    public CharSequence f() {
        djis djisVar;
        if (z()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.k.getAdsParameters().l) {
                cwy.c(spannableStringBuilder, this.e.getResources());
            } else {
                this.g.b(spannableStringBuilder, this.e.getResources());
                spannableStringBuilder.append((CharSequence) " ");
            }
            alp a = alp.a();
            djiu B = B();
            if (B.a == 8) {
                djisVar = (djis) B.b;
            } else {
                djisVar = djis.d;
            }
            spannableStringBuilder.append((CharSequence) a.b(Html.fromHtml(djisVar.a).toString()));
            return spannableStringBuilder;
        }
        return "";
    }

    @Override // defpackage.beer
    public String g() {
        djis djisVar;
        djis djisVar2;
        if (z()) {
            djiu B = B();
            if (B.a == 8) {
                djisVar2 = (djis) B.b;
            } else {
                djisVar2 = djis.d;
            }
            return djisVar2.b;
        } else if (A()) {
            djiu B2 = B();
            if (B2.a == 7) {
                djisVar = (djis) B2.b;
            } else {
                djisVar = djis.d;
            }
            return djisVar.b;
        } else {
            return B().e;
        }
    }

    @Override // defpackage.beer
    public Boolean h() {
        return true;
    }

    @Override // defpackage.beer
    public Boolean i() {
        return false;
    }

    @Override // defpackage.beer
    public String j() {
        djis djisVar;
        djiu B = B();
        if (B.a == 8) {
            djisVar = (djis) B.b;
        } else {
            djisVar = djis.d;
        }
        return djisVar.c;
    }

    @Override // defpackage.beer
    public String k() {
        return B().g;
    }

    @Override // defpackage.beer
    public acmv l() {
        return this.b;
    }

    @Override // defpackage.beer
    public jic m() {
        return this.c;
    }

    @Override // defpackage.beer
    @dzsi
    public cjtd o() {
        return null;
    }

    @Override // defpackage.beer
    public Boolean p() {
        return false;
    }

    @Override // defpackage.beer
    public cqkl q() {
        if (!B().f.isEmpty()) {
            this.j.a().k(this.e, B().f, 1);
        } else {
            Runnable runnable = this.i;
            if (runnable != null) {
                runnable.run();
            } else {
                this.d.v();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.beer
    public Boolean r() {
        djie y = y();
        boolean z = false;
        if (y != null && (y.a & 32) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.beer
    public cyg s() {
        return this.f;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null || !iloVar.cE()) {
            u();
            return;
        }
        x(iloVar.cD());
        this.l = cjtd.c(iloVar.bZ());
    }

    @Override // defpackage.bega
    public void u() {
        x(null);
        this.l = cjtd.c(null);
    }

    @Override // defpackage.beer
    public Boolean v() {
        boolean z = false;
        if (w().booleanValue() && !p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bega
    public Boolean w() {
        cut cutVar;
        djie y = y();
        boolean z = false;
        if (y != null && (y.a & 8) != 0 && (cutVar = this.a) != null && cutVar.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void x(@dzsi cut cutVar) {
        djie djieVar;
        this.a = cutVar;
        if (cutVar != null) {
            djieVar = cutVar.b;
            if (djieVar == null) {
                djieVar = djie.k;
            }
        } else {
            djieVar = null;
        }
        if (djieVar != null) {
            cut cutVar2 = this.a;
            String str = cutVar2 != null ? cutVar2.c : "";
            if ((djieVar.a & 32) != 0) {
                dqmo bZ = dqmr.h.bZ();
                dqmr dqmrVar = djieVar.g;
                if (dqmrVar == null) {
                    dqmrVar = dqmr.h;
                }
                bZ.bC(dqmrVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqmr dqmrVar2 = (dqmr) bZ.b;
                str.getClass();
                dqmrVar2.a |= 8;
                dqmrVar2.f = str;
                this.f.f(bZ.bK());
            }
        }
        this.c = new jic(B().c, ckqc.FULLY_QUALIFIED, null, 250, null);
    }

    @dzsi
    final djie y() {
        cut cutVar = this.a;
        if (cutVar == null) {
            return null;
        }
        djie djieVar = cutVar.b;
        return djieVar == null ? djie.k : djieVar;
    }

    @Override // defpackage.beer
    public cjtd n() {
        this.l.d = this.h ? dtyi.cT : dtyi.cS;
        cut cutVar = this.a;
        if (cutVar != null) {
            djie djieVar = cutVar.b;
            if (djieVar == null) {
                djieVar = djie.k;
            }
            akqi f = akqi.f(djieVar.b);
            if (akqi.d(f)) {
                this.l.g = f.n();
            }
        }
        return this.l.a();
    }
}
