package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buun  reason: default package */
/* loaded from: classes4.dex */
public final class buun implements buul {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buun(buum buumVar) {
        this.b = buumVar.a;
        this.c = buumVar.b;
        this.a = buumVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwnd dwndVar, btzi<dwnd, dwnf> btziVar, bvrj bvrjVar) {
        dwnd dwndVar2 = dwndVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwndVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwnd, dwnf>> c(dwnd dwndVar) {
        return btzj.a(this, dwndVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwnd dwndVar, btzi<dwnd, dwnf> btziVar, Executor executor) {
        return this.b.a().a(dwndVar, this.a, btziVar, executor);
    }
}
