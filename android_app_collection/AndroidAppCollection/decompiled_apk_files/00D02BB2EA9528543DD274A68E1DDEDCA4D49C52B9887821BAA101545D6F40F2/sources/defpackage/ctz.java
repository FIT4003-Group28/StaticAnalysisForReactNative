package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctz  reason: default package */
/* loaded from: classes5.dex */
public final class ctz {
    public static final /* synthetic */ int a = 0;
    private static final dcep<dnow> b = dcnm.a(dnow.PROMOTED_POI, dnow.PROMOTED_AGGREGATOR, dnow.PROMOTED_MANUFACTURER, dnow.PROMOTED_LOGOLESS_FIRST_PARTY);

    public static boolean a(List<dnow> list) {
        return !Collections.disjoint(list, b);
    }

    public static dqmr b(cut cutVar) {
        String str = cutVar.c;
        djie djieVar = cutVar.b;
        if (djieVar == null) {
            djieVar = djie.k;
        }
        dqmr dqmrVar = djieVar.g;
        if (dqmrVar == null) {
            dqmrVar = dqmr.h;
        }
        dsqp dsqpVar = (dsqp) dqmrVar.cu(5);
        dsqpVar.bC(dqmrVar);
        dqmo dqmoVar = (dqmo) dsqpVar;
        if (dqmoVar.c) {
            dqmoVar.bF();
            dqmoVar.c = false;
        }
        dqmr dqmrVar2 = (dqmr) dqmoVar.b;
        str.getClass();
        dqmrVar2.a |= 8;
        dqmrVar2.f = str;
        return dqmoVar.bK();
    }

