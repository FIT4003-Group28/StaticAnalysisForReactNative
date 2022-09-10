package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbn  reason: default package */
/* loaded from: classes4.dex */
public final class bvbn implements bvbl {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbn(bvbm bvbmVar) {
        this.b = bvbmVar.a;
        this.c = bvbmVar.b;
        this.a = bvbmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dhvs dhvsVar, btzi<dhvs, dhvu> btziVar, bvrj bvrjVar) {
        dhvs dhvsVar2 = dhvsVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhvsVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhvs, dhvu>> c(dhvs dhvsVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhvs dhvsVar, btzi<dhvs, dhvu> btziVar, Executor executor) {
        return this.b.a().a(dhvsVar, this.a, btziVar, executor);
    }
}
