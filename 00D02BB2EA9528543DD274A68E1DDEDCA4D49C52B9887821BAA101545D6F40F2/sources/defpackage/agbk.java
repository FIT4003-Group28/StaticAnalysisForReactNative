package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: agbk  reason: default package */
/* loaded from: classes2.dex */
public final class agbk<T> extends btrh<T> {
    public agbk(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        akqi akqiVar;
        alho alhoVar = (alho) obj;
        agbj agbjVar = ((agbh) this.a).a;
        ahac ahacVar = agbjVar.d;
        if (ahacVar != null) {
            alaq alaqVar = alhoVar.a;
            if (!(alaqVar instanceof alap) || (akqiVar = ((alap) alaqVar).g) == null) {
                return;
            }
            long j = akqiVar.c;
            List<agwu> h = agbjVar.h();
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i).b().ai().c == j) {
                    ahacVar.u().e(i, true);
                    cqkx.p(ahacVar.u());
                    return;
                }
            }
        }
    }
}
