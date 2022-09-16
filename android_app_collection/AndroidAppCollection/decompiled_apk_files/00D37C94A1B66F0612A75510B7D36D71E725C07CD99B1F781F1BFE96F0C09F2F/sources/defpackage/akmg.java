package defpackage;

import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;
/* compiled from: PG */
/* renamed from: akmg  reason: default package */
/* loaded from: classes.dex */
final class akmg implements afzf {
    final /* synthetic */ akmh a;
    final /* synthetic */ apzg b;
    final /* synthetic */ List c;

    public akmg(akmh akmhVar, apzg apzgVar, List list) {
        this.a = akmhVar;
        this.b = apzgVar;
        this.c = list;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        akmh akmhVar = this.a;
        if (akmhVar != null) {
            akmhVar.b(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) this.b.qm(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aauu aauuVar = (aauu) obj;
        if (this.a != null) {
            akmh akmhVar = this.a;
            String str = ((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) this.b.qm(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b;
            akmhVar.c(str, aaut.t(str, this.c));
        }
    }
}
