package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buuf  reason: default package */
/* loaded from: classes4.dex */
public final class buuf implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buuf(buue buueVar) {
        this.b = buueVar.a;
        this.c = buueVar.b;
        this.a = buueVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djxs djxsVar = (djxs) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djxsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djxs djxsVar, btzi<djxs, djxy> btziVar, Executor executor) {
        return this.b.a().a(djxsVar, this.a, btziVar, executor);
    }
}
