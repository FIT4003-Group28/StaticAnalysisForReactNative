package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akmi  reason: default package */
/* loaded from: classes.dex */
public final class akmi implements aafl {
    private final Context a;
    private final aaun b;
    private final aacz c;

    public akmi(Context context, aaun aaunVar, aacz aaczVar) {
        this.a = context;
        aaunVar.getClass();
        this.b = aaunVar;
        aaczVar.getClass();
        this.c = aaczVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        akmh akmhVar = (akmh) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akmh.class);
        List F = zgt.F(this.a.getPackageManager());
        atfw atfwVar = this.c.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apgv apgvVar = atfwVar.m;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        List r = apwt.r(F, apgvVar);
        this.b.d(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) apzgVar.qm(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b, r, new akmg(akmhVar, apzgVar, r), true);
    }
}
