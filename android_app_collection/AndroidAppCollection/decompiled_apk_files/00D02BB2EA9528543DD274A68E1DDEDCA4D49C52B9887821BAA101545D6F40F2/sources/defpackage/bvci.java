package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvci  reason: default package */
/* loaded from: classes4.dex */
final class bvci implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvci(bvch bvchVar) {
        this.b = bvchVar.a;
        this.c = bvchVar.b;
        this.a = bvchVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhnr dhnrVar = (dhnr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhnrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhnr dhnrVar, btzi<dhnr, dhnt> btziVar, Executor executor) {
        return this.b.a().a(dhnrVar, this.a, btziVar, executor);
    }
}
