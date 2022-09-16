package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: wwe  reason: default package */
/* loaded from: classes4.dex */
public final class wwe {
    private final boolean a;
    private final aadd b;

    public wwe(aadd aaddVar, snc sncVar, wkl wklVar) {
        this.b = aaddVar;
        this.a = new Random(sncVar.c()).nextFloat() < wklVar.a();
    }

    public static apdh a(xdu xduVar, boolean z, boolean z2) {
        aopa g = g(xduVar);
        if (z2) {
            aopa createBuilder = apdg.a.createBuilder();
            String str = xduVar.a;
            createBuilder.copyOnWrite();
            apdg apdgVar = (apdg) createBuilder.instance;
            apdgVar.b |= 1;
            apdgVar.c = str;
            amuk amukVar = xduVar.d;
            if (((amxx) amukVar).c > 0) {
                apdi b = b((xek) amukVar.get(0));
                createBuilder.copyOnWrite();
                apdg apdgVar2 = (apdg) createBuilder.instance;
                b.getClass();
                apdgVar2.e = b;
                apdgVar2.b |= 4;
            }
            amuk amukVar2 = xduVar.e;
            int i = ((amxx) amukVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                apdi b2 = b((xek) amukVar2.get(i2));
                createBuilder.copyOnWrite();
                apdg apdgVar3 = (apdg) createBuilder.instance;
                b2.getClass();
                aopu aopuVar = apdgVar3.f;
                if (!aopuVar.c()) {
                    apdgVar3.f = aopi.mutableCopy(aopuVar);
                }
                apdgVar3.f.add(b2);
            }
            amuk amukVar3 = xduVar.f;
            int i3 = ((amxx) amukVar3).c;
            for (int i4 = 0; i4 < i3; i4++) {
                apdi b3 = b((xek) amukVar3.get(i4));
                createBuilder.copyOnWrite();
                apdg apdgVar4 = (apdg) createBuilder.instance;
                b3.getClass();
                aopu aopuVar2 = apdgVar4.g;
                if (!aopuVar2.c()) {
                    apdgVar4.g = aopi.mutableCopy(aopuVar2);
                }
                apdgVar4.g.add(b3);
            }
            createBuilder.copyOnWrite();
            apdg apdgVar5 = (apdg) createBuilder.instance;
            apdgVar5.b |= 2;
            apdgVar5.d = z;
            apdg apdgVar6 = (apdg) createBuilder.mo39build();
            g.copyOnWrite();
            apdh apdhVar = (apdh) g.instance;
            apdh apdhVar2 = apdh.a;
            apdgVar6.getClass();
            apdhVar.f = apdgVar6;
            apdhVar.b |= 8;
        }
        return (apdh) g.mo39build();
    }

    public static apdi b(xek xekVar) {
        return e(xekVar, apdi.a.createBuilder());
    }

    public static apdi e(xek xekVar, aopa aopaVar) {
        apcf b = xekVar.b();
        aopaVar.copyOnWrite();
        apdi apdiVar = (apdi) aopaVar.instance;
        apdi apdiVar2 = apdi.a;
        apdiVar.e = b.af;
        apdiVar.b |= 1;
        if (xekVar.d()) {
            aopaVar.copyOnWrite();
            apdi apdiVar3 = (apdi) aopaVar.instance;
            apdiVar3.b |= 16;
            apdiVar3.g = true;
        }
        boolean z = xekVar instanceof xcj;
        if (z || (xekVar instanceof xdv)) {
            aopa createBuilder = apdj.a.createBuilder();
            if (z) {
                String a = ((xcj) xekVar).a();
                createBuilder.copyOnWrite();
                apdj apdjVar = (apdj) createBuilder.instance;
                apdjVar.b = 2;
                apdjVar.c = a;
            }
            if (xekVar instanceof xdv) {
                String e = ((xdv) xekVar).e();
                createBuilder.copyOnWrite();
                apdj apdjVar2 = (apdj) createBuilder.instance;
                apdjVar2.b = 1;
                apdjVar2.c = e;
            }
            apdj apdjVar3 = (apdj) createBuilder.mo39build();
            aopaVar.copyOnWrite();
            apdi apdiVar4 = (apdi) aopaVar.instance;
            apdjVar3.getClass();
            apdiVar4.d = apdjVar3;
            apdiVar4.c = 4;
        }
        return (apdi) aopaVar.mo39build();
    }

