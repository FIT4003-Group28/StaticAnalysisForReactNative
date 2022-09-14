package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bulh  reason: default package */
/* loaded from: classes4.dex */
public final class bulh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bulh(bulg bulgVar) {
        this.b = bulgVar.a;
        this.c = bulgVar.b;
        this.a = bulgVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duyc duycVar = (duyc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duycVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duyc duycVar, btzi<duyc, duye> btziVar, Executor executor) {
        return this.b.a().a(duycVar, this.a, btziVar, executor);
    }
}
