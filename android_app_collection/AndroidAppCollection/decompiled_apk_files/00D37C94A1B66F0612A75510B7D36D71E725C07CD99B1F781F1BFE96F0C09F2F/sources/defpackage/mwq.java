package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mwq  reason: default package */
/* loaded from: classes3.dex */
public final class mwq {
    private View A;
    private View B;
    private RatingBar C;
    private TextView D;
    private View E;
    private View F;
    private final View G;
    public nca a;
    public nck b;
    public mwj c;
    public mwk d;
    public mxl e;
    public acti f;
    public apoj g;
    public final boolean h;
    public boolean i;
    public final boolean j;
    final /* synthetic */ mwr k;
    private mvo l;
    private View m;
    private View n;
    private final View o;
    private final View p;
    private View q;
    private final View r;
    private final View s;
    private final View t;
    private View u;
    private View v;
    private TextView w;
    private TextView x;
    private View y;
    private TextView z;

    private final void b() {
        this.v = this.r.findViewById(R.id.channel_thumbnail);
        this.w = (TextView) this.r.findViewById(R.id.title);
        this.x = (TextView) this.r.findViewById(R.id.description);
        this.y = this.r.findViewById(R.id.ad_attribution);
        this.z = (TextView) this.r.findViewById(R.id.rating_text);
        this.C = (RatingBar) this.r.findViewById(R.id.rating_bar);
        this.D = (TextView) this.r.findViewById(R.id.price_text);
        View findViewById = this.r.findViewById(R.id.cta_button_wrapper);
        this.E = findViewById;
        this.F = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = this.r.findViewById(R.id.close_button);
        this.A = this.r.findViewById(R.id.contextual_menu_anchor);
        this.B = this.r.findViewById(R.id.static_contextual_menu_anchor);
    }

    private final void c() {
        this.b.B(this.w, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.B(this.x, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.B(this.y, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.B(this.z, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.B(this.C, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.B(this.D, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        this.b.B(this.t, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.B(this.F, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.B(this.v, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }

    private final void d() {
        this.l = new mvo(this.b, (ViewStub) this.o.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mwn
            @Override // defpackage.mvn
            public final void a() {
                mwq.this.e.b();
            }
        });
        this.e = new mxl(this.b, this.l, this.p);
    }

    private final void e() {
        this.a = new nca();
        mwr mwrVar = this.k;
        this.b = new nck(mwrVar.c, mwrVar.f, mwrVar.k, mwrVar.i, mwrVar.j, mwrVar.m, mwrVar.l, this.o, this.r, this.s, this.G, this.q, this.A, this.B, new View.OnClickListener() { // from class: mwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mwq.this.e.a();
            }
        }, new ncg() { // from class: mwo
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mwq mwqVar = mwq.this;
                if (mwqVar.h) {
                    mwqVar.c.g();
                } else {
                    mwqVar.d.f(false);
                }
            }
        }, new ncj() { // from class: mwp
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                mwq mwqVar = mwq.this;
                if (mwqVar.h) {
                    mwqVar.c.g();
                } else {
                    mwqVar.d.f(false);
                }
            }
        }, this.a);
    }

    public final View a() {
        return this.h ? this.m : this.o;
    }

    public mwq(mwr mwrVar, int i, boolean z, boolean z2) {
        this.k = mwrVar;
        this.h = z;
        this.j = z2;
        if (!z) {
            View inflate = LayoutInflater.from(mwrVar.c).inflate(i, mwrVar.n, false);
            this.o = inflate;
            View findViewById = inflate.findViewById(R.id.ad_view);
            this.p = findViewById;
            View findViewById2 = findViewById.findViewById(R.id.content_layout);
            this.r = findViewById2;
            this.s = findViewById.findViewById(R.id.click_overlay);
            this.t = findViewById2.findViewById(R.id.content_background);
            this.u = findViewById2.findViewById(R.id.thumbnail_wrapper);
            this.G = mwrVar.o;
            b();
            e();
            this.d = new mwk(mwrVar.e, mwrVar.g, mwrVar.h, inflate, findViewById2, mwrVar.t, mwrVar.u);
            d();
            this.b.B(this.u, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
            c();
            return;
        }
        View inflate2 = LayoutInflater.from(mwrVar.c).inflate(i, mwrVar.n, false);
        this.m = inflate2;
        View inflate3 = ((ViewStub) this.m.findViewById(R.id.promoted_discovery_app_promo_portrait_metadata_stub)).inflate();
        this.o = inflate3;
        this.n = ((ViewStub) inflate2.findViewById(R.id.promoted_discovery_app_promo_portrait_thumbnail_stub)).inflate();
        View findViewById3 = inflate3.findViewById(R.id.ad_view);
        this.p = findViewById3;
        View findViewById4 = findViewById3.findViewById(R.id.content_layout);
        this.r = findViewById4;
        this.s = findViewById3.findViewById(R.id.click_overlay);
        this.t = findViewById4.findViewById(R.id.content_background);
        this.G = mwrVar.o;
        b();
        e();
        this.c = new mwj(mwrVar.e, mwrVar.g, mwrVar.h, this.m, this.n, findViewById4, mwrVar.c, mwrVar.f, mwrVar.p, mwrVar.q, mwrVar.s, mwrVar.d, mwrVar.t, mwrVar.u);
        d();
        c();
    }
}
