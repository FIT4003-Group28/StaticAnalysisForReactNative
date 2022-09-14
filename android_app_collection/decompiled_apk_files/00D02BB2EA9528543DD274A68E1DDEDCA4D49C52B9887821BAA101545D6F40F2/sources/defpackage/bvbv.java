package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbv  reason: default package */
/* loaded from: classes4.dex */
public final class bvbv implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbv(bvbu bvbuVar) {
        this.b = bvbuVar.a;
        this.c = bvbuVar.b;
        this.a = bvbuVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dicg dicgVar = (dicg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dicgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dicg dicgVar, btzi<dicg, dici> btziVar, Executor executor) {
        return this.b.a().a(dicgVar, this.a, btziVar, executor);
    }
}
