package defpackage;

import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: foj  reason: default package */
/* loaded from: classes3.dex */
public final class foj implements aafl {
    final bame a;

    public foj(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint) apzgVar.qm(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
        apoa apoaVar = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (apoaVar == null) {
            apoaVar = apoa.a;
        }
        if ((apoaVar.b & 1) != 0) {
            ajxn ajxnVar = (ajxn) zew.K(map, "sectionListController", ajxn.class);
            if (ajxnVar == null) {
                if ((browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b & 4) == 0 || !browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.e) {
                    apzgVar = null;
                }
                bame bameVar = this.a;
                String str = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.d;
                apoa apoaVar2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
                if (apoaVar2 == null) {
                    apoaVar2 = apoa.a;
                }
                aumx aumxVar = apoaVar2.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                bameVar.c(zab.e(str, aumxVar, apzgVar, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.f));
            } else if (!(ajxnVar instanceof ajwq)) {
                apoa apoaVar3 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
                if (apoaVar3 == null) {
                    apoaVar3 = apoa.a;
                }
                aumx aumxVar2 = apoaVar3.c;
                if (aumxVar2 == null) {
                    aumxVar2 = aumx.a;
                }
                ajxnVar.aa(ajna.g(aumxVar2), apzgVar);
            } else {
                ajwq ajwqVar = (ajwq) ajxnVar;
                apoa apoaVar4 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
                if (apoaVar4 == null) {
                    apoaVar4 = apoa.a;
                }
                aumx aumxVar3 = apoaVar4.c;
                if (aumxVar3 == null) {
                    aumxVar3 = aumx.a;
                }
                ajwqVar.lx(aumxVar3, apzgVar);
            }
        }
    }
}
