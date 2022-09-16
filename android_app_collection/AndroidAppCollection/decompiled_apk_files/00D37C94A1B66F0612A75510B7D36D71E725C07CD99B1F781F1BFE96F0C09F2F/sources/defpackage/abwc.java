package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: abwc  reason: default package */
/* loaded from: classes.dex */
public final class abwc implements aafl {
    private final ajhr a;
    private final aafo b;
    private final achm c;

    public abwc(ajhr ajhrVar, aafo aafoVar, achm achmVar) {
        this.a = ajhrVar;
        this.b = aafoVar;
        this.c = achmVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.a();
        aqmq aqmqVar = (aqmq) apzgVar.qm(aqmq.b);
        achl achlVar = this.c.a;
        if (achlVar != null) {
            ((acll) achlVar).an = true;
        }
        aafo aafoVar = this.b;
        apzg apzgVar2 = aqmqVar.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.a(apzgVar2);
    }
}
