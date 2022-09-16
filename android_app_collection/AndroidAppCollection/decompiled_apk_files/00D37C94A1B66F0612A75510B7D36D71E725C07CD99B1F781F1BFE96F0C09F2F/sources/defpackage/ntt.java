package defpackage;

import android.util.Pair;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ntt  reason: default package */
/* loaded from: classes3.dex */
public final class ntt {
    public final aynx a;
    public final aynx b;

    public ntt(nte... nteVarArr) {
        aqxo.y(true);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            final nte nteVar = nteVarArr[i];
            arrayList.add(nteVar.u().C(new ayqe() { // from class: ntb
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    return Pair.create(nte.this, (Boolean) obj);
                }
            }));
        }
        aynx h = aynx.D(arrayList).K(amon.a, lum.u).h(nps.j);
        this.a = h.C(nox.p).n().h(nps.j);
        this.b = aynx.B(nteVarArr[0]).j(h.u(noc.h).C(nox.o)).n().h(nps.j);
    }

    public ntt(zbc zbcVar, aynx aynxVar) {
        aynx i = zbcVar.a().i(aynq.BUFFER);
        this.a = i;
        this.b = aynx.e(i.C(nox.t), aynxVar, nti.c);
    }
}
