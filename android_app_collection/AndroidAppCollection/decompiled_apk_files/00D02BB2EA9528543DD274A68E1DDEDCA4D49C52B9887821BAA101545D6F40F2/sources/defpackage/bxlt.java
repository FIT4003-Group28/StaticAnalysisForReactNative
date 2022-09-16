package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxlt  reason: default package */
/* loaded from: classes4.dex */
public final class bxlt {
    public static void a(dwjp dwjpVar, List<dwjj> list) {
        for (int i = 0; i < 2; i++) {
            dwjh dwjhVar = dwjpVar.b;
            if (dwjhVar == null) {
                dwjhVar = dwjh.c;
            }
            if (i >= dwjhVar.a.size()) {
                return;
            }
            dwjh dwjhVar2 = dwjpVar.b;
            if (dwjhVar2 == null) {
                dwjhVar2 = dwjh.c;
            }
            list.add(dwjhVar2.a.get(i));
        }
    }

    public static boolean b(@dzsi dwjp dwjpVar) {
        return dwjpVar == null || dwjpVar == dwjp.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static final String c(dwjj dwjjVar) {
        if ((dwjjVar.a & 2) != 0) {
            dwiv dwivVar = dwjjVar.c;
            if (dwivVar == null) {
                dwivVar = dwiv.M;
            }
            if (dwivVar.c.size() != 1) {
                return null;
            }
            dwiv dwivVar2 = dwjjVar.c;
            if (dwivVar2 == null) {
                dwivVar2 = dwiv.M;
            }
            if ((dwivVar2.c.get(0).a & 4) != 0) {
                dwiv dwivVar3 = dwjjVar.c;
                if (dwivVar3 == null) {
                    dwivVar3 = dwiv.M;
                }
                return dwivVar3.c.get(0).g;
            }
        }
        if ((dwjjVar.a & 32) != 0) {
            dvzj dvzjVar = dwjjVar.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            if ((dvzjVar.a & 1) != 0) {
                dvzj dvzjVar2 = dwjjVar.g;
                if (dvzjVar2 == null) {
                    dvzjVar2 = dvzj.y;
                }
                return dvzjVar2.b;
            }
        }
        if ((dwjjVar.a & 128) != 0) {
            dpjx dpjxVar = dwjjVar.h;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            if ((dpjxVar.a & 2) != 0) {
                dpjx dpjxVar2 = dwjjVar.h;
                if (dpjxVar2 == null) {
                    dpjxVar2 = dpjx.n;
                }
                return dpjxVar2.c;
            }
        }
        return null;
    }

    public static final boolean d(dwjp dwjpVar, GmmLocation gmmLocation) {
        for (int i = 0; i < 2; i++) {
            dwjh dwjhVar = dwjpVar.b;
            if (dwjhVar == null) {
                dwjhVar = dwjh.c;
            }
            if (i >= dwjhVar.a.size()) {
                break;
            }
            dwjh dwjhVar2 = dwjpVar.b;
            if (dwjhVar2 == null) {
                dwjhVar2 = dwjh.c;
            }
            dvzj dvzjVar = dwjhVar2.a.get(i).g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            if (gmmLocation.F(akqq.j(dhjzVar)) < 50000.0d) {
                return true;
            }
        }
        return false;
    }
}
