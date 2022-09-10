package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: zpd  reason: default package */
/* loaded from: classes7.dex */
public final class zpd implements zpc {
    public boolean a;
    @dzsi
    public cqtd b;
    @dzsi
    public CharSequence c;
    private final amve d;
    private final vxw e;
    private final zuz f;
    @dzsi
    private final xkl g;
    private final vxv h;
    @dzsi
    private vxz i;

    public zpd(amve amveVar, vxw vxwVar, zuz zuzVar, vxv vxvVar, @dzsi xkl xklVar) {
        this.d = amveVar;
        this.e = vxwVar;
        this.f = zuzVar;
        this.h = vxvVar;
        this.g = xklVar;
    }

    @Override // defpackage.zpc
    public final void a(Context context) {
        List<doyp> list;
        vxu h;
        List<doyp> arrayList;
        vxv vxvVar = this.h;
        amve amveVar = this.d;
        xkl xklVar = this.g;
        boolean a = xklVar == null ? false : xklVar.a();
        amuq E = vyb.E(amveVar);
        String str = null;
        if (E == null) {
            h = null;
        } else {
            dpgw dpgwVar = E.g().c;
            if (dpgwVar == null) {
                dpgwVar = dpgw.r;
            }
            dpgw dpgwVar2 = dpgwVar;
            dgas dgasVar = E.h().a;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            List<doyp> c = vxvVar.c(amveVar.w().c, a);
            doyp b = vxv.b(E.g());
            if (b != null) {
                int e = vxv.e(c, b);
                if (e >= 0) {
                    arrayList = c.subList(e, c.size());
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(b);
                    Iterator<doyp> it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        doyp next = it.next();
                        if (vxv.f(b, next) < 0) {
                            arrayList.add(next);
                            break;
                        }
                    }
                }
                list = arrayList;
            } else {
                list = c;
            }
            vwr vwrVar = (vwr) vxvVar.d(list);
            h = vxu.h(dpgwVar2, b, c, list, vwrVar.a, vwrVar.b, (dgasVar.a & 2) == 0 ? null : dgasVar);
        }
        if (h == null) {
            this.b = null;
            this.a = false;
            this.c = null;
            return;
        }
        vws vwsVar = (vws) h;
        vxz V = vyb.V(vwsVar.c);
        if (V == null) {
            this.b = null;
            this.i = null;
        } else if (V != this.i) {
            this.i = V;
            this.b = this.f.a(V);
        }
        this.a = vwsVar.d;
        String f = dbsj.f(vwsVar.a.b);
        dgas dgasVar2 = vwsVar.e;
        if (dgasVar2 != null) {
            str = dgasVar2.c;
        }
        this.c = vyb.X(this.e, vyb.a(vwsVar.b), str, f, context);
    }
}
