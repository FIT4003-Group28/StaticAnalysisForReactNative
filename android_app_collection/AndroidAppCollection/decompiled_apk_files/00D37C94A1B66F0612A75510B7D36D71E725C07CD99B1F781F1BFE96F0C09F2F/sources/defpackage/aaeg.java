package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aaeg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaeg implements ampg {
    public final /* synthetic */ aael a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaeg(aael aaelVar) {
        this.a = aaelVar;
    }

    public /* synthetic */ aaeg(aael aaelVar, int i) {
        this.b = i;
        this.a = aaelVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            aael aaelVar = this.a;
            amup amupVar = (amup) obj;
            aaelVar.g.putAll(amupVar);
            aaelVar.h.c(amupVar);
            return null;
        }
        aael aaelVar2 = this.a;
        amuk amukVar = (amuk) obj;
        HashMap hashMap = new HashMap();
        int size = amukVar.size();
        for (int i = 0; i < size; i++) {
            tpp tppVar = (tpp) amukVar.get(i);
            int j = tqj.j(tppVar.g);
            if (j != 0 && j == 2) {
                hashMap.put(tppVar.c, new aaes(tppVar, aaelVar2.e, aaelVar2.c, aaelVar2.d));
            }
        }
        return hashMap;
    }
}
