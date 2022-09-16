package defpackage;

import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: addn  reason: default package */
/* loaded from: classes.dex */
public final class addn implements aafl {
    private static final String b = zep.a("MDX.MdxPairingCommand");
    public final adgc a;
    private final dt c;
    private final adnq d;

    public addn(dt dtVar, adnq adnqVar, adgc adgcVar) {
        this.c = dtVar;
        this.d = adnqVar;
        this.a = adgcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(MdxPairingEndpointOuterClass.mdxPairingEndpoint)) {
            zep.m(b, "Mdx pairing endpoint not filled");
            return;
        }
        atdo atdoVar = (atdo) apzgVar.qm(MdxPairingEndpointOuterClass.mdxPairingEndpoint);
        if ((atdoVar.b & 1) == 0) {
            zep.m(b, "Mdx pairing endpoint missing pairing code");
        } else {
            this.d.k(new adit(atdoVar.c), yit.c(this.c, new addm(this)));
        }
    }
}
