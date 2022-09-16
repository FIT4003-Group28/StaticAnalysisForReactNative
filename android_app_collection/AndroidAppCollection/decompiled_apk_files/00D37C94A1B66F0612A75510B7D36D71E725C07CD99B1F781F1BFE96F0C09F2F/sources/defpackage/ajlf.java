package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ajlf  reason: default package */
/* loaded from: classes.dex */
public final class ajlf implements tct {
    private final ajlq a;
    private final yrj b;

    public ajlf(ajlq ajlqVar, yrj yrjVar) {
        this.a = ajlqVar;
        this.b = yrjVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return aqgd.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        apzg apzgVar;
        aqgd aqgdVar = (aqgd) obj;
        if (this.b.o()) {
            awmt awmtVar = aqgdVar.c;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            apzgVar = (apzg) awmtVar.qm(arng.a);
            if (apzgVar == null || !apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
                return aynr.s(new ted("Invalid ConnectivityDependentCommand: missing InnertubeCommand"));
            }
        } else {
            awmt awmtVar2 = aqgdVar.d;
            if (awmtVar2 == null) {
                awmtVar2 = awmt.a;
            }
            apzgVar = (apzg) awmtVar2.qm(arng.a);
            if (apzgVar == null || !apzgVar.qn(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                return aynr.s(new ted("Invalid ConnectivityDependentCommand: missing InnertubeCommand"));
            }
        }
        return this.a.b(apzgVar, tcsVar);
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
