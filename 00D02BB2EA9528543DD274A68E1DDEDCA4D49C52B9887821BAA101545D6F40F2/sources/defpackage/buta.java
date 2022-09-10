package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buta  reason: default package */
/* loaded from: classes4.dex */
public final class buta implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buta(busz buszVar) {
        this.b = buszVar.a;
        this.c = buszVar.b;
        this.a = buszVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diki dikiVar = (diki) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dikiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diki dikiVar, btzi<diki, dikk> btziVar, Executor executor) {
        return this.b.a().a(dikiVar, this.a, btziVar, executor);
    }
}
