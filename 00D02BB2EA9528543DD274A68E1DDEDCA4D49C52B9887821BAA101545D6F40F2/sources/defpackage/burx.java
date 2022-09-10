package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burx  reason: default package */
/* loaded from: classes4.dex */
public final class burx implements burv {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burx(burw burwVar) {
        this.b = burwVar.a;
        this.c = burwVar.b;
        this.a = burwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwmp dwmpVar, btzi<dwmp, dwmt> btziVar, bvrj bvrjVar) {
        dwmp dwmpVar2 = dwmpVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwmpVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwmp, dwmt>> c(dwmp dwmpVar) {
        return btzj.a(this, dwmpVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwmp dwmpVar, btzi<dwmp, dwmt> btziVar, Executor executor) {
        return this.b.a().a(dwmpVar, this.a, btziVar, executor);
    }
}
