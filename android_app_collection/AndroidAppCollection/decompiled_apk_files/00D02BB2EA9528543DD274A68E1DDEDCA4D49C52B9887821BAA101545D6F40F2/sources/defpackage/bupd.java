package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupd  reason: default package */
/* loaded from: classes4.dex */
public final class bupd implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupd(bupc bupcVar) {
        this.b = bupcVar.a;
        this.c = bupcVar.b;
        this.a = bupcVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhyh dhyhVar = (dhyh) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhyhVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhyh dhyhVar, btzi<dhyh, dhym> btziVar, Executor executor) {
        return this.b.a().a(dhyhVar, this.a, btziVar, executor);
    }
}
