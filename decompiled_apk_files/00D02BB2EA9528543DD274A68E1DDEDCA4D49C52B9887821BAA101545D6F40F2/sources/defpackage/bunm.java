package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bunm  reason: default package */
/* loaded from: classes4.dex */
public final class bunm implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bunm(bunl bunlVar) {
        this.b = bunlVar.a;
        this.c = bunlVar.b;
        this.a = bunlVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duqn duqnVar = (duqn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duqnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duqn duqnVar, btzi<duqn, duqp> btziVar, Executor executor) {
        return this.b.a().a(duqnVar, this.a, btziVar, executor);
    }
}
