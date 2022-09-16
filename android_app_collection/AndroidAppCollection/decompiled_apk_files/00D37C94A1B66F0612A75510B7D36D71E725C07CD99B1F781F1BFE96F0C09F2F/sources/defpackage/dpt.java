package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dpt  reason: default package */
/* loaded from: classes3.dex */
public final class dpt {
    final drg a;
    final dpu b;
    public final dpu c;
    final dpv d;

    public dpt() {
        drg drgVar = new drg();
        this.a = drgVar;
        dpu dpuVar = new dpu(null, drgVar);
        this.c = dpuVar;
        this.b = dpuVar.a();
        dpv dpvVar = new dpv();
        this.d = dpvVar;
        dpuVar.g("require", new dqg(dpvVar));
        dpvVar.a("internal.platform", gbb.b);
        dpuVar.g("runtime.counter", new dqr(Double.valueOf(0.0d)));
    }

    public final dpu a() {
        return this.b.a();
    }

    public final dqz b(dpu dpuVar, rqs... rqsVarArr) {
        dqz dqzVar = dqz.f;
        for (rqs rqsVar : rqsVarArr) {
            dqzVar = dqt.c(rqsVar);
            dqt.r(this.c);
            if ((dqzVar instanceof dra) || (dqzVar instanceof dqy)) {
                dqzVar = this.a.a(dpuVar, dqzVar);
            }
        }
        return dqzVar;
    }

    public final void c(String str, Callable callable) {
        this.d.a(str, callable);
    }
}
