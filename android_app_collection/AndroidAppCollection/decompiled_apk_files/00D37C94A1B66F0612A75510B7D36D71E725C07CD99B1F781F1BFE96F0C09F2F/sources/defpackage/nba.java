package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: nba  reason: default package */
/* loaded from: classes3.dex */
public final class nba implements ajru {
    public final nau a;
    public final mxl b;
    private final mvo c;
    private final mxk d;
    private final nck e;
    private final View f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final TextView l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final View p;
    private final View q;
    private final View r;
    private final TextView s;
    private final View t;
    private final View u;
    private acti v;

    /* JADX INFO: Access modifiers changed from: protected */
    public nba(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_product_watch, viewGroup, false);
        this.f = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.g = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.h = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.i = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.j = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.k = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.l = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.m = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.advertiser);
        this.n = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.o = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.p = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.r = findViewById9;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.s = textView4;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.t = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.u = findViewById11;
        mxk mxkVar = new mxk();
        this.d = mxkVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, inflate, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: naw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nba.this.b.a();
            }
        }, new ncg() { // from class: nay
            @Override // defpackage.ncg
            public final void a(boolean z) {
                nba.this.a.f(!z);
            }
        }, new ncj() { // from class: naz
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nau nauVar = nba.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nauVar.f(z3);
            }
        }, mxkVar);
        this.e = nckVar;
        this.a = new nau(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, fjnVar, akemVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nax
            @Override // defpackage.mvn
            public final void a() {
                nba.this.b.b();
            }
        });
        this.c = mvoVar;
        this.b = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        aozy aozyVar;
        apoj apojVar;
        auja aujaVar = (auja) obj;
        aujaVar.getClass();
        auiy auiyVar = aujaVar.c;
        if (auiyVar == null) {
            auiyVar = auiy.a;
        }
        auiy auiyVar2 = auiyVar;
        auif[] auifVarArr = (auif[]) aujaVar.d.toArray(new auif[0]);
        aunb aunbVar = aujaVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apzg apzgVar = null;
        if (aunbVar.qn(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aunb aunbVar2 = aujaVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atngVar = (atng) aunbVar2.qm(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        if ((aujaVar.b & 4) != 0) {
            aozy aozyVar2 = aujaVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        this.v = ajrsVar.a;
        aunb aunbVar3 = auiyVar2.n;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = auiyVar2.n;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = this.d;
        if ((auiyVar2.b & 512) != 0 && (apzgVar = auiyVar2.l) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auiyVar2.q);
        this.e.H(ajrsVar.a, aujaVar, aujaVar.h, auiyVar2, auifVarArr, aozyVar, aujaVar.g.I());
        this.a.i(this.v, aujaVar, auiyVar2, atngVar);
        this.b.c(this.v, apojVar, atngVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
    }
}
