package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxk  reason: default package */
/* loaded from: classes4.dex */
public final class buxk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxk(buxj buxjVar) {
        this.b = buxjVar.a;
        this.c = buxjVar.b;
        this.a = buxjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwhf dwhfVar = (dwhf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwhfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwhf dwhfVar, btzi<dwhf, dwhj> btziVar, Executor executor) {
        return this.b.a().a(dwhfVar, this.a, btziVar, executor);
    }
}
