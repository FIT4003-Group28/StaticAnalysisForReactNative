package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: iiz  reason: default package */
/* loaded from: classes3.dex */
public final class iiz implements aafl {
    private final iiy a;

    public iiz(iiy iiyVar) {
        this.a = iiyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqxo.p(apzgVar.qn(aqsi.b));
        aqsi aqsiVar = (aqsi) apzgVar.qm(aqsi.b);
        if ((aqsiVar.c & 8) != 0) {
            aunb aunbVar = aqsiVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(atau.a)) {
                return;
            }
            this.a.g(aqsiVar);
        }
    }
}
