package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvee  reason: default package */
/* loaded from: classes4.dex */
public final class bvee implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvee(bved bvedVar) {
        this.b = bvedVar.a;
        this.c = bvedVar.b;
        this.a = bvedVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvgc dvgcVar = (dvgc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvgcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvgc dvgcVar, btzi<dvgc, dvgg> btziVar, Executor executor) {
        return this.b.a().a(dvgcVar, this.a, btziVar, executor);
    }
}
