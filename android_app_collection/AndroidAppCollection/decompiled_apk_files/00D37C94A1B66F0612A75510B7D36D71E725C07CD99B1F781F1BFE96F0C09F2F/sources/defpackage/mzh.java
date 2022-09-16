package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: mzh  reason: default package */
/* loaded from: classes3.dex */
public final class mzh implements ajru {
    public final myv a;
    public final mxl b;
    public final View c;
    private final mvo d;
    private final mxk e;
    private final nck f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final TextView l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final ImageView p;
    private final TextView q;
    private final View r;
    private final View s;
    private final View t;
    private acti u;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzh(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, View view, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_grid_form, viewGroup, false);
        this.c = inflate;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.n = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView3;
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.rating_star);
        this.p = imageView;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView4;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.t = findViewById9;
        mxk mxkVar = new mxk();
        this.e = mxkVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, view == null ? inflate : view, findViewById9, null, null, new View.OnClickListener() { // from class: mzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mzh.this.b.a();
            }
        }, new ncg() { // from class: mzf
            @Override // defpackage.ncg
            public final void a(boolean z) {
                mzh.this.a.f(!z);
            }
        }, new ncj() { // from class: mzg
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                myv myvVar = mzh.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                myvVar.f(z3);
            }
        }, mxkVar);
        this.f = nckVar;
        this.a = new myv(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, false, fjnVar, akemVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: mze
            @Override // defpackage.mvn
            public final void a() {
                mzh.this.b.b();
            }
        });
        this.d = mvoVar;
        this.b = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView3, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(imageView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nckVar.B(textView4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        if (textView2 != null) {
            nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    public final void d(ajrs ajrsVar, Object obj, String str, auil auilVar, auif[] auifVarArr, atng atngVar, aozy aozyVar, byte[] bArr) {
        apoj apojVar;
        this.u = ajrsVar.a;
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
        mxk mxkVar = this.e;
        if ((auilVar.b & 32768) != 0 && (apzgVar = auilVar.q) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auilVar.v);
        this.f.G(ajrsVar.a, obj, str, auilVar, auifVarArr, aozyVar, bArr);
        this.a.v(this.u, obj, auilVar, atngVar);
        this.b.c(this.u, apojVar, atngVar);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        auis auisVar = (auis) obj;
        auisVar.getClass();
        String str = auisVar.h;
        auil auilVar = auisVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        auil auilVar2 = auilVar;
        auif[] auifVarArr = (auif[]) auisVar.d.toArray(new auif[0]);
        aunb aunbVar = auisVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atng atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auisVar.b & 4) != 0) {
            aozyVar = auisVar.f;
            if (aozyVar == null) {
                aozyVar = aozy.a;
            }
        } else {
            aozyVar = null;
        }
        d(ajrsVar, auisVar, str, auilVar2, auifVarArr, atngVar, aozyVar, auisVar.g.I());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.c();
    }
}
