package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bukq  reason: default package */
/* loaded from: classes4.dex */
public final class bukq implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bukq(bukp bukpVar) {
        this.b = bukpVar.a;
        this.c = bukpVar.b;
        this.a = bukpVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhqi dhqiVar = (dhqi) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhqiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhqi dhqiVar, btzi<dhqi, dhqk> btziVar, Executor executor) {
        return this.b.a().a(dhqiVar, this.a, btziVar, executor);
    }
}
