package defpackage;

import com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ebe  reason: default package */
/* loaded from: classes3.dex */
public final class ebe implements aafl {
    public final aafo a;
    private final afwc b;
    private final afvt c;
    private final dt d;

    public ebe(afwc afwcVar, afvt afvtVar, aafo aafoVar, dt dtVar) {
        this.b = afwcVar;
        this.c = afvtVar;
        this.a = aafoVar;
        this.d = dtVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        if (!apzgVar.qn(SignOutEndpointOuterClass.signOutEndpoint) || (((auwb) apzgVar.qm(SignOutEndpointOuterClass.signOutEndpoint)).b & 2) == 0) {
            this.b.qx("User requested sign out.");
            return;
        }
        final auwb auwbVar = (auwb) apzgVar.qm(SignOutEndpointOuterClass.signOutEndpoint);
        afvt afvtVar = this.c;
        auwa auwaVar = auwbVar.c;
        if (auwaVar == null) {
            auwaVar = auwa.a;
        }
        afvtVar.d(auwaVar.b);
        if ((auwbVar.b & 4) == 0) {
            return;
        }
        ylx.n(this.d, this.c.b(), etg.b, new zdt() { // from class: ebd
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ebe ebeVar = ebe.this;
                auwb auwbVar2 = auwbVar;
                Map map2 = map;
                if (((Boolean) obj).booleanValue()) {
                    apzg apzgVar2 = auwbVar2.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    ebeVar.a.c(wig.b(apzgVar2), map2);
                }
            }
        });
    }
}
