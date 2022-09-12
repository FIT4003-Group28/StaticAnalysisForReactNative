package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupj  reason: default package */
/* loaded from: classes4.dex */
public final class bupj implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupj(bupi bupiVar) {
        this.b = bupiVar.a;
        this.c = bupiVar.b;
        this.a = bupiVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diam diamVar = (diam) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diamVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diam diamVar, btzi<diam, diao> btziVar, Executor executor) {
        return this.b.a().a(diamVar, this.a, btziVar, executor);
    }
}
