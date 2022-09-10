package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnyo  reason: default package */
/* loaded from: classes3.dex */
public class bnyo {
    private static final dcqe a = dcqe.c("bnyo");
    private final Executor b;
    private final HashMap<Class<? extends dssj>, btzp<? extends dssj, ? extends dssj>> c;

    public bnyo(Executor executor, bumv bumvVar, bunu bunuVar, buwz buwzVar, buxk buxkVar, busn busnVar, bvam bvamVar, butg butgVar, burl burlVar) {
        HashMap<Class<? extends dssj>, btzp<? extends dssj, ? extends dssj>> hashMap = new HashMap<>();
        this.c = hashMap;
        this.b = executor;
        hashMap.put(dwgz.class, buwzVar);
        hashMap.put(dwjr.class, busnVar);
        hashMap.put(dwbw.class, bunuVar);
        hashMap.put(duoz.class, bumvVar);
        hashMap.put(dwjv.class, bvamVar);
        hashMap.put(dwhf.class, buxkVar);
        hashMap.put(diku.class, butgVar);
        hashMap.put(dige.class, burlVar);
    }

    public final <Q extends dssj, S extends dssj> void a(Q q, bnyn<Q, S> bnynVar) {
        bnyk bnykVar = new bnyk(bnynVar, q);
        btzp<? extends dssj, ? extends dssj> btzpVar = this.c.get(q.getClass());
        if (btzpVar != null) {
            btzpVar.b(q, bnykVar, this.b);
        } else {
            bvoo.h("RpcClient not found for %s", q.getClass().getSimpleName());
        }
    }

    public final <Q extends dssj, S extends dssj> btzc b(Q q, bnyn<Q, S> bnynVar) {
        bnyl bnylVar = new bnyl(bnynVar, q);
        btzp<? extends dssj, ? extends dssj> btzpVar = this.c.get(q.getClass());
        if (btzpVar != null) {
            return btzpVar.b(q, bnylVar, this.b);
        }
        bvoo.h("RpcClient not found for %s", q.getClass().getSimpleName());
        return new bnym();
    }
}
