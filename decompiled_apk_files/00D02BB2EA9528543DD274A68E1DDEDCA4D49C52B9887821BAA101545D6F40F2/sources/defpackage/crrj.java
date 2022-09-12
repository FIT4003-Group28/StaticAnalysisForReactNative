package defpackage;

import android.app.Application;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crrj  reason: default package */
/* loaded from: classes5.dex */
public final class crrj {
    public final Application a;
    public final cqat b;
    private final Executor c;

    public crrj(Application application, Executor executor, cqat cqatVar) {
        this.a = application;
        this.c = executor;
        this.b = cqatVar;
    }

    public final dehn<crrk> a(final List<avnr> list, final dvgi dvgiVar, final dlvc dlvcVar, final dwaw dwawVar, final dwbc dwbcVar, final int i, final amvh[] amvhVarArr, final boolean z, final long j) {
        if (list.isEmpty()) {
            return deha.a(new crrk(ddoc.NO_PATH_FOUND));
        }
        defg defgVar = new defg(this, list, dvgiVar, dlvcVar, dwawVar, dwbcVar, i, amvhVarArr, z, j) { // from class: crrg
            private final crrj a;
            private final List b;
            private final dvgi c;
            private final dlvc d;
            private final dwaw e;
            private final dwbc f;
            private final int g;
            private final amvh[] h;
            private final boolean i;
            private final long j;

            {
                this.a = this;
                this.b = list;
                this.c = dvgiVar;
                this.d = dlvcVar;
                this.e = dwawVar;
                this.f = dwbcVar;
                this.g = i;
                this.h = amvhVarArr;
                this.i = z;
                this.j = j;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                crrj crrjVar = this.a;
                List list2 = this.b;
                Exception exc = (Exception) obj;
                return crrjVar.a(list2.subList(1, list2.size()), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
        };
        return deee.h(deee.h(deew.h(degp.q(list.get(0).a(dlvcVar, dvgiVar, dwawVar, dwbcVar, i)), new dbrn(this, j, amvhVarArr, z, dwawVar) { // from class: crrh
            private final crrj a;
            private final long b;
            private final amvh[] c;
            private final boolean d;
            private final dwaw e;

            {
                this.a = this;
                this.b = j;
                this.c = amvhVarArr;
                this.d = z;
                this.e = dwawVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                crrj crrjVar = this.a;
                long j2 = this.b;
                amvh[] amvhVarArr2 = this.c;
                boolean z2 = this.d;
                dwaw dwawVar2 = this.e;
                dwbc dwbcVar2 = (dwbc) obj;
                dwaa dwaaVar = dwbcVar2.b;
                if (dwaaVar == null) {
                    dwaaVar = dwaa.g;
                }
                if ((dwaaVar.a & 1) != 0) {
                    dwaa dwaaVar2 = dwbcVar2.b;
                    if (dwaaVar2 == null) {
                        dwaaVar2 = dwaa.g;
                    }
                    dvzu dvzuVar = dwaaVar2.b;
                    if (dvzuVar == null) {
                        dvzuVar = dvzu.F;
                    }
                    dovb b = dovb.b(dvzuVar.j);
                    if (b == null) {
                        b = dovb.SUCCESS;
                    }
                    if (b == dovb.SUCCESS) {
                        amsy amsyVar = new amsy(dwbcVar2);
                        Application application = crrjVar.a;
                        dore doreVar = dore.REROUTE_AND_ALTERNATES_FROM_NEW_LOCATION;
                        dvzy dvzyVar = dwawVar2.b;
                        if (dvzyVar == null) {
                            dvzyVar = dvzy.u;
                        }
                        dwao dwaoVar = dvzyVar.g;
                        if (dwaoVar == null) {
                            dwaoVar = dwao.R;
                        }
                        amtx aD = amub.aD(amsyVar, j2, 0, application, doreVar, amvhVarArr2, z2, dwaoVar);
                        if (aD == null) {
                            throw new crri();
                        }
                        aD.C = amtz.REROUTING;
                        return new crrk(aD.a());
                    }
                }
                throw new crri();
            }
        }, this.c), avlo.class, defgVar, dege.a), crri.class, defgVar, dege.a);
    }
}
