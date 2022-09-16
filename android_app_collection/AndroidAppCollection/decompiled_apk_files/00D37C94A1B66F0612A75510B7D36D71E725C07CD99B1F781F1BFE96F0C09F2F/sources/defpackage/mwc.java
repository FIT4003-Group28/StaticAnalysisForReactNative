package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mwc  reason: default package */
/* loaded from: classes3.dex */
public final class mwc implements ajru, fzq, geq {
    public static final asjj a;
    public static final asjj b;
    private mwb A;
    private boolean B;
    public final Context c;
    public final ajrx d;
    public final ajmy e;
    public final aafo f;
    public final ajxz g;
    public final ajyc h;
    public final wwk i;
    public final tjv j;
    public final wxc k;
    public final yni l;
    public final enm m;
    public final ViewGroup n;
    public final FrameLayout o;
    public final InlinePlaybackLifecycleController p;
    public final mbw q;
    public final fyy r;
    public final mcj s;
    public final fjn t;
    public final akem u;
    public final fms v;
    public ggz w;
    private final Resources x;
    private mwb y;
    private mwb z;

    static {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asji.a.createBuilder();
        createBuilder2.copyOnWrite();
        asji asjiVar = (asji) createBuilder2.instance;
        asjiVar.b |= 1;
        asjiVar.c = true;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asji asjiVar2 = (asji) createBuilder2.mo39build();
        asjiVar2.getClass();
        asjjVar.o = asjiVar2;
        asjjVar.b |= 67108864;
        a = (asjj) createBuilder.mo39build();
        aopa createBuilder3 = asjj.a.createBuilder();
        aopa createBuilder4 = asji.a.createBuilder();
        createBuilder4.copyOnWrite();
        asji asjiVar3 = (asji) createBuilder4.instance;
        asjiVar3.b = 1 | asjiVar3.b;
        asjiVar3.c = false;
        createBuilder3.copyOnWrite();
        asjj asjjVar2 = (asjj) createBuilder3.instance;
        asji asjiVar4 = (asji) createBuilder4.mo39build();
        asjiVar4.getClass();
        asjjVar2.o = asjiVar4;
        asjjVar2.b |= 67108864;
        b = (asjj) createBuilder3.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mwc(Context context, ajrx ajrxVar, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, yni yniVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mbw mbwVar, fyy fyyVar, mcj mcjVar, ViewGroup viewGroup, enm enmVar, fjn fjnVar, akem akemVar, fms fmsVar) {
        this.c = context;
        this.d = ajrxVar;
        this.e = ajmyVar;
        this.f = aafoVar;
        this.g = ajxzVar;
        this.h = ajycVar;
        this.i = wwkVar;
        this.j = tjvVar;
        this.k = wxcVar;
        this.l = yniVar;
        this.m = enmVar;
        this.p = inlinePlaybackLifecycleController;
        this.q = mbwVar;
        this.r = fyyVar;
        this.s = mcjVar;
        this.x = context.getResources();
        this.n = viewGroup;
        this.o = new FrameLayout(context);
        this.t = fjnVar;
        this.u = akemVar;
        this.v = fmsVar;
    }

    private final void d(boolean z, boolean z2) {
        if (this.x.getConfiguration().orientation == 2) {
            if (this.z == null) {
                this.z = new mwb(this, R.layout.promoted_discovery_action_landscape, false, true);
            }
            this.A = this.z;
        } else if (z2) {
            mwb mwbVar = this.y;
            if (mwbVar == null || z != mwbVar.i) {
                if (z) {
                    this.y = new mwb(this, R.layout.promoted_discovery_action_portrait, true, false);
                } else {
                    this.y = new mwb(this, R.layout.promoted_discovery_action_disable_inline_muted_playback_portrait, false, false);
                }
            }
            this.A = this.y;
        } else if (this.y != null) {
        } else {
            if (z) {
                this.y = new mwb(this, R.layout.promoted_discovery_action_portrait, true, false);
            } else {
                this.y = new mwb(this, R.layout.promoted_discovery_action_disable_inline_muted_playback_portrait, false, false);
            }
            this.A = this.y;
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.o;
    }

    @Override // defpackage.fzq
    public final View g() {
        mwb mwbVar = this.A;
        if (!mwbVar.i) {
            return null;
        }
        return ((mxi) mwbVar.b).C;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        this.B = z;
        mwb mwbVar = this.A;
        if (mwbVar.i && mwbVar.j != z) {
            mwbVar.j = z;
            if (!z) {
                return;
            }
            mwbVar.b.i();
        }
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        mwb mwbVar = this.A;
        if (!mwbVar.i) {
            return aynr.f();
        }
        return mwbVar.b.d(i, this);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof mwc) {
            mwb mwbVar = this.A;
            ggz ggzVar = ((mwc) geqVar).w;
            ggz ggzVar2 = this.w;
            if (!mwbVar.i) {
                return false;
            }
            mvs mvsVar = mwbVar.b;
            return mvs.f(ggzVar, ggzVar2);
        }
        return false;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        auhq auhqVar;
        apzg apzgVar;
        arag aragVar;
        mbf mbfVar = (mbf) obj;
        ajrsVar.getClass();
        mbfVar.getClass();
        this.o.removeAllViews();
        d(!auhqVar.i, mbfVar.a.j);
        i(this.B);
        mwb mwbVar = this.A;
        if (mbfVar.c == null) {
            auik auikVar = mbfVar.a.c;
            if (auikVar == null) {
                auikVar = auik.a;
            }
            mbfVar.c = auikVar;
        }
        auik auikVar2 = mbfVar.c;
        auhp a2 = mbfVar.a();
        if (mbfVar.e == null) {
            aopu aopuVar = mbfVar.a.e;
            mbfVar.e = new auig[aopuVar.size()];
            for (int i = 0; i < aopuVar.size(); i++) {
                mbfVar.e[i] = (auig) aopuVar.get(i);
            }
        }
        auig[] auigVarArr = mbfVar.e;
        if (mbfVar.b == null) {
            aozy aozyVar = mbfVar.a.f;
            if (aozyVar == null) {
                aozyVar = aozy.a;
            }
            mbfVar.b = aozyVar;
        }
        aozy aozyVar2 = mbfVar.b;
        mwbVar.g = ajrsVar.a;
        mwbVar.g.u(new acte(mbfVar.b()), mwbVar.l.r.o() ? a : b);
        aunb aunbVar = auikVar2.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        mwbVar.h = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
        apzg apzgVar2 = a2.g;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        apzg apzgVar3 = a2.i;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        nca ncaVar = mwbVar.m;
        if ((auikVar2.b & 2048) != 0) {
            apzgVar = auikVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        aopu aopuVar2 = auikVar2.s;
        ncaVar.b = apzgVar;
        ncaVar.c = aopuVar2;
        ncaVar.d = apzgVar2;
        ncaVar.e = apzgVar3;
        nck nckVar = mwbVar.a;
        acti actiVar = mwbVar.g;
        auhq auhqVar2 = mbfVar.a;
        nckVar.F(actiVar, mbfVar, (auhqVar2.b & 32) != 0 ? auhqVar2.h : null, auikVar2, auigVarArr, aozyVar2, null);
        if (mwbVar.i) {
            mwbVar.l.w = eog.bm(mbfVar);
            nca ncaVar2 = mwbVar.m;
            boolean z = mwbVar.i;
            mwc mwcVar = mwbVar.l;
            ggz ggzVar = mwcVar.w;
            aafo aafoVar = mwcVar.f;
            mcj mcjVar = mwcVar.s;
            ncaVar2.f = z;
            ncaVar2.g = ggzVar;
            ncaVar2.h = aafoVar;
            ncaVar2.i = ajrsVar;
            ncaVar2.j = mcjVar;
            mvs mvsVar = mwbVar.b;
            acti actiVar2 = mwbVar.g;
            mvsVar.oK(ajrsVar, mwcVar.w);
            ((mxi) mvsVar).f.p(actiVar2, mbfVar, auikVar2, a2, false);
            arag aragVar2 = a2.j;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b2 = ajgl.b(aragVar2);
            if ((auikVar2.b & 1024) != 0) {
                aragVar = auikVar2.m;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b3 = ajgl.b(aragVar);
            avhn avhnVar = a2.h;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            nfj.f(mvsVar.a, b2);
            nfj.f(mvsVar.c, b3);
            nfj.g(mvsVar.b, avhnVar, mvsVar.h);
        } else {
            mwbVar.c.a(mwbVar.g, mbfVar, auikVar2, a2, (auikVar2.b & 8) != 0, mwbVar.k);
        }
        auhp a3 = mbfVar.a();
        mwbVar.f = String.format("PDTBState:%s", a3.k);
        aunb aunbVar2 = a3.d;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        final apos aposVar = (apos) ajjh.l(aunbVar2, ButtonRendererOuterClass.toggleButtonRenderer);
        mwbVar.e.b(aposVar);
        if (aposVar != null && ((mwt) mwbVar.l.m.c(mwbVar.f, mwt.class, "PDTBState", new enl() { // from class: mvw
            @Override // defpackage.enl
            public final Object a() {
                return new mwt(apos.this.e);
            }
        }, mbfVar.b())).a != aposVar.e) {
            mwbVar.e.c();
        }
        mwbVar.e.d();
        mwbVar.d.c(mwbVar.g, mwbVar.h, null);
        this.o.addView(this.A.a());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mwb mwbVar = this.A;
        mwbVar.getClass();
        mwbVar.j = false;
        mwbVar.a.c();
        if (mwbVar.i) {
            mwbVar.b.qZ(ajsaVar);
        }
        this.B = false;
        this.w = null;
        this.o.removeAllViews();
        this.z = null;
        this.y = null;
        d(this.A.i, true);
        this.o.addView(this.A.a());
    }
}
