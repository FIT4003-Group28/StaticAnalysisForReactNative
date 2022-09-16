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
/* renamed from: mwr  reason: default package */
/* loaded from: classes3.dex */
public final class mwr implements ajru, fzq, geq {
    public static final asjj a;
    public static final asjj b;
    private boolean A;
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
    public ggz v;
    private final Resources w;
    private mwq x;
    private mwq y;
    private mwq z;

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
    public mwr(Context context, ajrx ajrxVar, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, yni yniVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mbw mbwVar, fyy fyyVar, mcj mcjVar, ViewGroup viewGroup, enm enmVar, fjn fjnVar, akem akemVar) {
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
        this.w = context.getResources();
        this.n = viewGroup;
        this.o = new FrameLayout(context);
        this.t = fjnVar;
        this.u = akemVar;
    }

    private final void d(boolean z, boolean z2) {
        if (this.w.getConfiguration().orientation == 2) {
            if (this.y == null) {
                this.y = new mwq(this, R.layout.promoted_discovery_app_promo_landscape, false, true);
            }
            this.z = this.y;
        } else if (z2) {
            mwq mwqVar = this.x;
            if (mwqVar == null || z != mwqVar.h) {
                if (z) {
                    this.x = new mwq(this, R.layout.promoted_discovery_app_promo_portrait, true, false);
                } else {
                    this.x = new mwq(this, R.layout.promoted_discovery_app_promo_disable_inline_muted_playback_portrait, false, false);
                }
            }
            this.z = this.x;
        } else if (this.x != null) {
        } else {
            if (z) {
                this.x = new mwq(this, R.layout.promoted_discovery_app_promo_portrait, true, false);
            } else {
                this.x = new mwq(this, R.layout.promoted_discovery_app_promo_disable_inline_muted_playback_portrait, false, false);
            }
            this.z = this.x;
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.o;
    }

    @Override // defpackage.fzq
    public final View g() {
        mwq mwqVar = this.z;
        if (!mwqVar.h) {
            return null;
        }
        return ((mxi) mwqVar.c).C;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        this.A = z;
        mwq mwqVar = this.z;
        if (mwqVar.h && mwqVar.i != z) {
            mwqVar.i = z;
            if (!z) {
                return;
            }
            mwqVar.c.i();
        }
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        mwq mwqVar = this.z;
        if (!mwqVar.h) {
            return aynr.f();
        }
        return mwqVar.c.d(i, this);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof mwr) {
            mwq mwqVar = this.z;
            ggz ggzVar = ((mwr) geqVar).v;
            ggz ggzVar2 = this.v;
            if (!mwqVar.h) {
                return false;
            }
            mwj mwjVar = mwqVar.c;
            return mwj.f(ggzVar, ggzVar2);
        }
        return false;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        auhu auhuVar;
        apoj apojVar;
        apzg apzgVar;
        arag aragVar;
        mbg mbgVar = (mbg) obj;
        ajrsVar.getClass();
        mbgVar.getClass();
        this.o.removeAllViews();
        d(!auhuVar.i, mbgVar.a.j);
        i(this.A);
        mwq mwqVar = this.z;
        if (mbgVar.c == null) {
            auhs auhsVar = mbgVar.a.c;
            if (auhsVar == null) {
                auhsVar = auhs.a;
            }
            mbgVar.c = auhsVar;
        }
        auhs auhsVar2 = mbgVar.c;
        auht a2 = mbgVar.a();
        if (mbgVar.e == null) {
            aopu aopuVar = mbgVar.a.e;
            mbgVar.e = new auih[aopuVar.size()];
            for (int i = 0; i < aopuVar.size(); i++) {
                mbgVar.e[i] = (auih) aopuVar.get(i);
            }
        }
        auih[] auihVarArr = mbgVar.e;
        if (mbgVar.b == null) {
            aozy aozyVar = mbgVar.a.f;
            if (aozyVar == null) {
                aozyVar = aozy.a;
            }
            mbgVar.b = aozyVar;
        }
        aozy aozyVar2 = mbgVar.b;
        mwqVar.f = ajrsVar.a;
        acti actiVar = mwqVar.f;
        if (mbgVar.f == null) {
            mbgVar.f = mbgVar.a.g.I();
        }
        actiVar.u(new acte(mbgVar.f), mwqVar.k.r.o() ? a : b);
        aunb aunbVar = auhsVar2.m;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = auhsVar2.m;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mwqVar.g = apojVar;
        apzg apzgVar2 = a2.g;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        apzg apzgVar3 = a2.i;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        nca ncaVar = mwqVar.a;
        if ((auhsVar2.b & 256) != 0) {
            apzgVar = auhsVar2.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        apzg apzgVar4 = auhsVar2.l;
        if (apzgVar4 == null) {
            apzgVar4 = apzg.a;
        }
        amuk r = amuk.r(apzgVar4);
        ncaVar.b = apzgVar;
        ncaVar.c = r;
        ncaVar.d = apzgVar2;
        ncaVar.e = apzgVar3;
        nck nckVar = mwqVar.b;
        acti actiVar2 = mwqVar.f;
        auhu auhuVar2 = mbgVar.a;
        nckVar.E(actiVar2, mbgVar, (auhuVar2.b & 32) != 0 ? auhuVar2.h : null, auhsVar2, auihVarArr, aozyVar2, null);
        if (mwqVar.h) {
            mwqVar.k.v = eog.bm(mbgVar);
            nca ncaVar2 = mwqVar.a;
            boolean z = mwqVar.h;
            mwr mwrVar = mwqVar.k;
            ggz ggzVar = mwrVar.v;
            aafo aafoVar = mwrVar.f;
            mcj mcjVar = mwrVar.s;
            ncaVar2.f = z;
            ncaVar2.g = ggzVar;
            ncaVar2.h = aafoVar;
            ncaVar2.i = ajrsVar;
            ncaVar2.j = mcjVar;
            mwj mwjVar = mwqVar.c;
            acti actiVar3 = mwqVar.f;
            mwjVar.oK(ajrsVar, mwrVar.v);
            ((mxi) mwjVar).f.b(actiVar3, mbgVar, auhsVar2, a2, false);
            float f = auhsVar2.f;
            int i2 = auhsVar2.g;
            int i3 = auhsVar2.h;
            if ((auhsVar2.b & 8192) != 0) {
                aragVar = auhsVar2.p;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b2 = ajgl.b(aragVar);
            arag aragVar2 = a2.j;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b3 = ajgl.b(aragVar2);
            avhn avhnVar = a2.h;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            nfj.e(mwjVar.a, mwjVar.b, f, i2, i3);
            nfj.f(mwjVar.c, b2);
            nfj.f(mwjVar.d, b3);
            nfj.g(mwjVar.e, avhnVar, mwjVar.h);
        } else {
            mwqVar.d.b(mwqVar.f, mbgVar, auhsVar2, a2, mwqVar.j);
        }
        mwqVar.e.c(mwqVar.f, mwqVar.g, null);
        this.o.addView(this.z.a());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mwq mwqVar = this.z;
        mwqVar.getClass();
        mwqVar.i = false;
        mwqVar.b.c();
        if (mwqVar.h) {
            mwqVar.c.qZ(ajsaVar);
        }
        this.A = false;
        this.v = null;
        this.o.removeAllViews();
        this.y = null;
        this.x = null;
        d(this.z.h, true);
        this.o.addView(this.z.a());
    }
}
