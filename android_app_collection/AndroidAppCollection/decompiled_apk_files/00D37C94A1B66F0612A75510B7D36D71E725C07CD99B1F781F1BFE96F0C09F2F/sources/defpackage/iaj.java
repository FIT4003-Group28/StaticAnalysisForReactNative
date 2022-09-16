package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: iaj  reason: default package */
/* loaded from: classes3.dex */
public final class iaj {
    public final long a;
    public final boolean b;
    public final boolean c;
    public apzg d;
    public artv e;
    public ibk f;
    public long g = Long.MIN_VALUE;
    public final aoob h;

    public iaj(long j, apzg apzgVar, aoob aoobVar, boolean z, boolean z2) {
        aqxo.y(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        this.a = j;
        apzgVar.getClass();
        this.d = apzgVar;
        this.h = aoobVar;
        this.b = z;
        this.c = z2;
    }

    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint a() {
        aqxo.y(this.d.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        return (ReelWatchEndpointOuterClass$ReelWatchEndpoint) this.d.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }

    public final void b(artv artvVar) {
        this.e = artvVar;
        if (hqp.h(artvVar)) {
            aopc aopcVar = (aopc) this.d.mo52toBuilder();
            aopg aopgVar = ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
            aopa mo52toBuilder = a().mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) mo52toBuilder.instance;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.h = null;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.b &= -65;
            aopcVar.e(aopgVar, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) mo52toBuilder.mo39build());
            this.d = (apzg) aopcVar.mo39build();
        }
    }
}
