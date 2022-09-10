package defpackage;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: crke  reason: default package */
/* loaded from: classes5.dex */
public final class crke {
    private static final dcqe d = dcqe.c("crke");
    public final dovb a;
    public final amuh b;
    @dzsi
    public final amsy c;

    public crke(crkd crkdVar) {
        dovb dovbVar = crkdVar.a;
        dbsk.t(dovbVar, "status");
        this.a = dovbVar;
        amuh amuhVar = crkdVar.b;
        dbsk.t(amuhVar, "routes");
        this.b = amuhVar;
        this.c = crkdVar.c;
    }

    public static crke b(dwaw dwawVar, long j, @dzsi amsy amsyVar, Context context, boolean z, @dzsi dore doreVar) {
        int i;
        int i2;
        crkd crkdVar = new crkd();
        if (amsyVar == null) {
            crkdVar.a = dovb.NO_ROUTES_FOUND;
        } else {
            crkdVar.c = amsyVar;
            if ((amsyVar.b.a & 32) != 0) {
                crkdVar.a = amsyVar.s();
                if (!amsyVar.t()) {
                    amsyVar.s();
                }
            }
            amvh[] c = c(dwawVar, context);
            if (c.length >= 2) {
                dvzy dvzyVar = dwawVar.b;
                if (dvzyVar == null) {
                    dvzyVar = dvzy.u;
                }
                dsrj<dpjd> dsrjVar = dvzyVar.i;
                amvf[] amvfVarArr = new amvf[dsrjVar.size()];
                for (int i3 = 0; i3 < dsrjVar.size(); i3++) {
                    dnoh dnohVar = dsrjVar.get(i3).c;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    amvfVarArr[i3] = amvf.d(akqq.e(dnohVar), dsrjVar.get(i3).b);
                }
                dvzy dvzyVar2 = dwawVar.b;
                if (dvzyVar2 == null) {
                    dvzyVar2 = dvzy.u;
                }
                dvzy dvzyVar3 = dvzyVar2;
                if (amsyVar.i() == dvzyVar3.d.size()) {
                    for (int i4 = 0; i4 < c.length; i4++) {
                        c[i4] = amvj.b(amsyVar.c(), context, c[i4], amsyVar.h(i4));
                    }
                }
                int o = amsyVar.p() ? amsyVar.o() : -1;
                int n = amsyVar.n();
                ArrayList a = dchl.a();
                int i5 = o;
                int i6 = 0;
                while (i6 < n) {
                    dwao dwaoVar = dvzyVar3.g;
                    if (dwaoVar == null) {
                        dwaoVar = dwao.R;
                    }
                    int i7 = i6;
                    int i8 = i5;
                    ArrayList arrayList = a;
                    int i9 = n;
                    dvzy dvzyVar4 = dvzyVar3;
                    amub ay = amub.ay(amsyVar, j, i6, context, doreVar, c, amvfVarArr, z, dwaoVar);
                    if (ay != null) {
                        arrayList.add(ay);
                    } else if (i7 < i8) {
                        i5 = i8 - 1;
                        i6 = i7 + 1;
                        a = arrayList;
                        n = i9;
                        dvzyVar3 = dvzyVar4;
                    } else if (i7 == i8) {
                        bvoo.h("Selected trip returned from the server is not renderable", new Object[0]);
                    }
                    i5 = i8;
                    i6 = i7 + 1;
                    a = arrayList;
                    n = i9;
                    dvzyVar3 = dvzyVar4;
                }
                int i10 = i5;
                ArrayList arrayList2 = a;
                if (i10 < 0) {
                    i2 = 0;
                    i = 0;
                } else {
                    i = i10;
                    i2 = 0;
                }
                crkdVar.b = amuh.e(i, (amub[]) arrayList2.toArray(new amub[i2]));
            }
        }
        return new crke(crkdVar);
    }

    public static amvh[] c(dwaw dwawVar, Context context) {
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        int size = dvzyVar.d.size();
        amvh[] amvhVarArr = new amvh[size];
        for (int i = 0; i < size; i++) {
            dpjx dpjxVar = dvzyVar.d.get(i);
            dpjs b = dpjs.b(dpjxVar.f);
            if (b == null) {
                b = dpjs.ENTITY_TYPE_DEFAULT;
            }
            if (b == dpjs.ENTITY_TYPE_MY_LOCATION && (dpjxVar.a & 4) == 0) {
                dtaq dtaqVar = dwawVar.e;
                if (dtaqVar == null) {
                    dtaqVar = dtaq.m;
                }
                dtak dtakVar = dtaqVar.e;
                if (dtakVar == null) {
                    dtakVar = dtak.d;
                }
                akqq l = akqq.l(dtakVar);
                dbsk.t(l, "location");
                dnoh g = l.g();
                dpjq ca = dpjx.n.ca(dpjxVar);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dpjx dpjxVar2 = (dpjx) ca.b;
                g.getClass();
                dpjxVar2.d = g;
                dpjxVar2.a |= 4;
                dpjxVar = ca.bK();
            }
            amvhVarArr[i] = amvh.M(dpjxVar, context);
        }
        return amvhVarArr;
    }

    public final boolean a() {
        return this.a == dovb.SUCCESS;
    }
}
