package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vxv  reason: default package */
/* loaded from: classes7.dex */
public class vxv {
    private final cqat a;
    private final btpc b;
    private final vxh c;

    public vxv(cqat cqatVar, btpc btpcVar, vxh vxhVar) {
        this.a = cqatVar;
        this.b = btpcVar;
        this.c = vxhVar;
    }

    @dzsi
    public static doyp b(dphe dpheVar) {
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        if ((dpgwVar.a & 16) != 0) {
            doyo bZ = doyp.k.bZ();
            if ((dpgwVar.a & 64) != 0) {
                dgaw dgawVar = dpgwVar.h;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                doyp doypVar = (doyp) bZ.b;
                dgawVar.getClass();
                doypVar.e = dgawVar;
                doypVar.a |= 64;
            }
            dpbw b = dpbw.b(dpgwVar.p);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doyp doypVar2 = (doyp) bZ.b;
            doypVar2.c = b.f;
            doypVar2.a |= 2;
            dgaw dgawVar2 = dpgwVar.f;
            if (dgawVar2 == null) {
                dgawVar2 = dgaw.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doyp doypVar3 = (doyp) bZ.b;
            dgawVar2.getClass();
            doypVar3.b = dgawVar2;
            int i = doypVar3.a | 1;
            doypVar3.a = i;
            String str = dpheVar.m;
            str.getClass();
            doypVar3.a = i | 4096;
            doypVar3.j = str;
            return bZ.bK();
        }
        return null;
    }

    public static int e(List<doyp> list, @dzsi doyp doypVar) {
        if (doypVar != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).j.equals(doypVar.j)) {
                    return i;
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (f(list.get(i2), doypVar) == 0) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    public static int f(doyp doypVar, doyp doypVar2) {
        dgaw dgawVar;
        dgaw dgawVar2;
        if ((doypVar.a & 64) != 0) {
            dgawVar = doypVar.e;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        }
        if ((doypVar2.a & 64) == 0 ? (dgawVar2 = doypVar2.b) == null : (dgawVar2 = doypVar2.e) == null) {
            dgawVar2 = dgaw.g;
        }
        return (dgawVar.b > dgawVar2.b ? 1 : (dgawVar.b == dgawVar2.b ? 0 : -1));
    }

    public final vxu a(dpdy dpdyVar, boolean z, boolean z2) {
        int e;
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        dpgw dpgwVar2 = dpgwVar;
        dpdx dpdxVar = dpdyVar.g;
        if (dpdxVar == null) {
            dpdxVar = dpdx.d;
        }
        dgas dgasVar = dpdxVar.a;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        dpdx dpdxVar2 = dpdyVar.g;
        if (dpdxVar2 == null) {
            dpdxVar2 = dpdx.d;
        }
        List<doyp> c = c(dpdxVar2.b, z);
        dphe dpheVar2 = dpdyVar.e;
        if (dpheVar2 == null) {
            dpheVar2 = dphe.x;
        }
        doyp b = b(dpheVar2);
        ArrayList arrayList = new ArrayList(c);
        if (z2 && (e = e(arrayList, b)) >= 0) {
            arrayList.remove(e);
        }
        vwr vwrVar = (vwr) d(arrayList);
        return vxu.h(dpgwVar2, b, c, arrayList, vwrVar.a, vwrVar.b, (dgasVar.a & 2) == 0 ? null : dgasVar);
    }

    public final List<doyp> c(List<doyp> list, boolean z) {
        List<doyp> c = this.c.c(list, true != z ? 1 : 5, this.a.b(), 3);
        if (c.isEmpty()) {
            return c;
        }
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        ArrayList arrayList = new ArrayList();
        for (doyp doypVar : c) {
            dgaw dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            if (dgawVar.b - TimeUnit.MILLISECONDS.toSeconds(this.a.b()) < seconds) {
                arrayList.add(doypVar);
            }
        }
        return arrayList;
    }

    public final vxt d(List<doyp> list) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        Iterator it = dcft.v(list, 2).iterator();
        while (true) {
            if (it.hasNext()) {
                dpbw c = vxj.c((doyp) it.next());
                if (c != dpbw.UNKNOWN) {
                    dpbwVar = c;
                    break;
                }
            } else {
                break;
            }
        }
        return new vwr(this.b.i() ? dpbwVar : dpbw.UNKNOWN, dpbwVar != dpbw.UNKNOWN);
    }
}
