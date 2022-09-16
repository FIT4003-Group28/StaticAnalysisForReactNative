package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import java.util.Iterator;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_COMPANION, b = apcd.SLOT_TYPE_BELOW_PLAYER, c = {xaq.class, xbf.class, xat.class})
/* renamed from: wpv  reason: default package */
/* loaded from: classes4.dex */
public final class wpv implements wqg {
    private final wqf a;
    private final xdu b;
    private final xci c;
    private final wlt d;
    private final aqfd e;
    private final InstreamAd f;
    private final PlayerResponseModel g;

    public wpv(wqf wqfVar, xdu xduVar, xci xciVar, wlt wltVar) {
        this.a = wqfVar;
        this.b = xduVar;
        this.c = xciVar;
        this.d = wltVar;
        this.e = (aqfd) xciVar.e(xaq.class);
        this.f = (InstreamAd) xciVar.e(xbf.class);
        this.g = (PlayerResponseModel) xciVar.e(xat.class);
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        wlt wltVar = this.d;
        xci xciVar = this.c;
        String str = xciVar.a;
        InstreamAd instreamAd = this.f;
        PlayerResponseModel playerResponseModel = this.g;
        aqfd aqfdVar = this.e;
        asit asitVar = (asit) xciVar.i.f();
        wkh wkhVar = (wkh) wltVar;
        wkhVar.c();
        wkhVar.c = instreamAd;
        wkhVar.e = true;
        wkhVar.d = true;
        if (wkhVar.c != null) {
            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = null;
            if ((aqfdVar.b & 64) != 0) {
                atjm atjmVar = aqfdVar.i;
                if (atjmVar == null) {
                    atjmVar = atjm.a;
                }
                for (aunb aunbVar : atjmVar.b) {
                    MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = aunbVar.qn(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer) ? (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) aunbVar.qm(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer) : null;
                    if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 != null && (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.b & 1) != 0) {
                        wkhVar.g.put(multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.c, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2);
                    }
                }
            }
            Iterator it = wkhVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wkg wkgVar = (wkg) it.next();
                if (wkgVar.i(str, aqfdVar, asitVar)) {
                    wkhVar.d(wkgVar);
                    break;
                }
            }
            if (wkhVar.b == null) {
                if ((aqfdVar.b & 64) != 0) {
                    atjm atjmVar2 = aqfdVar.i;
                    if (atjmVar2 == null) {
                        atjmVar2 = atjm.a;
                    }
                    Iterator it2 = atjmVar2.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        aunb aunbVar2 = (aunb) it2.next();
                        if (aunbVar2.qn(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer)) {
                            multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) aunbVar2.qm(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                            break;
                        }
                    }
                }
                if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer != null && (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.b & 2) != 0) {
                    aunb aunbVar3 = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.d;
                    if (aunbVar3 == null) {
                        aunbVar3 = aunb.a;
                    }
                    Iterator it3 = wkhVar.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        wkg wkgVar2 = (wkg) it3.next();
                        if ((wkgVar2 instanceof wkf) && ((wkf) wkgVar2).j(str, aunbVar3)) {
                            wkhVar.d(wkgVar2);
                            break;
                        }
                    }
                }
            }
            if (wkhVar.b == null) {
                wkhVar.d(wkhVar.a(playerResponseModel, str, asitVar));
            }
            wke wkeVar = wkhVar.b;
            if (wkeVar != null && wkhVar.d) {
                wkeVar.f();
            }
        }
        this.a.a(this.b, this.c);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        ((wkh) this.d).c();
        this.a.d(this.b, this.c, i);
    }
}
