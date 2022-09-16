package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: myb  reason: default package */
/* loaded from: classes3.dex */
public final class myb implements ajru {
    public final Context a;
    public final ajmy b;
    public final aafo c;
    public final ajxz d;
    public final ajyc e;
    public final wwk f;
    public final tjv g;
    public final wxc h;
    public final yni i;
    public final ViewGroup j;
    public final FrameLayout k;
    public final fjn l;
    public final enm m;
    public final akem n;
    private final Resources o;
    private mzm p;
    private mzm q;
    private mzm r;

    /* JADX INFO: Access modifiers changed from: protected */
    public myb(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = ajycVar;
        this.f = wwkVar;
        this.g = tjvVar;
        this.h = wxcVar;
        this.m = enmVar;
        this.i = yniVar;
        this.o = context.getResources();
        this.j = viewGroup;
        this.k = new FrameLayout(context);
        this.l = fjnVar;
        this.n = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        apoj apojVar;
        auim auimVar = (auim) obj;
        ajrsVar.getClass();
        auimVar.getClass();
        this.k.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new mzm(this, (int) R.layout.promoted_sparkles_text_ctd_home_compact_form_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new mzm(this, (int) R.layout.promoted_sparkles_text_ctd_home_compact_form);
            }
            this.r = this.p;
        }
        mzm mzmVar = this.r;
        auil auilVar = auimVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        auil auilVar2 = auilVar;
        auif[] c = nfj.c(auimVar.d);
        aunb aunbVar = auimVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atng atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apzg apzgVar = null;
        if ((auimVar.b & 4) != 0) {
            aozy aozyVar2 = auimVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        mzmVar.g = ajrsVar.a;
        aunb aunbVar2 = auilVar2.s;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar3 = auilVar2.s;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = mzmVar.a;
        if ((auilVar2.b & 32768) != 0 && (apzgVar = auilVar2.q) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auilVar2.v);
        mzmVar.b.G(ajrsVar.a, auimVar, auimVar.h, auilVar2, c, aozyVar, auimVar.g.I());
        mzmVar.c.v(mzmVar.g, auimVar, auilVar2, atngVar);
        mzmVar.d.c(mzmVar.g, apojVar, atngVar);
        this.k.addView(this.r.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mzm mzmVar = this.r;
        mzmVar.getClass();
        mzmVar.b.c();
    }
}
