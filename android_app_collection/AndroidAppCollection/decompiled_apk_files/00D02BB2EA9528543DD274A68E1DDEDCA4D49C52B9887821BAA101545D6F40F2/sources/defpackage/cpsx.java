package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpsx  reason: default package */
/* loaded from: classes5.dex */
final class cpsx extends cppq {
    final /* synthetic */ cpsz a;

    public cpsx(cpsz cpszVar) {
        this.a = cpszVar;
    }

    @Override // defpackage.cppq
    public final void c(Map<String, List<cpot>> map, cptb cptbVar) {
        cpsy cpsyVar;
        cpsz cpszVar = this.a;
        for (List<cpot> list : map.values()) {
            for (cpot cpotVar : list) {
                cpvi<T, D> cpviVar = cpotVar.a;
                cpve d = cpviVar.d(cpvf.e);
                if (d instanceof cpsy) {
                    cpsyVar = (cpsy) d;
                } else {
                    cpsy cpsyVar2 = new cpsy(d, cpotVar.a(), cpszVar.b);
                    cpviVar.i(cpvf.e, cpsyVar2);
                    cpsyVar = cpsyVar2;
                }
                cpszVar.a.add(cpviVar);
                cpsyVar.b = cptbVar;
            }
        }
    }

    @Override // defpackage.cppq
    public final void e() {
        this.a.c();
    }
}
