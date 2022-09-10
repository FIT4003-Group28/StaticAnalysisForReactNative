package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupr  reason: default package */
/* loaded from: classes4.dex */
public final class bupr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupr(bupq bupqVar) {
        this.b = bupqVar.a;
        this.c = bupqVar.b;
        this.a = bupqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duvz duvzVar = (duvz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duvzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duvz duvzVar, btzi<duvz, duwb> btziVar, Executor executor) {
        return this.b.a().a(duvzVar, this.a, btziVar, executor);
    }
}
