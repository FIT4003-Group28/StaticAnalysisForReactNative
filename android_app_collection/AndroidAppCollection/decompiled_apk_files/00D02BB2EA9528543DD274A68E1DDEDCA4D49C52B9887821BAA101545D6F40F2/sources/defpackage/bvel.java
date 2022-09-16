package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvel  reason: default package */
/* loaded from: classes4.dex */
final class bvel implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvel(bvek bvekVar) {
        this.b = bvekVar.a;
        this.c = bvekVar.b;
        this.a = bvekVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djax djaxVar = (djax) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djaxVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djax djaxVar, btzi<djax, djaz> btziVar, Executor executor) {
        return this.b.a().a(djaxVar, this.a, btziVar, executor);
    }
}
