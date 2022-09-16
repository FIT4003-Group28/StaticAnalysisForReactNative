package defpackage;

import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajuv  reason: default package */
/* loaded from: classes.dex */
final class ajuv implements ajgw {
    final /* synthetic */ aqft a;
    final /* synthetic */ atui b;
    final /* synthetic */ Map c;
    final /* synthetic */ ajuw d;

    public ajuv(ajuw ajuwVar, aqft aqftVar, atui atuiVar, Map map) {
        this.d = ajuwVar;
        this.a = aqftVar;
        this.b = atuiVar;
        this.c = map;
    }

    @Override // defpackage.ajgw
    public final void a() {
    }

    @Override // defpackage.ajgw
    public final void b() {
        apoj g = ajjh.g(this.a);
        if (g != null) {
            apzg apzgVar = g.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                return;
            }
        } else {
            apzg apzgVar2 = this.a.r;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            if (apzgVar2.qn(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                return;
            }
        }
        this.d.b(this.b, this.c);
    }

    @Override // defpackage.ajgw
    public final void c(boolean z) {
    }
}
