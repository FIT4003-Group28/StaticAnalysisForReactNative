package defpackage;

import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
/* compiled from: PG */
/* renamed from: gwq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gwq implements Runnable {
    public final /* synthetic */ gxk a;
    private final /* synthetic */ int b;

    public /* synthetic */ gwq(gxk gxkVar) {
        this.a = gxkVar;
    }

    public /* synthetic */ gwq(gxk gxkVar, int i) {
        this.b = i;
        this.a = gxkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            gxk gxkVar = this.a;
            hew hewVar = gxkVar.aj;
            hewVar.f = gxkVar;
            hewVar.i();
        } else if (i == 1) {
            gxk gxkVar2 = this.a;
            gxkVar2.aj.b();
            gxkVar2.aj.f = null;
        } else if (i != 2) {
            if (i == 3) {
                this.a.aJ();
                return;
            }
            gxk gxkVar3 = this.a;
            amuk amukVar = hes.a;
            if (gxkVar3 == null) {
                return;
            }
            gxkVar3.aP(false);
        } else {
            gxk gxkVar4 = this.a;
            if (!gxkVar4.aV() || !gxkVar4.aX.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
                return;
            }
            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) gxkVar4.aX.qm(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
            if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 8) == 0) {
                return;
            }
            aafo aafoVar = gxkVar4.ap;
            apzg apzgVar = shortsCreationEndpointOuterClass$ShortsCreationEndpoint.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
    }
}
