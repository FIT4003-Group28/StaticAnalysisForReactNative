package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvgh  reason: default package */
/* loaded from: classes4.dex */
public final class bvgh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvgh(bvgg bvggVar) {
        this.b = bvggVar.a;
        this.c = bvggVar.b;
        this.a = bvggVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkfn dkfnVar = (dkfn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkfnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkfn dkfnVar, btzi<dkfn, dkfp> btziVar, Executor executor) {
        return this.b.a().a(dkfnVar, this.a, btziVar, executor);
    }
}
