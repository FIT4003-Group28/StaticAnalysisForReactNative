package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mzy  reason: default package */
/* loaded from: classes3.dex */
public final class mzy {
    public final mxk a;
    public final nck b;
    public final nan c;
    public final mxl d;
    public final View e;
    public acti f;
    private final mvo g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final TextView m;
    private final View n;
    private final TextView o;
    private final View p;
    private final View q;
    private final View r;
    private final View s;
    private final View t;
    private final TextView u;
    private final View v;

    public mzy(mzz mzzVar, int i) {
        View inflate = LayoutInflater.from(mzzVar.a).inflate(i, mzzVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.o = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.p = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.r = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.s = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.t = findViewById11;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.u = textView3;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.v = findViewById12;
        mxk mxkVar = new mxk();
        this.a = mxkVar;
        nck nckVar = new nck(mzzVar.a, mzzVar.c, mzzVar.h, mzzVar.f, mzzVar.g, mzzVar.i, mzzVar.j, inflate, findViewById2, findViewById3, mzzVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: mzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzy.this.d.a();
            }
        }, new ncg() { // from class: mzw
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzy.this.c.f(!z);
            }
        }, new ncj() { // from class: mzx
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nan nanVar = mzy.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nanVar.f(z3);
            }
        }, mxkVar);
        this.b = nckVar;
        this.c = new nan(mzzVar.b, mzzVar.d, mzzVar.e, inflate, findViewById2, false, mzzVar.m, mzzVar.n);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mzv
            @Override // defpackage.mvn
            public final void a() {
                mzy.this.d.b();
            }
        });
        this.g = mvoVar;
        this.d = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(findViewById12, auib.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