    public static final cvj c(djiq djiqVar, int i, boolean z, boolean z2, ddho ddhoVar, ddho ddhoVar2) {
        cuw bZ = cvj.q.bZ();
        dsrj<djie> dsrjVar = djiqVar.b;
        ArrayList arrayList = new ArrayList();
        for (djie djieVar : dsrjVar) {
            if (akqi.f(djieVar.b) != null) {
                dhwg dhwgVar = djieVar.h;
                if (dhwgVar == null) {
                    dhwgVar = dhwg.g;
                }
                if ((8 & dhwgVar.a) != 0) {
                    dhwg dhwgVar2 = djieVar.h;
                    if (dhwgVar2 == null) {
                        dhwgVar2 = dhwg.g;
                    }
                    int i2 = dhwgVar2.d;
                    dhwg dhwgVar3 = djieVar.h;
                    if (dhwgVar3 == null) {
                        dhwgVar3 = dhwg.g;
                    }
                    if (i2 < dhwgVar3.c) {
                        dhwg dhwgVar4 = djieVar.h;
                        if (dhwgVar4 == null) {
                            dhwgVar4 = dhwg.g;
                        }
                        if (dhwgVar4.c != Integer.MAX_VALUE) {
                            djib ca = djie.k.ca(djieVar);
                            dhwd bZ2 = dhwg.g.bZ();
                            dhwg dhwgVar5 = djieVar.h;
                            if (dhwgVar5 == null) {
                                dhwgVar5 = dhwg.g;
                            }
                            int i3 = dhwgVar5.c;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dhwg dhwgVar6 = (dhwg) bZ2.b;
                            dhwgVar6.a |= 2;
                            dhwgVar6.c = i3;
                            dhwg dhwgVar7 = djieVar.h;
                            if (dhwgVar7 == null) {
                                dhwgVar7 = dhwg.g;
                            }
                            int i4 = dhwgVar7.b;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dhwg dhwgVar8 = (dhwg) bZ2.b;
                            dhwgVar8.a |= 1;
                            dhwgVar8.b = i4;
                            if (ca.c) {
                                ca.bF();
                                ca.c = false;
                            }
                            djie djieVar2 = (djie) ca.b;
                            dhwg bK = bZ2.bK();
                            bK.getClass();
                            djieVar2.h = bK;
                            djieVar2.a |= 64;
                            arrayList.add(ca.bK());
                        }
                    }
                }
                arrayList.add(djieVar);
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cvj cvjVar = (cvj) bZ.b;
        dsrj<djie> dsrjVar2 = cvjVar.d;
        if (!dsrjVar2.a()) {
            cvjVar.d = dsqw.cl(dsrjVar2);
        }
        dsod.bv(arrayList, cvjVar.d);
        djim djimVar = djiqVar.c;
        if (djimVar == null) {
            djimVar = djim.C;
        }
        boolean z3 = djimVar.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cvj cvjVar2 = (cvj) bZ.b;
        int i5 = cvjVar2.a | 1;
        cvjVar2.a = i5;
        cvjVar2.e = z3;
        boolean z4 = djimVar.q;
        int i6 = i5 | 2;
        cvjVar2.a = i6;
        cvjVar2.f = z4;
        if ((djimVar.a & 8192) != 0) {
            float f = djimVar.l;
            i6 |= 4;
            cvjVar2.a = i6;
            cvjVar2.g = (int) f;
        }
        boolean z5 = djimVar.d;
        cvjVar2.a = i6 | 8;
        cvjVar2.h = z5;
        if ((djimVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            cvh bZ3 = cvi.d.bZ();
            djil djilVar = djimVar.n;
            if (djilVar == null) {
                djilVar = djil.c;
            }
            int i7 = djilVar.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            cvi cviVar = (cvi) bZ3.b;
            cviVar.a |= 1;
            cviVar.b = i7;
            djil djilVar2 = djimVar.n;
            if (djilVar2 == null) {
                djilVar2 = djil.c;
            }
            int i8 = djilVar2.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            cvi cviVar2 = (cvi) bZ3.b;
            cviVar2.a |= 2;
            cviVar2.c = i8;
            cvi bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cvj cvjVar3 = (cvj) bZ.b;
            bK2.getClass();
            cvjVar3.i = bK2;
            cvjVar3.a |= 16;
        }
        if ((djimVar.a & 131072) != 0) {
            cvh bZ4 = cvi.d.bZ();
            djil djilVar3 = djimVar.o;
            if (djilVar3 == null) {
                djilVar3 = djil.c;
            }
            int i9 = djilVar3.a;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            cvi cviVar3 = (cvi) bZ4.b;
            cviVar3.a |= 1;
            cviVar3.b = i9;
            djil djilVar4 = djimVar.o;
            if (djilVar4 == null) {
                djilVar4 = djil.c;
            }
            int i10 = djilVar4.b;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            cvi cviVar4 = (cvi) bZ4.b;
            cviVar4.a |= 2;
            cviVar4.c = i10;
            cvi bK3 = bZ4.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cvj cvjVar4 = (cvj) bZ.b;
            bK3.getClass();
            cvjVar4.j = bK3;
            cvjVar4.a |= 32;
        }
        if ((djimVar.a & 262144) != 0) {
            djig djigVar = djimVar.p;
            if (djigVar == null) {
                djigVar = djig.g;
            }
            cuu bZ5 = cuv.j.bZ();
            String str = djigVar.a;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            cuv cuvVar = (cuv) bZ5.b;
            str.getClass();
            int i11 = cuvVar.a | 1;
            cuvVar.a = i11;
            cuvVar.b = str;
            String str2 = djigVar.b;
            str2.getClass();
            int i12 = i11 | 2;
            cuvVar.a = i12;
            cuvVar.c = str2;
            int i13 = djigVar.c;
            int i14 = i12 | 4;
            cuvVar.a = i14;
            cuvVar.d = i13;
            int i15 = djigVar.d;
            int i16 = i14 | 8;
            cuvVar.a = i16;
            cuvVar.e = i15;
            int i17 = djigVar.e;
            int i18 = i16 | 16;
            cuvVar.a = i18;
            cuvVar.f = i17;
            int i19 = djigVar.f;
            int i20 = i18 | 32;
            cuvVar.a = i20;
            cuvVar.g = i19;
            int i21 = djimVar.h;
            int i22 = i20 | 64;
            cuvVar.a = i22;
            cuvVar.h = i21;
            int i23 = djimVar.i;
            cuvVar.a = i22 | 128;
            cuvVar.i = i23;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cvj cvjVar5 = (cvj) bZ.b;
            cuv bK4 = bZ5.bK();
            bK4.getClass();
            cvjVar5.c = bK4;
            cvjVar5.b = 8;
        } else {
            cuz bZ6 = cva.h.bZ();
            int i24 = djimVar.h;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            cva cvaVar = (cva) bZ6.b;
            int i25 = cvaVar.a | 1;
            cvaVar.a = i25;
            cvaVar.b = i24;
            int i26 = djimVar.i;
            int i27 = i25 | 2;
            cvaVar.a = i27;
            cvaVar.c = i26;
            int i28 = djimVar.f;
            int i29 = i27 | 4;
            cvaVar.a = i29;
            cvaVar.d = i28;
            int i30 = djimVar.g;
            int i31 = i29 | 8;
            cvaVar.a = i31;
            cvaVar.e = i30;
            String str3 = djimVar.j;
            str3.getClass();
            int i32 = i31 | 16;
            cvaVar.a = i32;
            cvaVar.f = str3;
            boolean z6 = djimVar.t;
            cvaVar.a = i32 | 32;
            cvaVar.g = z6;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cvj cvjVar6 = (cvj) bZ.b;
            cva bK5 = bZ6.bK();
            bK5.getClass();
            cvjVar6.c = bK5;
            cvjVar6.b = 7;
        }
        if ((djimVar.a & 32768) != 0) {
            cux bZ7 = cuy.f.bZ();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            cuy cuyVar = (cuy) bZ7.b;
            int i33 = cuyVar.a | 64;
            cuyVar.a = i33;
            cuyVar.e = i;
            int i34 = djimVar.m;
            int i35 = i33 | 2;
            cuyVar.a = i35;
            cuyVar.b = i34;
            int i36 = djimVar.v;
            int i37 = i35 | 16;
            cuyVar.a = i37;
            cuyVar.c = i36;
            int i38 = djimVar.w;
            cuyVar.a = i37 | 32;
            cuyVar.d = i38;
            cuy bK6 = bZ7.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cvj cvjVar7 = (cvj) bZ.b;
            bK6.getClass();
            cvjVar7.k = bK6;
            cvjVar7.a |= 256;
        }
        cve bZ8 = cvf.d.bZ();
        djij djijVar = djimVar.x;
        if (djijVar == null) {
            djijVar = djij.d;
        }
        if ((djijVar.a & 1) != 0) {
            djij djijVar2 = djimVar.x;
            if (djijVar2 == null) {
                djijVar2 = djij.d;
            }
            int i39 = djijVar2.b;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            cvf cvfVar = (cvf) bZ8.b;
            cvfVar.a |= 1;
            cvfVar.b = i39;
        }
        djij djijVar3 = djimVar.x;
        if (djijVar3 == null) {
            djijVar3 = djij.d;
        }
        if ((djijVar3.a & 2) != 0) {
            djij djijVar4 = djimVar.x;
            if (djijVar4 == null) {
                djijVar4 = djij.d;
            }
            int i40 = djijVar4.c;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            cvf cvfVar2 = (cvf) bZ8.b;
            cvfVar2.a |= 2;
            cvfVar2.c = i40;
        }
        cvd bZ9 = cvg.f.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        cvg cvgVar = (cvg) bZ9.b;
        int i41 = cvgVar.a | 1;
        cvgVar.a = i41;
        cvgVar.b = z;
        int i42 = ((dtxi) ddhoVar).a;
        int i43 = i41 | 2;
        cvgVar.a = i43;
        cvgVar.c = i42;
        int i44 = ((dtxi) ddhoVar2).a;
        cvgVar.a = i43 | 4;
        cvgVar.d = i44;
        cvf bK7 = bZ8.bK();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        cvg cvgVar2 = (cvg) bZ9.b;
        bK7.getClass();
        cvgVar2.e = bK7;
        cvgVar2.a |= 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cvj cvjVar8 = (cvj) bZ.b;
        cvg bK8 = bZ9.bK();
        bK8.getClass();
        cvjVar8.l = bK8;
        cvjVar8.a |= 512;
        cvb bZ10 = cvc.e.bZ();
        String str4 = djimVar.e;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        cvc cvcVar = (cvc) bZ10.b;
        str4.getClass();
        int i45 = cvcVar.a | 2;
        cvcVar.a = i45;
        cvcVar.c = str4;
        boolean z7 = djimVar.r;
        int i46 = i45 | 4;
        cvcVar.a = i46;
        cvcVar.d = z7;
        cvcVar.a = i46 | 1;
        cvcVar.b = z2;
        cvc bK9 = bZ10.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cvj cvjVar9 = (cvj) bZ.b;
        bK9.getClass();
        cvjVar9.m = bK9;
        int i47 = cvjVar9.a | 1024;
        cvjVar9.a = i47;
        boolean z8 = djimVar.y;
        int i48 = i47 | 2048;
        cvjVar9.a = i48;
        cvjVar9.n = z8;
        boolean z9 = djimVar.z;
        int i49 = i48 | 4096;
        cvjVar9.a = i49;
        cvjVar9.o = z9;
        boolean z10 = djimVar.A;
        cvjVar9.a = i49 | 8192;
        cvjVar9.p = z10;
        return bZ.bK();
    }
}
