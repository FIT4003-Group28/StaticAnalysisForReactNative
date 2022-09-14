package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvu  reason: default package */
/* loaded from: classes4.dex */
public final class buvu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvu(buvt buvtVar) {
        this.b = buvtVar.a;
        this.c = buvtVar.b;
        this.a = buvtVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duyo duyoVar = (duyo) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duyoVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duyo duyoVar, btzi<duyo, duyq> btziVar, Executor executor) {
        return this.b.a().a(duyoVar, this.a, btziVar, executor);
    }
}
