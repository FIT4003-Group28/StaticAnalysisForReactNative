package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass;
import java.util.List;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {xbj.class, xaj.class, xbf.class})
/* renamed from: woa  reason: default package */
/* loaded from: classes4.dex */
public final class woa extends wok {
    public final wvx a;
    public final xdu b;

    public woa(woo wooVar, wvx wvxVar, xdu xduVar) {
        super(wooVar);
        this.a = wvxVar;
        this.b = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wnz
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                woa woaVar = woa.this;
                xdu xduVar = (xdu) obj;
                InstreamAd instreamAd = (InstreamAd) xduVar.d(xbf.class);
                List list = (List) xduVar.d(xaj.class);
                apnh apnhVar = (apnh) xduVar.d(xan.class);
                String str = (String) xduVar.d(xbj.class);
                aoyz aoyzVar = null;
                if (apnhVar != null) {
                    wvx wvxVar = woaVar.a;
                    xdu xduVar2 = woaVar.b;
                    aozb aozbVar = apnhVar.b;
                    if (aozbVar == null) {
                        aozbVar = aozb.a;
                    }
                    String str2 = aozbVar.b;
                    aozb aozbVar2 = apnhVar.b;
                    if (aozbVar2 == null) {
                        aozbVar2 = aozb.a;
                    }
                    apcb b = apcb.b(aozbVar2.c);
                    if (b == null) {
                        b = apcb.LAYOUT_TYPE_UNSPECIFIED;
                    }
                    apcb apcbVar = b;
                    aozb aozbVar3 = apnhVar.b;
                    if (aozbVar3 == null) {
                        aozbVar3 = aozb.a;
                    }
                    aoyz aoyzVar2 = aozbVar3.d;
                    if (aoyzVar2 == null) {
                        aoyzVar2 = aoyz.a;
                    }
                    ampq j = ampq.j(aoyzVar2);
                    aunb aunbVar = apnhVar.c;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    return wvxVar.a(xduVar2, str2, apcbVar, j, str, instreamAd, ((aoyo) aunbVar.qm(AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer)).b);
                } else if (list == null || list.isEmpty()) {
                    return null;
                } else {
                    wvx wvxVar2 = woaVar.a;
                    xdu xduVar3 = woaVar.b;
                    if (instreamAd instanceof InstreamAdImpl) {
                        PlayerAd playerAd = ((InstreamAdImpl) instreamAd).b;
                        if (playerAd instanceof LocalVideoAd) {
                            aoyzVar = ((LocalVideoAd) playerAd).qP();
                        }
                    }
                    return wvxVar2.a(xduVar3, wvxVar2.c.a(apcb.LAYOUT_TYPE_IMMERSIVE, xduVar3.a), apcb.LAYOUT_TYPE_IMMERSIVE, ampq.i(aoyzVar), str, instreamAd, list);
                }
            }
        });
    }
}
