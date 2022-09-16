package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.SpannableString;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnom  reason: default package */
/* loaded from: classes3.dex */
public final class bnom implements bnoi {
    public final cqkp a;
    public final Activity b;
    public Boolean c;
    public String d;
    public long e;
    private final gn f;
    private final jic g;
    private final dvev h;
    private final CharSequence i;
    private final CharSequence j;
    private final cjtd k;
    private final cjtd l;
    private final cqss m;
    private final cqss n;
    private final cqss o;
    private final cqss p;
    private final int q;
    private final dxio<afha> r;
    private final boolean s;
    private final cztz t;
    private CountDownTimer u;
    private boolean v = false;
    private boolean w;

    public bnom(Activity activity, dvev dvevVar, gn gnVar, cztz cztzVar, bnoh bnohVar, long j, dxio<afha> dxioVar) {
        SpannableString spannableString;
        SpannableString spannableString2;
        jic jicVar;
        this.w = false;
        this.b = activity;
        this.h = dvevVar;
        this.t = cztzVar;
        this.r = dxioVar;
        cjta b = cjtd.b();
        b.b = dvevVar.k;
        b.g(dvevVar.i);
        b.d = cjth.d(dvevVar.j);
        this.k = b.a();
        cjta b2 = cjtd.b();
        b2.b = dvevVar.n;
        b2.g(dvevVar.l);
        b2.d = cjth.d(dvevVar.m);
        this.l = b2.a();
        int color = (dvevVar.a & 33554432) != 0 ? dvevVar.w : activity.getResources().getColor(R.color.qu_google_blue_500);
        this.q = color;
        if ((dvevVar.a & 8) != 0) {
            spannableString = new SpannableString(Html.fromHtml(dvevVar.c));
            jmw.i(spannableString, color);
        } else {
            spannableString = "";
        }
        this.i = spannableString;
        if ((dvevVar.a & 8388608) != 0) {
            spannableString2 = new SpannableString(Html.fromHtml(dvevVar.v));
            jmw.i(spannableString2, color);
        } else {
            spannableString2 = "";
        }
        this.j = spannableString2;
        cqss v = v(dvevVar.q, irg.a());
        this.m = v;
        this.o = v(dvevVar.r, irg.J());
        this.p = v(dvevVar.s, irg.H());
        this.n = v(dvevVar.x, ibm.x());
        if (dvevVar.o.isEmpty()) {
            this.c = true;
            jicVar = new jic("", ckqc.FULLY_QUALIFIED, R.drawable.product_logo_maps_color_144);
        } else {
            this.c = false;
            jicVar = new jic(dvevVar.o, ckqc.FULLY_QUALIFIED, v, 250, true, new bnol(this), null);
        }
        this.g = jicVar;
        boolean z = (dvevVar.a & ImageMetadata.SHADING_MODE) != 0 && dvevVar.t > 0;
        this.s = z;
        if (j == 0 || !z) {
            this.d = activity.getResources().getString(R.string.DISMISS);
            this.w = true;
        } else if (j > 0) {
            this.u = w(j);
            this.d = activity.getResources().getString(R.string.NUDGEBAR_FULLSCREEN_DISMISS_WITH_SECONDS, Integer.valueOf(Math.round(((float) j) / 1000.0f)));
        } else {
            this.u = w(TimeUnit.SECONDS.toMillis(dvevVar.t));
            this.d = activity.getResources().getString(R.string.NUDGEBAR_FULLSCREEN_DISMISS_WITH_SECONDS, Integer.valueOf(Math.round(((float) this.e) / 1000.0f)));
        }
        this.a = this;
        this.f = gnVar;
    }

    private static cqss v(int i, cqss cqssVar) {
        return i == 0 ? cqssVar : cqta.d(i);
    }

    private final CountDownTimer w(long j) {
        this.e = j;
        return new bnog(j, new bnok(this), new bnoj(this));
    }

    @Override // defpackage.bnoi
    public cqkl a() {
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (!this.h.d.isEmpty()) {
            Intent a = bnod.a(this.h, this.b);
            if (this.b.getPackageManager().resolveActivity(a, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
                this.r.a().f(this.b, a, 1);
            } else {
                cztq a2 = cztt.a(this.t);
                a2.c = this.b.getString(R.string.FAILED_TO_LAUNCH_APPLICATION);
                a2.d(cztr.LONG);
                this.t.a(a2.b());
            }
        }
        this.f.f();
        return cqkl.a;
    }

    @Override // defpackage.bnoi
    public CharSequence b() {
        return this.h.b;
    }

    @Override // defpackage.bnoi
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.bnoi
    public cqkl d() {
        if (this.w && !this.h.h) {
            this.f.f();
        }
        return cqkl.a;
    }

    @Override // defpackage.bnoi
    public Boolean e() {
        return Boolean.valueOf(this.h.h);
    }

    @Override // defpackage.bnoi
    public jic f() {
        return this.g;
    }

    @Override // defpackage.bnoi
    public cjtd g() {
        return this.k;
    }

    @Override // defpackage.bnoi
    public cjtd h() {
        return this.l;
    }

    @Override // defpackage.bnoi
    public cqss i() {
        return this.m;
    }

    @Override // defpackage.bnoi
    public cqss j() {
        return this.o;
    }

    @Override // defpackage.bnoi
    public cqss k() {
        return this.p;
    }

    @Override // defpackage.bnoi
    public CharSequence l() {
        CountDownTimer countDownTimer;
        if (!this.v && (countDownTimer = this.u) != null) {
            countDownTimer.start();
            this.v = true;
        }
        return this.d;
    }

    @Override // defpackage.bnoi
    public Boolean m() {
        return Boolean.valueOf(this.w);
    }

    @Override // defpackage.bnoi
    public CharSequence n() {
        dvev dvevVar = this.h;
        return (dvevVar.a & 2097152) != 0 ? dvevVar.u : this.b.getResources().getString(R.string.YES_BUTTON);
    }

    @Override // defpackage.bnoi
    public Boolean o() {
        return this.c;
    }

    @Override // defpackage.bnoi
    public CharSequence p() {
        return this.j;
    }

    @Override // defpackage.bnoi
    public cqss q() {
        return this.n;
    }

    @Override // defpackage.bnoi
    public Boolean r() {
        return Boolean.valueOf((this.h.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0);
    }

    public long s() {
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null && !this.w) {
            countDownTimer.cancel();
        }
        return this.e;
    }

    public void t() {
        s();
        if (!this.s || this.w) {
            return;
        }
        CountDownTimer w = w(this.e);
        this.u = w;
        w.start();
    }
}
