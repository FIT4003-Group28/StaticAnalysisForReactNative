package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butw  reason: default package */
/* loaded from: classes4.dex */
public final class butw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butw(butv butvVar) {
        this.b = butvVar.a;
        this.c = butvVar.b;
        this.a = butvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diqx diqxVar = (diqx) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diqxVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diqx diqxVar, btzi<diqx, diqz> btziVar, Executor executor) {
        return this.b.a().a(diqxVar, this.a, btziVar, executor);
    }
}
