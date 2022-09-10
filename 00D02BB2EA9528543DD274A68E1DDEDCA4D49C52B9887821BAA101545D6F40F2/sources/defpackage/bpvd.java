package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpvd  reason: default package */
/* loaded from: classes4.dex */
public final class bpvd {
    private static final dnfe a;

    static {
        dneu bZ = dnfe.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ.b;
        dnfeVar.a |= 4;
        dnfeVar.d = false;
        a = bZ.bK();
    }

    public static dnvs a(bowv bowvVar, ilo iloVar) {
        dnfw c;
        dnvn bZ = dnvs.d.bZ();
        ArrayList arrayList = new ArrayList();
        if (bowvVar.l.b.booleanValue() || !bowvVar.l.a()) {
            b(arrayList, dqgh.NAME, bowvVar.b, bowv.o(iloVar));
            b(arrayList, dqgh.ADDRESS, bowvVar.e, bowv.p(iloVar));
            bows bowsVar = bowvVar.p;
            if (bowsVar.e.booleanValue()) {
                dnvq bZ2 = dnvr.h.bZ();
                dqgh dqghVar = dqgh.POINT;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnvr dnvrVar = (dnvr) bZ2.b;
                dnvrVar.b = dqghVar.af;
                dnvrVar.a |= 1;
                akqq akqqVar = bowsVar.a;
                if (akqqVar != null) {
                    dneu bZ3 = dnfe.p.bZ();
                    dnog bZ4 = dnoh.d.bZ();
                    double d = akqqVar.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnoh dnohVar = (dnoh) bZ4.b;
                    int i = dnohVar.a | 1;
                    dnohVar.a = i;
                    dnohVar.b = d;
                    double d2 = akqqVar.b;
                    dnohVar.a = i | 2;
                    dnohVar.c = d2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnfe dnfeVar = (dnfe) bZ3.b;
                    dnoh bK = bZ4.bK();
                    bK.getClass();
                    dnfeVar.e = bK;
                    dnfeVar.a |= 8;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnvr dnvrVar2 = (dnvr) bZ2.b;
                    dnfe bK2 = bZ3.bK();
                    bK2.getClass();
                    dnvrVar2.c = bK2;
                    dnvrVar2.a |= 2;
                }
                akqq akqqVar2 = bowsVar.b;
                if (akqqVar2 != null) {
                    dneu bZ5 = dnfe.p.bZ();
                    dnog bZ6 = dnoh.d.bZ();
                    double d3 = akqqVar2.a;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnoh dnohVar2 = (dnoh) bZ6.b;
                    int i2 = dnohVar2.a | 1;
                    dnohVar2.a = i2;
                    dnohVar2.b = d3;
                    double d4 = akqqVar2.b;
                    dnohVar2.a = i2 | 2;
                    dnohVar2.c = d4;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnfe dnfeVar2 = (dnfe) bZ5.b;
                    dnoh bK3 = bZ6.bK();
                    bK3.getClass();
                    dnfeVar2.e = bK3;
                    dnfeVar2.a |= 8;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnvr dnvrVar3 = (dnvr) bZ2.b;
                    dnfe bK4 = bZ5.bK();
                    bK4.getClass();
                    dnvrVar3.d = bK4;
                    dnvrVar3.a |= 4;
                }
                arrayList.add(bZ2.bK());
            }
            b(arrayList, dqgh.PHONE_NUMBER, bowvVar.f, bowv.q(iloVar, alp.a()));
            b(arrayList, dqgh.WEBSITE, bowvVar.g, bowv.r(iloVar));
            bowt bowtVar = bowvVar.q;
            dnfw s = bowv.s(iloVar);
            if (bowtVar.d.booleanValue() && ((c = bowtVar.c()) == null || s == null || !s.c.equals(c.c))) {
                dnvq bZ7 = dnvr.h.bZ();
                dqgh dqghVar2 = dqgh.CATEGORY;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dnvr dnvrVar4 = (dnvr) bZ7.b;
                dnvrVar4.b = dqghVar2.af;
                dnvrVar4.a |= 1;
                dnfw b = bowtVar.b();
                if (b != null) {
                    dneu bZ8 = dnfe.p.bZ();
                    String a2 = bowt.a(b);
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dnfe dnfeVar3 = (dnfe) bZ8.b;
                    a2.getClass();
                    dnfeVar3.a |= 2;
                    dnfeVar3.c = a2;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnvr dnvrVar5 = (dnvr) bZ7.b;
                    dnfe bK5 = bZ8.bK();
                    bK5.getClass();
                    dnvrVar5.c = bK5;
                    dnvrVar5.a |= 2;
                    String str = b.c;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnvr dnvrVar6 = (dnvr) bZ7.b;
                    str.getClass();
                    dnvrVar6.a |= 16;
                    dnvrVar6.f = str;
                }
                if (c != null) {
                    dneu bZ9 = dnfe.p.bZ();
                    String a3 = bowt.a(c);
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dnfe dnfeVar4 = (dnfe) bZ9.b;
                    a3.getClass();
                    dnfeVar4.a |= 2;
                    dnfeVar4.c = a3;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnvr dnvrVar7 = (dnvr) bZ7.b;
                    dnfe bK6 = bZ9.bK();
                    bK6.getClass();
                    dnvrVar7.d = bK6;
                    dnvrVar7.a |= 4;
                    String str2 = c.c;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnvr dnvrVar8 = (dnvr) bZ7.b;
                    str2.getClass();
                    dnvrVar8.a |= 32;
                    dnvrVar8.g = str2;
                }
                arrayList.add(bZ7.bK());
            }
            byee byeeVar = bowvVar.n;
            byee byeeVar2 = bowvVar.x;
            if (byeeVar != null && byeeVar2 != null) {
                dgsl c2 = byeeVar.c();
                dgsl c3 = byeeVar2.c();
                int size = c2 != null ? c2.a.size() : 0;
                int size2 = c3 != null ? c3.a.size() : 0;
                if (size > 0 || size2 > 0) {
                    dnvq bZ10 = dnvr.h.bZ();
                    dqgh dqghVar3 = dqgh.BUSINESS_HOURS;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dnvr dnvrVar9 = (dnvr) bZ10.b;
                    dnvrVar9.b = dqghVar3.af;
                    dnvrVar9.a = 1 | dnvrVar9.a;
                    if (size > 0) {
                        dneu bZ11 = dnfe.p.bZ();
                        if (bZ11.c) {
                            bZ11.bF();
                            bZ11.c = false;
                        }
                        dnfe dnfeVar5 = (dnfe) bZ11.b;
                        c2.getClass();
                        dnfeVar5.l = c2;
                        dnfeVar5.a |= 2048;
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        dnvr dnvrVar10 = (dnvr) bZ10.b;
                        dnfe bK7 = bZ11.bK();
                        bK7.getClass();
                        dnvrVar10.c = bK7;
                        dnvrVar10.a |= 2;
                    }
                    if (size2 > 0) {
                        dneu bZ12 = dnfe.p.bZ();
                        if (bZ12.c) {
                            bZ12.bF();
                            bZ12.c = false;
                        }
                        dnfe dnfeVar6 = (dnfe) bZ12.b;
                        c3.getClass();
                        dnfeVar6.l = c3;
                        dnfeVar6.a |= 2048;
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        dnvr dnvrVar11 = (dnvr) bZ10.b;
                        dnfe bK8 = bZ12.bK();
                        bK8.getClass();
                        dnvrVar11.d = bK8;
                        dnvrVar11.a |= 4;
                    }
                    arrayList.add(bZ10.bK());
                }
            }
            c(arrayList, dqgh.CLOSED, bowvVar.l);
            c(arrayList, dqgh.PRIVATE, bowvVar.i);
            c(arrayList, dqgh.DOES_NOT_EXIST, bowvVar.k);
        } else if (bowvVar.o.a()) {
            bowy bowyVar = bowvVar.o;
            if (bowyVar.a()) {
                dneu bZ13 = dnfe.p.bZ();
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                dnfe dnfeVar7 = (dnfe) bZ13.b;
                dnfeVar7.a |= 4;
                dnfeVar7.d = true;
                if (bowyVar.b().equals(dqgh.MOVED)) {
                    bowz bowzVar = bowyVar.a;
                    akqq akqqVar3 = bowzVar.b;
                    String str3 = bowzVar.a;
                    if (akqqVar3 != null) {
                        dnog bZ14 = dnoh.d.bZ();
                        double d5 = akqqVar3.a;
                        if (bZ14.c) {
                            bZ14.bF();
                            bZ14.c = false;
                        }
                        dnoh dnohVar3 = (dnoh) bZ14.b;
                        int i3 = dnohVar3.a | 1;
                        dnohVar3.a = i3;
                        dnohVar3.b = d5;
                        double d6 = akqqVar3.b;
                        dnohVar3.a = i3 | 2;
                        dnohVar3.c = d6;
                        if (bZ13.c) {
                            bZ13.bF();
                            bZ13.c = false;
                        }
                        dnfe dnfeVar8 = (dnfe) bZ13.b;
                        dnoh bK9 = bZ14.bK();
                        bK9.getClass();
                        dnfeVar8.e = bK9;
                        dnfeVar8.a |= 8;
                        if (!dbsj.d(str3)) {
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dnfe dnfeVar9 = (dnfe) bZ13.b;
                            str3.getClass();
                            dnfeVar9.a |= 2;
                            dnfeVar9.c = str3;
                        }
                    }
                }
                dnvq bZ15 = dnvr.h.bZ();
                dqgh b2 = bowyVar.b();
                if (bZ15.c) {
                    bZ15.bF();
                    bZ15.c = false;
                }
                dnvr dnvrVar12 = (dnvr) bZ15.b;
                dnvrVar12.b = b2.af;
                dnvrVar12.a |= 1;
                dnfe bK10 = bZ13.bK();
                bK10.getClass();
                dnvrVar12.d = bK10;
                dnvrVar12.a |= 4;
                dnfe dnfeVar10 = a;
                if (bZ15.c) {
                    bZ15.bF();
                    bZ15.c = false;
                }
                dnvr dnvrVar13 = (dnvr) bZ15.b;
                dnfeVar10.getClass();
                dnvrVar13.c = dnfeVar10;
                dnvrVar13.a |= 2;
                arrayList.add(bZ15.bK());
            }
        } else {
            dqgh dqghVar4 = dqgh.CLOSED;
            bowr bowrVar = bowvVar.l;
            if (bowrVar.a()) {
                dnvq bZ16 = dnvr.h.bZ();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dnvr dnvrVar14 = (dnvr) bZ16.b;
                dnvrVar14.b = dqghVar4.af;
                dnvrVar14.a |= 1;
                dneu bZ17 = dnfe.p.bZ();
                boolean booleanValue = bowrVar.b.booleanValue();
                if (bZ17.c) {
                    bZ17.bF();
                    bZ17.c = false;
                }
                dnfe dnfeVar11 = (dnfe) bZ17.b;
                dnfeVar11.a |= 4;
                dnfeVar11.d = booleanValue;
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dnvr dnvrVar15 = (dnvr) bZ16.b;
                dnfe bK11 = bZ17.bK();
                bK11.getClass();
                dnvrVar15.c = bK11;
                dnvrVar15.a |= 2;
                dneu bZ18 = dnfe.p.bZ();
                boolean booleanValue2 = bowrVar.c.booleanValue();
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                dnfe dnfeVar12 = (dnfe) bZ18.b;
                dnfeVar12.a |= 4;
                dnfeVar12.d = booleanValue2;
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dnvr dnvrVar16 = (dnvr) bZ16.b;
                dnfe bK12 = bZ18.bK();
                bK12.getClass();
                dnvrVar16.d = bK12;
                dnvrVar16.a |= 4;
                arrayList.add(bZ16.bK());
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnvs dnvsVar = (dnvs) bZ.b;
        dnvsVar.b();
        dsod.bv(arrayList, dnvsVar.b);
        return bZ.bK();
    }

    private static void b(List<dnvr> list, dqgh dqghVar, bokk bokkVar, String str) {
        if (!bokkVar.h.booleanValue()) {
            return;
        }
        String c = bokkVar.c();
        if (dbsj.e(str).equals(c)) {
            return;
        }
        dnvq bZ = dnvr.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnvr dnvrVar = (dnvr) bZ.b;
        dnvrVar.b = dqghVar.af;
        dnvrVar.a |= 1;
        String str2 = bokkVar.e;
        String str3 = bokkVar.g;
        if (!dbsj.d(str2)) {
            dneu bZ2 = dnfe.p.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ2.b;
            str2.getClass();
            dnfeVar.a |= 2;
            dnfeVar.c = str2;
            if (!dbsj.d(str3)) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnfe dnfeVar2 = (dnfe) bZ2.b;
                str3.getClass();
                dnfeVar2.a |= 16384;
                dnfeVar2.n = str3;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnvr dnvrVar2 = (dnvr) bZ.b;
            dnfe bK = bZ2.bK();
            bK.getClass();
            dnvrVar2.c = bK;
            dnvrVar2.a |= 2;
        }
        if (!dbsj.d(c)) {
            dneu bZ3 = dnfe.p.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnfe dnfeVar3 = (dnfe) bZ3.b;
            c.getClass();
            dnfeVar3.a |= 2;
            dnfeVar3.c = c;
            if (!dbsj.d(str3)) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnfe dnfeVar4 = (dnfe) bZ3.b;
                str3.getClass();
                dnfeVar4.a |= 16384;
                dnfeVar4.n = str3;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnvr dnvrVar3 = (dnvr) bZ.b;
            dnfe bK2 = bZ3.bK();
            bK2.getClass();
            dnvrVar3.d = bK2;
            dnvrVar3.a |= 4;
        }
        list.add(bZ.bK());
    }

    private static void c(List<dnvr> list, dqgh dqghVar, bowr bowrVar) {
        if (!bowrVar.a()) {
            return;
        }
        dnvq bZ = dnvr.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnvr dnvrVar = (dnvr) bZ.b;
        dnvrVar.b = dqghVar.af;
        dnvrVar.a |= 1;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        dnfeVar.a |= 4;
        dnfeVar.d = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnvr dnvrVar2 = (dnvr) bZ.b;
        dnfe bK = bZ2.bK();
        bK.getClass();
        dnvrVar2.d = bK;
        dnvrVar2.a |= 4;
        list.add(bZ.bK());
    }
}
