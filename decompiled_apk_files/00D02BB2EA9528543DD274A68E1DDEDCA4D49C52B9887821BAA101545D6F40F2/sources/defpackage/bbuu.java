package defpackage;

import java.io.Serializable;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bbuu  reason: default package */
/* loaded from: classes3.dex */
public class bbuu implements Serializable {
    private final HashMap<String, dqjh> a = new HashMap<>();

    public final dqjc a(dwfl dwflVar) {
        dqjh dqjhVar = this.a.get(dwflVar.d);
        dqjc dqjcVar = dwflVar.s;
        if (dqjcVar == null) {
            dqjcVar = dqjc.d;
        }
        if (dqjhVar != null) {
            dqjh b = dqjh.b(dqjcVar.c);
            if (b == null) {
                b = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (!dqjhVar.equals(b)) {
                int i = dqjcVar.b;
                dqjh b2 = dqjh.b(dqjcVar.c);
                if (b2 == null) {
                    b2 = dqjh.UNKNOWN_VOTE_TYPE;
                }
                if (b2.equals(dqjh.THUMBS_UP)) {
                    i--;
                } else if (dqjhVar.equals(dqjh.THUMBS_UP)) {
                    i++;
                }
                dqjc dqjcVar2 = dwflVar.s;
                if (dqjcVar2 == null) {
                    dqjcVar2 = dqjc.d;
                }
                dsqp dsqpVar = (dsqp) dqjcVar2.cu(5);
                dsqpVar.bC(dqjcVar2);
                dqjb dqjbVar = (dqjb) dsqpVar;
                if (dqjbVar.c) {
                    dqjbVar.bF();
                    dqjbVar.c = false;
                }
                dqjc dqjcVar3 = (dqjc) dqjbVar.b;
                dqjcVar3.c = dqjhVar.e;
                int i2 = dqjcVar3.a | 8;
                dqjcVar3.a = i2;
                dqjcVar3.a = i2 | 1;
                dqjcVar3.b = i;
                return dqjbVar.bK();
            }
        }
        return dqjcVar;
    }

    public void b(String str, dqjh dqjhVar) {
        this.a.put(str, dqjhVar);
    }
}
