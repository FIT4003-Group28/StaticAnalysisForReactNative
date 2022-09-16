package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aiht  reason: default package */
/* loaded from: classes2.dex */
public final class aiht extends aihs {
    private static final eaow c = eaow.c(5);
    private final dqzv d;

    public aiht(eapd eapdVar, dqzv dqzvVar) {
        super(eapdVar, c);
        this.d = dqzvVar;
    }

    public static aiht c(aimf aimfVar) {
        aimh aimhVar;
        aimh aimhVar2;
        boolean z = false;
        dbsk.l(aimfVar.b == 3);
        if (aimfVar.b == 3) {
            aimhVar = (aimh) aimfVar.c;
        } else {
            aimhVar = aimh.c;
        }
        if (1 == (aimhVar.a & 1)) {
            z = true;
        }
        dbsk.l(z);
        eapd eapdVar = new eapd(aimfVar.d);
        if (aimfVar.b == 3) {
            aimhVar2 = (aimh) aimfVar.c;
        } else {
            aimhVar2 = aimh.c;
        }
        dqzv dqzvVar = aimhVar2.b;
        if (dqzvVar == null) {
            dqzvVar = dqzv.h;
        }
        return new aiht(eapdVar, dqzvVar);
    }

    @Override // defpackage.aihs
    public final List<aihr> a(List<aihr> list, ahvi ahviVar) {
        if (ahwg.g(this.d)) {
            return dcdc.r(list);
        }
        dccx F = dcdc.F();
        for (aihr aihrVar : list) {
            if (f(this.d, aihrVar.a())) {
                dbsg<aihr> i = dbsg.i(aihrVar);
                while (true) {
                    if (i.a()) {
                        if (!i.b().a().e()) {
                            break;
                        }
                        i = i.b().b();
                    } else {
                        i = dbpy.a;
                        break;
                    }
                }
                if (i.a()) {
                    F.g(i.b());
                }
            } else {
                F.g(aihrVar);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihs
    public final aimf b() {
        aime bZ = aimf.e.bZ();
        long j = this.a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimf aimfVar = (aimf) bZ.b;
        aimfVar.a |= 1;
        aimfVar.d = j;
        aimg bZ2 = aimh.c.bZ();
        dqzv dqzvVar = this.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        aimh aimhVar = (aimh) bZ2.b;
        dqzvVar.getClass();
        aimhVar.b = dqzvVar;
        aimhVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimf aimfVar2 = (aimf) bZ.b;
        aimh bK = bZ2.bK();
        bK.getClass();
        aimfVar2.c = bK;
        aimfVar2.b = 3;
        return bZ.bK();
    }
}
