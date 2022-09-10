package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buny  reason: default package */
/* loaded from: classes4.dex */
public final class buny implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buny(bunx bunxVar) {
        this.b = bunxVar.a;
        this.c = bunxVar.b;
        this.a = bunxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhkj dhkjVar = (dhkj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhkjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhkj dhkjVar, btzi<dhkj, dhkl> btziVar, Executor executor) {
        return this.b.a().a(dhkjVar, this.a, btziVar, executor);
    }
}
