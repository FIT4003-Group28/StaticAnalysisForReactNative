package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: myn  reason: default package */
/* loaded from: classes3.dex */
public final class myn {
    private final View A;
    private acti B;
    public final nck a;
    public final myv b;
    public final mxl c;
    public final View d;
    public auil e;
    public boolean f;
    public boolean g;
    final /* synthetic */ myo h;
    private final mvo i;
    private final mxk j;
    private final View k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final TextView p;
    private final View q;
    private final TextView r;
    private final RatingBar s;
    private final TextView t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private final TextView z;

    public myn(myo myoVar, int i) {
        this.h = myoVar;
        View inflate = LayoutInflater.from(myoVar.a).inflate(i, myoVar.k, false);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.k = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.l = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.m = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.n = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.o = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.p = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.q = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.r = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.s = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.t = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.u = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.v = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.w = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.x = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.y = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.z = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.A = findViewById12;
        mxk mxkVar = new mxk();
        this.j = mxkVar;
        nck nckVar = new nck(myoVar.a, myoVar.c, myoVar.h, myoVar.f, myoVar.g, myoVar.i, myoVar.j, inflate, findViewById2, findViewById3, myoVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: myj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myn.this.c.a();
            }
        }, new ncg() { // from class: myl
            @Override // defpackage.ncg
            public final void a(boolean z) {
                myn.this.b.f(!z);
            }
        }, new ncj() { // from class: mym
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = myn.this.b;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar, myoVar.o);
        this.a = nckVar;
        this.b = new myv(myoVar.a, myoVar.b, myoVar.d, myoVar.e, inflate, findViewById2, false, myoVar.o, myoVar.m, myoVar.q);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: myk
            @Override // defpackage.mvn
            public final void a() {
                myn.this.c.b();
            }
        });
        this.i = mvoVar;
        this.c = new mxl(nckVar, mvoVar, findViewById);
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

    public final void a(ajrs ajrsVar, Object obj, String str, auil auilVar, auif[] auifVarArr, atng atngVar, aozy aozyVar, byte[] bArr) {
        apoj apojVar;
        this.B = ajrsVar.a;
        aunb aunbVar = auilVar.s;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apzg apzgVar = null;
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = auilVar.s;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = this.j;
        if ((auilVar.b & 32768) != 0 && (apzgVar = auilVar.q) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auilVar.v);
        this.a.G(ajrsVar.a, obj, str, auilVar, auifVarArr, aozyVar, bArr);
        this.b.l(this.B, obj, auilVar, atngVar, Integer.valueOf(zhn.j(this.l.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        this.c.c(this.B, apojVar, atngVar);
    }

    public final void b(myo myoVar, boolean z) {
        if (!this.f) {
            return;
        }
        if (z) {
            this.h.p.i(myoVar);
        } else {
            this.h.p.j(myoVar);
        }
    }
}
