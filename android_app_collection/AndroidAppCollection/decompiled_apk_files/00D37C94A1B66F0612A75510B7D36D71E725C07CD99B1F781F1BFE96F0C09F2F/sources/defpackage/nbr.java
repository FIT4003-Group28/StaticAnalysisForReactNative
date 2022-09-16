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
/* renamed from: nbr  reason: default package */
/* loaded from: classes3.dex */
public final class nbr implements ajru {
    public final nan a;
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
    private final View o;
    private final View p;
    private final View q;
    private acti r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbr(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, View view, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_grid_form, viewGroup, false);
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.n = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.o = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.p = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.q = findViewById9;
        mxk mxkVar = new mxk();
        this.e = mxkVar;
        nck nckVar = new nck(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, inflate, findViewById2, findViewById3, view == null ? inflate : view, findViewById9, null, null, new View.OnClickListener() { // from class: nbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                nbr.this.b.a();
            }
        }, new ncg() { // from class: nbp
            @Override // defpackage.ncg
            public final void a(boolean z) {
                nbr.this.a.f(!z);
            }
        }, new ncj() { // from class: nbq
            @Override // defpackage.ncj
            public final void a(boolean z, boolean z2) {
                nan nanVar = nbr.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nanVar.f(z3);
            }
        }, mxkVar);
        this.f = nckVar;
        this.a = new nan(ajmyVar, ajxzVar, ajycVar, inflate, findViewById2, false, fjnVar, akemVar);
        mvo mvoVar = new mvo(nckVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new mvn() { // from class: nbo
            @Override // defpackage.mvn
            public final void a() {
                nbr.this.b.b();
            }
        });
        this.d = mvoVar;
        this.b = new mxl(nckVar, mvoVar, findViewById);
        nckVar.B(textView, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nckVar.B(findViewById6, auib.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nckVar.B(findViewById5, auib.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nckVar.B(findViewById8, auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nckVar.B(findViewById4, auib.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nckVar.B(textView2, auib.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    public final void d(ajrs ajrsVar, Object obj, String str, auik auikVar, auif[] auifVarArr, atng atngVar, aozy aozyVar, byte[] bArr) {
        apzg apzgVar;
        this.r = ajrsVar.a;
        aunb aunbVar = auikVar.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
        mxk mxkVar = this.e;
        if ((auikVar.b & 2048) != 0) {
            apzgVar = auikVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        mxkVar.a(apzgVar, auikVar.s);
        this.f.F(ajrsVar.a, obj, str, auikVar, auifVarArr, aozyVar, bArr);
        this.a.d(this.r, obj, auikVar, atngVar);
        this.b.c(this.r, apojVar, atngVar);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        auje aujeVar = (auje) obj;
        aujeVar.getClass();
        String str = aujeVar.h;
        auik auikVar = aujeVar.c;
        if (auikVar == null) {
            auikVar = auik.a;
        }
        auik auikVar2 = auikVar;
        auif[] auifVarArr = (auif[]) aujeVar.d.toArray(new auif[0]);
        aunb aunbVar = aujeVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atng atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((aujeVar.b & 4) != 0) {
            aozyVar = aujeVar.f;
            if (aozyVar == null) {
                aozyVar = aozy.a;
            }
        } else {
            aozyVar = null;
        }
        d(ajrsVar, aujeVar, str, auikVar2, auifVarArr, atngVar, aozyVar, aujeVar.g.I());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.c();
    }
}
