package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bubi  reason: default package */
/* loaded from: classes4.dex */
final class bubi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bubi(bubh bubhVar) {
        this.b = bubhVar.a;
        this.c = bubhVar.b;
        this.a = bubhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drzu drzuVar = (drzu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drzuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drzu drzuVar, btzi<drzu, drzw> btziVar, Executor executor) {
        return this.b.a().a(drzuVar, this.a, btziVar, executor);
    }
}
