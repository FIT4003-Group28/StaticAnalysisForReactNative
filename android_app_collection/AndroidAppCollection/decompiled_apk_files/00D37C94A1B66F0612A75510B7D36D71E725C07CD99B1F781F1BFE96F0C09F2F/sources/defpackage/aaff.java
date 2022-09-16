package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aaff  reason: default package */
/* loaded from: classes.dex */
public final class aaff extends aafi {
    private final amuk a;
    private final aafo b;

    public aaff(amuk amukVar, aafo aafoVar) {
        this.a = amukVar;
        this.b = aafoVar;
    }

    @Override // defpackage.aafi, defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        if (apzgVar == null) {
            return;
        }
        amuk amukVar = this.a;
        int size = amukVar.size();
        for (int i = 0; i < size; i++) {
            aafl f = ((aafi) amukVar.get(i)).f(apzgVar);
            if (f != aafl.x) {
                try {
                    f.kD(apzgVar, map);
                    return;
                } catch (aafy e) {
                    zep.d("CommandResolver threw exception during resolution", e);
                }
            }
        }
        aafo aafoVar = this.b;
        if (aafoVar != null) {
            aafoVar.c(apzgVar, map);
            return;
        }
        String valueOf = String.valueOf(apzgVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unknown command not resolved");
        sb.append(valueOf);
        zep.l(sb.toString());
    }

    @Override // defpackage.aafi
    public final aafl f(apzg apzgVar) {
        if (aafp.a(apzgVar) == null) {
            return aafl.x;
        }
        amuk amukVar = this.a;
        int size = amukVar.size();
        int i = 0;
        while (i < size) {
            aafl f = ((aafi) amukVar.get(i)).f(apzgVar);
            i++;
            if (f != aafl.x) {
                return f;
            }
        }
        return aafl.x;
    }
}
