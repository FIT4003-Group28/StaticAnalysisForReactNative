package defpackage;

import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxy  reason: default package */
/* loaded from: classes3.dex */
public final class hxy implements aafl {
    private final ibm a;
    private final gkj b;

    public hxy(ibm ibmVar, gkj gkjVar) {
        this.a = ibmVar;
        this.b = gkjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Optional a = this.a.a();
        ates atesVar = ((MenuEndpointOuterClass$MenuEndpoint) apzgVar.qm(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        atep atepVar = atesVar.c;
        if (atepVar == null) {
            atepVar = atep.a;
        }
        if (!atepVar.k || !a.isPresent()) {
            this.b.kD(apzgVar, map);
        } else {
            ((ibn) a.get()).r(atepVar);
        }
    }
}
