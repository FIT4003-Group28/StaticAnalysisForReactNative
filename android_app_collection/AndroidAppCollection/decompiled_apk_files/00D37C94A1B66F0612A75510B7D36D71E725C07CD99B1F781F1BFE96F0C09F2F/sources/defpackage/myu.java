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
/* renamed from: myu  reason: default package */
/* loaded from: classes3.dex */
public final class myu implements ajru, fzq, geq, ezg {
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
    public final ezh k;
    public final ViewGroup l;
    public final FrameLayout m;
    public final fjn n;
    public final boolean o;
    public final akem p;
    private final Resources q;
    private final InlinePlaybackLifecycleController r;
    private boolean s = false;
    private myt t;
    private myt u;
    private myt v;

    /* JADX INFO: Access modifiers changed from: protected */
    public myu(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, boolean z, yni yniVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ezh ezhVar, fjn fjnVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = ajycVar;
        this.f = wwkVar;
        this.g = tjvVar;
        this.h = wxcVar;
        this.i = enmVar;
        this.o = z;
        this.j = yniVar;
        this.q = context.getResources();
        this.l = viewGroup;
        this.m = new FrameLayout(context);
        this.r = inlinePlaybackLifecycleController;
        this.k = ezhVar;
        this.n = fjnVar;
        this.p = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.m;
    }

    @Override // defpackage.fzq
    public final View g() {
        myt mytVar = this.v;
        FrameLayout frameLayout = this.m;
        if (!mytVar.h) {
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
        myt mytVar = this.v;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.r;
        ezx g = this.k.g();
        if (!mytVar.h || g != ezx.NONE) {
            return aynr.f();
        }
        return mytVar.c.h(i, inlinePlaybackLifecycleController, mytVar.g, mytVar.i);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof myu) && ((myu) geqVar).m == this.m;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        apoj apojVar;
        auiq auiqVar = (auiq) obj;
        ajrsVar.getClass();
        auiqVar.getClass();
        this.m.removeAllViews();
        if (this.q.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.u == null) {
                this.u = new myt(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form_landscape);
            }
            this.v = this.u;
        } else {
            if (this.t == null) {
                this.t = new myt(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form);
            }
            this.v = this.t;
        }
        myt mytVar = this.v;
        auil auilVar = auiqVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        mytVar.g = auilVar;
        auil auilVar2 = auiqVar.c;
        if (auilVar2 == null) {
            auilVar2 = auil.a;
        }
        mytVar.h = (auilVar2.b & 8192) != 0;
        auil auilVar3 = auiqVar.c;
        if (auilVar3 == null) {
            auilVar3 = auil.a;
        }
        mytVar.i = auilVar3.p;
        aopu aopuVar = auiqVar.d;
        auif[] auifVarArr = new auif[aopuVar.size()];
        for (int i = 0; i < aopuVar.size(); i++) {
            auifVarArr[i] = (auif) aopuVar.get(i);
        }
        apzg apzgVar = null;
        String str = (auiqVar.b & 64) != 0 ? auiqVar.h : null;
        auil auilVar4 = auiqVar.c;
        if (auilVar4 == null) {
            auilVar4 = auil.a;
        }
        auil auilVar5 = auilVar4;
        if ((auiqVar.b & 2) != 0) {
            aunb aunbVar = auiqVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        aozy aozyVar = auiqVar.f;
        if (aozyVar == null) {
            aozyVar = aozy.a;
        }
        aozy aozyVar2 = aozyVar;
        byte[] I = auiqVar.g.I();
        mytVar.j = ajrsVar.a;
        aunb aunbVar2 = auilVar5.s;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar3 = auilVar5.s;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = mytVar.a;
        if ((auilVar5.b & 32768) != 0 && (apzgVar = auilVar5.q) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auilVar5.v);
        mytVar.b.G(ajrsVar.a, auiqVar, str, auilVar5, auifVarArr, aozyVar2, I);
        mytVar.c.l(mytVar.j, auiqVar, auilVar5, atngVar, Integer.valueOf(zhn.j(mytVar.f.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        mytVar.d.c(mytVar.j, apojVar, atngVar);
        this.m.addView(this.v.e);
        this.v.a(this, true);
        this.s = true;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        myt mytVar = this.v;
        if (mytVar.h && ezxVar != ezx.NONE) {
            mytVar.c.n(mytVar.g);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        myt mytVar = this.v;
        mytVar.getClass();
        mytVar.b.c();
        this.v.a(this, false);
        this.s = false;
    }
}
