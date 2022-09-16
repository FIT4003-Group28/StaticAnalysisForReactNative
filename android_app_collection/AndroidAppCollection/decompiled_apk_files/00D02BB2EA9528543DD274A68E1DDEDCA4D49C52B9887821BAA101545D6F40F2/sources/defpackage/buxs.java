package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxs  reason: default package */
/* loaded from: classes4.dex */
final class buxs implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxs(buxr buxrVar) {
        this.b = buxrVar.a;
        this.c = buxrVar.b;
        this.a = buxrVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dlbm dlbmVar = (dlbm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dlbmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dlbm dlbmVar, btzi<dlbm, dlbo> btziVar, Executor executor) {
        return this.b.a().a(dlbmVar, this.a, btziVar, executor);
    }
}
