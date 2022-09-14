package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zsa  reason: default package */
/* loaded from: classes7.dex */
public final class zsa {
    public static dcdc<zdu> a(amve amveVar, vtj vtjVar) {
        if (!amveVar.c()) {
            return dcdc.e();
        }
        return b(amveVar.b().n, vtjVar);
    }

    public static dcdc<zdu> b(List<dpce> list, vtj vtjVar) {
        if (!list.isEmpty()) {
            ArrayList<List> a = dchl.a();
            ArrayList a2 = dchl.a();
            a.add(a2);
            for (dpce dpceVar : list) {
                int a3 = dpcd.a(dpceVar.b);
                if (a3 == 0 || a3 != 10) {
                    a2.add(dpceVar);
                } else {
                    a2 = dchl.a();
                    a.add(a2);
                }
            }
            dccx F = dcdc.F();
            for (List<dpce> list2 : a) {
                dccx F2 = dcdc.F();
                jhk jhkVar = null;
                String str = null;
                dpce dpceVar2 = null;
                String str2 = null;
                Float f = null;
                for (dpce dpceVar3 : list2) {
                    douj doujVar = dpceVar3.d;
                    if (doujVar == null) {
                        doujVar = douj.h;
                    }
                    if (str2 == null) {
                        int i = doujVar.a;
                        if ((i & 8) != 0) {
                            str2 = doujVar.f;
                            if ((i & 16) != 0) {
                                f = Float.valueOf(doujVar.g);
                            }
                        }
                    }
                    if (dpceVar2 != null || !alcf.h(dpceVar3)) {
                        F2.g(dpceVar3);
                    } else {
                        dpceVar2 = dpceVar3;
                    }
                }
                if (dpceVar2 != null) {
                    douj doujVar2 = dpceVar2.d;
                    if (doujVar2 == null) {
                        doujVar2 = douj.h;
                    }
                    if ((doujVar2.a & 4) != 0) {
                        douj doujVar3 = dpceVar2.d;
                        if (doujVar3 == null) {
                            doujVar3 = douj.h;
                        }
                        str = doujVar3.e;
                    }
                    douj doujVar4 = dpceVar2.d;
                    if (doujVar4 == null) {
                        doujVar4 = douj.h;
                    }
                    jhkVar = new jhk(doujVar4.c, vtjVar, dbsg.j(str), dbsg.j(str2), dbsg.j(f));
                }
                dcdc f2 = F2.f();
                int size = f2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        int a4 = dpcd.a(((dpce) f2.get(i2)).b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        i2++;
                        if (a4 == 24) {
                            F.g(new zrv(jhkVar, new zvb(f2, vtjVar)));
                            break;
                        }
                    } else {
                        F.g(new zsg(jhkVar, new zvb(f2, vtjVar)));
                        break;
                    }
                }
            }
            return F.f();
        }
        return dcdc.e();
    }
}
