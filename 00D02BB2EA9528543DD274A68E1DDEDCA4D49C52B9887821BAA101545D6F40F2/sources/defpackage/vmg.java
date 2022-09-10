package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: vmg  reason: default package */
/* loaded from: classes7.dex */
public final class vmg {
    public final dbsg<qbl> a;

    public vmg() {
        this.a = dbpy.a;
    }

    public vmg(dbsg<dzsj<qbl>> dbsgVar) {
        this.a = dbsg.j(dbsgVar.a() ? dbsgVar.b().a() : null);
    }

    @dzsi
    public static dore c(dwaw dwawVar) {
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        if ((dvzyVar.a & 131072) != 0) {
            dwbm dwbmVar = dvzyVar.r;
            if (dwbmVar == null) {
                dwbmVar = dwbm.c;
            }
            if ((dwbmVar.a & 1) == 0) {
                return null;
            }
            dwbm dwbmVar2 = dvzyVar.r;
            if (dwbmVar2 == null) {
                dwbmVar2 = dwbm.c;
            }
            dore b = dore.b(dwbmVar2.b);
            return b == null ? dore.UNKNOWN : b;
        }
        return null;
    }

    public final vmd a(dwaw dwawVar, vmb vmbVar) {
        return b(dwawVar, false, 0L, vmbVar, true);
    }

    public final vmd b(dwaw dwawVar, boolean z, long j, vmb vmbVar, boolean z2) {
        vlq vlqVar = new vlq();
        vlqVar.b(0);
        if (dwawVar != null) {
            vlqVar.a = dwawVar;
            vlqVar.c = Boolean.valueOf(z);
            vlqVar.d = Long.valueOf(j);
            buac a = buad.a();
            btyr bZ = btys.f.bZ();
            boolean z3 = true;
            int i = true != z2 ? 1 : 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            btys btysVar = (btys) bZ.b;
            btysVar.a |= 2;
            btysVar.c = i;
            a.c(bZ.bK());
            btyp bZ2 = btyq.h.bZ();
            dvzy dvzyVar = dwawVar.b;
            if (dvzyVar == null) {
                dvzyVar = dvzy.u;
            }
            Iterator<dpjx> it = dvzyVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                dpjs b = dpjs.b(it.next().f);
                if (b == null) {
                    b = dpjs.ENTITY_TYPE_DEFAULT;
                }
                if (b == dpjs.ENTITY_TYPE_MY_LOCATION) {
                    break;
                }
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            btyq btyqVar = (btyq) bZ2.b;
            btyqVar.a = 2 | btyqVar.a;
            btyqVar.c = z3;
            a.a = bZ2.bK();
            vlqVar.b = a.a();
            vlqVar.e = new vmf(this, vmbVar);
            return vlqVar.a();
        }
        throw new NullPointerException("Null proto");
    }
}
