package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mzm  reason: default package */
/* loaded from: classes3.dex */
public final class mzm {
    public final mxk a;
    public final nck b;
    public final myv c;
    public final mxl d;
    public final View e;
    public final View f;
    public acti g;
    private final mvo h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final TextView m;
    private final View n;
    private final TextView o;
    private final RatingBar p;
    private final TextView q;
    private final View r;
    private final View s;
    private final View t;
    private final View u;
    private final View v;
    private final TextView w;
    private final View x;

    public mzm(myb mybVar, int i) {
        View inflate = LayoutInflater.from(mybVar.a).inflate(i, mybVar.j, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.l = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.m = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.n = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.t = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.u = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.v = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(mybVar.a, mybVar.c, mybVar.h, mybVar.f, mybVar.g, mybVar.m, mybVar.i, inflate, findViewById2, findViewById3, mybVar.k, findViewById9, findViewById10, findViewById11, new View.OnClickListener(null, null) { // from class: mxx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzm.this.d.a();
            }
        }, new ncg(null, null) { // from class: mxz
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzm.this.c.f(!z);
            }
        }, new ncj(null, null) { // from class: mya
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = mzm.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new myv(mybVar.b, mybVar.d, mybVar.e, inflate, findViewById2, false, mybVar.l, mybVar.n);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn(null, null) { // from class: mxy
            @Override // defpackage.mvn
            public final void a() {
                mzm.this.d.b();
            }
        });
        this.h = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(findViewById12, auib.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public mzm(myg mygVar, int i) {
        View inflate = LayoutInflater.from(mygVar.a).inflate(i, mygVar.j, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.l = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.m = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.n = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.t = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.u = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.v = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(mygVar.a, mygVar.c, mygVar.h, mygVar.f, mygVar.g, mygVar.n, mygVar.i, inflate, findViewById2, findViewById3, mygVar.k, findViewById9, findViewById10, findViewById11, new View.OnClickListener(null) { // from class: myc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzm.this.d.a();
            }
        }, new ncg(null) { // from class: mye
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzm.this.c.f(!z);
            }
        }, new ncj(null) { // from class: myf
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = mzm.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new myv(mygVar.b, mygVar.d, mygVar.e, inflate, findViewById2, false, mygVar.l, mygVar.m);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn(null) { // from class: myd
            @Override // defpackage.mvn
            public final void a() {
                mzm.this.d.b();
            }
        });
        this.h = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(findViewById12, auib.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public mzm(mzn mznVar) {
        View inflate = LayoutInflater.from(mznVar.a).inflate(R.layout.promoted_sparkles_text_ctd_watch_themed_cta_compact_form, mznVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.l = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.m = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.n = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.t = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.u = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.v = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(mznVar.a, mznVar.c, mznVar.h, mznVar.f, mznVar.g, mznVar.i, mznVar.j, inflate, findViewById2, findViewById3, mznVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: mzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzm.this.d.a();
            }
        }, new ncg() { // from class: mzk
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzm.this.c.f(!z);
            }
        }, new ncj() { // from class: mzl
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = mzm.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new myv(mznVar.b, mznVar.d, mznVar.e, inflate, findViewById2, false, mznVar.m, mznVar.n);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mzj
            @Override // defpackage.mvn
            public final void a() {
                mzm.this.d.b();
            }
        });
        this.h = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(findViewById12, auib.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }
}
