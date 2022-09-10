package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvak  reason: default package */
/* loaded from: classes4.dex */
public final class bvak implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvak(bvaj bvajVar) {
        this.b = bvajVar.a;
        this.c = bvajVar.b;
        this.a = bvajVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dlbq dlbqVar = (dlbq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dlbqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dlbq dlbqVar, btzi<dlbq, dlbu> btziVar, Executor executor) {
        return this.b.a().a(dlbqVar, this.a, btziVar, executor);
    }
}
