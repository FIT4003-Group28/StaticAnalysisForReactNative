package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bunw  reason: default package */
/* loaded from: classes.dex */
public final class bunw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bunw(bunv bunvVar) {
        this.b = bunvVar.a;
        this.c = bunvVar.b;
        this.a = bunvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvor dvorVar = (dvor) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvorVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvor dvorVar, btzi<dvor, dvov> btziVar, Executor executor) {
        return this.b.a().a(dvorVar, this.a, btziVar, executor);
    }
}
