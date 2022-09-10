package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvez  reason: default package */
/* loaded from: classes4.dex */
public final class bvez implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvez(bvey bveyVar) {
        this.b = bveyVar.a;
        this.c = bveyVar.b;
        this.a = bveyVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djrg djrgVar = (djrg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djrgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djrg djrgVar, btzi<djrg, djri> btziVar, Executor executor) {
        return this.b.a().a(djrgVar, this.a, btziVar, executor);
    }
}
