package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupf  reason: default package */
/* loaded from: classes4.dex */
public final class bupf implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupf(bupe bupeVar) {
        this.b = bupeVar.a;
        this.c = bupeVar.b;
        this.a = bupeVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diby dibyVar = (diby) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dibyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diby dibyVar, btzi<diby, dice> btziVar, Executor executor) {
        return this.b.a().a(dibyVar, this.a, btziVar, executor);
    }
}
