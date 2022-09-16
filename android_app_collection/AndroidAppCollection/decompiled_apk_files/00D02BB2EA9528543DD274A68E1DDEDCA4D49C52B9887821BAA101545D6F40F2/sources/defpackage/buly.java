package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buly  reason: default package */
/* loaded from: classes4.dex */
public final class buly implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buly(bulx bulxVar) {
        this.b = bulxVar.a;
        this.c = bulxVar.b;
        this.a = bulxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duxy duxyVar = (duxy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duxyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duxy duxyVar, btzi<duxy, duya> btziVar, Executor executor) {
        return this.b.a().a(duxyVar, this.a, btziVar, executor);
    }
}
