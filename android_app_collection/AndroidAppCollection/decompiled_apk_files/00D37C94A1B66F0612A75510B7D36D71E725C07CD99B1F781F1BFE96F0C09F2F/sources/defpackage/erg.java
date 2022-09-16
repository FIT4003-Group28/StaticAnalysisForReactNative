package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: erg  reason: default package */
/* loaded from: classes3.dex */
public final class erg implements aafl {
    private final eri a;

    public erg(eri eriVar) {
        this.a = eriVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        auql auqlVar = (auql) apzgVar.qm(auql.b);
        aqgx aqgxVar = auqlVar.c;
        if (aqgxVar == null) {
            aqgxVar = aqgx.a;
        }
        if (!aqgxVar.qn(aumx.b)) {
            return;
        }
        eri eriVar = this.a;
        String str = auqlVar.d;
        aqgx aqgxVar2 = auqlVar.c;
        if (aqgxVar2 == null) {
            aqgxVar2 = aqgx.a;
        }
        eriVar.a.c(erh.c(str, (aumx) aqgxVar2.qm(aumx.b)));
    }
}
