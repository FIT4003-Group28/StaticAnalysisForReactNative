package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buko  reason: default package */
/* loaded from: classes4.dex */
public final class buko implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buko(bukn buknVar) {
        this.b = buknVar.a;
        this.c = buknVar.b;
        this.a = buknVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhqe dhqeVar = (dhqe) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhqeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhqe dhqeVar, btzi<dhqe, dhqg> btziVar, Executor executor) {
        return this.b.a().a(dhqeVar, this.a, btziVar, executor);
    }
}