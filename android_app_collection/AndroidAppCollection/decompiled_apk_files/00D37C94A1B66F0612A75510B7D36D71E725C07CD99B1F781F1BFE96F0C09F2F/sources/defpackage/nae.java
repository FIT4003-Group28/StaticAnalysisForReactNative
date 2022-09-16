package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nae  reason: default package */
/* loaded from: classes3.dex */
public final class nae {
    public final mxk a;
    public final nck b;
    public final nan c;
    public final mxl d;
    public auik e;
    public boolean f;
    public boolean g;
    public final View h;
    public final View i;
    public acti j;
    final /* synthetic */ naf k;
    private final mvo l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final TextView q;
    private final View r;
    private final TextView s;
    private final View t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final TextView y;

    public nae(naf nafVar, int i) {
        this.k = nafVar;
        View inflate = LayoutInflater.from(nafVar.a).inflate(i, nafVar.m, false);
        this.h = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.m = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.s = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.u = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.v = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.w = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.x = findViewById11;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.y = textView3;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(nafVar.a, nafVar.c, nafVar.h, nafVar.f, nafVar.g, nafVar.i, nafVar.j, inflate, findViewById2, findViewById3, nafVar.n, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: naa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nae.this.d.a();
            }
        }, new ncg() { // from class: nac
            @Override // defpackage.ncg
            public final void a(boolean z) {
            }
        }, new ncj() { // from class: nad
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nan nanVar = nae.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nanVar.f(z3);
            }
        }, mxkVar, nafVar.k);
        this.b = nckVar;
        this.c = new nan(nafVar.a, nafVar.b, nafVar.d, nafVar.e, inflate, findViewById2, false, nafVar.k, nafVar.o, nafVar.p);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nab
            @Override // defpackage.mvn
            public final void a() {
                nae.this.d.b();
            }
        });
        this.l = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }

    public final void a(naf nafVar, boolean z) {
        if (!this.f) {
            return;
        }
        if (z) {
            this.k.l.i(nafVar);
        } else {
            this.k.l.j(nafVar);
        }
    }
}
