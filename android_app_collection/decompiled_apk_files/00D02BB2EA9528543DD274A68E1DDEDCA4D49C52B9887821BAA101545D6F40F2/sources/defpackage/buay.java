package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buay  reason: default package */
/* loaded from: classes4.dex */
final class buay implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buay(buax buaxVar) {
        this.b = buaxVar.a;
        this.c = buaxVar.b;
        this.a = buaxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dryz dryzVar = (dryz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dryzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dryz dryzVar, btzi<dryz, drzb> btziVar, Executor executor) {
        return this.b.a().a(dryzVar, this.a, btziVar, executor);
    }
}
