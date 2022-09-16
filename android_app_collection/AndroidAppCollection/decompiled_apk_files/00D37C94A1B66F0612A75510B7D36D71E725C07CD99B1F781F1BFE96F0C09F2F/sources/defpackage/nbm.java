package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: nbm  reason: default package */
/* loaded from: classes3.dex */
public final class nbm implements ajru {
    public final nan a;
    public final mxl b;
    public final View c;
    public boolean d;
    private final mvo e;
    private final mxc f;
    private final nck g;
    private final mwz h;
    private acti i;
    private Object j;
    private auik k;
    private auhx l;
    private atng m;

    public nbm(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_15_click, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.description);
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.website);
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper).findViewById(R.id.cta_button_touchable_wrapper);
        View findViewById8 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        View findViewById9 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        mxc mxcVar = new mxc(enmVar, new mxb() { // from class: nbj
            @Override // defpackage.mxb
            public final void a(boolean z) {
                nbm nbmVar = nbm.this;
                nbmVar.d = true;
                nbmVar.d(z);
                nbmVar.c.requestLayout();
            }
        });
        this.f = mxcVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, inflate, (ImageView) findViewById2.findViewById(R.id.close_button), findViewById8, findViewById9, new View.OnClickListener() { // from class: nbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nbm.this.b.a();
            }
        }, new ncg() { // from class: nbk
            @Override // defpackage.ncg
            public final void a(boolean z) {
                nbm.this.a.f(!z);
            }
        }, new ncj() { // from class: nbl
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nan nanVar = nbm.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nanVar.f(z3);
            }
        }, mxcVar);
        this.g = nckVar;
        this.a = new nan(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, true, fjnVar, akemVar);
        this.h = new mwz(ajxzVar, findViewById2, fjnVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nbi
            @Override // defpackage.mvn
            public final void a() {
                nbm.this.b.b();
            }
        });
        this.e = mvoVar;
        this.b = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById7, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
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
        this.a.d(this.i, this.j, this.k, this.m);
        auhy auhyVar = null;
        this.h.m = this.k.w ? 3 : null;
        mwz mwzVar = this.h;
        auik auikVar = this.k;
        auhx auhxVar = this.l;
        boolean z2 = this.d;
        if ((auikVar.b & 4) != 0) {
            arhs arhsVar3 = auikVar.e;
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
        apzg apzgVar;
        aujd aujdVar = (aujd) obj;
        aujdVar.getClass();
        this.i = ajrsVar.a;
        this.j = aujdVar;
        auik auikVar = aujdVar.c;
        if (auikVar == null) {
            auikVar = auik.a;
        }
        this.k = auikVar;
        auhx auhxVar = aujdVar.d;
        if (auhxVar == null) {
            auhxVar = auhx.a;
        }
        this.l = auhxVar;
        aunb aunbVar = this.k.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
        aunb aunbVar2 = aujdVar.f;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        this.m = (atng) ajjh.l(aunbVar2, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        mxc mxcVar = this.f;
        String str = aujdVar.i;
        auik auikVar2 = aujdVar.c;
        if (auikVar2 == null) {
            auikVar2 = auik.a;
        }
        aozy aozyVar = null;
        if ((auikVar2.b & 2048) != 0) {
            auik auikVar3 = aujdVar.c;
            if (auikVar3 == null) {
                auikVar3 = auik.a;
            }
            apzg apzgVar2 = auikVar3.n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            apzgVar = apzgVar2;
        } else {
            apzgVar = null;
        }
        auik auikVar4 = aujdVar.c;
        if (auikVar4 == null) {
            auikVar4 = auik.a;
        }
        aopu aopuVar = auikVar4.s;
        auhx auhxVar2 = aujdVar.d;
        if (auhxVar2 == null) {
            auhxVar2 = auhx.a;
        }
        aopu aopuVar2 = auhxVar2.f;
        auhx auhxVar3 = aujdVar.d;
        if (auhxVar3 == null) {
            auhxVar3 = auhx.a;
        }
        mxcVar.k(str, apzgVar, aopuVar, aopuVar2, auhxVar3.g);
        nck nckVar = this.g;
        acti actiVar = ajrsVar.a;
        String str2 = aujdVar.i;
        auik auikVar5 = aujdVar.c;
        if (auikVar5 == null) {
            auikVar5 = auik.a;
        }
        auie[] b = nfj.b(aujdVar.e);
        if ((aujdVar.b & 8) != 0 && (aozyVar = aujdVar.g) == null) {
            aozyVar = aozy.a;
        }
        nckVar.F(actiVar, aujdVar, str2, auikVar5, b, aozyVar, aujdVar.h.I());
        this.d = false;
        d(this.f.l());
        this.b.c(this.i, apojVar, this.m);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.c();
    }
}
