package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: mzc  reason: default package */
/* loaded from: classes3.dex */
public final class mzc implements ajru {
    private Object A;
    private auil B;
    private auhx C;
    private apoj D;
    private atng E;
    public final myv a;
    public final mxl b;
    public final View c;
    public boolean d;
    private final mvo e;
    private final mxc f;
    private final nck g;
    private final mwz h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final View p;
    private final TextView q;
    private final TextView r;
    private final RatingBar s;
    private final TextView t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private acti z;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzc(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, boolean z, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_15_click, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.description);
        this.o = textView2;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.p = findViewById6;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.q = textView3;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.r = textView4;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.s = ratingBar;
        TextView textView5 = (TextView) findViewById2.findViewById(R.id.price);
        this.t = textView5;
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
        mxc mxcVar = new mxc(enmVar, new mxb() { // from class: myy
            @Override // defpackage.mxb
            public final void a(boolean z2) {
                mzc mzcVar = mzc.this;
                mzcVar.d = true;
                mzcVar.d(z2);
                mzcVar.c.requestLayout();
            }
        });
        this.f = mxcVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, inflate, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: myw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzc.this.b.a();
            }
        }, new ncg() { // from class: myz
            @Override // defpackage.ncg
            public final void a(boolean z2) {
                mzc.this.a.f(!z2);
            }
        }, new ncj() { // from class: mza
            @Override // defpackage.ncj
            public final void a(boolean z2, boolean z3) {
                myv myvVar = mzc.this.a;
                boolean z4 = false;
                if (!z2 && !z3) {
                    z4 = true;
                }
                myvVar.f(z4);
            }
        }, mxcVar, z);
        this.g = nckVar;
        this.a = new myv(context, ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, true, z, fjnVar, akemVar);
        this.h = new mwz(ajxzVar, findViewById2, fjnVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: myx
            @Override // defpackage.mvn
            public final void a() {
                mzc.this.b.b();
            }
        });
        this.e = mvoVar;
        this.b = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(textView5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(ratingBar, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    public final void d(boolean z) {
        arhs arhsVar;
        arhs arhsVar2;
        arag aragVar;
        arag aragVar2;
        aoyl aoylVar;
        auij auijVar;
        this.h.a();
        this.a.v(this.z, this.A, this.B, this.E);
        auhy auhyVar = null;
        this.h.m = this.B.z ? 3 : null;
        mwz mwzVar = this.h;
        auil auilVar = this.B;
        auhx auhxVar = this.C;
        boolean z2 = this.d;
        if ((auilVar.b & 8) != 0) {
            arhs arhsVar3 = auilVar.f;
            if (arhsVar3 == null) {
                arhsVar3 = arhs.a;
            }
            arhsVar = arhsVar3;
        } else {
            arhsVar = null;
        }
        if ((auhxVar.b & 1) != 0) {
            arhs arhsVar4 = auhxVar.c;
            if (arhsVar4 == null) {
                arhsVar4 = arhs.a;
            }
            arhsVar2 = arhsVar4;
        } else {
            arhsVar2 = null;
        }
        if ((auhxVar.b & 2) != 0) {
            aragVar = auhxVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auhxVar.b & 4) != 0) {
            aragVar2 = auhxVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        aunb aunbVar = auhxVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar2 = auhxVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aoylVar = (aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar = null;
        }
        if ((auhxVar.b & 16) != 0) {
            auij auijVar2 = auhxVar.i;
            if (auijVar2 == null) {
                auijVar2 = auij.a;
            }
            auijVar = auijVar2;
        } else {
            auijVar = null;
        }
        if ((auhxVar.b & 32) != 0 && (auhyVar = auhxVar.j) == null) {
            auhyVar = auhy.a;
        }
        mwzVar.b(arhsVar, arhsVar2, b, b2, aoylVar, auijVar, auhyVar, z, z2);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apoj apojVar;
        apzg apzgVar;
        aozy aozyVar;
        auir auirVar = (auir) obj;
        auirVar.getClass();
        this.z = ajrsVar.a;
        this.A = auirVar;
        auil auilVar = auirVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        this.B = auilVar;
        auhx auhxVar = auirVar.d;
        if (auhxVar == null) {
            auhxVar = auhx.a;
        }
        this.C = auhxVar;
        aunb aunbVar = this.B.s;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = this.B.s;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        this.D = apojVar;
        aunb aunbVar3 = auirVar.f;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        this.E = (atng) ajjh.l(aunbVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        mxc mxcVar = this.f;
        String str = auirVar.h;
        auil auilVar2 = auirVar.c;
        if (auilVar2 == null) {
            auilVar2 = auil.a;
        }
        if ((auilVar2.b & 32768) != 0) {
            auil auilVar3 = auirVar.c;
            if (auilVar3 == null) {
                auilVar3 = auil.a;
            }
            apzg apzgVar2 = auilVar3.q;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            apzgVar = apzgVar2;
        } else {
            apzgVar = null;
        }
        auil auilVar4 = auirVar.c;
        if (auilVar4 == null) {
            auilVar4 = auil.a;
        }
        aopu aopuVar = auilVar4.v;
        auhx auhxVar2 = auirVar.d;
        if (auhxVar2 == null) {
            auhxVar2 = auhx.a;
        }
        aopu aopuVar2 = auhxVar2.f;
        auhx auhxVar3 = auirVar.d;
        if (auhxVar3 == null) {
            auhxVar3 = auhx.a;
        }
        mxcVar.k(str, apzgVar, aopuVar, aopuVar2, auhxVar3.g);
        nck nckVar = this.g;
        acti actiVar = ajrsVar.a;
        String str2 = auirVar.h;
        auil auilVar5 = auirVar.c;
        if (auilVar5 == null) {
            auilVar5 = auil.a;
        }
        auil auilVar6 = auilVar5;
        auie[] b = nfj.b(auirVar.e);
        if ((auirVar.b & 8) != 0) {
            aozy aozyVar2 = auirVar.g;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        nckVar.G(actiVar, auirVar, str2, auilVar6, b, aozyVar, auirVar.i.I());
        this.d = false;
        d(this.f.l());
        this.b.c(this.z, this.D, this.E);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.c();
    }
}
