package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: myt  reason: default package */
/* loaded from: classes3.dex */
public final class myt {
    private final TextView A;
    private final View B;
    public final mxk a;
    public final nck b;
    public final myv c;
    public final mxl d;
    public final View e;
    public final View f;
    public auil g;
    public boolean h;
    public boolean i;
    public acti j;
    final /* synthetic */ myu k;
    private final mvo l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final TextView q;
    private final View r;
    private final TextView s;
    private final RatingBar t;
    private final TextView u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private final View z;

    public myt(myu myuVar, int i) {
        this.k = myuVar;
        View inflate = LayoutInflater.from(myuVar.a).inflate(i, myuVar.l, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.m = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.n = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.o = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.p = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.q = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.r = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.s = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.t = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.u = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.v = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.w = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.x = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.y = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.z = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.A = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.B = findViewById12;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(myuVar.a, myuVar.c, myuVar.h, myuVar.f, myuVar.g, myuVar.i, myuVar.j, inflate, findViewById2, findViewById3, myuVar.m, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: myp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myt.this.d.a();
            }
        }, new ncg() { // from class: myr
            @Override // defpackage.ncg
            public final void a(boolean z) {
                myt.this.c.f(!z);
            }
        }, new ncj() { // from class: mys
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = myt.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar, myuVar.o);
        this.b = nckVar;
        this.c = new myv(myuVar.a, myuVar.b, myuVar.d, myuVar.e, inflate, findViewById2, false, myuVar.o, myuVar.n, myuVar.p);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: myq
            @Override // defpackage.mvn
            public final void a() {
                myt.this.d.b();
            }
        });
        this.l = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.C(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL, true);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(findViewById12, auib.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public final void a(myu myuVar, boolean z) {
        if (!this.h) {
            return;
        }
        if (z) {
            this.k.k.i(myuVar);
        } else {
            this.k.k.j(myuVar);
        }
    }
}
