package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.SpannableString;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bnof  reason: default package */
/* loaded from: classes3.dex */
public class bnof implements bnoe {
    private final efa a;
    private final cjtd b;
    private final cjtd c;
    private final jic d;
    private final cqss e;
    private final cqss f;
    private final cqss g;
    private final int h;
    private final dvev i;
    private final Activity j;
    private final cztz k;
    private final dxio<afha> l;

    public bnof(Activity activity, efa efaVar, cztz cztzVar, dvev dvevVar, dxio<afha> dxioVar) {
        this.a = efaVar;
        this.i = dvevVar;
        this.j = activity;
        this.k = cztzVar;
        this.l = dxioVar;
        cjta b = cjtd.b();
        b.b = dvevVar.k;
        b.g(dvevVar.i);
        b.d = cjth.d(dvevVar.j);
        this.b = b.a();
        cjta b2 = cjtd.b();
        b2.b = dvevVar.n;
        b2.g(dvevVar.l);
        b2.d = cjth.d(dvevVar.m);
        this.c = b2.a();
        if (dvevVar.o.isEmpty()) {
            this.d = new jic("", ckqc.FULLY_QUALIFIED, R.drawable.product_logo_maps_color_144);
        } else {
            ckql ckqlVar = new ckql();
            ckqlVar.e = false;
            this.d = new jic(dvevVar.o, ckqc.FULLY_QUALIFIED, cqrt.f(R.drawable.product_logo_maps_color_144), 250, true, null, ckqlVar);
        }
        if ((dvevVar.a & 33554432) != 0) {
            this.h = dvevVar.w;
        } else {
            this.h = activity.getResources().getColor(R.color.qu_google_blue_500);
        }
        this.e = l(dvevVar.q, cqrt.c(R.color.bar_promotion_background));
        this.f = l(dvevVar.r, irg.J());
        this.g = l(dvevVar.s, irg.H());
    }

    private static cqss l(int i, cqss cqssVar) {
        return i == 0 ? cqssVar : cqta.d(i);
    }

    @Override // defpackage.bnoe
    public cqkl a() {
        if (!this.i.d.isEmpty()) {
            Intent a = bnod.a(this.i, this.j);
            this.a.c();
            if (this.j.getPackageManager().resolveActivity(a, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
                this.l.a().f(this.j, a, 1);
            } else {
                cztq a2 = cztt.a(this.k);
                a2.c = this.j.getString(R.string.FAILED_TO_LAUNCH_APPLICATION);
                a2.d(cztr.LONG);
                this.k.a(a2.b());
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bnoe
    public CharSequence b() {
        return this.i.b;
    }

    @Override // defpackage.bnoe
    public CharSequence c() {
        SpannableString spannableString = new SpannableString(Html.fromHtml(this.i.c));
        jmw.i(spannableString, this.h);
        return spannableString;
    }

    @Override // defpackage.bnoe
    public cqkl d() {
        this.a.c();
        return cqkl.a;
    }

    @Override // defpackage.bnoe
    public Boolean e() {
        return Boolean.valueOf(this.i.h);
    }

    @Override // defpackage.bnoe
    public jic f() {
        return this.d;
    }

    @Override // defpackage.bnoe
    public cjtd g() {
        return this.b;
    }

    @Override // defpackage.bnoe
    public cjtd h() {
        return this.c;
    }

    @Override // defpackage.bnoe
    public cqss i() {
        return this.e;
    }

    @Override // defpackage.bnoe
    public cqss j() {
        return this.f;
    }

    @Override // defpackage.bnoe
    public cqss k() {
        return this.g;
    }
}
