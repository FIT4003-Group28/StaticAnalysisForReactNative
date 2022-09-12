package defpackage;

import defpackage.dssj;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anjr  reason: default package */
/* loaded from: classes2.dex */
public final class anjr<Q extends dssj, S extends dssj> {
    public final bvrb a;
    private final btzp<Q, S> b;
    private final Map<dspd, anjq> c = new HashMap();

    public anjr(btzp<Q, S> btzpVar, bvrb bvrbVar) {
        this.b = btzpVar;
        this.a = bvrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Q q, btzi<Q, S> btziVar, bvrj bvrjVar) {
        dspd bR = q.bR();
        if (this.c.containsKey(bR)) {
            this.c.get(bR).c(btziVar, bvrjVar);
            return;
        }
        anjq anjqVar = new anjq(this);
        anjqVar.c(btziVar, bvrjVar);
        this.b.a(q, anjqVar, bvrj.BACKGROUND_THREADPOOL);
        this.c.put(bR, anjqVar);
    }

    public final synchronized void b(Q q) {
        this.c.remove(q.bR());
    }
}
