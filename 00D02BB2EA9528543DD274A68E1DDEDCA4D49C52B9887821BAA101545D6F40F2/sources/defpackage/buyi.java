package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyi  reason: default package */
/* loaded from: classes4.dex */
public final class buyi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyi(buyh buyhVar) {
        this.b = buyhVar.a;
        this.c = buyhVar.b;
        this.a = buyhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djud djudVar = (djud) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djudVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djud djudVar, btzi<djud, djuf> btziVar, Executor executor) {
        return this.b.a().a(djudVar, this.a, btziVar, executor);
    }
}
