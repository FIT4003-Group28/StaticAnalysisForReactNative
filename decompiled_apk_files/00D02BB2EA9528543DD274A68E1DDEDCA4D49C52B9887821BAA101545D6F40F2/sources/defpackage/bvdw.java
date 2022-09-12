package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdw  reason: default package */
/* loaded from: classes4.dex */
public final class bvdw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdw(bvdv bvdvVar) {
        this.b = bvdvVar.a;
        this.c = bvdvVar.b;
        this.a = bvdvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djox djoxVar = (djox) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djoxVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djox djoxVar, btzi<djox, djoz> btziVar, Executor executor) {
        return this.b.a().a(djoxVar, this.a, btziVar, executor);
    }
}