    public static aopa f(apcb apcbVar, int i, amvn amvnVar) {
        aopa createBuilder = apcy.a.createBuilder();
        if (apcbVar == null) {
            apcbVar = apcb.LAYOUT_TYPE_UNSPECIFIED;
        }
        createBuilder.copyOnWrite();
        apcy apcyVar = (apcy) createBuilder.instance;
        apcyVar.c = apcbVar.aB;
        apcyVar.b |= 1;
        createBuilder.copyOnWrite();
        apcy apcyVar2 = (apcy) createBuilder.instance;
        apcyVar2.e = ((apca) wvv.b.get(Integer.valueOf(i))).f;
        apcyVar2.b |= 4;
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            apcf b = ((xek) it.next()).b();
            createBuilder.copyOnWrite();
            apcy apcyVar3 = (apcy) createBuilder.instance;
            aopq aopqVar = apcyVar3.f;
            if (!aopqVar.c()) {
                apcyVar3.f = aopi.mutableCopy(aopqVar);
            }
            apcyVar3.f.g(b.af);
        }
        return createBuilder;
    }

    private static aopa g(xdu xduVar) {
        aopa createBuilder = apdh.a.createBuilder();
        apcd c = xduVar.c();
        createBuilder.copyOnWrite();
        apdh apdhVar = (apdh) createBuilder.instance;
        apdhVar.c = c.r;
        apdhVar.b |= 1;
        createBuilder.copyOnWrite();
        apdh apdhVar2 = (apdh) createBuilder.instance;
        apdhVar2.g = ((apca) wvv.b.get(Integer.valueOf(xduVar.c))).f;
        apdhVar2.b |= 32;
        if (!xduVar.d.isEmpty()) {
            apcf b = apcf.b(b((xek) xduVar.d.get(0)).e);
            if (b == null) {
                b = apcf.TRIGGER_TYPE_UNSPECIFIED;
            }
            createBuilder.copyOnWrite();
            apdh apdhVar3 = (apdh) createBuilder.instance;
            apdhVar3.d = b.af;
            apdhVar3.b |= 2;
        }
        if (xduVar.a() != 1) {
            int a = xduVar.a();
            createBuilder.copyOnWrite();
            apdh apdhVar4 = (apdh) createBuilder.instance;
            apdhVar4.b |= 4;
            apdhVar4.e = a;
        }
        return createBuilder;
    }

    public final asit c(xdu xduVar, String str, apcb apcbVar, int i, aoyz aoyzVar) {
        boolean d = d();
        aopa createBuilder = asit.a.createBuilder();
        if (aoyzVar != null && (aoyzVar.b & 1) != 0) {
            aoob aoobVar = aoyzVar.c;
            createBuilder.copyOnWrite();
            asit asitVar = (asit) createBuilder.instance;
            aoobVar.getClass();
            asitVar.b |= 1024;
            asitVar.f = aoobVar;
        }
        aopa createBuilder2 = apcg.a.createBuilder();
        aopa g = g(xduVar);
        if (d) {
            aopa createBuilder3 = apdg.a.createBuilder();
            String str2 = xduVar.a;
            createBuilder3.copyOnWrite();
            apdg apdgVar = (apdg) createBuilder3.instance;
            apdgVar.b |= 1;
            apdgVar.c = str2;
            createBuilder3.copyOnWrite();
            apdg apdgVar2 = (apdg) createBuilder3.instance;
            apdgVar2.b |= 2;
            apdgVar2.d = false;
            apdg apdgVar3 = (apdg) createBuilder3.mo39build();
            g.copyOnWrite();
            apdh apdhVar = (apdh) g.instance;
            apdh apdhVar2 = apdh.a;
            apdgVar3.getClass();
            apdhVar.f = apdgVar3;
            apdhVar.b |= 8;
        }
        apdh apdhVar3 = (apdh) g.mo39build();
        createBuilder2.copyOnWrite();
        apcg apcgVar = (apcg) createBuilder2.instance;
        apdhVar3.getClass();
        apcgVar.d = apdhVar3;
        apcgVar.b |= 2;
        aopa f = f(apcbVar, i, amyg.a);
        if (d) {
            aopa createBuilder4 = apcx.a.createBuilder();
            createBuilder4.copyOnWrite();
            apcx apcxVar = (apcx) createBuilder4.instance;
            str.getClass();
            apcxVar.b |= 1;
            apcxVar.c = str;
            apcx apcxVar2 = (apcx) createBuilder4.mo39build();
            f.copyOnWrite();
            apcy apcyVar = (apcy) f.instance;
            apcy apcyVar2 = apcy.a;
            apcxVar2.getClass();
            apcyVar.d = apcxVar2;
            apcyVar.b |= 2;
        }
        apcy apcyVar3 = (apcy) f.mo39build();
        createBuilder2.copyOnWrite();
        apcg apcgVar2 = (apcg) createBuilder2.instance;
        apcyVar3.getClass();
        apcgVar2.e = apcyVar3;
        apcgVar2.b |= 4;
        apcg apcgVar3 = (apcg) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asit asitVar2 = (asit) createBuilder.instance;
        apcgVar3.getClass();
        asitVar2.e = apcgVar3;
        asitVar2.b |= 512;
        return (asit) createBuilder.mo39build();
    }

    public final boolean d() {
        if (!this.a) {
            apdq a = xrz.a(this.b);
            return a != null && a.c;
        }
        return true;
    }
}
