package defpackage;
/* compiled from: PG */
/* renamed from: boyn  reason: default package */
/* loaded from: classes3.dex */
final class boyn implements bpwg {
    final /* synthetic */ boys a;

    public boyn(boys boysVar) {
        this.a = boysVar;
    }

    @Override // defpackage.bpwg
    public final void a() {
        boys boysVar = this.a;
        if (!boysVar.aD) {
            return;
        }
        if (boysVar.e.b().isEmpty()) {
            boysVar.c.h(bpuh.CAROUSEL);
            return;
        }
        dnqe dnqeVar = boysVar.f;
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqe dnqeVar3 = dnqe.i;
        dnqeVar2.c = 2;
        dnqeVar2.a |= 2;
        dnqe a = bpun.a(dnpsVar.bK(), dnpv.ROAD_RAP_EXTENT_PICKER, "Yes");
        bpub bZ = bpue.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar = (bpue) bZ.b;
        bpueVar.b = 1;
        int i = 1 | bpueVar.a;
        bpueVar.a = i;
        a.getClass();
        bpueVar.c = a;
        bpueVar.a = i | 2;
        dpsn dpsnVar = boysVar.e.a;
        dbsk.s(dpsnVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar2 = (bpue) bZ.b;
        dpsnVar.getClass();
        bpueVar2.d = dpsnVar;
        bpueVar2.a |= 4;
        dhjz dhjzVar = boysVar.e.b;
        dbsk.s(dhjzVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar3 = (bpue) bZ.b;
        dhjzVar.getClass();
        bpueVar3.e = dhjzVar;
        bpueVar3.a |= 8;
        doay doayVar = doay.TYPE_ROAD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar4 = (bpue) bZ.b;
        bpueVar4.g = doayVar.j;
        bpueVar4.a |= 32;
        akqs akqsVar = boysVar.e.f;
        dbsk.s(akqsVar);
        dpuq l = akqsVar.l();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar5 = (bpue) bZ.b;
        l.getClass();
        bpueVar5.i = l;
        bpueVar5.a |= 64;
        dpsm bZ2 = dpsn.d.bZ();
        long j = boysVar.e.h;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpsn dpsnVar2 = (dpsn) bZ2.b;
        dpsnVar2.a |= 2;
        dpsnVar2.c = j;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar6 = (bpue) bZ.b;
        dpsn bK = bZ2.bK();
        bK.getClass();
        bpueVar6.j = bK;
        bpueVar6.a |= 128;
        String str = boysVar.e.c;
        dbsk.s(str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar7 = (bpue) bZ.b;
        str.getClass();
        bpueVar7.a |= 256;
        bpueVar7.k = str;
        dcdc<Long> b = boysVar.e.b();
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            dpsm bZ3 = dpsn.d.bZ();
            long longValue = b.get(i2).longValue();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpsn dpsnVar3 = (dpsn) bZ3.b;
            dpsnVar3.a |= 2;
            dpsnVar3.c = longValue;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpue bpueVar8 = (bpue) bZ.b;
            dpsn bK2 = bZ3.bK();
            bK2.getClass();
            bpueVar8.b();
            bpueVar8.h.add(bK2);
        }
        dcpd<Long> it = boysVar.e.e.iterator();
        while (it.hasNext()) {
            dpsm bZ4 = dpsn.d.bZ();
            long longValue2 = it.next().longValue();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dpsn dpsnVar4 = (dpsn) bZ4.b;
            dpsnVar4.a |= 2;
            dpsnVar4.c = longValue2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpue bpueVar9 = (bpue) bZ.b;
            dpsn bK3 = bZ4.bK();
            bK3.getClass();
            bpueVar9.c();
            bpueVar9.l.add(bK3);
        }
        boysVar.Nw(bZ.bK());
        gfq.m(boysVar);
    }
}
