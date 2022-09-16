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
/* renamed from: nam  reason: default package */
/* loaded from: classes3.dex */
public final class nam implements ajru, fzq, geq, ezg {
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
    public final ezh n;
    public final akem o;
    private final Resources p;
    private nal q;
    private nal r;
    private nal s;
    private final InlinePlaybackLifecycleController t;
    private boolean u = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public nam(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ezh ezhVar, fjn fjnVar, akem akemVar) {
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
        this.p = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.t = inlinePlaybackLifecycleController;
        this.n = ezhVar;
        this.m = fjnVar;
        this.o = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.l;
    }

    @Override // defpackage.fzq
    public final View g() {
        nal nalVar = this.s;
        FrameLayout frameLayout = this.l;
        if (!nalVar.f) {
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
        if (!this.u) {
            return aynr.f();
        }
        nal nalVar = this.s;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.t;
        ezx g = this.n.g();
        if (!nalVar.f || g != ezx.NONE) {
            return aynr.f();
        }
        return nalVar.c.g(i, inlinePlaybackLifecycleController, nalVar.e, nalVar.g);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof nam) && ((nam) geqVar).l == this.l;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        mbh mbhVar = (mbh) obj;
        ajrsVar.getClass();
        mbhVar.getClass();
        this.l.removeAllViews();
        if (this.p.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.r == null) {
                this.r = new nal(this, R.layout.promoted_sparkles_text_home_themed_cta_large_square_form_landscape);
            }
            this.s = this.r;
        } else {
            if (this.q == null) {
                this.q = new nal(this, R.layout.promoted_sparkles_text_home_themed_cta_large_square_form);
            }
            this.s = this.q;
        }
        nal nalVar = this.s;
        nalVar.e = mbhVar.a();
        nalVar.f = (mbhVar.a().b & 128) != 0;
        nalVar.g = mbhVar.a().l;
        auix auixVar = mbhVar.a;
        apzg apzgVar = null;
        String str = (auixVar.b & 64) != 0 ? auixVar.h : null;
        auik a = mbhVar.a();
        if (mbhVar.d == null) {
            aopu aopuVar = mbhVar.a.d;
            mbhVar.d = new auif[aopuVar.size()];
            for (int i = 0; i < aopuVar.size(); i++) {
                mbhVar.d[i] = (auif) aopuVar.get(i);
            }
        }
        auif[] auifVarArr = mbhVar.d;
        auix auixVar2 = mbhVar.a;
        if ((auixVar2.b & 2) != 0) {
            if (mbhVar.c == null) {
                aunb aunbVar = auixVar2.e;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                mbhVar.c = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            }
            atngVar = mbhVar.c;
        } else {
            atngVar = null;
        }
        if (mbhVar.b == null) {
            aozy aozyVar = mbhVar.a.f;
            if (aozyVar == null) {
                aozyVar = aozy.a;
            }
            mbhVar.b = aozyVar;
        }
        aozy aozyVar2 = mbhVar.b;
        if (mbhVar.e == null) {
            mbhVar.e = mbhVar.a.g.I();
        }
        byte[] bArr = mbhVar.e;
        nalVar.j = ajrsVar.a;
        aunb aunbVar2 = a.p;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        apoj apojVar = (apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer);
        mxk mxkVar = nalVar.a;
        if ((a.b & 2048) != 0 && (apzgVar = a.n) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, a.s);
        nalVar.b.F(ajrsVar.a, mbhVar, str, a, auifVarArr, aozyVar2, bArr);
        nalVar.c.k(nalVar.j, mbhVar, a, atngVar, Integer.valueOf(zhn.j(nalVar.i.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        nalVar.d.c(nalVar.j, apojVar, atngVar);
        this.l.addView(this.s.h);
        this.s.a(this, true);
        this.u = true;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        nal nalVar = this.s;
        if (nalVar.f && ezxVar != ezx.NONE) {
            nalVar.c.m(nalVar.e);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        nal nalVar = this.s;
        nalVar.getClass();
        nalVar.b.c();
        this.s.a(this, false);
        this.u = false;
    }
}
