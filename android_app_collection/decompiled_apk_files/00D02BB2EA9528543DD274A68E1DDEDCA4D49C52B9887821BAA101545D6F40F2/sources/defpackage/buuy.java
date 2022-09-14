package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buuy  reason: default package */
/* loaded from: classes4.dex */
public final class buuy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buuy(buux buuxVar) {
        this.b = buuxVar.a;
        this.c = buuxVar.b;
        this.a = buuxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dinq dinqVar = (dinq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dinqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dinq dinqVar, btzi<dinq, dins> btziVar, Executor executor) {
        return this.b.a().a(dinqVar, this.a, btziVar, executor);
    }
}
