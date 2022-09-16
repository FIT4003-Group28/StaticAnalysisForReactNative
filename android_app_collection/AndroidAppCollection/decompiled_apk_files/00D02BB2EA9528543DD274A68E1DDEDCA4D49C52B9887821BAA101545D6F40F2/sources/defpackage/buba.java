package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buba  reason: default package */
/* loaded from: classes4.dex */
final class buba implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buba(buaz buazVar) {
        this.b = buazVar.a;
        this.c = buazVar.b;
        this.a = buazVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drze drzeVar = (drze) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drzeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drze drzeVar, btzi<drze, drzg> btziVar, Executor executor) {
        return this.b.a().a(drzeVar, this.a, btziVar, executor);
    }
}
