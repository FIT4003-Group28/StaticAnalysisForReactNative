package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cxgb  reason: default package */
/* loaded from: classes.dex */
public abstract class cxgb implements cxfn {
    @Override // defpackage.cxfn
    public final void a(eacd eacdVar) {
        int i = cwsy.b;
        dsqp dsqpVar = (dsqp) eacdVar.cu(5);
        dsqpVar.bC(eacdVar);
        eacc eaccVar = (eacc) dsqpVar;
        cxga.a(cxga.a, eaccVar);
        eacd eacdVar2 = (eacd) eaccVar.b;
        if ((eacdVar2.a & 512) != 0) {
            dzye dzyeVar = eacdVar2.k;
            if (dzyeVar == null) {
                dzyeVar = dzye.c;
            }
            if ((dzyeVar.a & 1) != 0) {
                dzye dzyeVar2 = ((eacd) eaccVar.b).k;
                if (dzyeVar2 == null) {
                    dzyeVar2 = dzye.c;
                }
                dzyc dzycVar = dzyeVar2.b;
                if (dzycVar == null) {
                    dzycVar = dzyc.k;
                }
                dsqp dsqpVar2 = (dsqp) dzycVar.cu(5);
                dsqpVar2.bC(dzycVar);
                dzxz dzxzVar = (dzxz) dsqpVar2;
                cxga.a(cxga.b, dzxzVar);
                dzye dzyeVar3 = ((eacd) eaccVar.b).k;
                if (dzyeVar3 == null) {
                    dzyeVar3 = dzye.c;
                }
                dsqp dsqpVar3 = (dsqp) dzyeVar3.cu(5);
                dsqpVar3.bC(dzyeVar3);
                dzyd dzydVar = (dzyd) dsqpVar3;
                if (dzydVar.c) {
                    dzydVar.bF();
                    dzydVar.c = false;
                }
                dzye dzyeVar4 = (dzye) dzydVar.b;
                dzyc bK = dzxzVar.bK();
                bK.getClass();
                dzyeVar4.b = bK;
                dzyeVar4.a |= 1;
                if (eaccVar.c) {
                    eaccVar.bF();
                    eaccVar.c = false;
                }
                eacd eacdVar3 = (eacd) eaccVar.b;
                dzye bK2 = dzydVar.bK();
                bK2.getClass();
                eacdVar3.k = bK2;
                eacdVar3.a |= 512;
            }
        }
        eacd eacdVar4 = (eacd) eaccVar.b;
        if ((eacdVar4.a & 256) != 0) {
            eabp eabpVar = eacdVar4.j;
            if (eabpVar == null) {
                eabpVar = eabp.k;
            }
            if (eabpVar.j.size() != 0) {
                eabp eabpVar2 = ((eacd) eaccVar.b).j;
                if (eabpVar2 == null) {
                    eabpVar2 = eabp.k;
                }
                dsqp dsqpVar4 = (dsqp) eabpVar2.cu(5);
                dsqpVar4.bC(eabpVar2);
                eabm eabmVar = (eabm) dsqpVar4;
                for (int i2 = 0; i2 < ((eabp) eabmVar.b).j.size(); i2++) {
                    eabo eaboVar = ((eabp) eabmVar.b).j.get(i2);
                    dsqp dsqpVar5 = (dsqp) eaboVar.cu(5);
                    dsqpVar5.bC(eaboVar);
                    eabn eabnVar = (eabn) dsqpVar5;
                    if (!TextUtils.isEmpty(((eabo) eabnVar.b).b)) {
                        if (eabnVar.c) {
                            eabnVar.bF();
                            eabnVar.c = false;
                        }
                        ((eabo) eabnVar.b).c = eabo.ch();
                        for (String str : cxga.b(((eabo) eabnVar.b).b)) {
                            long longValue = deka.a(str).longValue();
                            if (eabnVar.c) {
                                eabnVar.bF();
                                eabnVar.c = false;
                            }
                            eabo eaboVar2 = (eabo) eabnVar.b;
                            dsri dsriVar = eaboVar2.c;
                            if (!dsriVar.a()) {
                                eaboVar2.c = dsqw.ci(dsriVar);
                            }
                            eaboVar2.c.d(longValue);
                        }
                    }
                    if (eabnVar.c) {
                        eabnVar.bF();
                        eabnVar.c = false;
                    }
                    eabo eaboVar3 = (eabo) eabnVar.b;
                    eaboVar3.a &= -2;
                    eaboVar3.b = eabo.e.b;
                    if (eabmVar.c) {
                        eabmVar.bF();
                        eabmVar.c = false;
                    }
                    eabp eabpVar3 = (eabp) eabmVar.b;
                    eabo bK3 = eabnVar.bK();
                    bK3.getClass();
                    eabpVar3.c();
                    eabpVar3.j.set(i2, bK3);
                }
                if (eaccVar.c) {
                    eaccVar.bF();
                    eaccVar.c = false;
                }
                eacd eacdVar5 = (eacd) eaccVar.b;
                eabp bK4 = eabmVar.bK();
                bK4.getClass();
                eacdVar5.j = bK4;
                eacdVar5.a |= 256;
            }
        }
        eacd eacdVar6 = (eacd) eaccVar.b;
        if ((eacdVar6.a & 32) != 0) {
            dzzz dzzzVar = eacdVar6.g;
            if (dzzzVar == null) {
                dzzzVar = dzzz.b;
            }
            if (dzzzVar.a.size() != 0) {
                dzzz dzzzVar2 = ((eacd) eaccVar.b).g;
                if (dzzzVar2 == null) {
                    dzzzVar2 = dzzz.b;
                }
                dsqp dsqpVar6 = (dsqp) dzzzVar2.cu(5);
                dsqpVar6.bC(dzzzVar2);
                dzzy dzzyVar = (dzzy) dsqpVar6;
                for (int i3 = 0; i3 < ((dzzz) dzzyVar.b).a.size(); i3++) {
                    dzzx dzzxVar = ((dzzz) dzzyVar.b).a.get(i3);
                    dsqp dsqpVar7 = (dsqp) dzzxVar.cu(5);
                    dsqpVar7.bC(dzzxVar);
                    dzzu dzzuVar = (dzzu) dsqpVar7;
                    if (!TextUtils.isEmpty(((dzzx) dzzuVar.b).s)) {
                        if (dzzuVar.c) {
                            dzzuVar.bF();
                            dzzuVar.c = false;
                        }
                        ((dzzx) dzzuVar.b).t = dzzx.ch();
                        String[] b = cxga.b(((dzzx) dzzuVar.b).s);
                        int length = b.length;
                        long[] jArr = new long[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            jArr[i4] = deka.a(b[i4]).longValue();
                        }
                        for (int i5 = 0; i5 < length; i5++) {
                            long j = jArr[i5];
                            if (dzzuVar.c) {
                                dzzuVar.bF();
                                dzzuVar.c = false;
                            }
                            dzzx dzzxVar2 = (dzzx) dzzuVar.b;
                            dsri dsriVar2 = dzzxVar2.t;
                            if (!dsriVar2.a()) {
                                dzzxVar2.t = dsqw.ci(dsriVar2);
                            }
                            dzzxVar2.t.d(j);
                        }
                    }
                    if (dzzuVar.c) {
                        dzzuVar.bF();
                        dzzuVar.c = false;
                    }
                    dzzx dzzxVar3 = (dzzx) dzzuVar.b;
                    dzzxVar3.a &= -262145;
                    dzzxVar3.s = dzzx.x.s;
                    if (dzzyVar.c) {
                        dzzyVar.bF();
                        dzzyVar.c = false;
                    }
                    dzzz dzzzVar3 = (dzzz) dzzyVar.b;
                    dzzx bK5 = dzzuVar.bK();
                    bK5.getClass();
                    dzzzVar3.c();
                    dzzzVar3.a.set(i3, bK5);
                }
                if (eaccVar.c) {
                    eaccVar.bF();
                    eaccVar.c = false;
                }
                eacd eacdVar7 = (eacd) eaccVar.b;
                dzzz bK6 = dzzyVar.bK();
                bK6.getClass();
                eacdVar7.g = bK6;
                eacdVar7.a |= 32;
            }
        }
        eacd eacdVar8 = (eacd) eaccVar.b;
        if ((eacdVar8.a & 32768) != 0) {
            eaaj eaajVar = eacdVar8.n;
            if (eaajVar == null) {
                eaajVar = eaaj.f;
            }
            if (eaajVar.d.size() != 0) {
                eaaj eaajVar2 = ((eacd) eaccVar.b).n;
                if (eaajVar2 == null) {
                    eaajVar2 = eaaj.f;
                }
                dsqp dsqpVar8 = (dsqp) eaajVar2.cu(5);
                dsqpVar8.bC(eaajVar2);
                eaah eaahVar = (eaah) dsqpVar8;
                for (int i6 = 0; i6 < ((eaaj) eaahVar.b).d.size(); i6++) {
                    eaam eaamVar = ((eaaj) eaahVar.b).d.get(i6);
                    dsqp dsqpVar9 = (dsqp) eaamVar.cu(5);
                    dsqpVar9.bC(eaamVar);
                    eaak eaakVar = (eaak) dsqpVar9;
                    cxga.a(cxga.c, eaakVar);
                    if (eaahVar.c) {
                        eaahVar.bF();
                        eaahVar.c = false;
                    }
                    eaaj eaajVar3 = (eaaj) eaahVar.b;
                    eaam bK7 = eaakVar.bK();
                    bK7.getClass();
                    eaajVar3.c();
                    eaajVar3.d.set(i6, bK7);
                }
                if (eaccVar.c) {
                    eaccVar.bF();
                    eaccVar.c = false;
                }
                eacd eacdVar9 = (eacd) eaccVar.b;
                eaaj bK8 = eaahVar.bK();
                bK8.getClass();
                eacdVar9.n = bK8;
                eacdVar9.a |= 32768;
            }
        }
        b(eaccVar.bK());
    }

    protected abstract void b(eacd eacdVar);
}
