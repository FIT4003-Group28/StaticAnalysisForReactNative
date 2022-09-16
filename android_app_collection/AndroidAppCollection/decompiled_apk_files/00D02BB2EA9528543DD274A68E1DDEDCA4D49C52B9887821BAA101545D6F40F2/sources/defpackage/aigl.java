package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aigl  reason: default package */
/* loaded from: classes2.dex */
public final class aigl extends aigm {
    public static final /* synthetic */ int a = 0;
    private static final eaow d = eaow.c(1);
    private final doep e;

    public aigl(eapd eapdVar, doep doepVar) {
        super(eapdVar, d);
        this.e = doepVar;
    }

    public static aigm c(aill aillVar) {
        ailj ailjVar;
        dbsk.l(aillVar.b == 2);
        eapd eapdVar = new eapd(aillVar.d);
        if (aillVar.b == 2) {
            ailjVar = (ailj) aillVar.c;
        } else {
            ailjVar = ailj.c;
        }
        doep doepVar = ailjVar.b;
        if (doepVar == null) {
            doepVar = doep.i;
        }
        return new aigl(eapdVar, doepVar);
    }

    @Override // defpackage.aigm
    public final ailh a(ailh ailhVar) {
        ailg bZ = ailh.b.bZ();
        dcep L = dcep.L(dcft.o(ailhVar.a, aigk.a));
        bZ.a(ailhVar.a);
        dqyj dqyjVar = this.e.c;
        if (dqyjVar == null) {
            dqyjVar = dqyj.f;
        }
        if (!L.contains(dqyjVar.b)) {
            doep doepVar = this.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ailh ailhVar2 = (ailh) bZ.b;
            doepVar.getClass();
            ailhVar2.b();
            ailhVar2.a.add(doepVar);
        }
        return bZ.bK();
    }

    @Override // defpackage.aigm
    public final aill b() {
        ailk bZ = aill.e.bZ();
        long j = this.b.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aill aillVar = (aill) bZ.b;
        aillVar.a |= 1;
        aillVar.d = j;
        aill bK = bZ.bK();
        dsqp dsqpVar = (dsqp) bK.cu(5);
        dsqpVar.bC(bK);
        ailk ailkVar = (ailk) dsqpVar;
        aili bZ2 = ailj.c.bZ();
        doep doepVar = this.e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ailj ailjVar = (ailj) bZ2.b;
        doepVar.getClass();
        ailjVar.b = doepVar;
        ailjVar.a |= 1;
        if (ailkVar.c) {
            ailkVar.bF();
            ailkVar.c = false;
        }
        aill aillVar2 = (aill) ailkVar.b;
        ailj bK2 = bZ2.bK();
        bK2.getClass();
        aillVar2.c = bK2;
        aillVar2.b = 2;
        return ailkVar.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aigl)) {
            return false;
        }
        aigl aiglVar = (aigl) obj;
        return dbsd.a(this.c, aiglVar.c) && dbsd.a(this.b, aiglVar.b) && dbsd.a(this.e, aiglVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b, this.e});
    }
}
