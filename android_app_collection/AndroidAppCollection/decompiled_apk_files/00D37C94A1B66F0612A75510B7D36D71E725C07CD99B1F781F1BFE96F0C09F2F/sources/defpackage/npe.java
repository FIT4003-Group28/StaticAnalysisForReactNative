package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: npe  reason: default package */
/* loaded from: classes3.dex */
public final class npe {
    public final ypf a;
    public final apy b;
    public final nmu c;
    public final aban d;
    public final Executor e;
    public final yzj f;
    public final azqb g;
    public final aafo h;

    public npe(apy apyVar, nmu nmuVar, aban abanVar, Executor executor, yzj yzjVar, azqb azqbVar, aafo aafoVar) {
        this.a = new ypf(apyVar.getLifecycle());
        this.b = apyVar;
        this.c = nmuVar;
        this.d = abanVar;
        this.e = executor;
        this.f = yzjVar;
        this.g = azqbVar;
        this.h = aafoVar;
    }

    public static Optional a(apzg apzgVar) {
        if (!apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            return Optional.empty();
        }
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 4) == 0) {
            return Optional.empty();
        }
        return Optional.of(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
    }

    public static final void b(nmc nmcVar, boolean z) {
        if (!(nmcVar instanceof nkh)) {
            return;
        }
        if (z) {
            ((nkh) nmcVar).d().c();
        } else {
            ((nkh) nmcVar).d().a();
        }
    }
}
