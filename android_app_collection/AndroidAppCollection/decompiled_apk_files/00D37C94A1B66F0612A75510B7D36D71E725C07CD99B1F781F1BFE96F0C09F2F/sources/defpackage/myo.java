package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: myo  reason: default package */
/* loaded from: classes3.dex */
public final class myo implements ajru, fzq, geq, ezg {
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
    public final ViewGroup k;
    public final FrameLayout l;
    public final fjn m;
    public myn n;
    public final boolean o;
    public final ezh p;
    public final akem q;
    private final Resources r;
    private myn s;
    private myn t;
    private final InlinePlaybackLifecycleController u;
    private boolean v = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public myo(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, boolean z, yni yniVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ezh ezhVar, fjn fjnVar, akem akemVar) {
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
        this.r = context.getResources();
        this.o = z;
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.u = inlinePlaybackLifecycleController;
        this.p = ezhVar;
        this.m = fjnVar;
        this.q = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.l;
    }

    public final void d() {
        if (this.r.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.t == null) {
                this.t = new myn(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form_landscape);
            }
            this.n = this.t;
            return;
        }
        if (this.s == null) {
            this.s = new myn(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form);
        }
        this.n = this.s;
    }

    @Override // defpackage.fzq
    public final View g() {
        myn mynVar = this.n;
        FrameLayout frameLayout = this.l;
        if (!mynVar.f) {
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
        if (!this.v) {
            return aynr.f();
        }
        myn mynVar = this.n;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.u;
        ezx g = this.p.g();
        if (!mynVar.f || g != ezx.NONE) {
            return aynr.f();
        }
        return mynVar.b.h(i, inlinePlaybackLifecycleController, mynVar.e, mynVar.g);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof myo) && ((myo) geqVar).l == this.l;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        auip auipVar = (auip) obj;
        ajrsVar.getClass();
        auipVar.getClass();
        this.l.removeAllViews();
        d();
        myn mynVar = this.n;
        auil auilVar = auipVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        mynVar.e = auilVar;
        auil auilVar2 = auipVar.c;
        if (auilVar2 == null) {
            auilVar2 = auil.a;
        }
        mynVar.f = (auilVar2.b & 8192) != 0;
        auil auilVar3 = auipVar.c;
        if (auilVar3 == null) {
            auilVar3 = auil.a;
        }
        mynVar.g = auilVar3.p;
        auif[] auifVarArr = (auif[]) auipVar.d.toArray(new auif[0]);
        String str = (auipVar.b & 64) != 0 ? auipVar.h : null;
        auil auilVar4 = auipVar.c;
        if (auilVar4 == null) {
            auilVar4 = auil.a;
        }
        auil auilVar5 = auilVar4;
        if ((auipVar.b & 2) != 0) {
            aunb aunbVar = auipVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        aozy aozyVar = auipVar.f;
        if (aozyVar == null) {
            aozyVar = aozy.a;
        }
        mynVar.a(ajrsVar, auipVar, str, auilVar5, auifVarArr, atngVar, aozyVar, auipVar.g.I());
        this.l.addView(this.n.d);
        this.n.b(this, true);
        this.v = true;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        myn mynVar = this.n;
        if (mynVar.f && ezxVar != ezx.NONE) {
            mynVar.b.n(mynVar.e);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        myn mynVar = this.n;
        mynVar.getClass();
        mynVar.a.c();
        this.n.b(this, false);
        this.v = false;
    }
}
