package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqk  reason: default package */
/* loaded from: classes4.dex */
final class buqk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqk(buqj buqjVar) {
        this.b = buqjVar.a;
        this.c = buqjVar.b;
        this.a = buqjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dicy dicyVar = (dicy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dicyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dicy dicyVar, btzi<dicy, dida> btziVar, Executor executor) {
        return this.b.a().a(dicyVar, this.a, btziVar, executor);
    }
}
