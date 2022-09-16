package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mwh  reason: default package */
/* loaded from: classes3.dex */
public final class mwh {
    public final mxk a;
    public final nck b;
    public final mws c;
    public final mxl d;
    public final View e;
    public acti f;
    private final mvo g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final View q;
    private final View r;
    private final RatingBar s;
    private final TextView t;
    private final View u;

    public mwh(mwi mwiVar, int i) {
        View inflate = LayoutInflater.from(mwiVar.a).inflate(i, mwiVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.j = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.k = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.l = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.m = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.p = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating_bar);
        this.s = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price_text);
        this.t = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.icon_text_badge_layout);
        this.u = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.i = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.q = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.r = findViewById10;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(mwiVar.a, mwiVar.c, mwiVar.h, mwiVar.f, mwiVar.g, mwiVar.j, mwiVar.i, inflate, findViewById2, findViewById3, mwiVar.l, findViewById8, findViewById9, findViewById10, new View.OnClickListener() { // from class: mwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mwh.this.d.a();
            }
        }, new ncg() { // from class: mwf
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mwh.this.c.f(!z);
            }
        }, new ncj() { // from class: mwg
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                mws mwsVar = mwh.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                mwsVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new mws(mwiVar.b, mwiVar.d, mwiVar.e, inflate, findViewById2, mwiVar.m, mwiVar.n);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mwe
            @Override // defpackage.mvn
            public final void a() {
                mwh.this.d.b();
            }
        });
        this.g = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        nckVar.B(findViewById7, auib.PROMOTED_SPARKLES_CLICK_LOCATION_CUSTOM_BADGE);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
    }
}
