package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: naf  reason: default package */
/* loaded from: classes3.dex */
public final class naf implements ajru, fzq, geq, ezg {
    public final Context a;
    public final ajmy b;
    public final aafo c;
    public final ajxz d;
    public final ajyc e;
    public final wwk f;
    public final tjv g;
    public final wxc h;
    public final enm i;
    public final yni j;
    public final boolean k;
    public final ezh l;
    public final ViewGroup m;
    public final FrameLayout n;
    public final fjn o;
    public final akem p;
    private final Resources q;
    private final InlinePlaybackLifecycleController r;
    private boolean s = false;
    private nae t;
    private nae u;
    private nae v;

    /* JADX INFO: Access modifiers changed from: protected */
    public naf(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, boolean z, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ezh ezhVar, fjn fjnVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = ajycVar;
        this.f = wwkVar;
        this.g = tjvVar;
        this.h = wxcVar;
        this.i = enmVar;
        this.j = yniVar;
        this.q = context.getResources();
        this.m = viewGroup;
        this.n = new FrameLayout(context);
        this.k = z;
        this.r = inlinePlaybackLifecycleController;
        this.l = ezhVar;
        this.o = fjnVar;
        this.p = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.n;
    }

    @Override // defpackage.fzq
    public final View g() {
        nae naeVar = this.v;
        FrameLayout frameLayout = this.n;
        if (!naeVar.f) {
            return null;
        }
        return frameLayout;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        if (!this.s) {
            return aynr.f();
        }
        nae naeVar = this.v;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.r;
        ezx g = this.l.g();
        if (!naeVar.f || g != ezx.NONE) {
            return aynr.f();
        }
        return naeVar.c.g(i, inlinePlaybackLifecycleController, naeVar.e, naeVar.g);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof naf) && ((naf) geqVar).n == this.n;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        auiw auiwVar = (auiw) obj;
        ajrsVar.getClass();
        auiwVar.getClass();
        this.n.removeAllViews();
        if (this.q.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.u == null) {
                this.u = new nae(this, R.layout.promoted_sparkles_text_home_themed_cta_form_landscape);
            }
            this.v = this.u;
        } else {
            if (this.t == null) {
                this.t = new nae(this, R.layout.promoted_sparkles_text_home_themed_cta_form);
            }
            this.v = this.t;
        }
        nae naeVar = this.v;
        auik auikVar = auiwVar.c;
        if (auikVar == null) {
            auikVar = auik.a;
        }
        naeVar.e = auikVar;
        auik auikVar2 = auiwVar.c;
        if (auikVar2 == null) {
            auikVar2 = auik.a;
        }
        naeVar.f = (auikVar2.b & 128) != 0;
        auik auikVar3 = auiwVar.c;
        if (auikVar3 == null) {
            auikVar3 = auik.a;
        }
        naeVar.g = auikVar3.l;
        auik auikVar4 = auiwVar.c;
        if (auikVar4 == null) {
            auikVar4 = auik.a;
        }
        auik auikVar5 = auikVar4;
        auif[] auifVarArr = (auif[]) auiwVar.d.toArray(new auif[0]);
        aunb aunbVar = auiwVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atng atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apzg apzgVar = null;
        if ((auiwVar.b & 4) != 0) {
            aozy aozyVar2 = auiwVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        naeVar.j = ajrsVar.a;
        aunb aunbVar2 = auikVar5.p;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        apoj apojVar = (apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer);
        mxk mxkVar = naeVar.a;
        if ((auikVar5.b & 2048) != 0 && (apzgVar = auikVar5.n) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auikVar5.s);
        naeVar.b.F(ajrsVar.a, auiwVar, auiwVar.h, auikVar5, auifVarArr, aozyVar, auiwVar.g.I());
        naeVar.c.k(naeVar.j, auiwVar, auikVar5, atngVar, Integer.valueOf(zhn.j(naeVar.i.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        naeVar.d.c(naeVar.j, apojVar, atngVar);
        this.n.addView(this.v.h);
        this.v.a(this, true);
        this.s = true;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        nae naeVar = this.v;
        if (naeVar.f && ezxVar != ezx.NONE) {
            naeVar.c.m(naeVar.e);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        nae naeVar = this.v;
        naeVar.getClass();
        naeVar.b.c();
        this.v.a(this, false);
        this.s = false;
    }
}
