package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bubg  reason: default package */
/* loaded from: classes4.dex */
final class bubg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bubg(bubf bubfVar) {
        this.b = bubfVar.a;
        this.c = bubfVar.b;
        this.a = bubfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drzq drzqVar = (drzq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drzqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drzq drzqVar, btzi<drzq, drzs> btziVar, Executor executor) {
        return this.b.a().a(drzqVar, this.a, btziVar, executor);
    }
}
