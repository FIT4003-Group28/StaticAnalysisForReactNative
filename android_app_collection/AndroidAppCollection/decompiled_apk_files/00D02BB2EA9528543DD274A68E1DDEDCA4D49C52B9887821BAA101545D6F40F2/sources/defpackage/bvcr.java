package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvcr  reason: default package */
/* loaded from: classes4.dex */
public final class bvcr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvcr(bvcq bvcqVar) {
        this.b = bvcqVar.a;
        this.c = bvcqVar.b;
        this.a = bvcqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dist distVar = (dist) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(distVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dist distVar, btzi<dist, disz> btziVar, Executor executor) {
        return this.b.a().a(distVar, this.a, btziVar, executor);
    }
}
