package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butt  reason: default package */
/* loaded from: classes4.dex */
public final class butt implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butt(buts butsVar) {
        this.b = butsVar.a;
        this.c = butsVar.b;
        this.a = butsVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvcd dvcdVar = (dvcd) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvcdVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvcd dvcdVar, btzi<dvcd, dvch> btziVar, Executor executor) {
        return this.b.a().a(dvcdVar, this.a, btziVar, executor);
    }
}