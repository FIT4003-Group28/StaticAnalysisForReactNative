package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butg  reason: default package */
/* loaded from: classes4.dex */
public final class butg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butg(butf butfVar) {
        this.b = butfVar.a;
        this.c = butfVar.b;
        this.a = butfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diku dikuVar = (diku) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dikuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diku dikuVar, btzi<diku, diky> btziVar, Executor executor) {
        return this.b.a().a(dikuVar, this.a, btziVar, executor);
    }
}
