package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
/* compiled from: PG */
/* renamed from: yhg  reason: default package */
/* loaded from: classes4.dex */
public final class yhg extends ygl implements View.OnClickListener, ydp, ynl {
    public auyo ae;
    public LoadingFrameLayout af;
    public acti ag;
    public acth ah;
    public abem ai;
    public yzj aj;
    public ajsg ak;
    public yni al;
    public azqb am;
    public azqb an;
    public ydq ao;
    public dt ap;
    public aaqp aq;
    public aadd ar;
    public aynx as;
    public akar at;
    private Context au;
    private apzg av;
    private Toolbar aw;
    private ajyc ax;

    @Override // defpackage.dp
    public final void W() {
        this.ao.e(this);
        this.al.m(this);
        super.W();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.ao.d(this);
        this.al.g(this);
    }

    public final void aG() {
        arag aragVar;
        auyo auyoVar = this.ae;
        if (auyoVar == null || this.af == null) {
            return;
        }
        aunb aunbVar = auyoVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        auyd auydVar = (auyd) ajjh.l(aunbVar, SponsorshipsRenderers.sponsorshipsAppBarRenderer);
        boolean z = false;
        zag.o(this.aw, auydVar != null);
        if (auydVar != null) {
            Toolbar toolbar = this.aw;
            if ((auydVar.b & 1) != 0) {
                aragVar = auydVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            toolbar.w(ajgl.b(aragVar));
            aunb aunbVar2 = auydVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atep atepVar = (atep) ajjh.l(aunbVar2, MenuRendererOuterClass.menuRenderer);
            View findViewById = this.af.findViewById(R.id.contextual_menu_anchor);
            if (atepVar != null) {
                z = true;
            }
            zag.o(findViewById, z);
            if (atepVar != null) {
                if ((atepVar.b & 256) != 0) {
                    aovs aovsVar = atepVar.i;
                    if (aovsVar == null) {
                        aovsVar = aovs.a;
                    }
                    aovr aovrVar = aovsVar.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    findViewById.setContentDescription(aovrVar.c);
                }
                ajyc ajycVar = (ajyc) this.an.get();
                this.ax = ajycVar;
                ajycVar.d(findViewById, atepVar, atepVar, this.ag);
            }
        }
        aarg aargVar = new aarg(1);
        Context context = this.au;
        acti actiVar = this.ag;
        yhh yhhVar = new yhh(context, actiVar, this.ak, aargVar, this.al, this.at.a(aargVar, actiVar), this.aj, this.am, this.ar, this.as);
        ((FrameLayout) this.af.findViewById(R.id.offer_view)).addView(yhhVar.a);
        ajrs ajrsVar = new ajrs();
        ajrsVar.a(this.ag);
        yhhVar.oK(ajrsVar, this.ae);
        this.af.a();
    }

    @Override // defpackage.ydp
    public final void h() {
        dismiss();
    }

    @Override // defpackage.ygl, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.au = context;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ygj ygjVar = (ygj) obj;
                dismiss();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ygj.class};
    }

    @Override // defpackage.ydp
    public final void mE() {
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        if (ashnVar != null && yce.a(ashnVar) != null) {
            yln.d(ashnVar).qv(this.ap.getSupportFragmentManager(), "sponsorships_dialog");
        }
        dismiss();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        auyo auyoVar;
        super.mQ(bundle);
        this.ag = this.ah.oi();
        try {
            this.av = (apzg) aopi.parseFrom(apzg.a, this.m.getByteArray("get_offers_command"), aoos.b());
        } catch (aopx e) {
            Log.e("SponsorshipsOffer", "Failed to deserialize offers command.", e);
        }
        if (this.m.containsKey("get_offers_response")) {
            ashr ashrVar = (ashr) this.aq.a(this.m.getByteArray("get_offers_response"), ashr.a);
            if (ashrVar == null) {
                Log.e("SponsorshipsOffer", "Failed to deserialize offer list renderer.");
            } else {
                ashh ashhVar = ashrVar.d;
                if (ashhVar == null) {
                    ashhVar = ashh.a;
                }
                if (ashhVar.c == 204280949) {
                    ashh ashhVar2 = ashrVar.d;
                    if (ashhVar2 == null) {
                        ashhVar2 = ashh.a;
                    }
                    if (ashhVar2.c == 204280949) {
                        auyoVar = (auyo) ashhVar2.d;
                    } else {
                        auyoVar = auyo.a;
                    }
                    this.ae = auyoVar;
                }
            }
        }
        mN(0, 2132083459);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.sponsorships_offer_dialog_layout, viewGroup, false);
        this.af = loadingFrameLayout;
        if (loadingFrameLayout.getLayoutParams() == null) {
            this.af.setLayoutParams(new xx(-1, -1));
        }
        Toolbar toolbar = (Toolbar) this.af.findViewById(R.id.toolbar);
        this.aw = toolbar;
        toolbar.r(this);
        yzh yzhVar = new yzh(this.au);
        Toolbar toolbar2 = this.aw;
        toolbar2.q(yzhVar.b(toolbar2.e(), zhn.j(this.au, R.attr.ytIconActiveOther).orElse(0)));
        if (this.ae != null) {
            aG();
        } else if (this.af != null && this.av != null) {
            abel a = this.ai.a();
            a.t((YpcOffersEndpoint$YPCOffersEndpoint) this.av.qm(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
            apzg apzgVar = this.av;
            if ((apzgVar.b & 1) == 0) {
                a.k(aadi.b);
            } else {
                a.k(apzgVar.c.I());
            }
            this.af.c();
            this.ai.b(a, new yhf(this));
        }
        return this.af;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }
}
