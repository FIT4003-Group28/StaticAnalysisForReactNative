package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcyn  reason: default package */
/* loaded from: classes5.dex */
public final class dcyn implements Serializable {
    public static final double a;
    private static final long serialVersionUID = 1;
    protected final List<dcxj> b;
    public volatile boolean c;
    private final dcxr d;
    private List<dcxm> e;
    private int f;

    static {
        double d = dcvo.a + dcvo.b;
        a = d + d;
    }

    public dcyn() {
        dcxr dcxrVar = new dcxr();
        this.e = Collections.emptyList();
        this.f = 0;
        dchl.a();
        this.c = true;
        this.d = dcxrVar;
        this.b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T> List<T> c(int i) {
        if (i < 256) {
            return new dcym(i);
        }
        return new dcyl(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int d(dcwa dcwaVar, dcwa dcwaVar2) {
        double k = dcwaVar.k(dcwaVar2);
        dcvb dcvbVar = dcwz.f.e;
        if (k <= a) {
            return 30;
        }
        return Math.max(0, Math.min(30, -(Math.getExponent(k / dcvbVar.a) >> (dcvbVar.b - 1))));
    }

    private final void e(dcvf dcvfVar, dcvf dcvfVar2, dcxq dcxqVar, dcxo dcxoVar) {
        if (dcxqVar.e > 0) {
            dcvg dcvgVar = new dcvg();
            dcvgVar.a.clear();
            while (dcvfVar.compareTo(dcvfVar2) < 0) {
                dcvf dcvfVar3 = dcvfVar;
                while (!dcvfVar3.k() && dcvfVar3.o().l().equals(dcvfVar) && dcvfVar3.o().m().compareTo(dcvfVar2) < 0) {
                    dcvfVar3 = dcvfVar3.o();
                }
                dcvgVar.a.add(dcvfVar3);
                dcvfVar = dcvfVar3.m().r();
            }
            List<dcxn> emptyList = Collections.emptyList();
            for (int i = 0; i < dcvgVar.b(); i++) {
                f(new dcvz(dcvgVar.a.get(i), a), emptyList, dcxqVar, dcxoVar);
            }
        }
    }

    private final void f(dcvz dcvzVar, List<dcxn> list, dcxq dcxqVar, dcxo dcxoVar) {
        List<dcxn> list2;
        int i;
        int i2;
        int i3;
        int i4;
        dcyk dcxyVar;
        dcyk dcxwVar;
        dcxl dcxlVar;
        List list3;
        dcdc dcdcVar;
        List<dcxn> list4 = list;
        dcxq dcxqVar2 = dcxqVar;
        if (!list.isEmpty() || dcxqVar2.e != 0) {
            if (list.size() > 10) {
                double size = list.size() + dcxqVar2.e;
                Double.isNaN(size);
                int max = Math.max(10, (int) (size * 0.2d));
                int i5 = 0;
                for (dcxn dcxnVar : list) {
                    i5 += dcvzVar.f < dcxnVar.a.c ? 1 : 0;
                    if (i5 > max) {
                        int size2 = list.size();
                        List c = c(size2);
                        List c2 = c(size2);
                        List c3 = c(size2);
                        List c4 = c(size2);
                        dcdc i6 = dcdc.i(c, c2, c3, c4);
                        int i7 = dcxoVar.a;
                        dcuv a2 = dcvzVar.a();
                        int i8 = 0;
                        while (i8 < size2) {
                            dcxn dcxnVar2 = list4.get(i8);
                            dcuv dcuvVar = dcxnVar2.b;
                            int i9 = size2;
                            dcuu dcuuVar = dcuvVar.a;
                            double d = dcuuVar.b;
                            int i10 = i7;
                            dcuu dcuuVar2 = a2.a;
                            if (d <= dcuuVar2.a) {
                                j(dcxnVar2, a2.b, c, c2, dcxoVar);
                            } else {
                                double d2 = dcuuVar.a;
                                double d3 = dcuuVar2.b;
                                if (d2 >= d3) {
                                    j(dcxnVar2, a2.b, c3, c4, dcxoVar);
                                } else {
                                    dcuu dcuuVar3 = dcuvVar.b;
                                    double d4 = dcuuVar3.b;
                                    dcuu dcuuVar4 = a2.b;
                                    list3 = c4;
                                    dcdcVar = i6;
                                    if (d4 <= dcuuVar4.a) {
                                        c.add(h(dcxnVar2, true, d3, dcxoVar));
                                        c3.add(h(dcxnVar2, false, a2.a.a, dcxoVar));
                                    } else if (dcuuVar3.a < dcuuVar4.b) {
                                        j(h(dcxnVar2, true, d3, dcxoVar), a2.b, c, c2, dcxoVar);
                                        j(h(dcxnVar2, false, a2.a.a, dcxoVar), a2.b, c3, list3, dcxoVar);
                                    } else {
                                        c2.add(h(dcxnVar2, true, d3, dcxoVar));
                                        list3.add(h(dcxnVar2, false, a2.a.a, dcxoVar));
                                    }
                                    i8++;
                                    list4 = list;
                                    c4 = list3;
                                    size2 = i9;
                                    i7 = i10;
                                    i6 = dcdcVar;
                                }
                            }
                            list3 = c4;
                            dcdcVar = i6;
                            i8++;
                            list4 = list;
                            c4 = list3;
                            size2 = i9;
                            i7 = i10;
                            i6 = dcdcVar;
                        }
                        dcdc dcdcVar2 = i6;
                        int i11 = i7;
                        int i12 = 0;
                        while (i12 < 4) {
                            dcdc dcdcVar3 = dcdcVar2;
                            List<dcxn> list5 = (List) dcdcVar3.get(dcvc.b(dcvzVar.e, i12));
                            if (!list5.isEmpty() || dcxqVar.e > 0) {
                                int b = dcvc.b(dcvzVar.e, i12);
                                f(new dcvz(dcvzVar, i12, b >> 1, b & 1), list5, dcxqVar, dcxoVar);
                            }
                            i12++;
                            dcdcVar2 = dcdcVar3;
                        }
                        dcxoVar.a = i11;
                        return;
                    }
                    dcxqVar2 = dcxqVar2;
                    list4 = list;
                }
            }
            dcxq dcxqVar3 = dcxqVar2;
            dcyn dcynVar = this;
            dcvz dcvzVar2 = dcvzVar;
            int size3 = list.size();
            int i13 = 2;
            if (dcxqVar3.a && size3 > 0) {
                if (dcvzVar2.a.l().b != dcxqVar3.c.b) {
                    int i14 = dcvzVar2.c;
                    int i15 = dcvzVar2.d;
                    if ((dcvzVar2.e & 2) != 0) {
                        int i16 = dcvf.i(dcvzVar2.f);
                        i14 += i16;
                        i15 += i16;
                    }
                    long j = i14;
                    long j2 = i15;
                    dcxqVar3.b = dcwa.f(dcwz.f.l(dcvzVar2.a.g(), j + j, j2 + j2));
                }
                int i17 = dcvzVar2.f;
                long j3 = dcvzVar2.c;
                long i18 = dcvf.i(i17);
                long j4 = dcvzVar2.d;
                dcxqVar3.a(dcwa.f(dcwz.f.l(dcvzVar2.a.g(), j3 + j3 + i18, j4 + j4 + i18)));
                for (int i19 = 0; i19 < size3; i19++) {
                    dcxp dcxpVar = list.get(i19).a;
                    if (dcynVar.b.get(dcxpVar.a).g()) {
                        dcxqVar3.b(dcxpVar.a, dcxpVar.h, dcxpVar.i);
                    }
                }
            }
            List<dcxn> list6 = list;
            dcvf dcvfVar = dcvzVar2.a;
            int size4 = dcynVar.b.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i20 >= size3 && i21 >= dcxqVar3.e) {
                    break;
                }
                int i23 = i20 < size3 ? list6.get(i20).a.a : size4;
                int i24 = i21 < dcxqVar3.e ? dcxqVar3.d[i21] : size4;
                if (i24 >= i23) {
                    int i25 = i20;
                    while (i25 < size3 && list6.get(i25).a.a == i23) {
                        i25++;
                    }
                    dcxj dcxjVar = dcynVar.b.get(i23);
                    int i26 = i25 - i20;
                    if (i26 == 1) {
                        dcxn dcxnVar3 = list6.get(i20);
                        if (dcvfVar != null) {
                            long j5 = dcvfVar.b;
                            if (i24 == i23) {
                                dcxwVar = new dcyf(dcxjVar, dcxnVar3, j5);
                            } else {
                                dcxwVar = new dcyg(dcxjVar, dcxnVar3, j5);
                            }
                        } else if (i24 == i23) {
                            dcxwVar = new dcyh(dcxjVar, dcxnVar3);
                        } else {
                            dcxwVar = new dcyi(dcxjVar, dcxnVar3);
                        }
                        list2 = list;
                        i = size3;
                        i2 = i24;
                        i3 = size4;
                        i4 = i23;
                    } else {
                        list2 = list6;
                        int i27 = list2.get(i20).a.b;
                        int i28 = 1;
                        while (true) {
                            if (i28 < i26) {
                                i = size3;
                                int i29 = i25;
                                if (i27 + i28 == list2.get(i20 + i28).a.b) {
                                    i25 = i29;
                                    i28++;
                                    size3 = i;
                                    size4 = size4;
                                } else if (dcvfVar != null) {
                                    long j6 = dcvfVar.b;
                                    if (i24 == i23) {
                                        i25 = i29;
                                        i2 = i24;
                                        i3 = size4;
                                        i4 = i23;
                                        dcxwVar = new dcya(dcxjVar, list, i20, i25, j6);
                                    } else {
                                        i2 = i24;
                                        i3 = size4;
                                        i4 = i23;
                                        i25 = i29;
                                        dcxwVar = new dcyb(dcxjVar, list, i20, i25, j6);
                                    }
                                } else {
                                    i2 = i24;
                                    i3 = size4;
                                    i4 = i23;
                                    if (i2 == i4) {
                                        i25 = i29;
                                        dcxyVar = new dcyc(dcxjVar, list2, i20, i25);
                                    } else {
                                        i25 = i29;
                                        dcxyVar = new dcyd(dcxjVar, list2, i20, i25);
                                    }
                                }
                            } else {
                                i = size3;
                                i2 = i24;
                                i3 = size4;
                                i4 = i23;
                                if (dcvfVar != null) {
                                    long j7 = dcvfVar.b;
                                    if (i2 == i4) {
                                        dcxwVar = new dcxv(dcxjVar, i27, i26, j7);
                                    } else {
                                        dcxwVar = new dcxw(dcxjVar, i27, i26, j7);
                                    }
                                } else if (i2 == i4) {
                                    dcxyVar = new dcxx(dcxjVar, i27, i26);
                                } else {
                                    dcxyVar = new dcxy(dcxjVar, i27, i26);
                                }
                            }
                        }
                        dcxwVar = dcxyVar;
                    }
                    if (i2 == i4) {
                        i21++;
                    }
                    i20 = i25;
                } else {
                    dcxj dcxjVar2 = dcynVar.b.get(i24);
                    if (dcvfVar != null) {
                        dcxwVar = new dcxs(dcxjVar2, dcvfVar.b);
                    } else {
                        dcxwVar = new dcxt(dcxjVar2);
                    }
                    i21++;
                    i = size3;
                    list2 = list6;
                    i3 = size4;
                }
                dcxqVar3.f[i22] = dcxwVar;
                dcvfVar = null;
                dcynVar = this;
                dcvzVar2 = dcvzVar;
                i22++;
                list6 = list2;
                size3 = i;
                size4 = i3;
                i13 = 2;
            }
            List<dcxm> list7 = dcynVar.e;
            dcyk[] dcykVarArr = dcxqVar3.f;
            if (i22 == 1) {
                dcxlVar = dcykVarArr[0];
            } else if (i22 != i13) {
                dcxlVar = new dcxl((dcyk[]) Arrays.copyOf(dcykVarArr, i22));
            } else {
                dcxlVar = new dcxk(dcykVarArr[0], dcykVarArr[1]);
            }
            list7.add(dcxlVar);
            if (!dcxqVar3.a || list.isEmpty()) {
                return;
            }
            int i30 = dcvzVar2.c;
            int i31 = dcvzVar2.d;
            int i32 = dcvf.i(dcvzVar2.f);
            int i33 = dcvzVar2.e;
            if (i33 == 0 || i33 == 3) {
                i30 += i32;
            } else {
                i31 += i32;
            }
            long j8 = i30;
            long j9 = i31;
            dcxqVar3.a(dcwa.f(dcwz.f.l(dcvzVar2.a.g(), j8 + j8, j9 + j9)));
            for (int i34 = 0; i34 < size3; i34++) {
                dcxp dcxpVar2 = list6.get(i34).a;
                if (dcynVar.b.get(dcxpVar2.a).g()) {
                    dcxqVar3.b(dcxpVar2.a, dcxpVar2.h, dcxpVar2.i);
                }
            }
            dcxqVar3.c = dcvzVar2.a.m().r();
        }
    }

    private static dcxn g(dcxn dcxnVar, boolean z, double d, boolean z2, double d2, dcxo dcxoVar) {
        if (dcxoVar.a == dcxoVar.b.size()) {
            dcxoVar.b.add(new dcxn());
        }
        List<dcxn> list = dcxoVar.b;
        int i = dcxoVar.a;
        dcxoVar.a = i + 1;
        dcxn dcxnVar2 = list.get(i);
        dcxnVar2.a = dcxnVar.a;
        if (!z) {
            dcxnVar2.b.a.f(d, dcxnVar.b.a.b);
        } else {
            dcxnVar2.b.a.f(dcxnVar.b.a.a, d);
        }
        if (!z2) {
            dcxnVar2.b.b.f(d2, dcxnVar.b.b.b);
        } else {
            dcxnVar2.b.b.f(dcxnVar.b.b.a, d2);
        }
        return dcxnVar2;
    }

    private static dcxn h(dcxn dcxnVar, boolean z, double d, dcxo dcxoVar) {
        if (!z) {
            if (dcxnVar.b.a.a >= d) {
                return dcxnVar;
            }
        } else if (dcxnVar.b.a.b <= d) {
            return dcxnVar;
        }
        dcxp dcxpVar = dcxnVar.a;
        double g = dcxnVar.b.b.g(dcvo.c(d, dcxpVar.d, dcxpVar.f, dcxpVar.e, dcxpVar.g));
        boolean z2 = false;
        if ((dcxpVar.d > dcxpVar.f) != (dcxpVar.e > dcxpVar.g)) {
            z2 = true;
        }
        return g(dcxnVar, z, d, z2 ^ z, g, dcxoVar);
    }

    private static dcxn i(dcxn dcxnVar, boolean z, double d, dcxo dcxoVar) {
        if (!z) {
            if (dcxnVar.b.b.a >= d) {
                return dcxnVar;
            }
        } else if (dcxnVar.b.b.b <= d) {
            return dcxnVar;
        }
        dcxp dcxpVar = dcxnVar.a;
        double g = dcxnVar.b.a.g(dcvo.c(d, dcxpVar.e, dcxpVar.g, dcxpVar.d, dcxpVar.f));
        boolean z2 = false;
        if ((dcxpVar.d > dcxpVar.f) != (dcxpVar.e > dcxpVar.g)) {
            z2 = true;
        }
        return g(dcxnVar, z2 ^ z, g, z, d, dcxoVar);
    }

    private static void j(dcxn dcxnVar, dcuu dcuuVar, List<dcxn> list, List<dcxn> list2, dcxo dcxoVar) {
        dcuu dcuuVar2 = dcxnVar.b.b;
        if (dcuuVar2.b <= dcuuVar.a) {
            list.add(dcxnVar);
            return;
        }
        double d = dcuuVar2.a;
        double d2 = dcuuVar.b;
        if (d < d2) {
            list.add(i(dcxnVar, true, d2, dcxoVar));
            list2.add(i(dcxnVar, false, dcuuVar.a, dcxoVar));
            return;
        }
        list2.add(dcxnVar);
    }

    public final void a(dcxj dcxjVar) {
        this.b.add(dcxjVar);
        this.c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02c5 A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:9:0x001b, B:11:0x0023, B:12:0x0033, B:14:0x0047, B:15:0x0051, B:16:0x0061, B:18:0x006a, B:20:0x0079, B:22:0x0081, B:23:0x0084, B:25:0x009a, B:27:0x009f, B:28:0x00a6, B:30:0x00b4, B:32:0x00ce, B:34:0x00d8, B:36:0x00e2, B:38:0x00ec, B:47:0x015f, B:42:0x0124, B:44:0x013a, B:46:0x015a, B:48:0x016f, B:51:0x0178, B:53:0x0184, B:86:0x0313, B:57:0x018e, B:59:0x0199, B:60:0x01db, B:62:0x01f4, B:64:0x01fe, B:66:0x0208, B:76:0x024d, B:78:0x02c5, B:81:0x02d9, B:83:0x02e3, B:85:0x030e, B:79:0x02c8, B:70:0x0214, B:71:0x021a, B:73:0x0234, B:80:0x02d7, B:87:0x0320, B:88:0x032b), top: B:96:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c8 A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:9:0x001b, B:11:0x0023, B:12:0x0033, B:14:0x0047, B:15:0x0051, B:16:0x0061, B:18:0x006a, B:20:0x0079, B:22:0x0081, B:23:0x0084, B:25:0x009a, B:27:0x009f, B:28:0x00a6, B:30:0x00b4, B:32:0x00ce, B:34:0x00d8, B:36:0x00e2, B:38:0x00ec, B:47:0x015f, B:42:0x0124, B:44:0x013a, B:46:0x015a, B:48:0x016f, B:51:0x0178, B:53:0x0184, B:86:0x0313, B:57:0x018e, B:59:0x0199, B:60:0x01db, B:62:0x01f4, B:64:0x01fe, B:66:0x0208, B:76:0x024d, B:78:0x02c5, B:81:0x02d9, B:83:0x02e3, B:85:0x030e, B:79:0x02c8, B:70:0x0214, B:71:0x021a, B:73:0x0234, B:80:0x02d7, B:87:0x0320, B:88:0x032b), top: B:96:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e3 A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:9:0x001b, B:11:0x0023, B:12:0x0033, B:14:0x0047, B:15:0x0051, B:16:0x0061, B:18:0x006a, B:20:0x0079, B:22:0x0081, B:23:0x0084, B:25:0x009a, B:27:0x009f, B:28:0x00a6, B:30:0x00b4, B:32:0x00ce, B:34:0x00d8, B:36:0x00e2, B:38:0x00ec, B:47:0x015f, B:42:0x0124, B:44:0x013a, B:46:0x015a, B:48:0x016f, B:51:0x0178, B:53:0x0184, B:86:0x0313, B:57:0x018e, B:59:0x0199, B:60:0x01db, B:62:0x01f4, B:64:0x01fe, B:66:0x0208, B:76:0x024d, B:78:0x02c5, B:81:0x02d9, B:83:0x02e3, B:85:0x030e, B:79:0x02c8, B:70:0x0214, B:71:0x021a, B:73:0x0234, B:80:0x02d7, B:87:0x0320, B:88:0x032b), top: B:96:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcvr<defpackage.dcxm> b() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcyn.b():dcvr");
    }
}
