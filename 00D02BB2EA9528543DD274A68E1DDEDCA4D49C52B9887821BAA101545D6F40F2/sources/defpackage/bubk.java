package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bubk  reason: default package */
/* loaded from: classes4.dex */
final class bubk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bubk(bubj bubjVar) {
        this.b = bubjVar.a;
        this.c = bubjVar.b;
        this.a = bubjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drzy drzyVar = (drzy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drzyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drzy drzyVar, btzi<drzy, dsaa> btziVar, Executor executor) {
        return this.b.a().a(drzyVar, this.a, btziVar, executor);
    }
}
