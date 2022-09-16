package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mwb  reason: default package */
/* loaded from: classes3.dex */
public final class mwb {
    private View A;
    private TextView B;
    private View C;
    private View D;
    private View E;
    private View F;
    private final View G;
    public nck a;
    public mvs b;
    public mvt c;
    public mxl d;
    public fmr e;
    public String f;
    public acti g;
    public apoj h;
    public final boolean i;
    public boolean j;
    public final boolean k;
    final /* synthetic */ mwc l;
    public nca m;
    private mvo n;
    private View o;
    private View p;
    private final View q;
    private final View r;
    private View s;
    private final View t;
    private final View u;
    private final View v;
    private View w;
    private View x;
    private TextView y;
    private TextView z;

    private final void b() {
        this.x = this.t.findViewById(R.id.channel_thumbnail);
        this.y = (TextView) this.t.findViewById(R.id.title);
        this.z = (TextView) this.t.findViewById(R.id.description);
        this.A = this.t.findViewById(R.id.ad_attribution);
        this.B = (TextView) this.t.findViewById(R.id.advertiser_name_or_website);
        View findViewById = this.t.findViewById(R.id.cta_button_wrapper);
        this.E = findViewById;
        this.F = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = this.t.findViewById(R.id.close_button);
        this.C = this.t.findViewById(R.id.contextual_menu_anchor);
        this.D = this.t.findViewById(R.id.static_contextual_menu_anchor);
        View findViewById2 = this.t.findViewById(R.id.discovery_action_toggle_button);
        fmr a = this.l.v.a(findViewById2);
        this.e = a;
        a.e = new fmq() { // from class: mvx
            @Override // defpackage.fmq
            public final void a(boolean z) {
                mwb mwbVar = mwb.this;
                mwt mwtVar = (mwt) mwbVar.l.m.a(new eno(mwbVar.f, mwt.class), mwt.class, "PDTBState");
                if (mwtVar != null) {
                    mwtVar.a = z;
                }
            }
        };
        findViewById2.setOnClickListener(null);
        findViewById2.setClickable(false);
    }

    private final void c() {
        this.a.B(this.y, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.a.B(this.z, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.a.B(this.A, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.a.B(this.B, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
        this.a.B(this.v, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.a.B(this.F, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.a.B(this.x, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }

    private final void d() {
        this.n = new mvo(this.a, (ViewStub) this.q.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mvy
            @Override // defpackage.mvn
            public final void a() {
                mwb.this.d.b();
            }
        });
        this.d = new mxl(this.a, this.n, this.r);
    }

    private final void e() {
        this.m = new nca(1);
        mwc mwcVar = this.l;
        this.a = new nck(mwcVar.c, mwcVar.f, mwcVar.k, mwcVar.i, mwcVar.j, mwcVar.m, mwcVar.l, this.q, this.t, this.u, this.G, this.s, this.C, this.D, this.e, new View.OnClickListener() { // from class: mvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mwb.this.d.a();
            }
        }, new ncg() { // from class: mvz
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mwb mwbVar = mwb.this;
                if (mwbVar.i) {
                    mwbVar.b.g();
                } else {
                    mwbVar.c.f(false);
                }
            }
        }, new ncj() { // from class: mwa
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                mwb mwbVar = mwb.this;
                if (mwbVar.i) {
                    mwbVar.b.g();
                } else {
                    mwbVar.c.f(false);
                }
            }
        }, this.m, false);
    }

    public final View a() {
        return this.i ? this.o : this.q;
    }

    public mwb(mwc mwcVar, int i, boolean z, boolean z2) {
        this.l = mwcVar;
        this.i = z;
        this.k = z2;
        if (!z) {
            View inflate = LayoutInflater.from(mwcVar.c).inflate(i, mwcVar.n, false);
            this.q = inflate;
            View findViewById = inflate.findViewById(R.id.ad_view);
            this.r = findViewById;
            View findViewById2 = findViewById.findViewById(R.id.content_layout);
            this.t = findViewById2;
            this.u = findViewById.findViewById(R.id.click_overlay);
            this.v = findViewById2.findViewById(R.id.content_background);
            this.w = findViewById2.findViewById(R.id.thumbnail_wrapper);
            this.G = mwcVar.o;
            b();
            e();
            this.c = new mvt(mwcVar.e, mwcVar.g, mwcVar.h, inflate, findViewById2, mwcVar.t, mwcVar.u);
            d();
            this.a.B(this.w, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
            c();
            return;
        }
        View inflate2 = LayoutInflater.from(mwcVar.c).inflate(i, mwcVar.n, false);
        this.o = inflate2;
        View inflate3 = ((ViewStub) this.o.findViewById(R.id.promoted_discovery_action_portrait_metadata_stub)).inflate();
        this.q = inflate3;
        this.p = ((ViewStub) inflate2.findViewById(R.id.promoted_discovery_action_portrait_thumbnail_stub)).inflate();
        View findViewById3 = inflate3.findViewById(R.id.ad_view);
        this.r = findViewById3;
        View findViewById4 = findViewById3.findViewById(R.id.content_layout);
        this.t = findViewById4;
        this.u = findViewById3.findViewById(R.id.click_overlay);
        this.v = findViewById4.findViewById(R.id.content_background);
        this.G = mwcVar.o;
        b();
        e();
        this.b = new mvs(mwcVar.e, mwcVar.g, mwcVar.h, this.o, this.p, findViewById4, mwcVar.c, mwcVar.f, mwcVar.p, mwcVar.q, mwcVar.s, mwcVar.d, mwcVar.t, mwcVar.u);
        d();
        c();
    }
}
