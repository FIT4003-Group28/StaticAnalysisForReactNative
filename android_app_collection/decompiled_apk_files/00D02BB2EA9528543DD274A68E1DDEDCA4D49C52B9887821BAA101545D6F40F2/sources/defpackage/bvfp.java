package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvfp  reason: default package */
/* loaded from: classes4.dex */
final class bvfp implements bvfn {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvfp(bvfo bvfoVar) {
        this.b = bvfoVar.a;
        this.c = bvfoVar.b;
        this.a = bvfoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dkez dkezVar, btzi<dkez, dkfb> btziVar, bvrj bvrjVar) {
        dkez dkezVar2 = dkezVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkezVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dkez, dkfb>> c(dkez dkezVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkez dkezVar, btzi<dkez, dkfb> btziVar, Executor executor) {
        return this.b.a().a(dkezVar, this.a, btziVar, executor);
    }
}
