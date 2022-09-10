package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqz  reason: default package */
/* loaded from: classes4.dex */
public final class buqz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqz(buqy buqyVar) {
        this.b = buqyVar.a;
        this.c = buqyVar.b;
        this.a = buqyVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diea dieaVar = (diea) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dieaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diea dieaVar, btzi<diea, dier> btziVar, Executor executor) {
        return this.b.a().a(dieaVar, this.a, btziVar, executor);
    }
}
