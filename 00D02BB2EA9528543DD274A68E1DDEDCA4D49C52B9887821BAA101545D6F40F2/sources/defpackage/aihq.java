package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aihq  reason: default package */
/* loaded from: classes2.dex */
public final class aihq extends aihs {
    private static final eaow c = eaow.c(5);
    private static final eaow d = eaow.c(1);
    private final dqzv e;
    private final boolean f;

    public aihq(eapd eapdVar, dqzv dqzvVar, boolean z) {
        super(eapdVar, z ? d : c);
        this.e = dqzvVar;
        this.f = z;
    }

    public static aihq c(aimf aimfVar) {
        aimd aimdVar;
        aimd aimdVar2;
        dbsk.l(aimfVar.b == 2);
        eapd eapdVar = new eapd(aimfVar.d);
        if (aimfVar.b == 2) {
            aimdVar = (aimd) aimfVar.c;
        } else {
            aimdVar = aimd.d;
        }
        dqzv dqzvVar = aimdVar.b;
        if (dqzvVar == null) {
            dqzvVar = dqzv.h;
        }
        if (aimfVar.b == 2) {
            aimdVar2 = (aimd) aimfVar.c;
        } else {
            aimdVar2 = aimd.d;
        }
        return new aihq(eapdVar, dqzvVar, aimdVar2.c);
    }

    @Override // defpackage.aihs
    public final /* bridge */ /* synthetic */ List a(List list, ahvi ahviVar) {
        dbsg<ahwg> h = ahwg.h(this.e, ahviVar, this.f, dbsg.i(this.a));
        if (!h.a()) {
            return dcdc.r(list);
        }
        dccx F = dcdc.F();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            aihr aihrVar = (aihr) it.next();
            if (f(this.e, aihrVar.a())) {
                F.g(aihr.c(h.b(), dbsg.i(aihrVar)));
                z = true;
            } else {
                F.g(aihrVar);
            }
        }
        if (!z) {
            F.g(aihr.c(h.b(), dbpy.a));
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
        aimc bZ2 = aimd.d.bZ();
        boolean z = this.f;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        aimd aimdVar = (aimd) bZ2.b;
        int i = aimdVar.a | 2;
        aimdVar.a = i;
        aimdVar.c = z;
        dqzv dqzvVar = this.e;
        dqzvVar.getClass();
        aimdVar.b = dqzvVar;
        aimdVar.a = i | 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimf aimfVar2 = (aimf) bZ.b;
        aimd bK = bZ2.bK();
        bK.getClass();
        aimfVar2.c = bK;
        aimfVar2.b = 2;
        return bZ.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aihq)) {
            return false;
        }
        aihq aihqVar = (aihq) obj;
        return dbsd.a(this.b, aihqVar.b) && dbsd.a(this.a, aihqVar.a) && dbsd.a(Boolean.valueOf(this.f), Boolean.valueOf(aihqVar.f)) && this.e.equals(aihqVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, Boolean.valueOf(this.f)});
    }
}
