package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zar  reason: default package */
/* loaded from: classes7.dex */
public final class zar {
    private final cqat a;
    private final btvo b;
    private final vxh c;

    public zar(cqat cqatVar, btvo btvoVar, vxh vxhVar) {
        this.a = cqatVar;
        this.b = btvoVar;
        this.c = vxhVar;
    }

    @dzsi
    public static doyp c(zaw zawVar, int[] iArr, Map<String, Integer> map) {
        dpbw dpbwVar;
        Integer num;
        dooa a = zawVar.a();
        if ((a.a & 1) == 0) {
            dpbwVar = dpbw.UNKNOWN;
        } else {
            donz donzVar = donz.ON_TIME;
            donz b = donz.b(a.b);
            if (b == null) {
                b = donz.ON_TIME;
            }
            int ordinal = b.ordinal();
            if (ordinal == 0) {
                dpbwVar = dpbw.ON_TIME;
            } else if (ordinal != 1) {
                dpbwVar = ordinal != 2 ? dpbw.UNKNOWN : null;
            } else if ((a.a & 4) != 0) {
                dgaw dgawVar = a.c;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                long j = dgawVar.b;
                dgaw dgawVar2 = a.d;
                if (dgawVar2 == null) {
                    dgawVar2 = dgaw.g;
                }
                if (j > dgawVar2.b) {
                    dpbwVar = dpbw.LATE;
                } else {
                    dpbwVar = dpbw.EARLY;
                }
            } else {
                dpbwVar = dpbw.REALTIME_ONLY;
            }
        }
        if (dpbwVar == null) {
            return null;
        }
        doyo bZ = doyp.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doyp doypVar = (doyp) bZ.b;
        doypVar.a |= 4;
        doypVar.d = false;
        doyp doypVar2 = (doyp) bZ.b;
        doypVar2.c = dpbwVar.f;
        doypVar2.a |= 2;
        dgaw dgawVar3 = a.c;
        if (dgawVar3 == null) {
            dgawVar3 = dgaw.g;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doyp doypVar3 = (doyp) bZ.b;
        dgawVar3.getClass();
        doypVar3.b = dgawVar3;
        doypVar3.a |= 1;
        if ((a.a & 4) != 0) {
            dgaw dgawVar4 = a.d;
            if (dgawVar4 == null) {
                dgawVar4 = dgaw.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doyp doypVar4 = (doyp) bZ.b;
            dgawVar4.getClass();
            doypVar4.e = dgawVar4;
            doypVar4.a |= 64;
        }
        dpjb dpjbVar = a.k;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doyp doypVar5 = (doyp) bZ.b;
        dpjbVar.getClass();
        doypVar5.g = dpjbVar;
        int i = doypVar5.a | 256;
        doypVar5.a = i;
        if ((a.a & 64) != 0) {
            String str = a.h;
            str.getClass();
            doypVar5.a = i | 4096;
            doypVar5.j = str;
        }
        if (zawVar.d() >= 0) {
            int i2 = iArr[zawVar.d()];
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doyp doypVar6 = (doyp) bZ.b;
            doypVar6.a |= 512;
            doypVar6.h = i2;
        } else if ((a.a & 64) != 0 && (num = map.get(a.h)) != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doyp doypVar7 = (doyp) bZ.b;
            doypVar7.a |= 512;
            doypVar7.h = intValue;
        }
        dpgk bZ2 = dpgl.g.bZ();
        List<dpce> c = zawVar.c();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpgl dpglVar = (dpgl) bZ2.b;
        dsrj<dpce> dsrjVar = dpglVar.b;
        if (!dsrjVar.a()) {
            dpglVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(c, dpglVar.b);
        String b2 = zawVar.b();
        if (b2 != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpgl dpglVar2 = (dpgl) bZ2.b;
            b2.getClass();
            dpglVar2.a |= 2;
            dpglVar2.e = b2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doyp doypVar8 = (doyp) bZ.b;
        dpgl bK = bZ2.bK();
        bK.getClass();
        doypVar8.i = bK;
        doypVar8.a |= 2048;
        return bZ.bK();
    }

    private final dpdy d(dpdy dpdyVar, Map<qdv, dopk> map, List<dwae> list, @dzsi eapd eapdVar, boolean z, boolean z2) {
        dopk dopkVar;
        doyp doypVar;
        dpec dpecVar = dpdyVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c = dqvj.c(dpecVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (c != dqvj.TRANSIT) {
            return dpdyVar;
        }
        if (eapdVar != null) {
            dphe dpheVar = dpdyVar.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            dopkVar = map.get(qdv.g(dpheVar, this.b));
        } else {
            dphe dpheVar2 = dpdyVar.e;
            if (dpheVar2 == null) {
                dpheVar2 = dphe.x;
            }
            dopkVar = map.get(qdv.f(dpheVar2, z, z2));
        }
        if (dopkVar == null) {
            return dpdyVar;
        }
        dsqp dsqpVar = (dsqp) dpdyVar.cu(5);
        dsqpVar.bC(dpdyVar);
        dpdr dpdrVar = (dpdr) dsqpVar;
        dsrj<dode> dsrjVar = dopkVar.r;
        final int[] iArr = new int[dsrjVar.size()];
        for (int i = 0; i < dsrjVar.size(); i++) {
            iArr[i] = -1;
            dode dodeVar = dsrjVar.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                dwae dwaeVar = list.get(i2);
                if (dodeVar.b.equals(dwaeVar.c)) {
                    doud doudVar = dodeVar.a;
                    if (doudVar == null) {
                        doudVar = doud.c;
                    }
                    dsrf dsrfVar = doudVar.a;
                    dvzn dvznVar = dwaeVar.b;
                    if (dvznVar == null) {
                        dvznVar = dvzn.e;
                    }
                    if (dsrfVar.equals(dvznVar.b)) {
                        doud doudVar2 = dodeVar.a;
                        if (doudVar2 == null) {
                            doudVar2 = doud.c;
                        }
                        dsrf dsrfVar2 = doudVar2.b;
                        dvzn dvznVar2 = dwaeVar.b;
                        if (dvznVar2 == null) {
                            dvznVar2 = dvzn.e;
                        }
                        if (dsrfVar2.equals(dvznVar2.c)) {
                            iArr[i] = i2;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            if (iArr[i] < 0) {
                dwad bZ = dwae.d.bZ();
                dsrj<dpgw> dsrjVar2 = dodeVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwae dwaeVar2 = (dwae) bZ.b;
                dsrj<dpgw> dsrjVar3 = dwaeVar2.c;
                if (!dsrjVar3.a()) {
                    dwaeVar2.c = dsqw.cl(dsrjVar3);
                }
                dsod.bv(dsrjVar2, dwaeVar2.c);
                dvzm bZ2 = dvzn.e.bZ();
                doud doudVar3 = dodeVar.a;
                if (doudVar3 == null) {
                    doudVar3 = doud.c;
                }
                bZ2.a(doudVar3.a);
                doud doudVar4 = dodeVar.a;
                if (doudVar4 == null) {
                    doudVar4 = doud.c;
                }
                bZ2.b(doudVar4.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwae dwaeVar3 = (dwae) bZ.b;
                dvzn bK = bZ2.bK();
                bK.getClass();
                dwaeVar3.b = bK;
                dwaeVar3.a |= 1;
                list.add(bZ.bK());
                iArr[i] = list.size() - 1;
            }
        }
        final HashMap hashMap = new HashMap();
        dphe dpheVar3 = dpdyVar.e;
        if (dpheVar3 == null) {
            dpheVar3 = dphe.x;
        }
        if (!dbsj.d(dpheVar3.m)) {
            dphe dpheVar4 = dpdyVar.e;
            if (dpheVar4 == null) {
                dpheVar4 = dphe.x;
            }
            if ((dpheVar4.a & 4194304) != 0) {
                dphe dpheVar5 = dpdyVar.e;
                if (dpheVar5 == null) {
                    dpheVar5 = dphe.x;
                }
                String str = dpheVar5.m;
                dphe dpheVar6 = dpdyVar.e;
                if (dpheVar6 == null) {
                    dpheVar6 = dphe.x;
                }
                hashMap.put(str, Integer.valueOf(dpheVar6.u));
            }
        }
        if ((((dpdy) dpdrVar.b).a & 32) != 0) {
            dpdx dpdxVar = dpdyVar.g;
            if (dpdxVar == null) {
                dpdxVar = dpdx.d;
            }
            for (doyp doypVar2 : dpdxVar.b) {
                String str2 = doypVar2.j;
                if (!dbsj.d(str2) && (doypVar2.a & 512) != 0) {
                    hashMap.put(str2, Integer.valueOf(doypVar2.h));
                }
            }
        }
        final List<doyp> arrayList = new ArrayList<>();
        zax.a(dopkVar, new dbsz(iArr, hashMap, arrayList) { // from class: zap
            private final int[] a;
            private final Map b;
            private final List c;

            {
                this.a = iArr;
                this.b = hashMap;
                this.c = arrayList;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                int[] iArr2 = this.a;
                Map map2 = this.b;
                List list2 = this.c;
                doyp c2 = zar.c((zaw) obj, iArr2, map2);
                if (c2 != null) {
                    list2.add(c2);
                }
            }
        });
        Collections.sort(arrayList, new zaq());
        if (eapdVar != null) {
            arrayList = this.c.c(arrayList, 5, eapdVar.a, 2);
        }
        if ((((dpdy) dpdrVar.b).a & 32) != 0 && (!arrayList.isEmpty() || eapdVar != null)) {
            dpdx dpdxVar2 = ((dpdy) dpdrVar.b).g;
            if (dpdxVar2 == null) {
                dpdxVar2 = dpdx.d;
            }
            dsqp dsqpVar2 = (dsqp) dpdxVar2.cu(5);
            dsqpVar2.bC(dpdxVar2);
            dpdw dpdwVar = (dpdw) dsqpVar2;
            if (dpdwVar.c) {
                dpdwVar.bF();
                dpdwVar.c = false;
            }
            ((dpdx) dpdwVar.b).b = dpdx.ck();
            if (dpdwVar.c) {
                dpdwVar.bF();
                dpdwVar.c = false;
            }
            dpdx dpdxVar3 = (dpdx) dpdwVar.b;
            dsrj<doyp> dsrjVar4 = dpdxVar3.b;
            if (!dsrjVar4.a()) {
                dpdxVar3.b = dsqw.cl(dsrjVar4);
            }
            dsod.bv(arrayList, dpdxVar3.b);
            if (dpdrVar.c) {
                dpdrVar.bF();
                dpdrVar.c = false;
            }
            dpdy dpdyVar2 = (dpdy) dpdrVar.b;
            dpdx bK2 = dpdwVar.bK();
            bK2.getClass();
            dpdyVar2.g = bK2;
            dpdyVar2.a |= 32;
        }
        if (eapdVar == null) {
            final dphe dpheVar7 = dpdyVar.e;
            if (dpheVar7 == null) {
                dpheVar7 = dphe.x;
            }
            final dbsl dbslVar = new dbsl(dpheVar7) { // from class: zao
                private final dphe a;

                {
                    this.a = dpheVar7;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return ((dooa) obj).h.equals(this.a.m);
                }
            };
            final ArrayList arrayList2 = new ArrayList();
            zax.a(dopkVar, new dbsz(dbslVar, arrayList2) { // from class: zav
                private final dbsl a;
                private final List b;

                {
                    this.a = dbslVar;
                    this.b = arrayList2;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    dbsl dbslVar2 = this.a;
                    List list2 = this.b;
                    zaw zawVar = (zaw) obj;
                    if (dbslVar2.a(zawVar.a())) {
                        list2.add(zawVar);
                    }
                }
            });
            zaw zawVar = arrayList2.size() == 0 ? null : (zaw) arrayList2.get(0);
            if (zawVar != null) {
                doypVar = c(zawVar, iArr, hashMap);
            }
            doypVar = null;
        } else {
            if (!arrayList.isEmpty()) {
                doypVar = arrayList.get(0);
            }
            doypVar = null;
        }
        dphe dpheVar8 = ((dpdy) dpdrVar.b).e;
        if (dpheVar8 == null) {
            dpheVar8 = dphe.x;
        }
        dsqp dsqpVar3 = (dsqp) dpheVar8.cu(5);
        dsqpVar3.bC(dpheVar8);
        dpgz dpgzVar = (dpgz) dsqpVar3;
        dpgw dpgwVar = ((dphe) dpgzVar.b).c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        dsqp dsqpVar4 = (dsqp) dpgwVar.cu(5);
        dsqpVar4.bC(dpgwVar);
        dpgt dpgtVar = (dpgt) dsqpVar4;
        dpgw dpgwVar2 = ((dphe) dpgzVar.b).d;
        if (dpgwVar2 == null) {
            dpgwVar2 = dpgw.r;
        }
        dsqp dsqpVar5 = (dsqp) dpgwVar2.cu(5);
        dsqpVar5.bC(dpgwVar2);
        dpgt dpgtVar2 = (dpgt) dsqpVar5;
        if (doypVar != null) {
            dpbw b = dpbw.b(doypVar.c);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            boolean z3 = !((doypVar.a & 2) != 0);
            if (dpgzVar.c) {
                dpgzVar.bF();
                dpgzVar.c = false;
            }
            dphe dpheVar9 = (dphe) dpgzVar.b;
            dpheVar9.a |= 2048;
            dpheVar9.k = z3;
            dgaw dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            if (dpgtVar.c) {
                dpgtVar.bF();
                dpgtVar.c = false;
            }
            dpgw dpgwVar3 = (dpgw) dpgtVar.b;
            dgawVar.getClass();
            dpgwVar3.f = dgawVar;
            dpgwVar3.a |= 16;
            if ((doypVar.a & 2) == 0) {
                b = dpbw.UNKNOWN;
            }
            if (dpgtVar.c) {
                dpgtVar.bF();
                dpgtVar.c = false;
            }
            dpgw dpgwVar4 = (dpgw) dpgtVar.b;
            dpgwVar4.p = b.f;
            int i3 = dpgwVar4.a | 8192;
            dpgwVar4.a = i3;
            if ((doypVar.a & 64) != 0) {
                dgaw dgawVar2 = doypVar.e;
                if (dgawVar2 == null) {
                    dgawVar2 = dgaw.g;
                }
                if (dpgtVar.c) {
                    dpgtVar.bF();
                    dpgtVar.c = false;
                }
                dpgw dpgwVar5 = (dpgw) dpgtVar.b;
                dgawVar2.getClass();
                dpgwVar5.h = dgawVar2;
                dpgwVar5.a |= 64;
            } else {
                dpgwVar4.h = null;
                dpgwVar4.a = i3 & (-65);
            }
            dpbw dpbwVar = dpbw.UNKNOWN;
            if (dpgtVar2.c) {
                dpgtVar2.bF();
                dpgtVar2.c = false;
            }
            dpgw dpgwVar6 = (dpgw) dpgtVar2.b;
            dpgwVar6.p = dpbwVar.f;
            dpgwVar6.a |= 8192;
            dpjb dpjbVar = doypVar.g;
            if (dpjbVar == null) {
                dpjbVar = dpjb.e;
            }
            dsqp dsqpVar6 = (dsqp) dpjbVar.cu(5);
            dsqpVar6.bC(dpjbVar);
            dpja dpjaVar = (dpja) dsqpVar6;
            if (((dphe) dpgzVar.b).m.equals(doypVar.j)) {
                dpjb dpjbVar2 = ((dphe) dpgzVar.b).t;
                if (dpjbVar2 == null) {
                    dpjbVar2 = dpjb.e;
                }
                if (dpjbVar2.d.size() != ((dpjb) dpjaVar.b).d.size()) {
                    HashMap hashMap2 = new HashMap();
                    dpjb dpjbVar3 = doypVar.g;
                    if (dpjbVar3 == null) {
                        dpjbVar3 = dpjb.e;
                    }
                    for (drhn drhnVar : dpjbVar3.d) {
                        drhj drhjVar = drhnVar.b;
                        if (drhjVar == null) {
                            drhjVar = drhj.c;
                        }
                        hashMap2.put(drhjVar, drhnVar);
                    }
                    dpjb dpjbVar4 = ((dphe) dpgzVar.b).t;
                    if (dpjbVar4 == null) {
                        dpjbVar4 = dpjb.e;
                    }
                    for (drhn drhnVar2 : dpjbVar4.d) {
                        drhj drhjVar2 = drhnVar2.b;
                        if (drhjVar2 == null) {
                            drhjVar2 = drhj.c;
                        }
                        if (hashMap2.get(drhjVar2) == null) {
                            if (dpjaVar.c) {
                                dpjaVar.bF();
                                dpjaVar.c = false;
                            }
                            dpjb dpjbVar5 = (dpjb) dpjaVar.b;
                            drhnVar2.getClass();
                            dsrj<drhn> dsrjVar5 = dpjbVar5.d;
                            if (!dsrjVar5.a()) {
                                dpjbVar5.d = dsqw.cl(dsrjVar5);
                            }
                            dpjbVar5.d.add(drhnVar2);
                        }
                    }
                }
            }
            if (dpgzVar.c) {
                dpgzVar.bF();
                dpgzVar.c = false;
            }
            dphe dpheVar10 = (dphe) dpgzVar.b;
            dpjb bK3 = dpjaVar.bK();
            bK3.getClass();
            dpheVar10.t = bK3;
            dpheVar10.a |= 2097152;
            String str3 = doypVar.j;
            if (dpgzVar.c) {
                dpgzVar.bF();
                dpgzVar.c = false;
            }
            dphe dpheVar11 = (dphe) dpgzVar.b;
            str3.getClass();
            dpheVar11.a |= 8192;
            dpheVar11.m = str3;
            dgas dgasVar = dpheVar11.s;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            int i4 = dgasVar.b;
            dgaw dgawVar3 = doypVar.b;
            if (dgawVar3 == null) {
                dgawVar3 = dgaw.g;
            }
            long j = dgawVar3.b + i4;
            long a = bvtb.a(j);
            dsqp dsqpVar7 = (dsqp) dgawVar3.cu(5);
            dsqpVar7.bC(dgawVar3);
            dgav dgavVar = (dgav) dsqpVar7;
            if (dgavVar.c) {
                dgavVar.bF();
                dgavVar.c = false;
            }
            dgaw dgawVar4 = (dgaw) dgavVar.b;
            int i5 = 1 | dgawVar4.a;
            dgawVar4.a = i5;
            dgawVar4.b = j;
            int i6 = dgawVar3.e;
            int i7 = i5 | 8;
            dgawVar4.a = i7;
            dgawVar4.e = i6 + i4;
            dgawVar4.a = i7 | 16;
            dgawVar4.f = a;
            dgaw bK4 = dgavVar.bK();
            if (dpgtVar2.c) {
                dpgtVar2.bF();
                dpgtVar2.c = false;
            }
            dpgw dpgwVar7 = (dpgw) dpgtVar2.b;
            bK4.getClass();
            dpgwVar7.e = bK4;
            dpgwVar7.a |= 8;
            dgaw dgawVar5 = dpgwVar7.e;
            if (dgawVar5 == null) {
                dgawVar5 = dgaw.g;
            }
            if (dpgtVar2.c) {
                dpgtVar2.bF();
                dpgtVar2.c = false;
            }
            dpgw dpgwVar8 = (dpgw) dpgtVar2.b;
            dgawVar5.getClass();
            dpgwVar8.g = dgawVar5;
            dpgwVar8.a |= 32;
        } else if (eapdVar != null) {
            if (dpgtVar.c) {
                dpgtVar.bF();
                dpgtVar.c = false;
            }
            dpgw dpgwVar9 = (dpgw) dpgtVar.b;
            dpgwVar9.f = null;
            int i8 = dpgwVar9.a & (-17);
            dpgwVar9.a = i8;
            dpgwVar9.h = null;
            int i9 = i8 & (-65);
            dpgwVar9.a = i9;
            dpgwVar9.a = i9 & (-8193);
            dpgwVar9.p = 0;
            if (dpgtVar2.c) {
                dpgtVar2.bF();
                dpgtVar2.c = false;
            }
            dpgw dpgwVar10 = (dpgw) dpgtVar2.b;
            dpgwVar10.e = null;
            int i10 = dpgwVar10.a & (-9);
            dpgwVar10.a = i10;
            dpgwVar10.g = null;
            int i11 = i10 & (-33);
            dpgwVar10.a = i11;
            dpgwVar10.a = i11 & (-8193);
            dpgwVar10.p = 0;
        }
        if (dpgzVar.c) {
            dpgzVar.bF();
            dpgzVar.c = false;
        }
        dphe dpheVar12 = (dphe) dpgzVar.b;
        dpgw bK5 = dpgtVar.bK();
        bK5.getClass();
        dpheVar12.c = bK5;
        dpheVar12.a |= 2;
        if (dpgzVar.c) {
            dpgzVar.bF();
            dpgzVar.c = false;
        }
        dphe dpheVar13 = (dphe) dpgzVar.b;
        dpgw bK6 = dpgtVar2.bK();
        bK6.getClass();
        dpheVar13.d = bK6;
        dpheVar13.a |= 4;
        if (dpdrVar.c) {
            dpdrVar.bF();
            dpdrVar.c = false;
        }
        dpdy dpdyVar3 = (dpdy) dpdrVar.b;
        dphe bK7 = dpgzVar.bK();
        bK7.getClass();
        dpdyVar3.e = bK7;
        dpdyVar3.a |= 8;
        return dpdrVar.bK();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v31 */
    public final dvzo a(dvzu dvzuVar, Map<qdv, dopk> map, @dzsi bzdh bzdhVar, boolean z) {
        boolean z2;
        dpdy dpdyVar;
        int i;
        int i2;
        int i3;
        dphr dphrVar;
        bzdg bzdgVar;
        dpbm dpbmVar;
        int i4;
        eapd e;
        eapd eapdVar;
        eapd eapdVar2;
        zar zarVar = this;
        bzdh bzdhVar2 = bzdhVar;
        boolean z3 = dvzuVar.D;
        int i5 = 5;
        dsqp dsqpVar = (dsqp) dvzuVar.cu(5);
        dsqpVar.bC(dvzuVar);
        dvzo dvzoVar = (dvzo) dsqpVar;
        ArrayList c = dchl.c(dvzuVar.q);
        int i6 = 0;
        while (i6 < ((dvzu) dvzoVar.b).e.size()) {
            dpie a = dvzoVar.a(i6);
            dsqp dsqpVar2 = (dsqp) a.cu(i5);
            dsqpVar2.bC(a);
            dphr dphrVar2 = (dphr) dsqpVar2;
            dpec dpecVar = ((dpie) dphrVar2.b).d;
            if (dpecVar == null) {
                dpecVar = dpec.o;
            }
            if (dpecVar.i) {
                i = i6;
            } else {
                int i7 = 0;
                while (true) {
                    dpdyVar = 0;
                    if (i7 >= ((dpie) dphrVar2.b).e.size()) {
                        break;
                    }
                    dpbp a2 = dphrVar2.a(i7);
                    dsqp dsqpVar3 = (dsqp) a2.cu(i5);
                    dsqpVar3.bC(a2);
                    dpbm dpbmVar2 = (dpbm) dsqpVar3;
                    if (bzdhVar2 != null) {
                        bzdg b = bzdhVar.b();
                        eapd eapdVar3 = new eapd(zarVar.a.b());
                        boolean z4 = bzdhVar2 instanceof bzcz;
                        if (z4 || (bzdhVar2 instanceof bzdf)) {
                            eapd e2 = eapdVar3.e(bzdhVar.e());
                            if (z4) {
                                int q = bzdhVar.q();
                                bzdg b2 = bzdhVar.b();
                                if (((dpbp) dpbmVar2.b).c.size() > q) {
                                    dpdy a3 = dpbmVar2.a(q);
                                    dsqp dsqpVar4 = (dsqp) a3.cu(i5);
                                    dsqpVar4.bC(a3);
                                    dpdr dpdrVar = (dpdr) dsqpVar4;
                                    dphe dpheVar = ((dpdy) dpdrVar.b).e;
                                    if (dpheVar == null) {
                                        dpheVar = dphe.x;
                                    }
                                    dsqp dsqpVar5 = (dsqp) dpheVar.cu(i5);
                                    dsqpVar5.bC(dpheVar);
                                    dpgz dpgzVar = (dpgz) dsqpVar5;
                                    eapdVar = e2;
                                    if (qdv.g(dpheVar, zarVar.b).equals(qdv.g(b2.d(), zarVar.b))) {
                                        dpgw dpgwVar = ((dphe) dpgzVar.b).d;
                                        if (dpgwVar == null) {
                                            dpgwVar = dpgw.r;
                                        }
                                        dsqp dsqpVar6 = (dsqp) dpgwVar.cu(5);
                                        dsqpVar6.bC(dpgwVar);
                                        dpgt dpgtVar = (dpgt) dsqpVar6;
                                        i2 = i7;
                                        long seconds = TimeUnit.MILLISECONDS.toSeconds(bzdhVar.e().j(eaow.e(zarVar.a.b())).b);
                                        i3 = i6;
                                        dphrVar = dphrVar2;
                                        long a4 = bvtb.a(seconds);
                                        dgaw dgawVar = ((dpgw) dpgtVar.b).e;
                                        if (dgawVar == null) {
                                            dgawVar = dgaw.g;
                                        }
                                        dsqp dsqpVar7 = (dsqp) dgawVar.cu(5);
                                        dsqpVar7.bC(dgawVar);
                                        dgav dgavVar = (dgav) dsqpVar7;
                                        if (dgavVar.c) {
                                            dgavVar.bF();
                                            dgavVar.c = false;
                                        }
                                        dgaw dgawVar2 = (dgaw) dgavVar.b;
                                        int i8 = dgawVar2.a | 1;
                                        dgawVar2.a = i8;
                                        dgawVar2.b = seconds;
                                        dgawVar2.a = i8 | 16;
                                        dgawVar2.f = a4;
                                        if (dpgtVar.c) {
                                            dpgtVar.bF();
                                            dpgtVar.c = false;
                                        }
                                        dpgw dpgwVar2 = (dpgw) dpgtVar.b;
                                        dgaw bK = dgavVar.bK();
                                        bK.getClass();
                                        dpgwVar2.e = bK;
                                        dpgwVar2.a |= 8;
                                        dpbw dpbwVar = dpbw.UNKNOWN;
                                        if (dpgtVar.c) {
                                            dpgtVar.bF();
                                            dpgtVar.c = false;
                                        }
                                        dpgw dpgwVar3 = (dpgw) dpgtVar.b;
                                        dpgwVar3.p = dpbwVar.f;
                                        dpgwVar3.a |= 8192;
                                        if (dpgzVar.c) {
                                            dpgzVar.bF();
                                            dpgzVar.c = false;
                                        }
                                        dphe dpheVar2 = (dphe) dpgzVar.b;
                                        dpgw bK2 = dpgtVar.bK();
                                        bK2.getClass();
                                        dpheVar2.d = bK2;
                                        dpheVar2.a |= 4;
                                        if (dpdrVar.c) {
                                            dpdrVar.bF();
                                            dpdrVar.c = false;
                                        }
                                        dpdy dpdyVar2 = (dpdy) dpdrVar.b;
                                        dphe bK3 = dpgzVar.bK();
                                        bK3.getClass();
                                        dpdyVar2.e = bK3;
                                        dpdyVar2.a |= 8;
                                        dpbmVar2.c(q, dpdrVar);
                                        eapdVar2 = eapdVar;
                                        bzdgVar = b.B();
                                        dpdyVar = eapdVar2;
                                    }
                                    i2 = i7;
                                    i3 = i6;
                                    dphrVar = dphrVar2;
                                    eapdVar2 = eapdVar;
                                    bzdgVar = b.B();
                                    dpdyVar = eapdVar2;
                                }
                            }
                            eapdVar = e2;
                            i2 = i7;
                            i3 = i6;
                            dphrVar = dphrVar2;
                            eapdVar2 = eapdVar;
                            bzdgVar = b.B();
                            dpdyVar = eapdVar2;
                        } else {
                            i2 = i7;
                            i3 = i6;
                            dphrVar = dphrVar2;
                            dpdyVar = eapdVar3;
                            bzdgVar = b;
                        }
                    } else {
                        i2 = i7;
                        i3 = i6;
                        dphrVar = dphrVar2;
                        bzdgVar = null;
                    }
                    bzdg bzdgVar2 = bzdgVar;
                    eapd eapdVar4 = dpdyVar;
                    int i9 = 0;
                    while (i9 < ((dpbp) dpbmVar2.b).c.size()) {
                        if (bzdgVar2 == null || bzdgVar2.D()) {
                            dpbmVar = dpbmVar2;
                            i4 = i2;
                            dpbmVar.d(i9, d(dpbmVar.a(i9), map, c, null, z3, z));
                        } else if (i9 < bzdgVar2.J()) {
                            dpbmVar = dpbmVar2;
                            i4 = i2;
                        } else {
                            dbsk.s(eapdVar4);
                            if (bzdgVar2.c() == dqvj.WALK) {
                                e = eapdVar4.e(bzdgVar2.y());
                                dpbmVar = dpbmVar2;
                                i4 = i2;
                            } else {
                                dpbmVar = dpbmVar2;
                                i4 = i2;
                                dpdy d = d(dpbmVar2.a(i9), map, c, eapdVar4, z3, z);
                                dpbmVar.d(i9, d);
                                dpdx dpdxVar = d.g;
                                if (dpdxVar == null) {
                                    dpdxVar = dpdx.d;
                                }
                                dsrj<doyp> dsrjVar = dpdxVar.b;
                                if (!dsrjVar.isEmpty()) {
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    dgaw dgawVar3 = dsrjVar.get(0).b;
                                    if (dgawVar3 == null) {
                                        dgawVar3 = dgaw.g;
                                    }
                                    eapdVar4 = new eapd(timeUnit.toMillis(dgawVar3.b));
                                }
                                e = eapdVar4.e(bzdgVar2.y());
                            }
                            eapdVar4 = e;
                            bzdgVar2 = bzdgVar2.B();
                        }
                        i9++;
                        dpbmVar2 = dpbmVar;
                        i2 = i4;
                    }
                    int i10 = i2;
                    dphr dphrVar3 = dphrVar;
                    dphrVar3.c(i10, dpbmVar2);
                    i7 = i10 + 1;
                    zarVar = this;
                    bzdhVar2 = bzdhVar;
                    dphrVar2 = dphrVar3;
                    i6 = i3;
                    i5 = 5;
                }
                int i11 = i6;
                dphr dphrVar4 = dphrVar2;
                if (((dpie) dphrVar4.b).e.size() > 0) {
                    dpid dpidVar = ((dpie) dphrVar4.b).w;
                    if (dpidVar == null) {
                        dpidVar = dpid.h;
                    }
                    dpbp a5 = dphrVar4.a(0);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= a5.c.size()) {
                            break;
                        }
                        dpdy dpdyVar3 = a5.c.get(i12);
                        dpec dpecVar2 = dpdyVar3.c;
                        if (dpecVar2 == null) {
                            dpecVar2 = dpec.o;
                        }
                        dqvj c2 = dqvj.c(dpecVar2.b);
                        if (c2 == null) {
                            c2 = dqvj.DRIVE;
                        }
                        if (c2 == dqvj.TRANSIT) {
                            dpdyVar = dpdyVar3;
                            break;
                        }
                        i12++;
                    }
                    if (dpdyVar != null) {
                        dsqp dsqpVar8 = (dsqp) dpidVar.cu(5);
                        dsqpVar8.bC(dpidVar);
                        dphy dphyVar = (dphy) dsqpVar8;
                        if (dphyVar.c) {
                            dphyVar.bF();
                            dphyVar.c = false;
                        }
                        ((dpid) dphyVar.b).c = dpid.ck();
                        dpdx dpdxVar2 = dpdyVar.g;
                        if (dpdxVar2 == null) {
                            dpdxVar2 = dpdx.d;
                        }
                        dsrj<doyp> dsrjVar2 = dpdxVar2.b;
                        if (dphyVar.c) {
                            dphyVar.bF();
                            dphyVar.c = false;
                        }
                        dpid dpidVar2 = (dpid) dphyVar.b;
                        dsrj<doyp> dsrjVar3 = dpidVar2.c;
                        if (!dsrjVar3.a()) {
                            dpidVar2.c = dsqw.cl(dsrjVar3);
                        }
                        dsod.bv(dsrjVar2, dpidVar2.c);
                        dpidVar = dphyVar.bK();
                    }
                    if (dphrVar4.c) {
                        dphrVar4.bF();
                        dphrVar4.c = false;
                    }
                    dpie dpieVar = (dpie) dphrVar4.b;
                    dpidVar.getClass();
                    dpieVar.w = dpidVar;
                    dpieVar.a |= 8388608;
                }
                i = i11;
                dvzoVar.g(i, dphrVar4);
            }
            i6 = i + 1;
            zarVar = this;
            bzdhVar2 = bzdhVar;
            i5 = 5;
        }
        if (dvzoVar.c) {
            dvzoVar.bF();
            z2 = false;
            dvzoVar.c = false;
        } else {
            z2 = false;
        }
        ((dvzu) dvzoVar.b).q = dvzu.ck();
        if (dvzoVar.c) {
            dvzoVar.bF();
            dvzoVar.c = z2;
        }
        dvzu dvzuVar2 = (dvzu) dvzoVar.b;
        dsrj<dwae> dsrjVar4 = dvzuVar2.q;
        if (!dsrjVar4.a()) {
            dvzuVar2.q = dsqw.cl(dsrjVar4);
        }
        dsod.bv(c, dvzuVar2.q);
        return dvzoVar;
    }

    public final amte b(amte amteVar, Map<qdv, dopk> map, @dzsi bzdh bzdhVar, boolean z) {
        dwbc dwbcVar = amteVar.a.a;
        dsqp dsqpVar = (dsqp) dwbcVar.cu(5);
        dsqpVar.bC(dwbcVar);
        dwaz dwazVar = (dwaz) dsqpVar;
        dwaa dwaaVar = ((dwbc) dwazVar.b).b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dsqp dsqpVar2 = (dsqp) dwaaVar.cu(5);
        dsqpVar2.bC(dwaaVar);
        dvzz dvzzVar = (dvzz) dsqpVar2;
        dwaa dwaaVar2 = ((dwbc) dwazVar.b).b;
        if (dwaaVar2 == null) {
            dwaaVar2 = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar2.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dvzo a = a(dvzuVar, map, bzdhVar, z);
        if (dvzzVar.c) {
            dvzzVar.bF();
            dvzzVar.c = false;
        }
        dwaa dwaaVar3 = (dwaa) dvzzVar.b;
        dvzu bK = a.bK();
        bK.getClass();
        dwaaVar3.b = bK;
        dwaaVar3.a |= 1;
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dwaa bK2 = dvzzVar.bK();
        bK2.getClass();
        dwbcVar2.b = bK2;
        dwbcVar2.a |= 1;
        amtd amtdVar = new amtd(amteVar);
        amtdVar.a = new amsy((dwbc) dwazVar.bK());
        return amtdVar.a();
    }
}
