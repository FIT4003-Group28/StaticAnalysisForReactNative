package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mzs  reason: default package */
/* loaded from: classes3.dex */
public final class mzs {
    public final mxk a;
    public final nck b;
    public final myv c;
    public final mxl d;
    public final View e;
    public final View f;
    public final View g;
    public acti h;
    private final mvo i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final TextView q;
    private final RatingBar r;
    private final TextView s;
    private final View t;
    private final View u;
    private final View v;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzs(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, View view, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_wide_form, (ViewGroup) null, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.j = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.k = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.l = findViewById3;
        this.f = findViewById2.findViewById(R.id.content_metadata_grid_layout);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.m = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.g = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.p = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.q = textView3;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.r = ratingBar;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.price);
        this.s = textView4;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.u = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.v = findViewById9;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, view, findViewById9, null, null, new View.OnClickListener() { // from class: mzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mzs.this.d.a();
            }
        }, new ncg() { // from class: mzq
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzs.this.c.f(!z);
            }
        }, new ncj() { // from class: mzr
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = mzs.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new myv(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, true, fjnVar, akemVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mzp
            @Override // defpackage.mvn
            public final void a() {
                mzs.this.d.b();
            }
        });
        this.i = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        if (textView2 != null) {
            nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }
}
