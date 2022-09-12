package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buse  reason: default package */
/* loaded from: classes4.dex */
public final class buse implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buse(busd busdVar) {
        this.b = busdVar.a;
        this.c = busdVar.b;
        this.a = busdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dihj dihjVar = (dihj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dihjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dihj dihjVar, btzi<dihj, dihl> btziVar, Executor executor) {
        return this.b.a().a(dihjVar, this.a, btziVar, executor);
    }
}
