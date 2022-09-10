package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvfm  reason: default package */
/* loaded from: classes4.dex */
public final class bvfm implements bvfk {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvfm(bvfl bvflVar) {
        this.b = bvflVar.a;
        this.c = bvflVar.b;
        this.a = bvflVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djar djarVar, btzi<djar, djav> btziVar, bvrj bvrjVar) {
        djar djarVar2 = djarVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djarVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djar, djav>> c(djar djarVar) {
        return btzj.a(this, djarVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djar djarVar, btzi<djar, djav> btziVar, Executor executor) {
        return this.b.a().a(djarVar, this.a, btziVar, executor);
    }
}
