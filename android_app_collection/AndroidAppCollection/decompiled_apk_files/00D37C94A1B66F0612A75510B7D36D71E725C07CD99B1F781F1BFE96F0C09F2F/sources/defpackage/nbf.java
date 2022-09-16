package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nbf  reason: default package */
/* loaded from: classes3.dex */
public final class nbf {
    public final mxk a;
    public final nck b;
    public final mxv c;
    public final mxl d;
    public final View e;
    public acti f;
    private final mvo g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final TextView l;
    private final View m;
    private final TextView n;
    private final View o;
    private final View p;
    private final View q;
    private final TextView r;
    private final View s;
    private final View t;

    public nbf(nbg nbgVar, int i) {
        View inflate = LayoutInflater.from(nbgVar.a).inflate(i, nbgVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.l = textView;
        View findViewById5 = findViewById2.findViewById(R.id.ad_attribution);
        this.m = findViewById5;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.n = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.r = textView3;
        View findViewById6 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.s = findViewById6;
        View findViewById7 = findViewById6.findViewById(R.id.cta_button_touchable_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.o = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.p = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.q = findViewById10;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(nbgVar.a, nbgVar.c, nbgVar.h, nbgVar.f, nbgVar.g, nbgVar.i, nbgVar.j, inflate, findViewById2, findViewById3, nbgVar.l, findViewById8, findViewById9, findViewById10, new View.OnClickListener() { // from class: nbb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nbf.this.d.a();
            }
        }, new ncg() { // from class: nbd
            @Override // defpackage.ncg
            public final void a(boolean z) {
                nbf.this.c.f(!z);
            }
        }, new ncj() { // from class: nbe
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                mxv mxvVar = nbf.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                mxvVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new mxv(nbgVar.b, nbgVar.d, nbgVar.e, inflate, findViewById2, nbgVar.m, nbgVar.n);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nbc
            @Override // defpackage.mvn
            public final void a() {
                nbf.this.d.b();
            }
        });
        this.g = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById7, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
