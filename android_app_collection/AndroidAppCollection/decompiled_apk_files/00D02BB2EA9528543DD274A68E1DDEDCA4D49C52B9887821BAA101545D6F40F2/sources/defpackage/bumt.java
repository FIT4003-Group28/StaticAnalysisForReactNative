package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumt  reason: default package */
/* loaded from: classes4.dex */
public final class bumt implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumt(bums bumsVar) {
        this.b = bumsVar.a;
        this.c = bumsVar.b;
        this.a = bumsVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwbq dwbqVar = (dwbq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwbqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwbq dwbqVar, btzi<dwbq, dwbs> btziVar, Executor executor) {
        return this.b.a().a(dwbqVar, this.a, btziVar, executor);
    }
}
