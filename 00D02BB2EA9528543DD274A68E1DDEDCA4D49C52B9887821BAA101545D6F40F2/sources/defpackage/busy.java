package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busy  reason: default package */
/* loaded from: classes4.dex */
public final class busy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busy(busx busxVar) {
        this.b = busxVar.a;
        this.c = busxVar.b;
        this.a = busxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dukb dukbVar = (dukb) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dukbVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dukb dukbVar, btzi<dukb, dukf> btziVar, Executor executor) {
        return this.b.a().a(dukbVar, this.a, btziVar, executor);
    }
}
