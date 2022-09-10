package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buar  reason: default package */
/* loaded from: classes4.dex */
final class buar implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buar(buaq buaqVar) {
        this.b = buaqVar.a;
        this.c = buaqVar.b;
        this.a = buaqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dryn drynVar = (dryn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drynVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dryn drynVar, btzi<dryn, dryp> btziVar, Executor executor) {
        return this.b.a().a(drynVar, this.a, btziVar, executor);
    }
}
